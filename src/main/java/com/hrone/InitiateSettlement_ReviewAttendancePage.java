package com.hrone.genericPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrone.library.ApplicationUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class InitiateSettlement_ReviewAttendancePage extends ApplicationUtility{
	public InitiateSettlement_ReviewAttendancePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[contains(text(),'attendance')]/../..//button")
	private WebElement reviewEmployeeAttendance_ReviewBtn;
	
	@FindBys({@FindBy(xpath="//span[contains(text(),'You can not proceed further')]")})
	private List<WebElement> youCanNotProcessUntilRequestPending_Label_Eles;
	
	@FindBy(xpath="//h3[contains(text(),'Review Employee')]/../..//i")
	private WebElement reviewEmployeeAttendance_FlyerCrossBtn;
	
	@FindBys({@FindBy(xpath="//div[@class='cls-settlementbox']")})
	private List<WebElement> pendingRequestCard_Eles; 
	
	@FindBy(xpath="(//button[text()='Next'])[1]")
	private WebElement pendingRequest_NextBtn;
	
	@FindBys({@FindBy(xpath="//div[contains(text(),'Attendance')]/..//span[contains(text(),'PROCESS')]")})
	private List<WebElement> processAttendance_AttendanceProcessBtns;
	
	@FindBys({@FindBy(xpath="//div[contains(text(),'arrear')]/..//button[contains(text(),'process')]")})
	private List<WebElement> processAttendance_arrearProcessBtns;
	
	@FindBy(xpath="//div[contains(text(),'Attendance')]/../../../../../../..//button[text()='Next']")
	private WebElement processAttendace_NextBtn;
	
	@FindBy(xpath="//span[contains(text(),'Finish')]")
	private WebElement reviewEmployeeAttendance_FinishBtn;
	
	@FindBys({@FindBy(xpath="//input[@value='REVIEW']")})
	private List<WebElement> summery_ReviewBtns;
	
	@FindBy(xpath="//span[contains(text(),'UPDATE')]")
	private WebElement summary_UpdateBtn;
	
	@FindBy(xpath="//label[contains(text(),'attendance')]/../..//button[text()='Edit']")
	private WebElement reviewEmpAttendance_EditBtn;
	
	@FindBys({@FindBy(xpath="//span[contains(text(),'UNLOCK')]")})
	private List<WebElement> summary_unlockBtns;
	
	@FindBy(xpath="//button[@class='cls-editbtn']")
	private WebElement edit_Icon;
	
	@FindBy(xpath="//div[text()='Present days']/..//input")
	private WebElement presentDays_Input;
	
	@FindBy(xpath="//div[text()='Week days off']/..//input")
	private WebElement weekDaysOff_InputField;
	
	@FindBy(xpath="//div[text()='Holidays']/..//input")
	private WebElement holidays_InputField;
	
	@FindBy(xpath="//div[text()='Paid leave']/..//input")
	private WebElement paidLeave_InputField;
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement done_Btn;
	
	@FindBy(xpath="//div[text()='Working hours']/..//input")
	private WebElement workingHrs_InpurField;
	
	@FindBy(xpath="//div[text()='Weekly Off hours']/..//input")
	private WebElement weeklyOffHrs_InputField;
	
	@FindBy(xpath="//div[text()='Holiday hours']/..//input")
	private WebElement holidayHrs_InputField;
	
	@FindBy(xpath="//div[text()='National holiday hours']/..//input")
	private WebElement nationalHolidayHours_InputField;
	
	@FindBy(xpath="//span[text()='ARREAR']/../../../../../..//span[contains(text(),'UPDATE')]")
	private WebElement reviewArrearUpdate_Btn;
	
	@FindBys({@FindBy(xpath="//h4[contains(text(),'Paid days')]/../../../..//a")})
	private List<WebElement> paidDays_DetailsLinks;
	
	@FindBy(xpath="//h4[contains(text(),'Paid days')]/../../../..//a")
	private WebElement paidDays_DetailsLink;
	
	@FindBys({@FindBy(xpath="//h4[contains(text(),'Arrear')]/../../../..//a")})
	private List<WebElement> arrear_DetailsLinks;
	
	@FindBy(xpath="//h4[contains(text(),'Arrear')]/../../../..//a")
	private WebElement arrear_DetailsLink;
	
	@FindBys({@FindBy(xpath="//h4[contains(text(),'Overtime')]/../../../..//a")})
	private List<WebElement> overtime_DetailsLinks;
	
	@FindBy(xpath="//h4[contains(text(),'Overtime')]/../../../..//a")
	private WebElement overtime_DetailsLink;
	
	@FindBy(xpath="//div[contains(text(),'Initiate settlement')]/../..//i")
	private  WebElement initiateSettlement_FlyerCrossBtn;
	
	public  WebElement getInitiateSettlement_FlyerCrossBtn() {
		return initiateSettlement_FlyerCrossBtn;
	}

	public WebElement getReviewEmpAttendance_EditBtn() {
		return reviewEmpAttendance_EditBtn;
	}

	public WebElement getReviewEmployeeAttendance_FinishBtn() {
		return reviewEmployeeAttendance_FinishBtn;
	}

	public WebElement getProcessAttendace_NextBtn() {
		return processAttendace_NextBtn;
	}

	public WebElement getPendingRequest_NextBtn() {
		return pendingRequest_NextBtn;
	}

	public WebElement getReviewEmployeeAttendance_FlyerCrossBtn() {
		return reviewEmployeeAttendance_FlyerCrossBtn;
	}
	
	public WebElement getReviewEmployeeAttendance_ReviewBtn() {
		return reviewEmployeeAttendance_ReviewBtn;
	}
	
	/**
	 * This method is to verify pending request page cards.
	 */
	public void verifyPendingRequestPage_Cards() {
		Assert.assertTrue(pendingRequestCard_Eles.size()>0);
		logPass("Review employee's attendance pending request cards are displying has been verified.");
	}
	
	/**
	 * This method is to verify You can not proceed further until all pending request are closed.You can do the same from insights label display.
	 */
	public void verifyYouCannotProcessUntilPendingRequest_LabelDisplay() {
		Assert.assertTrue(youCanNotProcessUntilRequestPending_Label_Eles.size()>0);
		logPass("You can not proceed further until all pending request are closed. You can do the same from insights, label display has been verified.");
	}
	
	/**
	 * This method is to is to process attendance.
	 */
	public void processAttendance() {		
		if(processAttendance_arrearProcessBtns.size()>0) {

			for(WebElement processAttendance_arrearProcessBtn:processAttendance_arrearProcessBtns) {
				click_WebElement(processAttendance_arrearProcessBtn);
			}
		}
		
		WaitStatementsLib.sleep(2000);		
		if(processAttendance_AttendanceProcessBtns.size()>0) {
			for(WebElement processAttendance_AttendanceProcessBtn:processAttendance_AttendanceProcessBtns) {
				click_WebElement(processAttendance_AttendanceProcessBtn);
			}
		}
	}
	
	/**
	 * This method is to review and update summery.
	 */
	public void reviewAndUpdate() {
		for(WebElement summery_ReviewBtn:summery_ReviewBtns) {
			fluentWait(summery_ReviewBtn);
			click_WebElement(summery_ReviewBtn);
			
		    WaitStatementsLib.sleep(2000);
		    click_WebElement(summary_UpdateBtn);
		}
	}
	
	/**
	 * This method is to click on summery unlock button.
	 */
	public void clickOnUnlock_Btn() {
		for(WebElement summery_unlockBtn:summary_unlockBtns) {
			fluentWait(summery_unlockBtn);
			click_WebElement(summery_unlockBtn);
		}
	}
	
	/**
	 * This method is to edit paid days.
	 * @param presentDays_xl
	 * @param weekDaysOff_xl
	 * @param holidays_xl
	 * @param paidLeaves_xl
	 * @param effectivePaiddays_xl
	 */
	public void edit_PaidDays(String presentDays_xl,String weekDaysOff_xl,String holidays_xl,String paidLeaves_xl,String effectivePaiddays_xl) {
		
		fluentWait(edit_Icon);
		click_WebElement(edit_Icon);
		
		WaitStatementsLib.sleep(2000);
		enterValueToInputField(presentDays_Input, presentDays_xl);
		logPass(presentDays_xl+" has been entered to present days input field.");
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(weekDaysOff_InputField, weekDaysOff_xl);
		logPass(weekDaysOff_xl+" has been entered to week days off input field.");
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(holidays_InputField, holidays_xl);
		logPass(holidays_xl+" has been entered to holidays input field.");
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(paidLeave_InputField, paidLeaves_xl);
		logPass(paidLeaves_xl+" has been entered to paid leave input field.");
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(done_Btn);
		
	}
	
	public void edit_Overtime(String workinghrs_xl,String weeklyOffHrs_xl,String holidayHrs_xl,String nationalHolidayHrs_xl) {
		
		fluentWait(edit_Icon);
		click_WebElement(edit_Icon);
		
		WaitStatementsLib.sleep(2000);
		enterValueToInputField(workingHrs_InpurField, workinghrs_xl);
		logPass(workinghrs_xl+" has been entered to working hours input field.");
	
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(weeklyOffHrs_InputField, weeklyOffHrs_xl);
		logPass(weeklyOffHrs_xl+" has been entered to weekly off input field.");
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(holidayHrs_InputField, holidayHrs_xl);
		logPass(holidayHrs_xl+" has been entered to holiday hours input field.");
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(nationalHolidayHours_InputField, nationalHolidayHrs_xl);
		logPass(nationalHolidayHrs_xl+" has been entered to national holiday input field.");
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(done_Btn);
	}
	
	/**
	 * This method is to edit arrear.
	 * @param totalArrearDays_xl
	 */
	public void edit_Arrear(String totalArrearDays_xl) {
		
		fluentWait(edit_Icon);
		click_WebElement(edit_Icon);
		
		String[] arrearDays = totalArrearDays_xl.split(",");
		for(int i=1; i<=arrearDays.length; i++) {
			
			String totalArrearDaysVal = arrearDays[i-1];
			
			WaitStatementsLib.sleep(2000);
			WebElement totalArrearDaysEle = driver.findElement(By.xpath("(//div[text()='Total arrear days']/..//input)["+i+"]"));
			WaitStatementsLib.sleep(2000);
			enterValueToInputField(totalArrearDaysEle, totalArrearDaysVal);
			logPass(totalArrearDaysVal+" has been entered to total arrear days input field.");
			
		}
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(done_Btn);
	}
	
	/**
	 * This method is to click on paid days details link and update paid days.
	 * @param presentDays_xl
	 * @param weekDaysOff_xl
	 * @param holidays_xl
	 * @param paidLeaves_xl
	 * @param effectivePaiddays_xl
	 */
	public void clickOnPaidDaysDetailsAndUpdate(String presentDays_xl,String weekDaysOff_xl,String holidays_xl,String paidLeaves_xl,String effectivePaiddays_xl) {
		WaitStatementsLib.sleep(3000);
		if(paidDays_DetailsLinks.size()>0) {
			
			WaitStatementsLib.sleep(2000);
			click_WebElement(paidDays_DetailsLink);
			
			WaitStatementsLib.sleep(3000);
			edit_PaidDays(presentDays_xl, weekDaysOff_xl, holidays_xl, paidLeaves_xl, effectivePaiddays_xl);			
		}
		else {
			logInfo("Paid days card is not displaying.");
		}
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(summary_UpdateBtn);
	}
	
	/**
	 * This method is to click on arrear details link and update.
	 * @param totalArrearDays_xl
	 */
	public void clickOnArrearDetailsAndUpdate(String totalArrearDays_xl) {
		WaitStatementsLib.sleep(3000);
		
		if(arrear_DetailsLinks.size()>0) {
			
			WaitStatementsLib.sleep(2000);
			click_WebElement(arrear_DetailsLink);
			
			WaitStatementsLib.sleep(3000);
			edit_Arrear(totalArrearDays_xl);
		}
		else {
			logInfo("Arrear card is not displaying.");
		}	
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(summary_UpdateBtn);
	}
	
	/**
	 * This method is to click on overtimr details and update.
	 * @param workinghrs_xl
	 * @param weeklyOffHrs_xl
	 * @param holidayHrs_xl
	 * @param nationalHolidayHrs_xl
	 */
	public void clickOnOvertimeDetailsAndUpdate(String workinghrs_xl,String weeklyOffHrs_xl,String holidayHrs_xl,String nationalHolidayHrs_xl) {
		
		if(overtime_DetailsLinks.size()>0) {
			
			WaitStatementsLib.sleep(2000);
			click_WebElement(overtime_DetailsLink);
			
			WaitStatementsLib.sleep(3000);
			edit_Overtime(workinghrs_xl, weeklyOffHrs_xl, holidayHrs_xl, nationalHolidayHrs_xl);
		}
		else {
			logInfo("Overtime card is not displaying.");
		}
		
		WaitStatementsLib.sleep(2000);
		click_WebElement(summary_UpdateBtn);
	}
}
