package com.hrone.genericPages;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.hrone.library.ApplicationUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class LoginLogoutPage extends ApplicationUtility {
	public LoginLogoutPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='username']")
	private WebElement userName_empId;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement password;

	@FindBy(xpath = "//span[contains(text(),'LOG IN')]")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@ptooltip='Profile']")
	private WebElement avatar;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logout;

	@FindBy(xpath = "(//i[text()=' clear '])[2]")
	private WebElement ratingCrossBtn;

	@FindBy(xpath = "//h3[text()='Welcome!']")
	private WebElement loginPage_WelcomeMsg;

	@FindBy(xpath = "//h1")
	private WebElement dashboard_hiMsg;

	@FindBy(xpath = "//input[@formcontrolname='username']/../../../../../..//span[text()=' NEXT ']")
	private WebElement nextBtn;

	@FindBy(xpath = "//h3[text()=' This survey is anonymous ']")
	private WebElement survey_msg;

	@FindBy(xpath = "//div[@class='cls-surveytitle']//following-sibling::a[@class='btnclose']//i[contains(text(),'clear')]")
	private List<WebElement> pulseSurveyCross_btnSize;

	@FindBy(xpath = "//div[@class='cls-surveytitle']//following-sibling::a[@class='btnclose']//i[contains(text(),'clear')]")
	private WebElement pulseSurveyCross_btn;
	
	@FindBy(xpath="//span[text()='Login by Employee code']")
	private WebElement loginByEmployeeCode_Label;
    
	@FindBy(xpath="//input[@formcontrolname='domainCode']")
	private WebElement companyCode_InputField;

	@FindBy(xpath="//span[text()='Login by Employee code']")
	private WebElement loginByEmployeeCode_link;


	public void loginUser(String url, String login_xlData, String passward_xlData) {

		driver.navigate().to(url);
		driver.manage().deleteAllCookies();
		WaitStatementsLib.sleep(5000);
		fluentWait(loginPage_WelcomeMsg);
		Assert.assertTrue(loginPage_WelcomeMsg.isDisplayed());
		logPass("Login page has been displayed.");

		WaitStatementsLib.pageLoadWait(driver, getPageloadTime());
		
		
		WaitStatementsLib.fluentWait(driver, userName_empId, getFluentWaitTime(), 1);

		userName_empId.clear();

		
		loginByEmpCode_Or_MobileNoEmail();
		WaitStatementsLib.sleep(1000);
		userName_empId.clear();		

		WaitStatementsLib.fluentWait(driver, userName_empId, getFluentWaitTime(), 1);
		userName_empId.sendKeys(login_xlData);
		logPass(login_xlData + " has been entered in Username field.");

		fluentWait(nextBtn);
		click_WebElement(nextBtn);

		WaitStatementsLib.fluentWait(driver, password, getFluentWaitTime(), 1);
		WaitStatementsLib.sleep(4000);
		password.clear();
		WaitStatementsLib.sleep(2000);
		password.sendKeys(passward_xlData);
		logPass(passward_xlData + " has been entered in password field.");

		WaitStatementsLib.fluentWait(driver, loginBtn, getFluentWaitTime(), 1);
		click_WebElement(loginBtn);

		WaitStatementsLib.fluentWait(driver, dashboard_hiMsg, 25, 2);
//		Assert.assertTrue(dashboard_hiMsg.getText().contains("Hi"));
		logPass("Login is successful.");

//		WaitStatementsLib.sleep(3000);
//		press_RightArrowKey();
//		press_RightArrowKey();
//		press_Enter();

	}

//	public void CrossPulseIcon() {
//		for (int i = 0;; i++) {
//			if (pulseSurveyCross_btnSize.size() > 0 && survey_msg.isDisplayed()) {
//				{
//					pulseSurveyCross_btn.click();
//				}
//			} else {
//              System.out.print("pass the pulse");
//              break ;
//			}
//		}
//	}

	public void logoutUser() {
		WaitStatementsLib.sleep(3000);
		fluentWait(avatar);
		click_WebElement(avatar);
		fluentWait(logout);
		clickByJavascriptExecutor(logout);
		// Assert.assertTrue(getLoginPageHeading().getText().contains("HR-One"), "HR one
		// login page has been displayed.");
		logPass("Logout is successful.");
		WaitStatementsLib.sleep(2000);
	}
	
	/**
	 * This method is to click on login by employee code.
	 * @param loginByEmpCodeOrMobileNoEmail_xl
	 */
	public void loginByEmpCode_Or_MobileNoEmail() {
		
		if(getLoginByEmpCode().equalsIgnoreCase("Y")||getLoginByEmpCode().equalsIgnoreCase("Yes")) {
			fluentWait(loginByEmployeeCode_Label);
			scrollByJavaScriptExecutor(loginByEmployeeCode_Label);
			click_WebElement(loginByEmployeeCode_Label);
			
			WaitStatementsLib.sleep(2000);
			enterValueToInputField(companyCode_InputField,getCompanyCode());
		}
		else {
			ApplicationUtility.logInfo("Use email Id or phone number for login.");
		}
	}
}
