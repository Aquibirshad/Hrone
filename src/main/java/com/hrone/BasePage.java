package com.hrone.genericPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.hrone.library.BaseLib;

/**
 * Test
 * @author shalini.sharma
 *
 */
public class BasePage extends BaseLib{
	public BasePage() {
		super();		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='login-text']//h2")
	private WebElement loginPageHeading;
	
	@FindBy(xpath="//i[@class='Setting']")
	private WebElement setup_icon;
	
	@FindBy(xpath="//span[text()='Organization ']")
	private WebElement organization_Link;
	
	@FindBy(xpath="//button[contains(text(),'EDIT')]")
	private WebElement editBtn;
	
	@FindBy(xpath="//span[contains(text(),'UPDATE')]")
	private WebElement updateBtn;
	
	@FindBy(xpath="//input[@value='INACTIVATE']")
	private WebElement inactivateBtn;
	
	@FindBy(xpath="//button[contains(text(),'YES, INACTIVATE')]")
	private WebElement yesInactivateBtn;
	
	@FindBy(xpath="//span[contains(text(),'ADD')]")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()='SHOW MORE']")
	private WebElement showMoreBtn;
	
	@FindBy(xpath="//span[contains(text(),'Organization structure')]")
	private WebElement organizationStructure;
	
	@FindBy(xpath="//span[contains(text(),'Location')]")
	private WebElement location_Link;
	
	@FindBys({@FindBy(xpath="//snack-bar-container//app-snackbar[contains(text(),'Record saved successfully')]")})
	private static List<WebElement> snackBarMsg_Saved;
	
	@FindBys({@FindBy(xpath="//snack-bar-container//app-snackbar[contains(text(),'Record updated successfully')]")})
	private static List<WebElement> snackBarMsg_Update;
	
	@FindBys({@FindBy(xpath="//snack-bar-container//simple-snack-bar//span[contains(text(),'File uploaded successfully')]")})
	private static List<WebElement> snackBarMsg_FileUploadedSuccessfully;
	
	@FindBy(xpath="//simple-snack-bar//span[contains(text(),'already exists')]")
	private WebElement snackBarMsg_alreadyExists;
	
	@FindBy(xpath="//p[text()='Available Search']")
	private WebElement availableSearch_link;
	
//	@FindBy(xpath="//snack-bar-container//app-snackbar[contains(text(),'File uploaded successfully')]")
//	private WebElement snackBarMsg_FileUploadedSuccessfully;
	
	@FindBys({@FindBy(xpath="//app-snackbar[contains(text(),'Letter generated successfully')]")})
	private static List<WebElement> snackBarMsg_LetterGeneratedSuccessfully;
	
	@FindBy(xpath="//snack-bar-container//simple-snack-bar//span[text()='OK']")
	private WebElement snackBarOk_btn;
	
	@FindBy(xpath="//a//span[contains(text(),'General')]")
	private WebElement general;
		
	@FindBy(xpath="//a//span[contains(text(),'Code series')]")
	private WebElement codeSeries;
		
	@FindBy(xpath="//i[@class='Process']")
	private WebElement hrDesk_icon;
	
	@FindBy(xpath="//button[contains(text(),'actions')]")
	private WebElement hrDesk_Actions_Btn;
	
	@FindBy(xpath="//h5[contains(text(),'actions')]")
	private WebElement actionsFlyer_title;
	
	@FindBy(xpath="//button[contains(text(),'imports')]")
	private WebElement hrDesk_Imports_Btn;
	
	@FindBy(xpath="//span[contains(text(),'NEXT')]")
	private WebElement next_Btn;
	
	@FindBy(xpath="//span[text()='Workforce ']")
	private WebElement workforce_Link;
	
	@FindBy(xpath="//span[text()='Settings ']")
	private WebElement settings_Link;
	
	@FindBy(xpath="//span[text()='Qualification ']")
	private WebElement qualification_Link;
	
	@FindBy(xpath="(//span[text()='Letter template '])[1]")
	private WebElement letterTemplate_Link;
	
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement popup_ConfirmBtn;
	
	@FindBy(xpath="//span[contains(text(),'Documents')]")
	private WebElement setup_WF_Documents_Link;
	
	@FindBy(xpath="//span[text()='Separation policy ']")
	private WebElement separationPolicy_Link;
	
	@FindBy(xpath="//span[text()='Feedback template ']")
	private WebElement feedbackTemplate_Link;
	
	@FindBys(value= {@FindBy(xpath="//div[@class='cdk-overlay-pane']//div//mat-option/span")})
	private static List<WebElement> dropdownEles;

	@FindBy(xpath="//span[text()='Role ']")
	private WebElement role_Link;
	
	@FindBy(xpath="(//span[text()='Workflow '])[1]")
	private WebElement workflow_Link;
	
	@FindBy(xpath="//span[text()='Confirmation policy ']")
	private WebElement confirmationPolicy_Link;
	
	@FindBy(xpath="//span[text()='CHATBOT']")
	private WebElement chatbot_Label;
	
	@FindBy(xpath="//i[@class='Request']")
	private WebElement request_Icon;
	
	@FindBy(xpath="//button[text()=' New Request']")
	private WebElement newRequest_Btn;
	
	@FindBy(xpath="//span[text()='Resignation ']")
	private WebElement resignation_Link;
	
	@FindBy(xpath="//i[@class='Team']")
	private WebElement team_Icon;
	
	@FindBy(xpath="//button[text()='View pending request']")
	private WebElement viewPendingRequest_btn;
	
	@FindBys({ @FindBy(xpath = "//div[@class='tab-card-title']") })
	private List<WebElement> cardTabEles;
	
	@FindBy(xpath="//span[text()='Pending ']")
	private WebElement requestPending_Link;
	
	@FindBy(xpath="//i[@class='Inbox']")
	private WebElement inbox_Icon;
	 
	@FindBy(xpath="//span[text()='Insights ']")
	private WebElement insights_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Confirmation']")
	private WebElement inbox_Confirmation_Link;
	
	@FindBy(xpath="//span[text()='Time office ']")
	private WebElement timeOffice_Link;
	
	@FindBy(xpath="(//span[text()='Settings '])[2]")
	private WebElement timeOfficeSetting_Link;
	
	@FindBy(xpath="(//span[contains(text(),'Shift')])[1]")
	private WebElement timeOfficeShift_Link;
	
	@FindBy(xpath="//span[text()='Shift rotation ']")
	private WebElement timeOfficeShiftRotation_Link;
	
	@FindBy(xpath="//span[contains(text(),'Weekly off')]")
	private WebElement timeOfficeWeeklyOff_Link;
	
	@FindBy(xpath="//span[text()='Holiday ']")
	private WebElement timeOfficeHoliday_Link;
	
	@FindBy(xpath="//span[text()='Attendance ']")
	private WebElement timeOfficeAttendance_Link;
	
	@FindBy(xpath="//span[text()='Check in policy ']")
	private WebElement timeOfficeCheckinPolicy_Link;
	 
	@FindBy(xpath="//span[text()='Leave ']")
	private WebElement timeOfficeLeave_Link;
	
	@FindBy(xpath="//span[contains(text(),'Short leave')]")
	private WebElement timeOfficeShortLeave_Link;
	
	@FindBy(xpath="//span[text()='Access rights ']")
	private WebElement accessRights_Link;
	
	@FindBy(xpath="//span[text()='Page access ']")
	private WebElement pageAccess_Link;
	
	@FindBy(xpath="//span[text()='Data access ']")
	private WebElement dataAccess_Link;
	
	@FindBy(xpath="(//span[contains(text(),'Workflow')])[2]")
	private WebElement timeOfficeWorkflow_Link;
	
	@FindBy(xpath="(//span[contains(text(),'Attendance regularization')])[1]")
	private WebElement attendanceRegularizationLink;
	
	@FindBy(xpath="//span[text()='On duty ']")
	private WebElement requestOnDuty_Link;
	
	@FindBy(xpath="//span[text()='Restricted holiday ']")
	private WebElement requestRestrictedHoliday_Link;
	
	@FindBy(xpath="//h2[contains(text(),'Confirmed!')]")
	private WebElement req_ConfirmedPopup;
	
	@FindBy(xpath="//span[text()='Short leave ']")
	private WebElement shortLeave_Link;
	
	@FindBy(xpath="//a[text()='Assign shift']")
	private WebElement actionsAssignShift_Link;
	
	@FindBy(xpath="//a[contains(text(),'Leave')]")
	private WebElement hrdesk_Actions_Leave_Link;
	
	@FindBy(xpath="//a[text()='On duty']")
	private WebElement hrdesk_Actions_OnDuty_Link;
	
	@FindBy(xpath="//a[contains(text(),'Restricted holiday')]")
	private WebElement hrdesk_Actions_restrictedHoliday_Link;
	
	@FindBy(xpath="//a[contains(text(),'Attendance regularization')]")
	private WebElement hrdesk_Actions_attendanceRegularization_Link;
	
	@FindBy(xpath="//a[contains(text(),'Short leave')]")
	private WebElement hrdesk_Actions_ShortLeave;
	
	@FindBy(xpath="(//span[text()='Attendance regularization'])[1]")
	private WebElement inbox_AttendanceRegularization_Link;
	
	@FindBy(xpath="(//span[text()='Short leave'])[1]")
	private WebElement inbox_ShortLeave_Link;
	
	@FindBy(xpath="(//span[text()='Leave'])[1]")
	private WebElement inbox_Leave_Link;
	
	@FindBy(xpath="(//span[text()='On duty'])[1]")
	private WebElement inbox_OnDuty_Link;
	
	@FindBy(xpath="(//span[text()='Restricted holiday'])[1]")
	private WebElement inbox_RestrictedHoliday_Link;
	
	@FindBy(xpath="//span[text()='Leave ']")
	private WebElement requestLeave_Link;
	
	@FindBy(xpath="//button[text()='Action']")
	private WebElement team_Action_Btn;
	
	@FindBy(xpath="//span[contains(text(),'Search employee')]/../../../.././..//i")
	private WebElement searchEmployeePopup_CrossBtn;
	
	@FindBy(xpath="(//span[text()='Verify Compensatory off'])[1]")
	private WebElement inbox_VerifyCompensatoryOff_Link;
	
	@FindBy(xpath="(//span[text()='Verify Overtime'])[1]")
	private WebElement inbox_VerifyOverTime_Link;
	
	@FindBy(xpath="//span[text()='Services ']")
	private WebElement services_Link;
	
	@FindBy(xpath="//a[text()='Announcement']")
	private WebElement actionsEngageAnnouncement_link;
	
	@FindBy(xpath="//h5[contains(text(),'actions')]/..//i")
	private WebElement hrdeskActions_crossBtn;
	
	@FindBy(xpath="//h5[contains(text(),'Actions')]/..//i")
	private WebElement teamsActions_crossBtn;

	@FindBy(xpath="//span[text()=' Read it ']")
	private WebElement inbox_NewAnnouncementReadItBtn;
	
	@FindBy(xpath="(//span[text()='New announcement'])[1]")
	private WebElement inbox_NewAnnouncement_Link;
	
	@FindBy(xpath="//a[text()='Hr handbook']")
	private WebElement hrdesk_Actions_HrHandbook_Link;
	
	@FindBy(xpath="//a[@ptooltip='Profile']")
	private WebElement avatar_Icon;
	
	@FindBy(xpath="//a[text()=' HR handbook ']")
	private WebElement profile_HrHandbook_Link;
	
	@FindBy(xpath="//a[text()='Attendance status']")
	private WebElement hrdesk_Actions_AttendanceStatus_Link;
	
	@FindBy(xpath="//a[text()='Change manager']")
	private WebElement hrdesk_Actions_changeManager_Link;
	
	@FindBy(xpath="//a[text()='Invite to hr-one']")
	private WebElement hrdesk_Actions_InviteToHrOne_Link;
	
	@FindBy(xpath="//div[contains(text(),'Invite')]/../../../../..//input")
	private WebElement actions_InviteToHrone_searchByNameCodeDesig_Ele;
	
	@FindBy(xpath="//span[contains(text(),'SEND PASSWORD')]")
	private WebElement actions_InviteToHrone_SendPassword_Btn;
	
	@FindBy(xpath="//span[text()='Payroll ']")
	private WebElement setup_Payroll_Link;
	
	@FindBy(xpath="//span[text()='Payroll ']/../..//span[text()='Settings ']")
	private WebElement payroll_Settings_Link;
	
	@FindBy(xpath="//span[text()='Statutory ']")
	private WebElement payroll_Statutory_Link;
	
	@FindBy(xpath="//span[text()='Challan ']")
	private WebElement payroll_Challan_Link;
	
	@FindBy(xpath="//span[text()='Slabs ']")
	private WebElement payroll_Slabs_Link;
	
	@FindBy(xpath="//mat-select[@placeholder='Financial year']")
	private WebElement payroll_FinancialYear_Dd;
	
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement doYouWantToCloseWindow_ConfirmBtn;
	
	@FindBy(xpath="//span[text()='Pay group ']")
	private WebElement payroll_PayGroup_Link;
	
	@FindBy(xpath="//img[@class='click-div']")
	private WebElement payRoll_PG_PayComponentPlus_Icon;
	
	@FindBy(xpath="//span[text()='Payroll ']/../..//span[text()='Workflow ']")
	private WebElement payroll_Workflow_Link;
	
	@FindBy(xpath="//span[text()='Payroll ']/../..//span[text()='Letter template ']")
	private WebElement payroll_LetterTemplate_Link;
	
	@FindBy(xpath="(//span[text()='Confirmation letter'])[1]")
	private WebElement inbox_confirmationLetter_Link;
	
	@FindBy(xpath="(//span[text()='Extension letter'])[1]")
	private WebElement inbox_ExtensionLetter_Link;
	
	@FindBy(xpath="(//span[text()='Termination Letter'])[1]")
	private WebElement inbox_TerminationLetter_Link;
	
	@FindBy(xpath="(//span[text()='New join CTC'])[1]")
	private WebElement inbox_NewJoinCTC_Link;
	
	@FindBy(xpath="//h3[text()='Salary Structure']/../..//i")
	private WebElement employeeSalaryStructure_Flyer_CrossBtn;
	
	@FindBy(xpath="//h3[contains(text(),'New join CTC')]/../..//i")
	private WebElement newJoinCtc_Flyer_CrossBtn;
	
	@FindBy(xpath="//span[text()='ASSIGN SALARY STRUCTURE ']")
	private WebElement payroll_assignSalaryStructure_Btn;
	
	@FindBy(xpath="//a[contains(text(),'Salary structure')]")
	private WebElement hrdesk_Actions_SalaryStructure_Link;
	
	@FindBy(xpath="//div[contains(text(),'Salary Structure')]/../../../../..//button[text()=' EDIT ']")
	private WebElement hrdesk_Actions_SalStructure_Edit_Btn;
	
	@FindBy(xpath="//a[contains(text(),'Employee ctc (auto)')]")
	private WebElement hrdesk_imports_EmployeeCTCAuto_Link;
	
	@FindBy(xpath="//h5[text()='imports ']//..//i[text()=' clear ']")
	private WebElement hrdesk_Imports_FlyerCrossBtn;
	
	@FindBy(xpath="//a[contains(text(),'Employee ctc (manual)')]")
	private WebElement hrdesk_Imports_EmployeeCTCManual_Link;
	
	@FindBy(xpath="//a[contains(text(),'Snapshot')]")
	private WebElement hrdesk_Imports_Snapshot_Link;
	
	@FindBy(xpath="//span[text()='Checklist ']")
	private WebElement setup_WF_Checklist_Link;
	
	@FindBys(@FindBy(xpath = "//button[text()='SHOW MORE']"))
	private List<WebElement> showMoreBtns;
	
	@FindBy(xpath="//textarea[@formcontrolname='employeeCode']")
	private WebElement pasteEmployeeCodes_InputField;
	
	@FindBy(xpath="//label[text()='Paste employee codes here']/../..//span[text()=' DONE ']")
	private WebElement addBulkEmployee_Done_btn;
	
	@FindBy(xpath="//a[contains(text(),'Employee statutory')]")
	private WebElement hrdesk_Imports_EmployeeStatutory_link;
	
	@FindBy(xpath="//h3[text()='Pay component']/../../../..//span[text()=' SAVE ']")
	private WebElement payroll_PG_PayComp_SaveBtn;
	
	@FindBy(xpath="//div[text()='Pay component']/../../../../../..//span[text()=' UPDATE ']")
	private WebElement payroll_PG_PayComp_UpdateBtn;
	
	@FindBys({@FindBy(xpath="//mat-option")})
	private static List<WebElement> dropdownOptionEles; 
	
	@FindBy(xpath="(//span[contains(text(),'Salary structure')])[1]")
	private WebElement inbox_SalaryStructure_Link;
	
	@FindBy(xpath="//h2[text()='Task Insights']")
	private WebElement hrdesk_TaskInsights_Label;
	
	@FindBy(xpath="//span[contains(text(),'Propose invest')]")
	private WebElement request_ProposeInvest_Link;
	
	@FindBy(xpath="//a[text()='Proposed investment declaration']")
	private WebElement hrdesk_Actions_ProposedInvestmentDeclaration_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Propose Invest']")
	private WebElement inbox_ProposeInvest_Link;
	
	@FindBy(xpath="//span[contains(text(),'Loan')]")
	private WebElement request_Loan_Link;
	
	@FindBy(xpath="//a[text()='Loan']")
	private WebElement hrdesk_Actions_Loan_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Loan']")
	private WebElement inbox_Loan_Link;
	
	@FindBy(xpath="//button[text()='APPROVE']")
	private WebElement approve_Btn;
	
	@FindBy(xpath="//button[text()='REJECT']")
	private WebElement reject_Btn;
	
	@FindBy(xpath="(//span[contains(text(),'Reimbursement')])[1]")
	private WebElement request_Reimbursement_Link;
	
	@FindBy(xpath="//h5[text()='actions']/../..//a[text()='Reimbursement']")
	private WebElement hrdesk_Actions_Reimbursement_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Reimbursement']")
	private WebElement inbox_Reimbursement_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Dispense loan']")
	private WebElement inbox_DispenseLoan_Link;
	
	@FindBy(xpath="//h5[text()='imports']/../..//a[text()='Investment declaration']")
	private WebElement hrdesk_Imports_InvestmentDeclaration_Link;
	
	@FindBy(xpath="//a[contains(text(),'Business Unit')]")
	private WebElement businessUnit_Tab;
	
	@FindBy(xpath="//button[text()='YES, REMOVE']")
	private WebElement areYouSureYouWantToRemove_YesRemove_Btn;
	
	@FindBy(xpath="//a[text()='Monthly variable']")
	private WebElement hrdesk_imports_MonthlyVariable_Link;
	
	@FindBy(xpath="//a[text()='Reimbursement opening balance (pay on claim)']")
	private WebElement hrdesk_imports_ReimbursementOpeningBal_PayOnClaim_Link;
	
	@FindBy(xpath="//a[text()='Reimbursement bills (pay by default)']")
	private WebElement hrdesk_imports_ReimbursementBills_PBD_Link;
	
	@FindBy(xpath="//a[text()='Request reimbursement (pay on claim)']")
	private WebElement hrdesk_imports_ReqReimbursement_POC_Link;
	
	@FindBy(xpath="//a[text()='Change pay group']")
	private WebElement hrdesk_imports_ChangePaygroup_Link;
	
	@FindBy(xpath="//span[contains(text(),'Engage')]")
	private WebElement setup_Engage_Link;
	
	@FindBy(xpath="//span[contains(text(),'Engage')]/../..//span[contains(text(),'Settings')]")
	private WebElement setup_Engage_Settings_Link;
	
	@FindBy(xpath="//span[contains(text(),'Reward points')]")
	private WebElement setup_Engage_RewardPoints_Link;
	
	@FindBy(xpath="//span[text()='Badge ']")
	private WebElement setup_Engage_Badge_Link;
	
	@FindBy(xpath="//i[@class='Home']")
	private WebElement home_Icon;
	
	@FindBys({@FindBy(xpath="//span[contains(text(),'new message')]")})
	private List<WebElement> home_NewMessage_AlertIcons;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='1-on-1']")
	private WebElement inbox_One_On_One_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Initiative']")
	private WebElement inbox_Initiative_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Initiative feedback']")
	private WebElement inbox_InitiativeFeedback_Link;
	
	@FindBy(xpath="//span[contains(text(),'Happiness index')]")
	private WebElement setup_Engage_HappinessIndex_Link;
	
	@FindBys({@FindBy(xpath="//div[contains(text(),'How is your mood today')]")})
	private List<WebElement> howIsYourMoodToday_Labels;
	
	@FindBys({@FindBy(xpath="//h4[contains(text(),'Tax Regime')]")})
	private List<WebElement> taxRegime_Labels;
	
	@FindBy(xpath="//mat-icon[contains(text(),'search')]")
	private WebElement inbox_searchIcon;
	
	@FindBy(xpath="//input[contains(@class,'employee_search')]")
	private WebElement inbox_enterEmployeeCodeOrName_InputField;
	
	@FindBy(xpath="//a[contains(text(),'Attendance dashboard')]")
	private WebElement hrdesk_Actions_AttendanceDashboard_Link;
	
	@FindBys({@FindBy(xpath="//snack-bar-container//app-snackbar[contains(text(),'Report downloaded successfully')]")})
	private static List<WebElement> snackbarMsg_ReportDownloadedSuccessfully;
	
	@FindBy(xpath="//snack-bar-container//app-snackbar[contains(text(),'Report downloaded successfully')]")
	private static WebElement snackbarMsg_ReportDownloadedSuccessfully_ele;
	
	@FindBy(xpath="//button[contains(@class,'filter-icon')]")
	private WebElement filter_Icon;
	
	@FindBy(xpath="//a[contains(text(),'Salary dashboard')]")
	private WebElement hrdesk_Actions_SalaryDashboard_Link;
	
	@FindBy(xpath="//button[text()='YES, DELETE']")
	private WebElement yesDelete_btn;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement youWantToApplyThisPolicyOnSave_btn;
	
	@FindBy(xpath="//span[contains(text(),'Reports')]")
	private WebElement hrdesk_Reports_Link;

	@FindBy(xpath="//a[contains(text(),'Override overtime')]")
	private WebElement hrdesk_Imports_OverrideOvertime_Link;
	
	@FindBy(xpath="//a[contains(text(),'Override paid days')]")
	private WebElement hrdesk_Imports_OverridePaidDays_Link;
	
	@FindBy(xpath="//h5[text()='Actions']/../..//i")
	private WebElement teamActions_CrossBtn;
	
	@FindBy(xpath="//span[contains(text(),'Approved')]")
	private WebElement request_Approved_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Attendance regularization Cancel']")
	private WebElement inbox_AR_RequestCancel_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='On duty cancel']")
	private WebElement inbox_OD_Cancel_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Short leave']")
	private WebElement inbox_ShortLeaveCancel_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Leave cancel']")
	private WebElement inbox_LeaveCancel_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Resignation cancel']")
	private WebElement inbox_ResignationCancel_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Initiate settlement']")
	private WebElement inbox_InitiateSettlement_link;
	
	@FindBys({@FindBy(xpath="//h3[contains(text(),'Initiate settlement')]/../..//i")})
	private List<WebElement> insights_InitiateSettlement_CrossBtn;
	
	@FindBys({@FindBy(xpath="//div[contains(@class,'tab-card-body')]")})
	private List<WebElement> tabCardEles;
	
	@FindBys({@FindBy(xpath="//div[@class='clsinboxblank-text']")})
	private List<WebElement> inboxBlankMessage_TextEles;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Overtime']")
	private WebElement inbox_Overtime_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Compensatory off']")
	private WebElement inbox_compensatoryOff_Link;
	
	@FindBy(xpath="//span[contains(text(),'Performance')]")
	private WebElement setup_Performance_Link;
	
	@FindBy(xpath="//span[contains(text(),'Performance')]/../..//span[contains(text(),'Settings')]")
	private WebElement performance_Settings_Link;
	
	@FindBy(xpath="//span[contains(text(),'Goal bank')]")
	private WebElement performance_GoalBank_Link;
	
	@FindBy(xpath="//span[contains(text(),'Goal sheet template')]")
	private WebElement performance_GoalSheetTemplate_Link;
	
	@FindBy(xpath="//span[contains(text(),'Goal policy')]")
	private WebElement performance_GoalPolicy_Link;
	
	@FindBy(xpath="//span[text()='Goal sheet ']")
	private WebElement performance_GoalSheet_Link;
	
	@FindBy(xpath="//span[text()='Performance ']/../..//span[text()='Workflow ']")
	private WebElement performance_Workflow_Link;
	
	@FindBy(xpath="//a[contains(text(),'Extend goal')]")
	private WebElement actions_PMS_ExtendGoal_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Create goal']")
	private WebElement inbox_New_CreateGoal_Link;
	
	@FindBy(xpath="//h3[contains(text(),'Create goal')]/../..//i")
	private List<WebElement> insights_CreateGoal_CrossBtns;
	
	@FindBy(xpath="//button[@class='cls-secbtn']")
	private WebElement search_filter_icon;
	
	@FindBy(xpath="//button[text()='Yes, Continue']")
	private WebElement yesContinue_Btn;
	
	@FindBy(xpath="//span[text()='Expense ']")
	private WebElement setup_Expense_link;
	
	@FindBy(xpath="//span[text()='Location group ']")
	private WebElement expense_LocationGroup_Link;
	
	@FindBy(xpath="//span[text()='Expense ']/../..//span[text()='Settings ']")
	private WebElement expense_Settings_Link;
	
	@FindBy(xpath="//span[text()='Expense policy ']")
	private WebElement expense_ExpensePolicy_Link;
	
	@FindBy(xpath="//span[text()='Currency ']")
	private WebElement expense_Currency_Link;
	
	@FindBy(xpath="//span[text()='Expense ']")
	private WebElement request_Expense_Link;
	
	@FindBy(xpath="//span[text()='Expense advance ']")
	private WebElement request_ExpenseAdvance_Link;
	
	@FindBy(xpath="//a[contains(text(),'Expense advance')]")
	private WebElement actions_ExpenseAdvance_link;
	
	@FindBy(xpath="//h2[text()='Expense advance request']/../../../../..//i")
	private WebElement actions_ExpenseAdvance_FlyerCrossIcon;
	
	@FindBy(xpath="//h5[text()='Actions']")
	private WebElement team_ActionsFlyer_title;
	
	@FindBy(xpath="(//a[contains(text(),'Expense')])[1]")
	private WebElement actions_Expense_Link;
	
	@FindBy(xpath="//h2[text()='Expense']/../../../../../../../..//i")
	private WebElement actions_Expense_FlyerCrossIcon;
	
	@FindBy(xpath="//a[text()='VIEW WORKFLOW']")
	private WebElement viewWorkflow_Label;
	@FindBy(xpath="//a[contains(text(),'View activity log')]")
	private WebElement ViewActivityLog_Link;
	
	@FindBy(xpath="(//h5[text()='ACTIVITY LOG'])[2]/..//a")
	private WebElement ActivityLog_CrossIcon;
	
	@FindBy(xpath="(//h5[contains(text(),'ACTIVITY LOG')])/..//a//i")
	private WebElement DispenseActivityLog_CrossIcon;
	
	@FindBys({@FindBy(xpath="//div[contains(@class,'rpanel-title1')]//i")})
	private List<WebElement> insights_DispenseAdvance_FlyerCrossBtn;
	
	@FindBy(xpath="//span[contains(text(),'Organization')]/..//..//span[contains(text(),'Customer')]")
	private WebElement Customer_Link;
	
	@FindBy(xpath="//span[contains(text(),'Project')]")
	private WebElement project_link;
	
	@FindBy(xpath="//h5[text()=' Customer']/..//i[contains(text(),'clear')]")
	private WebElement customerClear_Icon;
	
	@FindBy(xpath="//button[contains(text(),'APPLY FILTER')]")
	private WebElement applyFilter_btn;
	
	@FindBy(xpath="//span[text()='CXO access ']")
	private WebElement cxoAccess_link;
			
	@FindBy(xpath="(//span[contains(text(),'New')])[1]/../..//span[text()='Expense']")
	private WebElement inbox_Expense_Link;
	
	@FindBys({@FindBy(xpath="//div[contains(@class,'rpanel-title')]//i")})
	private List<WebElement> taskInsights_Flyer_CrossIcon;
	
	@FindBy(xpath="(//span[contains(text(),'New')])[1]/../..//span[text()='Initiate review']")
	private WebElement inbox_InitiateReview_Link;
	
	@FindBy(xpath="//span[text()='Onboarding policy ']")
	private WebElement OnboardingPolicy_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]")
	private WebElement InboxNew_link;
	
	@FindBy(xpath="//span[contains(text(),'Archive')]")
	private WebElement inboxArchives_link;
	
	@FindBy(xpath="//div//a[text()='Expense payment']")
	private WebElement actions_expensePayment_link;
	
	@FindBy(xpath="//span[@ng-reflect-text='Survey']")
	private WebElement availableSearchSurvey_link;
	
	@FindBy(xpath="//button[text()='GO']")
	private WebElement hrdeskGo_btn;
	
	@FindBy(xpath="//button[text()=' Unpublish ']")
	private WebElement unpublish_btn;
	
	@FindBy(xpath="//button[contains(text(),'YES, UNPUBLISH')]")
	private WebElement yesUnpublish_btn;
	
	@FindBy(xpath="//span[text()='Widget access ']")
	private WebElement widgetAccess_link;
	
	@FindBy(xpath="//span[text()='Payment bank ']")
	private WebElement paymentBank_link;
	
	@FindBy(xpath="//span[text()='Forms ']")
	private WebElement forms_link;
	
	@FindBy(xpath="//a[text()=' Profile ']")
	private WebElement profile_link;
	
	@FindBy(xpath="//div//a[text()='Bank']")
	private WebElement import_bank_link;
	
	@FindBy(xpath="//div//a[text()='Education']")
	private WebElement import_Education_link;
	
	@FindBy(xpath="//div//a[text()='Family']")
	private WebElement import_Family_link;
	
	@FindBy(xpath="//div//a[text()='Contract details']")
	private WebElement import_contractDetails_link;
	
	@FindBy(xpath="//span[contains(text(),'Onboarding policy')]")
	private WebElement onboardingPolicy_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]")
	private WebElement inboxNew_link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[contains(text(),'Exceptional expense')]")
	private WebElement inbox_ExceptionalExpense_Link;
	
	@FindBy(xpath="//a[contains(text(),'Add upcoming join')]")
	private WebElement actions_AddUpcomingJoin_Link;
	
	@FindBy(xpath="//span[text()=' Save ']")
	private WebElement createUpcomingJoin_SaveBtn;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Pre boarding']")
	private WebElement inbox_Preboarding_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='Upcoming join']")
	private WebElement inbox_UpcomingJoin_Link;
	
	@FindBy(xpath="//span[contains(text(),'New')]/../..//span[text()='On boarding']")
	private WebElement inbox_onBoarding_Link;
	
	@FindBy(xpath="//div//a[text()='Employees other details']")
	private WebElement otherDetails_link;
	
	@FindBy(xpath="//div//a[text()='Health insurance']")
	private WebElement healthInsurance_link;
	
	@FindBy(xpath="//div//a[text()='Nominee details']")
	private WebElement nomineeDetails_link;
	
	@FindBy(xpath="//div//a[text()='Other dependents']")
	private WebElement otherDependents_link;
	
	@FindBy(xpath="//div//a[text()='Parent and spouse details']")
	private WebElement parentAndSpouseDetails_link;
	
	@FindBy(xpath="//div//a[text()='Personal']")
	private WebElement personalDetails_link;
	
	@FindBy(xpath="//div//a[text()='Previous employer details']")
	private WebElement previousEmployerDetails_link;
	
	@FindBy(xpath="//div//a[text()='Single sign on']")
	private WebElement singleSignOn_link;
	
	@FindBy(xpath="//div//a[text()='Work experience']")
	private WebElement workExperience_link;
	
	@FindBy(xpath="//a//span[text()='Job opening ']")
	private WebElement jobOpening_link;
	
	@FindBy(xpath="//div//a[text()='Add candidate']")
	private WebElement addCandidate_link;
	
	@FindBy(xpath="//div//a[text()='Edit candidate']")
	private WebElement editCandidate_link;
	
	@FindBy(xpath="//div//a[text()='Job opening']")
	private WebElement hrdeskJobOpening_link;
	
	@FindBy(xpath="//div//a[text()='Job opening ']")
	private WebElement teamsJobOpening_link;
	
	@FindBy(xpath="//div//a[text()='Assign shift ']")
	private WebElement teamsAssignShift_link;
	
	@FindBy(xpath="//div//a[text()='Attendance status ']")
	private WebElement teamsAttendanceStatus_link;
	
	public WebElement getTeamsAttendanceStatus_link() {
		return teamsAttendanceStatus_link;
	}

	public WebElement getTeamsAssignShift_link() {
		return teamsAssignShift_link;
	}

	public WebElement getTeamsActions_crossBtn() {
		return teamsActions_crossBtn;
	}
	
	public WebElement getTeamsJobOpening_link() {
		return teamsJobOpening_link;
	}


	public WebElement getHrdeskJobOpening_link() {
		return hrdeskJobOpening_link;
	}


	public WebElement getEditCandidate_link() {
		return editCandidate_link;
	}


	public WebElement getAddCandidate_link() {
		return addCandidate_link;
	}


	public WebElement getJobOpening_link() {
		return jobOpening_link;
	}


	public WebElement getWorkExperience_link() {
		return workExperience_link;
	}


	public void setWorkExperience_link(WebElement workExperience_link) {
		this.workExperience_link = workExperience_link;
	}


	public WebElement getSingleSignOn_link() {
		return singleSignOn_link;
	}


	public WebElement getPreviousEmployerDetails_link() {
		return previousEmployerDetails_link;
	}


	public WebElement getPersonalDetails_link() {
		return personalDetails_link;
	}


	public WebElement getParentAndSpouseDetails_link() {
		return parentAndSpouseDetails_link;
	}


	public WebElement getOtherDependents_link() {
		return otherDependents_link;
	}


	public WebElement getNomineeDetails_link() {
		return nomineeDetails_link;
	}


	public WebElement getHealthInsurance_link() {
		return healthInsurance_link;
	}


	public WebElement getImport_OtherDetails_link() {
		return otherDetails_link;
	}


	public WebElement getInbox_onBoarding_Link() {
		return inbox_onBoarding_Link;
	}

	
	public WebElement getImport_contractDetails_link() {
		return import_contractDetails_link;
	}

	public WebElement getImport_Family_link() {
		return import_Family_link;
	}

	public WebElement getImport_Education_link() {
		return import_Education_link;
	}

	public WebElement getImport_bank_link() {
		return import_bank_link;
	}

	public WebElement getProfile_link() {
		return profile_link;
	}

	public WebElement getForms_link() {
		return forms_link;
	}

	public WebElement getPaymentBank_link() {
		return paymentBank_link;
	}
	
	public WebElement getWidgetAccess_link() {
		return widgetAccess_link;
	}

	public WebElement getYesUnpublish_btn() {
		return yesUnpublish_btn;
	}

	public WebElement getUnpublish_btn() {
		return unpublish_btn;
	}

	public WebElement getHrdeskGo_btn() {
		return hrdeskGo_btn;
	}

	public WebElement getAvailableSearchSurvey_link() {
		return availableSearchSurvey_link;
	}

	public WebElement getAvailableSearch() {
		return availableSearch_link;
	}

	public WebElement getActions_ExpensePayment_link() {
		return actions_expensePayment_link;
	}

	public WebElement getInboxArchives_link() {
		return inboxArchives_link;
	}

	public WebElement getInboxNew_link() {
		return InboxNew_link;
	}

	public WebElement getLocation_Link() {
		return location_Link;
	}



	public WebElement getInbox_UpcomingJoin_Link() {
		return inbox_UpcomingJoin_Link;
	}

	public WebElement getInbox_Preboarding_Link() {
		return inbox_Preboarding_Link;
	}

	public WebElement getCreateUpcomingJoin_SaveBtn() {
		return createUpcomingJoin_SaveBtn;
	}

	public WebElement getActions_AddUpcomingJoin_Link() {
		return actions_AddUpcomingJoin_Link;
	}

	public WebElement getInbox_ExceptionalExpense_Link() {
		return inbox_ExceptionalExpense_Link;
	}

//	public WebElement getInboxNew_link() {
//		return inboxNew_link;
//	}
//
//	public WebElement getLocation_Link() {
//		return location_Link;
//	}
//
	public WebElement getOnboardingPolicy_link() {
		return onboardingPolicy_link;

	}

	public WebElement getInbox_InitiateReview_Link() {
		return inbox_InitiateReview_Link;
	}

	public List<WebElement> getTaskInsights_Flyer_CrossIcon() {
		return taskInsights_Flyer_CrossIcon;
	}

	public WebElement getInbox_Expense_Link() {
		return inbox_Expense_Link;

	}
	
	public WebElement getCxoAccess_link() {
		return cxoAccess_link;
	}

	public WebElement getApplyFilter_btn() {
		return applyFilter_btn;
	}

	public WebElement getCustomerClear_Icon() {
		return customerClear_Icon;
	}

	public WebElement getProject_link() {
		return project_link;
	}

	public WebElement getCustomer_Link() {
		return Customer_Link;
	}

	public List<WebElement> getInsights_DispenseAdvance_FlyerCrossBtn() {
		return insights_DispenseAdvance_FlyerCrossBtn;
	}

	public WebElement getDispenseActivityLog_CrossIcon() {
		return DispenseActivityLog_CrossIcon;
	}

	public WebElement getActivityLog_CrossIcon() {
		return ActivityLog_CrossIcon;
	}

	public WebElement getViewActivityLog_Link() {
		return ViewActivityLog_Link;
	}

	public WebElement getViewWorkflow_Label() {
		return viewWorkflow_Label;
	}

	public WebElement getActions_Expense_FlyerCrossIcon() {
		return actions_Expense_FlyerCrossIcon;
	}

	public WebElement getActions_Expense_Link() {
		return actions_Expense_Link;
	}

	public WebElement getTeam_ActionsFlyer_title() {
		return team_ActionsFlyer_title;
	}

	public WebElement getActions_ExpenseAdvance_FlyerCrossIcon() {
		return actions_ExpenseAdvance_FlyerCrossIcon;
	}

	public WebElement getActions_ExpenseAdvance_link() {
		return actions_ExpenseAdvance_link;
	}

	public WebElement getRequest_ExpenseAdvance_Link() {
		return request_ExpenseAdvance_Link;
	}
			
    public WebElement getRequest_Expense_Link() {
		return request_Expense_Link;
	}

	public WebElement getExpense_Currency_Link() {
		return expense_Currency_Link;
	}

	public WebElement getExpense_ExpensePolicy_Link() {
		return expense_ExpensePolicy_Link;
	}

	public WebElement getExpense_Settings_Link() {
		return expense_Settings_Link;
	}

	public WebElement getExpense_LocationGroup_Link() {
		return expense_LocationGroup_Link;
	}

	public WebElement getSetup_Expense_link() {
		return setup_Expense_link;
	}

	public WebElement getYesContinue_Btn() {
		return yesContinue_Btn;
	}

	public WebElement getSearch_filter_icon() {
		return search_filter_icon;
	}

	public List<WebElement> getInsights_CreateGoal_CrossBtns() {
		return insights_CreateGoal_CrossBtns;
	}

	public WebElement getInbox_New_CreateGoal_Link() {
		return inbox_New_CreateGoal_Link;
	}

	public WebElement getActions_PMS_ExtendGoal_Link() {
		return actions_PMS_ExtendGoal_Link;
	}

	public WebElement getPerformance_Workflow_Link() {
		return performance_Workflow_Link;
	}

	public WebElement getPerformance_GoalSheet_Link() {
		return performance_GoalSheet_Link;
	}

	public WebElement getPerformance_GoalPolicy_Link() {
		return performance_GoalPolicy_Link;
	}

	public WebElement getPerformance_GoalSheetTemplate_Link() {
		return performance_GoalSheetTemplate_Link;
	}

	public WebElement getPerformance_GoalBank_Link() {
		return performance_GoalBank_Link;
	}

	public WebElement getPerformance_Settings_Link() {
		return performance_Settings_Link;
	}

	public WebElement getSetup_Performance_Link() {
		return setup_Performance_Link;
	}

	public WebElement getInbox_compensatoryOff_Link() {
		return inbox_compensatoryOff_Link;
	}

	public WebElement getInbox_Overtime_Link() {
		return inbox_Overtime_Link;
	}

	public List<WebElement> getInboxBlankMessage_TextEles() {
		return inboxBlankMessage_TextEles;
	}

	public List<WebElement> getTabCardEles() {
		return tabCardEles;
	}

	public List<WebElement> getInsights_InitiateSettlement_CrossBtn() {
		return insights_InitiateSettlement_CrossBtn;
	}

	public WebElement getInbox_InitiateSettlement_link() {
		return inbox_InitiateSettlement_link;
	}

	public WebElement getInbox_ResignationCancel_link() {
		return inbox_ResignationCancel_link;
	}

	public WebElement getInbox_LeaveCancel_link() {
		return inbox_LeaveCancel_link;
	}

	public WebElement getInbox_ShortLeaveCancel_Link() {
		return inbox_ShortLeaveCancel_Link;
	}

	public WebElement getInbox_OD_Cancel_link() {
		return inbox_OD_Cancel_link;
	}

	public WebElement getInbox_AR_RequestCancel_link() {
		return inbox_AR_RequestCancel_link;
	}

	public WebElement getRequest_Approved_Link() {
		return request_Approved_Link;
	}

	public WebElement getTeamActions_CrossBtn() {
		return teamActions_CrossBtn;
	}

	public WebElement getHrdesk_Imports_OverridePaidDays_Link() {
		return hrdesk_Imports_OverridePaidDays_Link;
	}

	public WebElement getHrdesk_Imports_OverrideOvertime_Link() {
		return hrdesk_Imports_OverrideOvertime_Link;
	}

	public WebElement getHrdesk_Reports_Link() {
		return hrdesk_Reports_Link;
	}

	public WebElement getYouWantToApplyThisPolicyOnSave_btn() {
		return youWantToApplyThisPolicyOnSave_btn;
	}
	
	public WebElement getYesDelete_btn() {
		return yesDelete_btn;
	}

	public static WebElement getSnackbarMsg_ReportDownloadedSuccessfully_ele() {
		return snackbarMsg_ReportDownloadedSuccessfully_ele;
	}

	public WebElement getHrdesk_Actions_SalaryDashboard_Link() {
		return hrdesk_Actions_SalaryDashboard_Link;
	}

	public WebElement getFilter_Icon() {
		return filter_Icon;
	}

	public static List<WebElement> getSnackbarMsg_ReportDownloadedSuccessfully() {
		return snackbarMsg_ReportDownloadedSuccessfully;
	}

	public WebElement getHrdesk_Actions_AttendanceDashboard_Link() {
		return hrdesk_Actions_AttendanceDashboard_Link;
	}

	public WebElement getInbox_enterEmployeeCodeOrName_InputField() {
		return inbox_enterEmployeeCodeOrName_InputField;
	}

	public WebElement getInbox_searchIcon() {
		return inbox_searchIcon;
	}

	public List<WebElement> getTaxRegime_Labels() {
		return taxRegime_Labels;
	}

	public List<WebElement> getHowIsYourMoodToday_Labels() {
		return howIsYourMoodToday_Labels;
	}

	public WebElement getSetup_Engage_HappinessIndex_Link() {
		return setup_Engage_HappinessIndex_Link;
	}

	public WebElement getInbox_InitiativeFeedback_Link() {
		return inbox_InitiativeFeedback_Link;
	}

	public WebElement getInbox_Initiative_Link() {
		return inbox_Initiative_Link;
	}

	public WebElement getInbox_One_On_One_Link() {
		return inbox_One_On_One_Link;
	}
	
	public List<WebElement> getHome_NewMessage_AlertIcons() {
		return home_NewMessage_AlertIcons;
	}

	public WebElement getHome_Icon() {
		return home_Icon;
	}

	public WebElement getSetup_Engage_Badge_Link() {
		return setup_Engage_Badge_Link;
	}

	public WebElement getSetup_Engage_RewardPoints_Link() {
		return setup_Engage_RewardPoints_Link;
	}

	public WebElement getSetup_Engage_Settings_Link() {
		return setup_Engage_Settings_Link;
	}

	public WebElement getSetup_Engage_Link() {
		return setup_Engage_Link;
	}

	public WebElement getHrdesk_imports_ChangePaygroup_Link() {
		return hrdesk_imports_ChangePaygroup_Link;
	}

	public WebElement getHrdesk_imports_ReqReimbursement_POC_Link() {
		return hrdesk_imports_ReqReimbursement_POC_Link;
	}

	public WebElement getHrdesk_imports_ReimbursementBills_PBD_Link() {
		return hrdesk_imports_ReimbursementBills_PBD_Link;
	}

	public WebElement getHrdesk_imports_ReimbursementOpeningBal_PayOnClaim_Link() {
		return hrdesk_imports_ReimbursementOpeningBal_PayOnClaim_Link;
	}

	public WebElement getHrdesk_imports_MonthlyVariable_Link() {
		return hrdesk_imports_MonthlyVariable_Link;
	}

	public WebElement getAreYouSureYouWantToRemove_YesRemove_Btn() {
		return areYouSureYouWantToRemove_YesRemove_Btn;
	}

	public WebElement getBusinessUnit_Tab() {
		return businessUnit_Tab;
	}

	public WebElement getHrdesk_Imports_InvestmentDeclaration_Link() {
		return hrdesk_Imports_InvestmentDeclaration_Link;
	}

	public WebElement getInbox_DispenseLoan_Link() {
		return inbox_DispenseLoan_Link;
	}

	public WebElement getInbox_Reimbursement_Link() {
		return inbox_Reimbursement_Link;
	}

	public WebElement getHrdesk_Actions_Reimbursement_Link() {
		return hrdesk_Actions_Reimbursement_Link;
	}

	public WebElement getRequest_Reimbursement_Link() {
		return request_Reimbursement_Link;
	}

	public WebElement getApprove_Btn() {
		return approve_Btn;
	}

	public WebElement getReject_Btn() {
		return reject_Btn;
	}

	public WebElement getInbox_Loan_Link() {
		return inbox_Loan_Link;
	}

	public WebElement getHrdesk_Actions_Loan_Link() {
		return hrdesk_Actions_Loan_Link;
	}

	public WebElement getRequest_Loan_Link() {
		return request_Loan_Link;
	}

	public WebElement getInbox_ProposeInvest_Link() {
		return inbox_ProposeInvest_Link;
	}

	public WebElement getHrdesk_Actions_ProposedInvestmentDeclaration_link() {
		return hrdesk_Actions_ProposedInvestmentDeclaration_link;
	}

	public WebElement getRequest_ProposeInvest_Link() {
		return request_ProposeInvest_Link;
	}

	public WebElement getHrdesk_TaskInsights_Label() {
		return hrdesk_TaskInsights_Label;
	}

	public WebElement getInbox_SalaryStructure_Link() {
		return inbox_SalaryStructure_Link;
	}

	public static List<WebElement> getDropdownOptionEles() {
		return dropdownOptionEles;
	}

	public WebElement getPayroll_PG_PayComp_UpdateBtn() {
		return payroll_PG_PayComp_UpdateBtn;
	}

	public WebElement getPayroll_PG_PayComp_SaveBtn() {
		return payroll_PG_PayComp_SaveBtn;
	}

	public WebElement getHrdesk_Imports_EmployeeStatutory_link() {
		return hrdesk_Imports_EmployeeStatutory_link;
	}

	public WebElement getAddBulkEmployee_Done_btn() {
		return addBulkEmployee_Done_btn;
	}

	public WebElement getPasteEmployeeCodes_InputField() {
		return pasteEmployeeCodes_InputField;
	}

	public List<WebElement> getShowMoreBtns() {
		return showMoreBtns;
	}

	public WebElement getSetup_WF_Checklist_Link() {
		return setup_WF_Checklist_Link;
	}

	public WebElement getHrdesk_Imports_Snapshot_Link() {
		return hrdesk_Imports_Snapshot_Link;
	}

	public WebElement getHrdesk_Imports_EmployeeCTCManual_Link() {
		return hrdesk_Imports_EmployeeCTCManual_Link;
	}

	public WebElement getHrdesk_Imports_FlyerCrossBtn() {
		return hrdesk_Imports_FlyerCrossBtn;
	}

	@FindBy(xpath="//span[text()='OK']")
	private static WebElement fileUploadedSuccessfully_OkBtn;
	

	public static WebElement getFileUploadedSuccessfully_OkBtn() {
		return fileUploadedSuccessfully_OkBtn;
	}

	public static List<WebElement> getSnackBarMsg_FileUploadedSuccessfully() {
		return snackBarMsg_FileUploadedSuccessfully;
	}

	public WebElement getHrdesk_imports_EmployeeCTCAuto_Link() {
		return hrdesk_imports_EmployeeCTCAuto_Link;
	}

	public WebElement getHrdesk_Actions_SalStructure_Edit_Btn() {
		return hrdesk_Actions_SalStructure_Edit_Btn;
	}

	public WebElement getHrdesk_Actions_SalaryStructure_Link() {
		return hrdesk_Actions_SalaryStructure_Link;
	}

	public WebElement getPayroll_assignSalaryStructure_Btn() {
		return payroll_assignSalaryStructure_Btn;
	}

	public WebElement getNewJoinCtc_Flyer_CrossBtn() {
		return newJoinCtc_Flyer_CrossBtn;
	}

	public WebElement getEmployeeSalaryStructure_Flyer_CrossBtn() {
		return employeeSalaryStructure_Flyer_CrossBtn;
	}

	public WebElement getInbox_NewJoinCTC_Link() {
		return inbox_NewJoinCTC_Link;
	}

	public WebElement getInbox_confirmationLetter_Link() {
		return inbox_confirmationLetter_Link;
	}

	public WebElement getInbox_ExtensionLetter_Link() {
		return inbox_ExtensionLetter_Link;
	}

	public WebElement getInbox_TerminationLetter_Link() {
		return inbox_TerminationLetter_Link;
	}

	public static List<WebElement> getSnackBarMsg_LetterGeneratedSuccessfully() {
		return snackBarMsg_LetterGeneratedSuccessfully;
	}

	public WebElement getPayroll_LetterTemplate_Link() {
		return payroll_LetterTemplate_Link;
	}

	public WebElement getPayroll_Workflow_Link() {
		return payroll_Workflow_Link;
	}

	public WebElement getPayRoll_PG_PayComponentPlus_Icon() {
		return payRoll_PG_PayComponentPlus_Icon;
	}

	public WebElement getPayroll_PayGroup_Link() {
		return payroll_PayGroup_Link;
	}

	public WebElement getDoYouWantToCloseWindow_ConfirmBtn() {
		return doYouWantToCloseWindow_ConfirmBtn;
	}

	public WebElement getPayroll_FinancialYear_Dd() {
		return payroll_FinancialYear_Dd;
	}

	public WebElement getPayroll_Slabs_Link() {
		return payroll_Slabs_Link;
	}

	public WebElement getPayroll_Challan_Link() {
		return payroll_Challan_Link;
	}

	public WebElement getPayroll_Statutory_Link() {
		return payroll_Statutory_Link;
	}

	public WebElement getPayroll_Settings_Link() {
		return payroll_Settings_Link;
	}

	public WebElement getSetup_Payroll_Link() {
		return setup_Payroll_Link;
	}

	public WebElement getActions_InviteToHrone_SendPassword_Btn() {
		return actions_InviteToHrone_SendPassword_Btn;
	}
	
	public WebElement getChatbot_Label() {
		return chatbot_Label;
	}

	public WebElement getActions_InviteToHrone_searchByNameCodeDesig_Ele() {
		return actions_InviteToHrone_searchByNameCodeDesig_Ele;
	}

	@FindBy(xpath="//span[text()=' SEND PASSWORD ']")
	private WebElement inviteToHrone_SendPwd_Btn;
	
	public WebElement getInviteToHrone_SendPwd_Btn() {
		return inviteToHrone_SendPwd_Btn;
	}

	public WebElement getHrdesk_Actions_InviteToHrOne_Link() {
		return hrdesk_Actions_InviteToHrOne_Link;
	}

	public WebElement getHrdesk_Actions_changeManager_Link() {
		return hrdesk_Actions_changeManager_Link;
	}

	public WebElement getHrdesk_Actions_AttendanceStatus_Link() {
		return hrdesk_Actions_AttendanceStatus_Link;
	}

	public WebElement getProfile_HrHandbook_Link() {
		return profile_HrHandbook_Link;
	}

	public WebElement getHrdesk_Actions_HrHandbook_Link() {
		return hrdesk_Actions_HrHandbook_Link;
	}

	public WebElement getInbox_NewAnnouncementReadItBtn() {
		return inbox_NewAnnouncementReadItBtn;
	}
	
	public WebElement getInbox_NewAnnouncement_Link() {
		return inbox_NewAnnouncement_Link;
	}

	public WebElement getAvatar_Icon() {
		return avatar_Icon;
	}

	public WebElement getHrdeskActions_crossBtn() {
		return hrdeskActions_crossBtn;
	}

	public WebElement getActionsEngageAnnouncement_link() {
		return actionsEngageAnnouncement_link;
	}

	public WebElement getServices_Link() {
		return services_Link;
	}

	public WebElement getInbox_VerifyOverTime_Link() {
		return inbox_VerifyOverTime_Link;
	}

	public WebElement getInbox_VerifyCompensatoryOff_Link() {
		return inbox_VerifyCompensatoryOff_Link;
	}

	public WebElement getSearchEmployeePopup_CrossBtn() {
		return searchEmployeePopup_CrossBtn;
	}

	public WebElement getTeam_Action_Btn() {
		return team_Action_Btn;
	}

	public WebElement getInbox_RestrictedHoliday_Link() {
		return inbox_RestrictedHoliday_Link;
	}

	public WebElement getInbox_OnDuty_Link() {
		return inbox_OnDuty_Link;
	}

	public WebElement getInbox_ShortLeave_Link() {
		return inbox_ShortLeave_Link;
	}

	public WebElement getInbox_Leave_Link() {
		return inbox_Leave_Link;
	}

	public WebElement getInbox_AttendanceRegularization_Link() {
		return inbox_AttendanceRegularization_Link;
	}

	public WebElement getHrdesk_Actions_ShortLeave() {
		return hrdesk_Actions_ShortLeave;
	}

	public WebElement getHrdesk_Actions_attendanceRegularization_Link() {
		return hrdesk_Actions_attendanceRegularization_Link;
	}

	public WebElement getHrdesk_Actions_restrictedHoliday_Link() {
		return hrdesk_Actions_restrictedHoliday_Link;
	}

	public WebElement getHrdesk_Actions_OnDuty_Link() {
		return hrdesk_Actions_OnDuty_Link;
	}

	public WebElement getHrdesk_Actions_Leave_Link() {
		return hrdesk_Actions_Leave_Link;
	}

	public WebElement getActionsAssignShift_Link() {
		return actionsAssignShift_Link;
	}

	public WebElement getShortLeave_Link() {
		return shortLeave_Link;
	}

	public WebElement getReq_ConfirmedPopup() {
		return req_ConfirmedPopup;
	}
	
	public WebElement getRequestRestrictedHoliday_Link() {
		return requestRestrictedHoliday_Link;
	}

	public WebElement getRequestOnDuty_Link() {
		return requestOnDuty_Link;
	}


			
	public WebElement getRequestLeave_Link() {
		return requestLeave_Link;
	}

	public WebElement getTimeOfficeWorkflow_Link() {
		return timeOfficeWorkflow_Link;
	}

	public WebElement getDataAccess_Link() {
		return dataAccess_Link;
	}

	public WebElement getAttendanceRegularizationLink() {
		return attendanceRegularizationLink;
	}

	public WebElement getPageAccess_Link() {
		return pageAccess_Link;
	}

	public WebElement getAccessRights_Link() {
		return accessRights_Link;
	}

	public WebElement getTimeOfficeShortLeave_Link() {
		return timeOfficeShortLeave_Link;
	}

	public WebElement getTimeOfficeLeave_Link() {
		return timeOfficeLeave_Link;
	}

	public WebElement getTimeOfficeCheckinPolicy_Link() {
		return timeOfficeCheckinPolicy_Link;
	}

	public WebElement getTimeOfficeAttendance_Link() {
		return timeOfficeAttendance_Link;
	}

	public WebElement getTimeOfficeHoliday_Link() {
		return timeOfficeHoliday_Link;
	}

	public WebElement getTimeOfficeWeeklyOff_Link() {
		return timeOfficeWeeklyOff_Link;
	}

	public WebElement getTimeOfficeShiftRotation_Link() {
		return timeOfficeShiftRotation_Link;
	}

	public WebElement getTimeOfficeShift_Link() {
		return timeOfficeShift_Link;
	}
	public WebElement getTimeOffice_Link() {
		return timeOffice_Link;
	}

	public WebElement getTimeOfficeSetting_Link() {
		return timeOfficeSetting_Link;
	}

	public WebElement getInbox_Confirmation_Link() {
		return inbox_Confirmation_Link;
	}

	public WebElement getInsights_Link() {
		return insights_Link;
	}

	public WebElement getInbox_Icon() {
		return inbox_Icon;
	}

	public WebElement getRequestPending_Link() {
		return requestPending_Link;
	}

	public List<WebElement> getCardTabEles() {
		return cardTabEles;
	}

	public WebElement getViewPendingRequest_btn() {
		return viewPendingRequest_btn;
	}

	public WebElement getTeam_Icon() {
		return team_Icon;
	}

	public WebElement getNewRequest_Btn() {
		return newRequest_Btn;
	}

	public WebElement getResignation_Link() {
		return resignation_Link;
	}

	public WebElement getRequest_Icon() {
		return request_Icon;
	}

//	public WebElement getChatbot_Label() {
//		return chatbot_Label;
//	}

	public WebElement getConfirmationPolicy_Link() {
		return confirmationPolicy_Link;
	}

	public WebElement getWorkflow_Link() {
		return workflow_Link;
	}

	public static List<WebElement> getDropdownEles() {
		return dropdownEles;
	}

	public WebElement getRole_Link() {
		return role_Link;
	}

	public WebElement getFeedbackTemplate_Link() {
		return feedbackTemplate_Link;
	}

	public WebElement getSeparationPolicy_Link() {
		return separationPolicy_Link;
	}

	public WebElement getSetup_WF_Documents_Link() {
		return setup_WF_Documents_Link;
	}

	public WebElement getLoginPageHeading() {
		return loginPageHeading;
	}

	public WebElement getSetup_icon() {
		return setup_icon;
	}

	public WebElement getOrganization_Link() {
		return organization_Link;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public WebElement getInactivateBtn() {
		return inactivateBtn;
	}

	public WebElement getYesInactivateBtn() {
		return yesInactivateBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getShowMoreBtn() {
		return showMoreBtn;
	}

	public WebElement getOrganizationStructure() {
		return organizationStructure;
	}

	public WebElement getLocation() {
		return location_Link;
	}

	public static List<WebElement> getSnackBarMsg_Saved() {
		return snackBarMsg_Saved;
	}

	
	public static List<WebElement> getSnackBarMsg_Update() {
		return snackBarMsg_Update;
	}

	public WebElement getSnackBarMsg_alreadyExists() {
		return snackBarMsg_alreadyExists;
	}

//	public WebElement getSnackBarMsg_FileUploadedSuccessfully() {
//		return snackBarMsg_FileUploadedSuccessfully;
//	}

	public WebElement getSnackBarOk_btn() {
		return snackBarOk_btn;
	}

	public WebElement getGeneral() {
		return general;
	}

	public WebElement getCodeSeries() {
		return codeSeries;
	}

	public WebElement getHrDesk_icon() {
		return hrDesk_icon;
	}

	public WebElement getHrDesk_Actions_Btn() {
		return hrDesk_Actions_Btn;
	}

	public WebElement getActionsFlyer_title() {
		return actionsFlyer_title;
	}

	public WebElement getHrDesk_Imports_Btn() {
		return hrDesk_Imports_Btn;
	}

	public WebElement getNext_Btn() {
		return next_Btn;
	}

	public WebElement getWorkforce_Link() {
		return workforce_Link;
	}

	public WebElement getSettings_Link() {
		return settings_Link;
	}

	public WebElement getQualification_Link() {
		return qualification_Link;
	}

	public WebElement getLetterTemplate_Link() {
		return letterTemplate_Link;
	}

	public WebElement getPopup_ConfirmBtn() {
		return popup_ConfirmBtn;
	}
}
