package com.hrone.genericPages;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.hrone.library.ApplicationUtility;
import com.hrone.library.CalendarUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class CalendarHandlePage extends ApplicationUtility {
	public CalendarHandlePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Choose month and year']")
	private WebElement chooseMonthAndYr_Btn;

	@FindBys({
			@FindBy(xpath = "//table[@class='mat-calendar-table']//tr//td//div[contains(@class,'mat-calendar-body-cell-content')]") })
	private List<WebElement> listOfYears;

	@FindBy(xpath = "//button[@aria-label='Previous 20 years']")
	private WebElement privious20Yrs_Btn;

	@FindBy(xpath = "//button[@aria-label='Next 20 years']")
	private WebElement next20Yrs_Btn;

	@FindBy(xpath = "")
	private WebElement calendarLeft_btn;

	@FindBy(xpath = "")
	private WebElement calendarRight_btn;

	public void selDateFromCalendar(String date_xl, WebElement calendarIcon) {
		String year = CalendarUtility.year(date_xl);
		int yearInt = Integer.parseInt(year);
		System.out.println(year);

		String month = CalendarUtility.month(date_xl);
		System.out.println(month);

		String day = CalendarUtility.day(date_xl);
		System.out.println(day);

		ArrayList<String> al = new ArrayList<>();
		WaitStatementsLib.sleep(2000);
		scrollByJavaScriptExecutor(calendarIcon);
		clickByJavascriptExecutor(calendarIcon);
		WaitStatementsLib.sleep(1000);
		scrollByJavaScriptExecutor(chooseMonthAndYr_Btn);
		fluentWait(chooseMonthAndYr_Btn);
		click_WebElement(chooseMonthAndYr_Btn);
		WaitStatementsLib.sleep(1000);

		for (WebElement listOfYear : listOfYears) {
			String listOfYrText = listOfYear.getText().trim();
			al.add(listOfYrText);
		}

		System.out.println(al);
		String smallestYr = Collections.min(al);
		int smallest_Yr = Integer.parseInt(smallestYr);
		String greatestYr = Collections.max(al);
		int greatest_Yr = Integer.parseInt(greatestYr);

		if (yearInt < smallest_Yr) {
			int lnth = smallest_Yr - yearInt;
			for (int k = 0; k < lnth; k++) {
				click_WebElement(privious20Yrs_Btn);
				for (WebElement listOfYear : listOfYears) {
					String listOfYrText = listOfYear.getText().trim();
					al.add(listOfYrText);
				}
				if (al.contains(year)) {
					WaitStatementsLib.sleep(3000);
					WebElement yr = driver
							.findElement(By.xpath("//td[@role='gridcell']//div[contains(text(),'" + year + "')]"));
					WaitStatementsLib.pageLoadWait(driver, getPageloadTime());
					fluentWait(yr);
					WaitStatementsLib.sleep(2000);
					scrollByJavaScriptExecutor(yr);
					click_WebElement(yr);
					break;
				}
			}
		} else if (yearInt > greatest_Yr) {
			int lnth = yearInt - greatest_Yr;
			for (int k = 0; k < lnth; k++) {
				clickByJavascriptExecutor(next20Yrs_Btn);
				for (WebElement listOfYear : listOfYears) {
					String listOfYrText = listOfYear.getText().trim();
					al.add(listOfYrText);
				}
				if (al.contains(year)) {
					WaitStatementsLib.sleep(3000);
					driver.findElement(By.xpath("//td[@role='gridcell']//div[contains(text(),'" + year + "')]"))
							.click();
					break;
				}
			}
		} else {
			for (WebElement listOfYear : listOfYears) {
				String listOfYrText = listOfYear.getText().trim();
				al.add(listOfYrText);
			}
			if (al.contains(year)) {
				WaitStatementsLib.sleep(2000);
				WebElement ele = driver.findElement(
						By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + year + "')]"));
				fluentWait(ele);
				clickByJavascriptExecutor(ele);
			}
		}

		WaitStatementsLib.sleep(2000);
		WebElement monthEle = driver.findElement(
				By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + month + "')]"));
		clickByJavascriptExecutor(monthEle);

		WaitStatementsLib.sleep(2000);
		int dayIntVal = Integer.parseInt(day);
		if (dayIntVal < 10) {
			String[] dayVal = day.split("");
			String d = dayVal[1];
			WebElement dayEle = driver.findElement(
					By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + d + "')]"));
			scrollByJavaScriptExecutor(dayEle);
			clickByJavascriptExecutor(dayEle);
		} else {
			WebElement dayEle = driver.findElement(
					By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + day + "')]"));
			clickByJavascriptExecutor(dayEle);
		}
	}

	public void selDateFromCalendar_FinancialYear(String date_xl, WebElement cal_Icon) {

		String year = CalendarUtility.getYear_FromFinancialYear(date_xl);
		String month = CalendarUtility.getMonth_FromFinancialYear(date_xl);

		fluentWait(cal_Icon);
		clickByJavascriptExecutor(cal_Icon);

		WaitStatementsLib.sleep(1000);
		WebElement yearChipEle = driver.findElement(
				By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + year + "')]"));
		fluentWait(yearChipEle);
		click_WebElement(yearChipEle);

		WaitStatementsLib.sleep(1000);
		WebElement monthChipEle = driver.findElement(
				By.xpath("//table[@class='mat-calendar-table']//tr//td//div[contains(text(),'" + month + "')]"));
		fluentWait(monthChipEle);
		click_WebElement(monthChipEle);
	}

}
