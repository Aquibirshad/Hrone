package com.hrone.genericPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.hrone.library.ApplicationUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class Setup_WorkflowPage extends ApplicationUtility{
	public Setup_WorkflowPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath="//i[text()='delete']")})
	private List<WebElement> delete_Icons;
		
	@FindBy(xpath="//button[text()='New Workflow']")
	private WebElement newWorkFlow_Btn;
	
	@FindBy(xpath="//input[@formcontrolname='workflowNameControl']")
	private WebElement workflowName_InputField;
	
	@FindBy(xpath="//input[@formcontrolname='descriptionFormControl']")
	private WebElement description_InputField;
	
	@FindBy(xpath="//mat-select[@formcontrolname='requestFormControl']")
	private WebElement requestType_Dd;
	
	@FindBy(xpath="//div[text()='New']/..")
	private WebElement flowTypeNew_RdoBtn_click;
	
	@FindBy(xpath="//div[text()='New']/../..")
	private WebElement flowTypeNew_RdoBtn_verify;
	
	@FindBy(xpath="//div[text()=' Cancellation']/../..")
	private WebElement flowTypeCancellation_RdoBtn_verify;
	
	@FindBy(xpath="//div[text()=' Cancellation']/../.")
	private WebElement flowTypeCancellation_RdoBtn_click;
	
	@FindBy(xpath="//h5[contains(text(),'Information')]/../../../../..//button[text()='Next']")
	private WebElement informationNext_Btn;
	
	@FindBy(xpath="//i[text()='add']")
	private WebElement plus_Icon;
	
	@FindBy(xpath="(//h5[contains(text(),'Workflow Levels')]/../../../../..//button[text()='Next'])[1]")
	private WebElement approversNext_Btn;
	 
	@FindBy(xpath="//span[text()='SELECT ALL']/../..//input")
	private WebElement selectAll_ChkBox;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search by')]")
	private WebElement searchByNameCodeDesigEmail_InputField;
	
	@FindBy(xpath="//h5[contains(text(),'APPLICABLE ON')]/../../../../..//button[text()=' Next ']")
	private WebElement applicableOnNext_Btn;
	
	@FindBy(xpath="//mat-select[@placeholder='Select']")
	private WebElement advanceApplicabilitySelect_Dd;
	
	@FindBy(xpath="//h5[contains(text(),'Advance applicability (Optional)')]/../../../../../../../..//button[text()='Next']")
	private WebElement advanceApplicabilityNext_Btn;
	
	@FindBy(xpath="//span[text()=' FINISH ']")
	private WebElement finish_Btn;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement setupWorkflowEdit_Btn;
	
	
	public WebElement getSetupWorkflowEdit_Btn() {
		return setupWorkflowEdit_Btn;
	}

	public WebElement getApplicableOnNext_Btn() {
		return applicableOnNext_Btn;
	}

	public WebElement getFinish_Btn() {
		return finish_Btn;
	}

	public WebElement getAdvanceApplicabilityNext_Btn() {
		return advanceApplicabilityNext_Btn;
	}

	public WebElement getAdvanceApplicabilitySelect_Dd() {
		return advanceApplicabilitySelect_Dd;
	}

	public WebElement getSelectAll_ChkBox() {
		return selectAll_ChkBox;
	}

	public WebElement getSearchByNameCodeDesigEmail_InputField() {
		return searchByNameCodeDesigEmail_InputField;
	}

	public WebElement getApproversNext_Btn() {
		return approversNext_Btn;
	}

	public WebElement getNewWorkFlow_Btn() {
		return newWorkFlow_Btn;
	}

	public WebElement getInformationNext_Btn() {
		return informationNext_Btn;
	}

	/**
	 * This method is to click on workflow type.
	 * @param workflowType_xl
	 */
	public void selReqType_Workflow(String workflowType_xl) {
		WaitStatementsLib.sleep(4000);
		WebElement workflowTypEle = driver.findElement(By.xpath("//h3[contains(text(),'Workflow')]/../../../..//span[text()='"+workflowType_xl+"']"));
		fluentWait(workflowTypEle);
		scrollByJavaScriptExecutor(workflowTypEle);
		fluentWait(workflowTypEle);
		click_WebElement(workflowTypEle);
	}
	
	/**
	 * This method is to enter workflow name.
	 * @param workflowName_xl
	 */
	public void enterWorkflowName(String workflowName_xl) {
		
		fluentWait(workflowName_InputField);
		workflowName_InputField.clear();
		workflowName_InputField.sendKeys(workflowName_xl);
		logPass(workflowName_xl+" has been entered to workflow name input field");
		
	}
	
	/**
	 * This method is to enter description input field.
	 * @param description_xl
	 */
	public void enterDescription(String description_xl) {
		fluentWait(description_InputField);
		description_InputField.clear();
		description_InputField.sendKeys(description_xl);
		logPass(description_xl+" has been entered in description input field.");
	}
	
	/**
	 * This method is to select request type drop down.
	 * @param requestType_xl
	 */
	public void selRequestTypeDropdown(String requestType_xl) {
		fluentWait(requestType_Dd);
		selDropdown(requestType_Dd, requestType_xl);
		logPass(requestType_xl+" has been selected to request type dropdown.");
	}
		
	/**
	 * This method is to select flow type radio button.
	 * @param flowTypeNew_xl
	 * @param flowTypeCancellation_xl
	 */
	public void flowTypeRdaioButtonOperation(String flowTypeNew_xl,String flowTypeCancellation_xl) {
		fluentWait(flowTypeNew_RdoBtn_verify);
		selAndVerifyCheckBox(flowTypeNew_xl, flowTypeNew_RdoBtn_verify, flowTypeNew_RdoBtn_click);	
		selAndVerifyCheckBox(flowTypeCancellation_xl, flowTypeCancellation_RdoBtn_verify, flowTypeCancellation_RdoBtn_click);
	}
		
	/**
	 * This method is to add approvers.
	 * @param role_xl
	 * @param intimationOnly_xl
	 * @param dueDay_xl
	 * @param turnAroundTym_xl
	 */
	public void approvers(String role_xl,String otherSearchByNameCodeDesigEmail_xl,String intimationOnly_xl,String dueDay_xl,String turnAroundTym_xl) {
		System.out.println(role_xl+" Role value");
		String[] role = role_xl.split(",");
		int role_Lnth = role.length;
		for(int i=1; i<=role_Lnth; i++) {
			
			if(i!=role_Lnth) {
				 
				 scrollByJavaScriptExecutor(plus_Icon);
				 fluentWait(plus_Icon);
				 click_WebElement(plus_Icon);
			 }
			
			String roleVal = role[i-1];
			System.out.println(roleVal+" Role value...................");
			WebElement roleDd = driver.findElement(By.xpath("(//mat-select[@formcontrolname='roleFC'])["+i+"]"));
			fluentWait(roleDd);
			selDropdown(roleDd, roleVal);
			logPass(role_xl+" has been selected in role dropdown.");
			
			if(roleVal.equalsIgnoreCase("Other")) {
				String[] otherRole = otherSearchByNameCodeDesigEmail_xl.split(",");
				String otherRoleVal = otherRole[i-1];
				WebElement searchByNameCodeDesigEmail = driver.findElement(By.xpath("(//input[contains(@placeholder,'Search by')])["+i+"]"));
				fluentWait(searchByNameCodeDesigEmail);
				searchEmployeeByNameCodeDesigEmail(otherRoleVal, searchByNameCodeDesigEmail);
			}
			else {
				logInfo("If other is not selected to role than no need to enter value in search by name, code, designation or email.");
			}
			
			String[] intimationOnly = intimationOnly_xl.split(",");
			String initimationOnlyVal = intimationOnly[i-1];
			
			WebElement initimationOnYes_RdoBtn = driver.findElement(By.xpath("(//label[text()='Intimation only ']/..//div[text()='Yes'])["+i+"]"));
			WebElement initimationOnNo_RdoBtn = driver.findElement(By.xpath("(//label[text()='Intimation only ']/..//div[text()='No'])["+i+"]"));
			fluentWait(initimationOnYes_RdoBtn);
			scrollByJavaScriptExecutor(initimationOnYes_RdoBtn);
			radioButtonSelectionOperation(initimationOnlyVal, initimationOnYes_RdoBtn, initimationOnNo_RdoBtn);
			
			if(initimationOnlyVal.equalsIgnoreCase("No")||initimationOnlyVal.equalsIgnoreCase("N")) {
				
				String[] dueDay = dueDay_xl.split(",");
				String dueDayVal = dueDay[i-1];
				WebElement dueDayEle = driver.findElement(By.xpath("(//input[@formcontrolname='dueDateFC'])["+i+"]"));
				fluentWait(dueDayEle);
				scrollByJavaScriptExecutor(dueDayEle);
				dueDayEle.clear();
				dueDayEle.sendKeys(dueDayVal);
				logPass(dueDayVal+" has been entered to due day input field");
				
				
				WebElement turnAroundTimeEle = driver.findElement(By.xpath("(//input[@formcontrolname='turnAroundTimeFC'])["+i+"]"));
				try {
					fluentWait(turnAroundTimeEle);
					scrollByJavaScriptExecutor(turnAroundTimeEle);
					if(turnAroundTimeEle.isEnabled()) {
						String[] tat = turnAroundTym_xl.split(",");
						String tatVal = tat[i-1];
						turnAroundTimeEle.clear();
						turnAroundTimeEle.sendKeys(tatVal);
						logPass(tatVal+" has been entered to turnarount time input field.");
						
					}
				} catch (Exception e) {
					logInfo(e.getMessage());
				}
			}
			else if(initimationOnlyVal.equalsIgnoreCase("Yes")||initimationOnlyVal.equalsIgnoreCase("Y")) {
				logInfo("Not required to enter due day and turn around time.");
			}
			
			 
		}		
	}
	
	/**
	 * This method is to click on delete icons.
	 */
	public void clickOnDeleteIcon() {
	
		while(delete_Icons.size()>0) {
			for(WebElement delete_Icon:delete_Icons) {
				fluentWait(delete_Icon);
				scrollByJavaScriptExecutor(delete_Icon);
				click_WebElement(delete_Icon);
			}
		}
	}
}






