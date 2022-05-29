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
public class GenerateLetterPage extends ApplicationUtility{
	public GenerateLetterPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'SHOW')]/..//mat-checkbox")
	private WebElement selectAll_checkBox;
	
	@FindBy(xpath="//div[text()='Yes']")
	private WebElement doYouWantToChangeLetterTemplateYes_RdoBtn;
	
	@FindBy(xpath="//div[text()='No']")
	private WebElement doYouWantToChangeLetterTemplateNo_RdoBtn;
	
	@FindBy(xpath="//mat-select[@placeholder='Select Template']")
	private WebElement selectTemplate_Dd;
	
	@FindBy(xpath="//a[text()='Change']")
	private WebElement change_Link;
	
	@FindBy(xpath="//span[contains(text(),'download letter')]/..//input")
	private WebElement doYouWantToDownloadLetter_ChkBox;
	
	@FindBy(xpath="//button[text()='Generate & publish']")
	private WebElement generateAndPublish_All_Btn;
	
	@FindBy(xpath="//span[text()='Generate & publish']")
	private WebElement generateAndPublish_EmpWise_Btn;
	
	@FindBy(xpath="//button[text()='Ignore']")
	private WebElement ignore_All_Btn;
	
	@FindBy(xpath="//span[text()='Ignore']")
	private WebElement ignore_EmpWise_Btn;
	
	@FindBy(xpath="//h3[contains(text(),'Letter')]/../..//i")
	private WebElement letterCross_Btn;
	
	
	public WebElement getLetterCross_Btn() {
		return letterCross_Btn;
	}


	public void generateLetter(String ignoreGenerateLetter_xl,String employeeSelChkBox_xl,String doYouWantToChangeLetterTemp_xl,String selectTemplate_xl,
			String doYouWantToDownloadLetter_xl) {
		
		String[] empSelChkBoxForConf = employeeSelChkBox_xl.split(",");
		int empSelChkBoxForConfLnth = empSelChkBoxForConf.length;
		
		if(ignoreGenerateLetter_xl.equalsIgnoreCase("Generate")) {
			if(employeeSelChkBox_xl.equalsIgnoreCase("All")) {
				fluentWait(selectAll_checkBox);
				click_WebElement(selectAll_checkBox);
			}
			else {
				for(int i=0; i<empSelChkBoxForConfLnth; i++) {
					WaitStatementsLib.sleep(2000);
					String empSelChkBoxVal = empSelChkBoxForConf[i];	
					WebElement tabEle = driver.findElement(By.xpath("//div[contains(text(),'"+empSelChkBoxVal+"')]/../mat-checkbox"));
					scrollByJavaScriptExecutor(tabEle);
					fluentWait(tabEle);
					click_WebElement(tabEle);
				}
				if(empSelChkBoxForConfLnth>1 ||employeeSelChkBox_xl.equalsIgnoreCase("All") ) {
					if(doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("Yes")||doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("Y")) {
						fluentWait(selectTemplate_Dd);
						selDropdown(selectTemplate_Dd, selectTemplate_xl);
					}
					else if(doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("No")||doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("N")){
						logInfo("Selection of letter template dropdown is not required when do you want to change letter template is selected no.");
					}
					fluentWait(generateAndPublish_All_Btn);
					click_WebElement(generateAndPublish_All_Btn);
				}
				else if(empSelChkBoxForConfLnth<=1) {
					if(doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("Yes")||doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("Y")) {
						fluentWait(change_Link);
						clickByJavascriptExecutor(change_Link);
						WaitStatementsLib.sleep(1000);
						fluentWait(selectTemplate_Dd);
						selDropdown(selectTemplate_Dd, selectTemplate_xl);
					}
					else if(doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("No")||doYouWantToChangeLetterTemp_xl.equalsIgnoreCase("N")){
						logInfo("Selection of letter template dropdown is not required when do you want to change letter template is selected no.");
					}
					
					WaitStatementsLib.pageLoadWait(driver, getPageloadTime());
					fluentWait(doYouWantToDownloadLetter_ChkBox);
					select_Checkbox(doYouWantToDownloadLetter_ChkBox, doYouWantToDownloadLetter_xl);
					
					WaitStatementsLib.sleep(1000);
					fluentWait(generateAndPublish_EmpWise_Btn);
					click_WebElement(generateAndPublish_EmpWise_Btn);
				}
			}			
		}
		else if(ignoreGenerateLetter_xl.equalsIgnoreCase("Ignore")) {
			if(empSelChkBoxForConfLnth>1 ||employeeSelChkBox_xl.equalsIgnoreCase("All")) {
				fluentWait(ignore_All_Btn);
				click_WebElement(ignore_All_Btn);
			}
			else {
				scrollByJavaScriptExecutor(ignore_EmpWise_Btn);
				fluentWait(ignore_EmpWise_Btn);
				click_WebElement(ignore_EmpWise_Btn);
			}
		}
	}	

}
