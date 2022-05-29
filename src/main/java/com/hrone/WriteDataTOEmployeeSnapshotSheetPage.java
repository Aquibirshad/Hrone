package com.hrone.genericPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.hrone.library.ApplicationUtility;

/**
 * 
 * @author shalini.sharma
 *
 */
public class WriteDataTOEmployeeSnapshotSheetPage extends ApplicationUtility{
	private static final String FILEPATH = getUserDirFilePath(getPropertyValue("SnapshotFilePath"));
	//private static final String FILEPATH = "D:\\Workspace\\HR-OneCloud_V5.0_Automation_2\\files-to-upload\\Import_Snapshot\\NewEmp_Snap.xlsx";
	static Workbook wb;
	static FileInputStream fis;
	static FileOutputStream fos;
	static String value;
	
	public static int getRowNum(String sheetName) {
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
	
	public static void writeData(String sheetName, int rowNum, int cellNum, String datatoWrite) {
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
				}
			}
			fos = new FileOutputStream(FILEPATH);
			wb.write(fos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This method is to write phone number to sheet.
	 * @param sheetName
	 * @param filePath
	 * @param cellNum
	 */
	public void writePhoneNumbersToSnapshotSheet(String sheetName_xl) {
		for(int i=1; i<=getRowNum(sheetName_xl);i++) {
			writeData(sheetName_xl, i, 10, generateRandomNum(10));
		}
	}
	
	/**
	 * This method is to write email id to sheet.
	 * @param sheetName
	 * @param filePath
	 * @param cellNum
	 */
	public void writeEmailIdToSnapshotSheet(String sheetName_xl) {
		for(int i=1; i<=getRowNum(sheetName_xl);i++) {
			writeData(sheetName_xl, i, 9, generateRandomAlphaNumeric(6).toLowerCase()+"@xyztech.com");
		}
	}
	
	/**
	 * This method is to write biometric id to snapshot sheet.
	 */
	public void writeBiometricIdToSanpshotSheet(String sheetName_xl) {
		for(int i=1; i<=getRowNum(sheetName_xl); i++) {
			String bioMetricId = generateRandomNum(4);
			writeData(sheetName_xl, i, 30, bioMetricId);
		}
	}
}
