package com.hrone.genericPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hrone.library.ApplicationUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class SelectEmployees_GridPage extends ApplicationUtility{
	public SelectEmployees_GridPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//mat-select[@data-placeholder='Select']//div[@class='mat-select-arrow-wrapper']")
	private WebElement selectShowNumbers_Dd;
	
	@FindBy(xpath="//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement selectAll_None_Visible_ChkBox_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Process attendance')]")
	private WebElement processAttendance_btn;
	
	@FindBy(xpath="//button[contains(text(),'Unprocess attendance')]")
	private WebElement unprocessAttendance_Btn;
	
	@FindBy(xpath="//span[contains(text(),'Show')]")
	private WebElement show_Label;
	
	@FindBy(xpath="//span[contains(text(),'successfully')]")
	private WebElement successfully_Message;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok_btn;
	
	@FindBy(xpath="//button[text()=' Process arrear ']")
	private WebElement processArrear_btn;
	
	@FindBy(xpath="//button[text()=' Unprocess arrear ']")
	private WebElement unprocessArrear_btn;
	
	@FindBy(xpath="//button[contains(text(),'Calculate arrear')]")
	private WebElement calculateArrear_btn;
	
	@FindBy(xpath="//button[contains(text(),'Ignore arrear')]")
	private WebElement ignoreArrear_btn;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to calculate attendance correction arrear')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToCalculateAttendanceCorrectionArrear_Show_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'calculate attendance correction')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToCalculateAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'increment arrear')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToCalculateIncrementArrear_Show_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'increment arrear')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToCalculateIncrementArrear_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'overtime')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToProcessOvertime_Show_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'overtime')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToProcessOvertime_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Unprocess overtime')]")
	private WebElement unprocessOvertime_btn;

	@FindBy(xpath="//button[contains(text(),'Process overtime')]")
	private WebElement processOvertime_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'Overtime')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement overtimeProcessed_Show_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Overtime')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement overtimeProcessed_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Process salary')]")
	private WebElement processSalary_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to process salary')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToProcessSalary_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to process salary')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToProcessSalary_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Salary processed')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement salaryProcessed_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Salary processed')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement salaryProcessed_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Unprocess salary')]")
	private WebElement unprocessSalary_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to process previous month overtime')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToProcessPreviousMonthOvertime_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to process previous month overtime')]/../../../..//mat-select[@id='selectEmp']")
	private WebElement readyToProcessPreviousMonthOvertime_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Ignore overtime')]")
	private WebElement ignoreOverTime_btn;
	
	@FindBy(xpath="//h3[contains(text(),'Previous month overtime processed')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement previousMonthOvertimeProcessed_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Previous month overtime processed')]/../../../..//mat-select[@id='selectEmp']")
	private WebElement previousMonthOvertimeProcessed_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to release salary')]/../../../..//div[@class='attendance-filters-global-float-btn']//button")
	private WebElement readyToReleaseSalary_Filter_Icon;
	
	@FindBy(xpath="//h3[contains(text(),'release salary')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement releaseSalary_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'release salary')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement releaseSalary_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[text()=' Release payment ']")
	private WebElement releasePayment_btn;
	
	@FindBy(xpath="//button[text()=' Hold payment ']")
	private WebElement holdPayment_btn;
	
	@FindBy(xpath="//h2[text()='Release payment']/..//button[text()='Release']")
	private WebElement releasePayment_ReleaseBtn;
	
	@FindBy(xpath="//button[text()=' Unpublish salary ']")
	private WebElement unpublishSalary_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'Salary published')]/../../../..//div[@class='attendance-filters-global-float-btn']//button")
	private WebElement salaryPublished_Filter_Icon;
	
	@FindBy(xpath="//h3[contains(text(),'Salary published')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement salaryPublished_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Salary published')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement salaryPublished_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Ready to release')]/../../../..//button[contains(@class,'filter-icon')]")
	private WebElement readyToReleaseReimbursement_FilterIcon;
	
	@FindBy(xpath="//h3[contains(text(),'release reimbursement')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement readyToReleaseReimbursement_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'release reimbursement')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToReleaseReimbursement_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Release reimbursement')]")
	private WebElement releaseReimbursement_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'publish reimbursement')]/../../../..//button[contains(@class,'filter')]")
	private WebElement readyToPublishReimbursement_FilterBtn;
	
	@FindBy(xpath="//h3[contains(text(),'publish reimbursement')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement readyToPublishReimbursement_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'publish reimbursement')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement readyToPublishReimbursement_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Reimbursement published')]/../../../..//button[contains(@class,'filter')]")
	private WebElement reimbursementPublished_FilterBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Reimbursement published')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement reimbursementPublished_ShowDd;
	
	@FindBy(xpath="//h3[contains(text(),'Reimbursement published')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement reimbursementPublished_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//button[contains(text(),'Unpublish reimbursement')]")
	private WebElement unpublishReimbursement_Btn;
	
	@FindBy(xpath="//div[contains(text(),'Unclaimed reimbursement')]/../../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement unclaimedReimbursement_ShowDd;
	
	@FindBy(xpath="//div[contains(text(),'Unclaimed reimbursement')]/../../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement unclaimedReimbursement_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h2[contains(text(),'pay the unclaimed')]/..//button[text()='CONFIRM']")
	private WebElement doYouWantToPayTheUnclaimedAmount_ConfirmBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Calculated attendance correction')]/../../../..//mat-select[@id='selectEmp']//div[@class='mat-select-arrow-wrapper']")
	private WebElement calculatedAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd;
	
	@FindBy(xpath="//h3[contains(text(),'Calculated attendance correction')]/../../../..//span[contains(text(),'Show')]/../..//div[@class='mat-select-arrow']")
	private WebElement calculatedAttendaceCorrectionArrear_ShowDd;
	
	public WebElement getCalculatedAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd() {
		return calculatedAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getCalculatedAttendaceCorrectionArrear_ShowDd() {
		return calculatedAttendaceCorrectionArrear_ShowDd;
	}

	public WebElement getReadyToCalculateAttendanceCorrectionArrear_Show_Dd() {
		return readyToCalculateAttendanceCorrectionArrear_Show_Dd;
	}

	public WebElement getReadyToCalculateAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd() {
		return readyToCalculateAttendanceCorrectionArrear_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getDoYouWantToPayTheUnclaimedAmount_ConfirmBtn() {
		return doYouWantToPayTheUnclaimedAmount_ConfirmBtn;
	}

	@FindBy(xpath="//button[contains(text(),'Process')]")
	private WebElement process_btn;

	
	public WebElement getProcess_btn() {
		return process_btn;
	}

	public WebElement getUnclaimedReimbursement_ShowDd() {
		return unclaimedReimbursement_ShowDd;
	}

	public WebElement getUnclaimedReimbursement_selectAllNoneSelectVisible_Dd() {
		return unclaimedReimbursement_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getUnpublishReimbursement_Btn() {
		return unpublishReimbursement_Btn;
	}

	public WebElement getReimbursementPublished_FilterBtn() {
		return reimbursementPublished_FilterBtn;
	}

	public WebElement getReimbursementPublished_ShowDd() {
		return reimbursementPublished_ShowDd;
	}

	public WebElement getReimbursementPublished_selectAllNoneSelectVisible_Dd() {
		return reimbursementPublished_selectAllNoneSelectVisible_Dd;
	}

	@FindBy(xpath="//button[text()=' Publish reimbursement ']")
	private WebElement publishReimbursement_btn;
	
	public WebElement getPublishReimbursement_btn() {
		return publishReimbursement_btn;
	}

	public WebElement getReleaseReimbursement_Btn() {
		return releaseReimbursement_Btn;
	}

	public WebElement getReadyToPublishReimbursement_FilterBtn() {
		return readyToPublishReimbursement_FilterBtn;
	}

	public WebElement getReadyToPublishReimbursement_ShowDd() {
		return readyToPublishReimbursement_ShowDd;
	}

	public WebElement getReadyToPublishReimbursement_selectAllNoneSelectVisible_Dd() {
		return readyToPublishReimbursement_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToReleaseReimbursement_ShowDd() {
		return readyToReleaseReimbursement_ShowDd;
	}

	public WebElement getReadyToReleaseReimbursement_selectAllNoneSelectVisible_Dd() {
		return readyToReleaseReimbursement_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToReleaseReimbursement_FilterIcon() {
		return readyToReleaseReimbursement_FilterIcon;
	}

	public WebElement getSalaryPublished_selectAllNoneSelectVisible_Dd() {
		return salaryPublished_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getSalaryPublished_Filter_Icon() {
		return salaryPublished_Filter_Icon;
	}

	public WebElement getSalaryPublished_ShowDd() {
		return salaryPublished_ShowDd;
	}

	public WebElement getUnpublishSalary_Btn() {
		return unpublishSalary_Btn;
	}
	
	public WebElement getReleasePayment_ReleaseBtn() {
		return releasePayment_ReleaseBtn;
	}

	public WebElement getReleasePayment_btn() {
		return releasePayment_btn;
	}

	public WebElement getHoldPayment_btn() {
		return holdPayment_btn;
	}

	public WebElement getReleaseSalary_ShowDd() {
		return releaseSalary_ShowDd;
	}

	public WebElement getReleaseSalary_selectAllNoneSelectVisible_Dd() {
		return releaseSalary_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToReleaseSalary_Filter_Icon() {
		return readyToReleaseSalary_Filter_Icon;
	}

	public WebElement getPreviousMonthOvertimeProcessed_ShowDd() {
		return previousMonthOvertimeProcessed_ShowDd;
	}

	public WebElement getPreviousMonthOvertimeProcessed_selectAllNoneSelectVisible_Dd() {
		return previousMonthOvertimeProcessed_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getIgnoreOverTime_btn() {
		return ignoreOverTime_btn;
	}
	
	public WebElement getReadyToProcessPreviousMonthOvertime_selectAllNoneSelectVisible_Dd() {
		return readyToProcessPreviousMonthOvertime_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToProcessPreviousMonthOvertime_ShowDd() {
		return readyToProcessPreviousMonthOvertime_ShowDd;
	}

	public WebElement getUnprocessSalary_Btn() {
		return unprocessSalary_Btn;
	}

	public WebElement getSalaryProcessed_ShowDd() {
		return salaryProcessed_ShowDd;
	}

	public WebElement getSalaryProcessed_selectAllNoneSelectVisible_Dd() {
		return salaryProcessed_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToProcessSalary_ShowDd() {
		return readyToProcessSalary_ShowDd;
	}

	public WebElement getReadyToProcessSalary_selectAllNoneSelectVisible_Dd() {
		return readyToProcessSalary_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getProcessSalary_Btn() {
		return processSalary_Btn;
	}

	public WebElement getReadyToCalculateIncrementArrear_selectAllNoneSelectVisible_Dd() {
		return readyToCalculateIncrementArrear_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getOvertimeProcessed_Show_Dd() {
		return overtimeProcessed_Show_Dd;
	}

	public WebElement getOvertimeProcessed_selectAllNoneSelectVisible_Dd() {
		return overtimeProcessed_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getSelectShowNumbers_Dd() {
		return selectShowNumbers_Dd;
	}

	public WebElement getSelectAll_None_Visible_ChkBox_Dd() {
		return selectAll_None_Visible_ChkBox_Dd;
	}

	public WebElement getSuccessfully_Message() {
		return successfully_Message;
	}

	public WebElement getCalculateArrear_btn() {
		return calculateArrear_btn;
	}

	public WebElement getIgnoreArrear_btn() {
		return ignoreArrear_btn;
	}

	public WebElement getReadyToCalculateIncrementArrear_Show_Dd() {
		return readyToCalculateIncrementArrear_Show_Dd;
	}

	public WebElement getReadyToCalculateIncreamentArrear_selectAllNoneSelectVisible_Dd() {
		return readyToCalculateIncrementArrear_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getReadyToProcessOvertime_Show_Dd() {
		return readyToProcessOvertime_Show_Dd;
	}

	public WebElement getReadyToProcessOvertime_selectAllNoneSelectVisible_Dd() {
		return readyToProcessOvertime_selectAllNoneSelectVisible_Dd;
	}

	public WebElement getUnprocessOvertime_btn() {
		return unprocessOvertime_btn;
	}
	
	public WebElement getProcessOvertime_Btn() {
		return processOvertime_Btn;
	}

	public WebElement getUnprocessArrear_btn() {
		return unprocessArrear_btn;
	}

	public WebElement getProcessArrear_btn() {
		return processArrear_btn;
	}

	public WebElement getUnprocessAttendance_Btn() {
		return unprocessAttendance_Btn;
	}

	public WebElement getOk_btn() {
		return ok_btn;
	}

	public WebElement getSuccessfullyMessage() {
		return successfully_Message;
	}

	public WebElement getShow_Label() {
		return show_Label;
	}

	public WebElement getProcessAttendance_btn() {
		return processAttendance_btn;
	}

	/**
	 * This method is to select show drop down.
	 * @param show_xl
	 */
	public void selectShowDropdown(String show_xl) {
		WaitStatementsLib.sleep(2000);
		selDropdown(selectShowNumbers_Dd, show_xl);
		logPass(show_xl+" has been selected to show drop down.");
	}

	public void select_selAllNoneVisibleDd(String selectAllNoneVisible_xl) {
		WaitStatementsLib.sleep(1000);
		fluentWait(selectAll_None_Visible_ChkBox_Dd);
		selDropdown(selectAll_None_Visible_ChkBox_Dd, selectAllNoneVisible_xl);
		logPass(selectAllNoneVisible_xl+" has been selected.");
	}
	
	/**
	 * This method is for select specific checkbox as per employee code for attendance dashboard
	 * @param employeeCode_xl.
	 */
	public void selectCheckboxForSepecificEmp(String employeeCode_xl) {
		
		String[] empCodes = employeeCode_xl.split(",");
		for(int i=0; i<empCodes.length; i++) {
			String empCodeVal = empCodes[i];
			WaitStatementsLib.sleep(1000);
			WebElement checkboxEle = driver.findElement(By.xpath("//td[contains(text(),'"+empCodeVal+"')]/..//mat-checkbox"));
			WaitStatementsLib.sleep(1000);
			scrollByJavaScriptExecutor(checkboxEle);
			fluentWait(checkboxEle);
			clickByJavascriptExecutor(checkboxEle);			
		}				
	}
	
	/**
	 * This method is to select specific employee from salary dash board.
	 * @param employeeCode_xl
	 */
	public void selChkBoxForSpecificEmp_SalaryDashBoard(String employeeCode_xl) {
		WaitStatementsLib.pageLoadWait(driver, 500);
		String[] empCodes = employeeCode_xl.split(",");
		for(int i=0; i<empCodes.length; i++) {
			String empCodeVal = empCodes[i];
			WaitStatementsLib.sleep(2000);
			WebElement checkboxEle = driver.findElement(By.xpath("(//span[text()='"+empCodeVal+"'])[1]/..//mat-checkbox//input"));
			fluentWait(checkboxEle);
			scrollByJavaScriptExecutor(checkboxEle);
			clickByJavascriptExecutor(checkboxEle);
		}
	}
	
	/**
	 * This method is for handle employee grid page for attendance dashboard.
	 * @param selectShow_xl
	 * @param selectAllNoneVisible_xl
	 * @param employeeCode_xl
	 */
	public void selectEmployees_AttendanceDashboard(String selectShow_xl,String selectAllNoneVisible_xl,String employeeCode_xl) {
		WaitStatementsLib.sleep(3000);
		selectShowDropdown(selectShow_xl);
		
		WaitStatementsLib.sleep(3000);
		select_selAllNoneVisibleDd(selectAllNoneVisible_xl);
		
		if(!(selectAllNoneVisible_xl.equalsIgnoreCase("Select all")||selectAllNoneVisible_xl.equalsIgnoreCase("Select visible"))) {			
			selectCheckboxForSepecificEmp(employeeCode_xl);
		}	
	}
	
	/**
	 * This method is to handle grid for salary dashboard.
	 * @param selectShow_xl
	 * @param selectAllNoneVisible_xl
	 * @param employeeCode_xl
	 */
	public void selectEmployees_SalaryDashboard(String selectShow_xl,String selectAllNoneVisible_xl,String employeeCode_xl,WebElement show_Dd,WebElement selectAllNoneSelectVisible_chkboxDd) {
		WaitStatementsLib.pageLoadWait(driver, 500);
		fluentWait(show_Dd);
		selDropdown(show_Dd, selectShow_xl);
		logPass(selectShow_xl+" has been selected to show drop down.");
		
		WaitStatementsLib.pageLoadWait(driver, 500);
		WaitStatementsLib.sleep(4000);		
		fluentWait(selectAllNoneSelectVisible_chkboxDd);
		selDropdown(selectAllNoneSelectVisible_chkboxDd, selectAllNoneVisible_xl);
		logPass(selectAllNoneVisible_xl+" has been selected to select employees drop down.");
				
		if(!(selectAllNoneVisible_xl.equalsIgnoreCase("Select all")||selectAllNoneVisible_xl.equalsIgnoreCase("Select visible"))) {
			WaitStatementsLib.pageLoadWait(driver, 500);
			selChkBoxForSpecificEmp_SalaryDashBoard(employeeCode_xl);
		}
	}
	
	/**
	 * This method is to click on calculate or ignore button.
	 * @param calculateIgnore_xl
	 */
	public void clickOnCalculateOrIgnoreArrearBtn(String calculateIgnore_xl) {
		if(calculateIgnore_xl.equalsIgnoreCase("Calculate")) {
			click_WebElement(calculateArrear_btn);
		}
		else {
			click_WebElement(ignoreArrear_btn);
		}
	}
	
	/**
	 * This method is to select cash or cheque button from employee grid page.
	 * @param selCash_Cheque_xl
	 */
	public void selectCash_Cheque(String selCash_Cheque_xl) {
		WaitStatementsLib.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'Ready to release')]/../../../..//button[text()='"+selCash_Cheque_xl+"']"));
		WaitStatementsLib.sleep(2000);
		click_WebElement(ele);
	}
	
	/**
	 * This method is to select specific employee for unclaimed reimbursement from salary dash board.
	 * @param employeeCode_xl
	 */
	public void selChkBoxForSpecificEmp_UnclaimedReimbursement(String employeeCode_xl) {
		WaitStatementsLib.pageLoadWait(driver, 500);
		String[] empCodes = employeeCode_xl.split(",");
		for(int i=0; i<empCodes.length; i++) {
			String empCodeVal = empCodes[i];
			WaitStatementsLib.sleep(2000);
			WebElement checkboxEle = driver.findElement(By.xpath("//td[contains(text(),'"+empCodeVal+"')]/..//input"));
			fluentWait(checkboxEle);
			scrollByJavaScriptExecutor(checkboxEle);
			clickByJavascriptExecutor(checkboxEle);
		}
	}
	
	/**
	 * This method is to handle grid for salary dashboard unclaimed reimbursement.
	 * @param selectShow_xl
	 * @param selectAllNoneVisible_xl
	 * @param employeeCode_xl
	 */
	public void selectEmployees_unclaimedReimbursement(String selectShow_xl,String selectAllNoneVisible_xl,String employeeCode_xl,WebElement show_Dd,WebElement selectAllNoneSelectVisible_chkboxDd) {
		WaitStatementsLib.pageLoadWait(driver, 500);
		fluentWait(show_Dd);
		selDropdown(show_Dd, selectShow_xl);
		logPass(selectShow_xl+" has been selected to show drop down.");
		
		WaitStatementsLib.pageLoadWait(driver, 500);
		WaitStatementsLib.sleep(4000);		
		fluentWait(selectAllNoneSelectVisible_chkboxDd);
		selDropdown(selectAllNoneSelectVisible_chkboxDd, selectAllNoneVisible_xl);
		logPass(selectAllNoneVisible_xl+" has been selected to select employees drop down.");
				
		if(!(selectAllNoneVisible_xl.equalsIgnoreCase("Select all")||selectAllNoneVisible_xl.equalsIgnoreCase("Select visible"))) {
			WaitStatementsLib.pageLoadWait(driver, 500);
			selChkBoxForSpecificEmp_UnclaimedReimbursement(employeeCode_xl);
		}
	}
}
