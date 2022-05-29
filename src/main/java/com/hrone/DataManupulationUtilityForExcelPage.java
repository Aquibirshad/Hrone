package com.hrone.genericPages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;
import com.hrone.library.ApplicationUtility;
import com.hrone.library.PropertiesLib;


/**
 * 
 * @author shalini.sharma
 *
 */
public class DataManupulationUtilityForExcelPage extends ApplicationUtility {

	public DataManupulationUtilityForExcelPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	static Workbook wb;
	static FileInputStream fis;
	static FileOutputStream fos;
	static String value;
	int firstEmpId_no=PropertiesLib.getRawPunchFirstEmpId();
	int totalDateCount=PropertiesLib.getTotalDateCount();

	/**
	 * This method reads data from excel sheet.
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String readData(String FILEPATH, String sheetName, int rowNum, int cellNum) {
		try {
			if (sheetName == null)
				return "Enter valid sheet name...";

			fis = new FileInputStream(new File(FILEPATH));
			wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			if (sheet == null)
				return "Sheet is empty...";

			Row row = sheet.getRow(rowNum);
			if (row == null)
				return "";

			Cell cell = row.getCell(cellNum);
			if (cell == null)
				return "";
			else if (cell.getCellTypeEnum() == CellType.STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
				if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat datefarmate = new SimpleDateFormat("dd/MM/yyyy");
					return datefarmate.format(cell.getDateCellValue());
				} else
					return String.valueOf((int) cell.getNumericCellValue());
			} else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			e.getMessage();
			return "";
		}
	}

	/**
	 * This method writes data to excel sheet.
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param datatoWrite
	 */
	public void writeData(String FILEPATH, String sheetName, int rowNum, int cellNum, String datatoWrite) {
		try {
			fis = new FileInputStream(FILEPATH);
			wb = WorkbookFactory.create(fis);
			if (wb != null) {
				Sheet sheet = wb.getSheet(sheetName);
				if (sheet != null) {
					Row row = sheet.getRow(rowNum);
					if (row != null) {
						Cell cell = row.getCell(cellNum);
						if (cell != null) {
							cell.setCellValue(datatoWrite);
							System.out.println("data written");
						} else {
							cell = row.createCell(cellNum);
							cell.setCellValue(datatoWrite);
							System.out.println("data written in empty cell");
						}
					}
					else {
						row = 	sheet.createRow(rowNum);

						Cell cell = row.getCell(cellNum);
						if (cell != null) {
							cell.setCellValue(datatoWrite);
							System.out.println("data written");
						} else {
							cell = row.createCell(cellNum);
							cell.setCellValue(datatoWrite);
							System.out.println("data written in empty cell");
						}
					
					}
				}
			}
			fos = new FileOutputStream(FILEPATH);
			wb.write(fos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getLastRowNum(String FILEPATH, String sheetName) {
		int row = 0;
		try {
			fis = new FileInputStream(new File(FILEPATH));
			wb = WorkbookFactory.create(fis);
			if (wb != null) {
				Sheet sheet = wb.getSheet(sheetName);
				if (sheet != null) {
					row = sheet.getLastRowNum(); 
				}
			}
		} catch (Exception e) {
		}
		return row;
	}

	public void writeRawPunchDateAndEmpID_Opn(String FILEPATH, String sheetName,String startDate,String endDate, int iniRow, int dateCellNum,
			int empID_cellNum, String empPrefix) {

		String s = startDate;
		String e = endDate;
		LocalDate start = LocalDate.parse(s);
		LocalDate end = LocalDate.parse(e);
		System.out.println(start + " local start date");
		System.out.println(end + " local end date");
		List<LocalDate> totalDates = new ArrayList<>();
		while (!start.isAfter(end)) {
			totalDates.add(start);
			start = start.plusDays(1);
			System.out.println(totalDates);
		}

		String formatted = String.format("%04d", firstEmpId_no);
		int dateSize = totalDates.size();

		for (int row = iniRow; row <= totalDateCount;) {
			for (int i = 1; i <= dateSize; i++) {
				LocalDate d = totalDates.get(i - 1);
				System.out.println(d + " ??????????? local dates");
				DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				String dateToWrite = d.format(formatters);
				System.out.println(dateToWrite + "formated date");
				writeData(FILEPATH, sheetName, row, dateCellNum, dateToWrite);
				writeData(FILEPATH, sheetName, row++, empID_cellNum, empPrefix + formatted);
				writeData(FILEPATH, sheetName, row, dateCellNum, dateToWrite);
				writeData(FILEPATH, sheetName, row++, empID_cellNum, empPrefix + formatted);
			}
		}
		totalDateCount = totalDateCount + 60;
		firstEmpId_no++;
		System.out.println(firstEmpId_no+" new emp ID.................");
	}

	public void writeRawPunchDataToSheet( int totalNumOfEmployees,String FILEPATH, String sheetName,String startDate,String endDate,int dateCellNum, int empID_cellNum,
			 String empPrefix) {
		for (int j = 0; j < totalNumOfEmployees; j++) {			 
			int lastRow = getLastRowNum(FILEPATH, sheetName);
			lastRow++;	
			writeRawPunchDateAndEmpID_Opn(FILEPATH, sheetName, startDate, endDate,lastRow, dateCellNum, empID_cellNum, empPrefix);
		}
	}
}
