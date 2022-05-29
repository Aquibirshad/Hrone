package com.hrone.genericPages;

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
public class Setup_LetterTemplatePage extends ApplicationUtility{
	public Setup_LetterTemplatePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='NEW TEMPLATE']")
	private WebElement newTemplate_Btn;
	
	@FindBy(xpath="//input[@placeholder='Template name']")
	private WebElement templateName_inputField;
	
	@FindBy(xpath="//mat-select[@placeholder='Letter process']")
	private WebElement letterProcess_Dd;
	
	@FindBy(xpath="//mat-select[@placeholder='Letter type']")
	private WebElement letterType_Dd;
	
	@FindBy(xpath="//label[text()='Click to Upload']/..//input")
	private WebElement clickToUpload_Link;
	
	@FindBy(xpath="//div[contains(text(),'Letter template ')]/../../../../..//span[text()=' SAVE ']")
	private WebElement letterTemplate_SaveBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Letter template')]")
	private WebElement letterTemplate_PageHeading;
	
	@FindBy(xpath="//div[text()='Letter template ']/../../../../..//button[text()='Edit']")
	private WebElement letterTemplate_EditBtn;
	
	@FindBy(xpath="//label[text()='Change']/..//input")
	private WebElement change_Link;
	
	@FindBy(xpath="//div[text()='Letter template ']/../../../../..//span[text()=' UPDATE ']")
	private WebElement letterTemplate_UpdateBtn;
	
	@FindBy(xpath="//div[text()='Letter template ']/../../../../..//span[text()=' INACTIVATE ']")
	private WebElement letterTemplate_InactivateBtn;

	public WebElement getLetterTemplate_InactivateBtn() {
		return letterTemplate_InactivateBtn;
	}

	public WebElement getLetterTemplate_UpdateBtn() {
		return letterTemplate_UpdateBtn;
	}

	public WebElement getLetterTemplate_EditBtn() {
		return letterTemplate_EditBtn;
	}

	public WebElement getNewTemplate_Btn() {
		return newTemplate_Btn;
	}

	public WebElement getLetterTemplate_PageHeading() {
		return letterTemplate_PageHeading;
	}

	public WebElement getLetterTemplate_SaveBtn() {
		return letterTemplate_SaveBtn;
	}

	/**
	 * This method is to click on new template button.
	 */
	public void clickOnNewTemplateBtn() {
		WaitStatementsLib.sleep(3000);
		fluentWait(newTemplate_Btn);
		click_WebElement(newTemplate_Btn);
	}

	/**
	 * This method is to enter template name.
	 * @param templateName_xl
	 */
	public void enterTemplateName(String templateName_xl) {
		
		fluentWait(templateName_inputField);
		templateName_inputField.clear();
		templateName_inputField.sendKeys(templateName_xl);
		logPass(templateName_xl+" has been entered to template name input field.");
		
	}
	
	/**
	 * This method is to select letter process dropdown.
	 * @param letterProcess_xl
	 */
	public void selLetterProcess_Dd(String letterProcess_xl) {

		fluentWait(letterProcess_Dd);
		selDropdown(letterProcess_Dd, letterProcess_xl);
		logPass(letterProcess_xl+" has been selected to letter process dropdown.");
	}
	
	/**
	 * This method is to select letter type dropdown.
	 * @param letterType_xl
	 */
	public void selLetterType(String letterType_xl) {

		fluentWait(letterType_Dd);
		selDropdown(letterType_Dd, letterType_xl);
		logPass(letterType_xl+"has been selected to letter type dropdown.");
	}

	/**
	 * This method is to upload file.
	 * @param filePath_xl
	 */
	public void uploadTemplateFile(String filePath_xl) {
		fluentWait(clickToUpload_Link);
		uploadFile(filePath_xl, clickToUpload_Link);
	}
	
	/**
	 * This method is to upload new template file.
	 * @param filePath_xl
	 */
	public void uploadNewTemplate(String filePath_xl) {
		fluentWait(change_Link);
		uploadFile(filePath_xl, change_Link);		
	}
}
