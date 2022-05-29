package com.hrone.genericPages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.hrone.library.ApplicationUtility;
import com.hrone.library.PropertiesLib;
import com.hrone.library.TextWriterClass;

/**
 * 
 * @author shalini.sharma
 *
 */
public class DataManupulationToTextFilePage {
	
	int firstEmpId_no=PropertiesLib.getRawPunchFirstEmpId();
	int totalDateCount=PropertiesLib.getTotalDateCount();
	int dateSize;
	public void generateDate(String filePath,String startDate,String endDate,int noOfDateToPrint) {
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
		dateSize = totalDates.size();
		for (int i = 1; i <= dateSize; i++) {
			LocalDate d = totalDates.get(i - 1);
			System.out.println(d + " ??????????? local dates");
			DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String dateToWrite = d.format(formatters);
			TextWriterClass.writeUsingFileWriter(dateToWrite, filePath);	
			TextWriterClass.writeUsingFileWriter(dateToWrite, filePath);
		}
		//totalDateCount = totalDateCount + noOfDateToPrint;
	}
	
	public void printDateToTextFile(int totalNumOfEmployees,String filePath,String startDate,String endDate,int noOfDateToPrint) {
		for (int j = 0; j < totalNumOfEmployees; j++) {					
			generateDate(filePath,startDate, endDate,noOfDateToPrint);
		}
	}
	
	public void printEmployeeId(int totalNumOfEmployees,String filePath,String empIDPrifix,int totalEmpSize) {
		for (int j = 0; j < totalNumOfEmployees; j++) {	
			for (int i = 1; i <= totalEmpSize; i++) {
			String formatted = String.format("%04d", firstEmpId_no);
			TextWriterClass.writeUsingFileWriter(empIDPrifix+formatted, filePath);
			TextWriterClass.writeUsingFileWriter(empIDPrifix+formatted, filePath);
			}
			firstEmpId_no++;
		}
	}
	
	public void writePunchTime(int totalNumOfEmployees,String filePath,String startShift,String endShift,int totalEmpSize) {
		for (int j = 0; j < totalNumOfEmployees; j++) {	
			for (int i = 1; i <= (totalEmpSize); i++) {
				TextWriterClass.writeUsingFileWriter(startShift, filePath);
				TextWriterClass.writeUsingFileWriter(endShift, filePath);				
			}
		}
	}
	
	/**
	 * This method is to generate and write pan numbers.
	 * @param totalNumOfPan
	 */
	public void generatePanCardNumbers(String totalNumOfPan) {
		for(int i=0; i<Integer.parseInt(totalNumOfPan); i++) {
			String panNum1 = ApplicationUtility.generateRandomString(5).toUpperCase();
			String panNum2 = ApplicationUtility.generateRandomNum(4);
			String panNum3 = ApplicationUtility.generateRandomString(1).toUpperCase();
			String data = panNum1+panNum2+panNum3;
			TextWriterClass.writeUsingFileWriter(data, ApplicationUtility.getUserDirFilePath("/files-to-upload/FileWriter.txt"));
		}
	}

	/**
	 * This method id to generate and write UAN number.
	 * @param totalNumOfUAN
	 */
	public void writeUAN_Numbers(String totalNumOfUAN) {
		for(int i=0; i<Integer.parseInt(totalNumOfUAN); i++) {
			TextWriterClass.writeUsingFileWriter(ApplicationUtility.generateRandomNum(15), ApplicationUtility.getUserDirFilePath("/files-to-upload/FileWriter.txt"));
		}		
	}
	
	/**
	 * This method id to generate and write ESI number.
	 * @param totalNumOfUAN
	 */
	public void writeESI_Numbers(String totalNumOfUAN) {
		for(int i=0; i<Integer.parseInt(totalNumOfUAN); i++) {
			TextWriterClass.writeUsingFileWriter(ApplicationUtility.generateRandomNum(17), ApplicationUtility.getUserDirFilePath("/files-to-upload/FileWriter.txt"));
		}		
	}
	
	/**
	 * This method id to generate and write ESI number.
	 * @param totalNumOfUAN
	 */
	public void writePensionNumber(String totalNumOfUAN) {
		for(int i=0; i<Integer.parseInt(totalNumOfUAN); i++) {
			TextWriterClass.writeUsingFileWriter(ApplicationUtility.generateRandomNum(6), ApplicationUtility.getUserDirFilePath("/files-to-upload/FileWriter.txt"));
		}		
	}
}
