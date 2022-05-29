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
public class AssignRightsPage extends ApplicationUtility{
	public AssignRightsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//mat-select[@formcontrolname='company']")
	private WebElement selCompany_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='business_unit']")
	private WebElement selBusinessUnit_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='department']")
	private WebElement selDepartment_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='sub_department']")
	private WebElement selSubDepartment_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='designation']")
	private WebElement selDesignation_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='grade']")
	private WebElement selGrade_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='level']")
	private WebElement selLevel_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='region']")
	private WebElement selRegion_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='branch']")
	private WebElement selBranch_Dd;
	
	@FindBy(xpath="//mat-select[@formcontrolname='sub_branch']")
	private WebElement selSubBranch_Dd;
		
	@FindBy(xpath="//span[contains(text(),'Select All')]/..//input")
	private WebElement selectAll_ChkBox;
	
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement confirm_Btn;
	
	@FindBy(xpath="//span[text()='Do you want to change the tab?']")
	private WebElement doYouWantToChangeTab_Popup;
	
	/**
	 * This method is for assign rights page.
	 * @param provideDataAccessTabs_xl
	 * @param selectAllChkBox_xl
	 * @param employeesNameVal_xl
	 * @param selCompany_xl
	 * @param selBusinessUnit_xl
	 * @param selDepartment_xl
	 * @param selSubDepartment_xl
	 * @param selDesignation_xl
	 * @param selGrade_xl
	 * @param selLevel_xl
	 * @param selRegion_xl
	 * @param selBranch_xl
	 * @param selSubBranch_xl
	 * @param searchEmpByNameCodeDesigEmail_xl
	 * @param addBulkEmpEle TODO
	 * @param searchByNameCodeDesigEmailEle TODO
	 */
	public void assignRights(String provideDataAccessTabs_xl,String selectAllChkBox_xl,String employeesNameVal_xl,
			String selCompany_xl,String selBusinessUnit_xl,String selDepartment_xl,
			String selSubDepartment_xl,String selDesignation_xl,String selGrade_xl,String selLevel_xl,String selRegion_xl,
			String selBranch_xl,String selSubBranch_xl,String searchEmpByNameCodeDesigEmail_xl, WebElement addBulkEmpEle, WebElement searchByNameCodeDesigEmailEle) {
		
		 WaitStatementsLib.sleep(7000);
		 System.out.println(provideDataAccessTabs_xl+" tabs value");
		 driver.findElement(By.xpath("//div[contains(text(),'"+provideDataAccessTabs_xl+"')]")).click();
		
		WaitStatementsLib.sleep(1000);
		try {
			if(doYouWantToChangeTab_Popup.isDisplayed()) {
				fluentWait(confirm_Btn);
				click_WebElement(confirm_Btn);
			}
		} catch (Exception e) {
			logInfo(e.getMessage());
		}
		 
		 WaitStatementsLib.sleep(2000);
		select_Checkbox(selectAll_ChkBox, selectAllChkBox_xl);
		
		WaitStatementsLib.sleep(2000);
		if(selectAllChkBox_xl.equalsIgnoreCase("Yes")||selectAllChkBox_xl.equalsIgnoreCase("Y")) {
			if(selectAll_ChkBox.getAttribute("aria-checked").equalsIgnoreCase("false")) {
				click_WebElement(selectAll_ChkBox);
				click_WebElement(confirm_Btn);
			}
				
				WaitStatementsLib.sleep(1000);
				if(provideDataAccessTabs_xl.contains("organization")) {
					selectProvideDataAccessOrgWiseDropdowns(selCompany_xl, selBusinessUnit_xl, selDepartment_xl, selSubDepartment_xl, 
							selDesignation_xl, selGrade_xl, selLevel_xl, selRegion_xl, selBranch_xl, selSubBranch_xl);
				}
				else if(provideDataAccessTabs_xl.contains("specific")) {
					enterBulkOrSpecificEmployees(searchEmpByNameCodeDesigEmail_xl, addBulkEmpEle, searchByNameCodeDesigEmailEle);
				}
			
		}
		else if(selectAllChkBox_xl.equalsIgnoreCase("No")||selectAllChkBox_xl.equalsIgnoreCase("N")) {			
				
				WaitStatementsLib.pageLoadWait(driver, getPageloadTime());
				String[] employeesName = employeesNameVal_xl.split(",");
				int employeesNameLnth = employeesName.length;
				for(int i=0; i<employeesNameLnth; i++) {
					
					String employeesNameVal = employeesName[i];
					System.out.println(employeesNameVal+ " employees name value..........");
					WaitStatementsLib.sleep(1000);
				    WebElement empNameEle = driver.findElement(By.xpath("(//label[contains(text(),'"+employeesNameVal+"')])[1]"));
				    clickByJavascriptExecutor(empNameEle);
				    				    
					WaitStatementsLib.sleep(1000);
					if(provideDataAccessTabs_xl.contains("organization")) {
						
						String[] selCompany = selCompany_xl.split("-");
						String selCompanyVal = selCompany[i];
						selEmployeeOrgWiseDropdownOperation(selCompanyVal, selCompany_Dd);
						logPass(selCompanyVal+ " has been selected in select company dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selBusinessUnit = selBusinessUnit_xl.split("-");
						String selBusinessUnitVal = selBusinessUnit[i];
						selEmployeeOrgWiseDropdownOperation(selBusinessUnitVal, selBusinessUnit_Dd);
						logPass(selBusinessUnitVal+" has been selected in select business unit dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selDepartment = selDepartment_xl.split("-");
						String selDepartmentVal = selDepartment[i];
						selEmployeeOrgWiseDropdownOperation(selDepartmentVal, selDepartment_Dd);
						logPass(selDepartmentVal+ " has been selected in select department dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selSubDepartment = selSubDepartment_xl.split("-");
						String selSubDepartmentVal = selSubDepartment[i];
						selEmployeeOrgWiseDropdownOperation(selSubDepartmentVal, selSubDepartment_Dd);
						logPass(selSubDepartmentVal+ " has been selected in select sub department dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selDesignation = selDesignation_xl.split("-");
						String selDesignationVal = selDesignation[i];
						selEmployeeOrgWiseDropdownOperation(selDesignationVal, selDesignation_Dd);
						logPass(selDesignationVal+ " has been selected in select designation dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selGrade = selGrade_xl.split("-");
						String selGradeVal = selGrade[i];
						selEmployeeOrgWiseDropdownOperation(selGradeVal, selGrade_Dd);
						logPass(selGradeVal+" has been selected in select grade dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selLevel = selLevel_xl.split("-");
						String selLevelVal = selLevel[i];
						selEmployeeOrgWiseDropdownOperation(selLevelVal, selLevel_Dd);
						logPass(selLevelVal+" has been selected in select level dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selRegion = selRegion_xl.split("-");
						String selRegionVal = selRegion[i];
						selEmployeeOrgWiseDropdownOperation(selRegionVal, selRegion_Dd);
						logPass(selRegionVal+" has been selected in select region dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selBranch = selBranch_xl.split("-");
						String selBranchVal = selBranch[i];
						selEmployeeOrgWiseDropdownOperation(selBranchVal, selBranch_Dd);
						logPass(selBranchVal+ " has been selected in select branch dropdown.");
						
						WaitStatementsLib.sleep(1000);
						String[] selSubBranch = selSubBranch_xl.split("-");
						String selSubBranchVal = selSubBranch[i];
						selEmployeeOrgWiseDropdownOperation(selSubBranchVal, selSubBranch_Dd);
						logPass(selSubBranchVal+ " has been selected in select sub branch dropdown.");
						
					}
					else if(provideDataAccessTabs_xl.contains("specific")) {
						enterBulkOrSpecificEmployees(searchEmpByNameCodeDesigEmail_xl, addBulkEmpEle, searchByNameCodeDesigEmailEle);
					}
				}
		}
	}
	
	/**
	 * This method is for selecting provide data access organization wise dropdowns.
	 * @param selCompany_xl
	 * @param selBusinessUnit_xl
	 * @param selDepartment_xl
	 * @param selSubDepartment_xl
	 * @param selDesignation_xl
	 * @param selGrade_xl
	 * @param selLevel_xl
	 * @param selRegion_xl
	 * @param selBranch_xl
	 * @param selSubBranch_xl
	 */
	public void selectProvideDataAccessOrgWiseDropdowns(String selCompany_xl,String selBusinessUnit_xl,String selDepartment_xl,
			String selSubDepartment_xl,String selDesignation_xl,String selGrade_xl,String selLevel_xl,String selRegion_xl,
			String selBranch_xl,String selSubBranch_xl) {
		
	
		selEmployeeOrgWiseDropdownOperation(selCompany_xl, selCompany_Dd);
		logPass(selCompany_xl+ " has been selected in select company dropdown.");

		selEmployeeOrgWiseDropdownOperation(selBusinessUnit_xl, selBusinessUnit_Dd);
		logPass(selBusinessUnit_xl+ " has been selected in select business unit dropdown.");
		

		selEmployeeOrgWiseDropdownOperation(selDepartment_xl, selDepartment_Dd);
		logPass(selDepartment_xl+ " has been selected in select department dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selSubDepartment_xl, selSubDepartment_Dd);
		logPass(selSubDepartment_xl+ " has been selected in select sub department dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selDesignation_xl, selDesignation_Dd);
		logPass(selDesignation_xl+ " has been selected in select designation dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selGrade_xl, selGrade_Dd);
		logPass(selGrade_xl+ " has been selected in select grade dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selLevel_xl, selLevel_Dd);
		logPass(selLevel_xl+ " has been selected in select level dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selBranch_xl, selBranch_Dd);
		logPass(selBranch_xl+ " has been selected in select branch dropdown.");
		
		WaitStatementsLib.sleep(1000);
		selEmployeeOrgWiseDropdownOperation(selSubBranch_xl, selSubBranch_Dd);
		logPass(selSubBranch_xl+ " has been selected in select sub branch dropdown.");		
	}

}
