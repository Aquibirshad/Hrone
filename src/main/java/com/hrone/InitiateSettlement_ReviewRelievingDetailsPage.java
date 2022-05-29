package com.hrone.genericPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrone.library.ApplicationUtility;

/**
 * 
 * @author shalini.sharma
 *
 */
public class InitiateSettlement_ReviewRelievingDetailsPage extends ApplicationUtility{
	public InitiateSettlement_ReviewRelievingDetailsPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath="//h2[contains(text(),'Settlement of')]/..")})
	private List<WebElement> initiateSettlememtMainCard_Eles;
	
	@FindBy(xpath="//label[text()='Review relieving details']/../..//button")
	private WebElement reviewRelievingDetails_ReviewBtn;
	
	@FindBy(xpath="//mat-select[@name='leavingReason']")
	private WebElement leavingReason_Dd;
	
	@FindBy(xpath="//input[@placeholder='Other reason']")
	private WebElement otherReason_InputField;
	
	@FindBy(xpath="//mat-select[@name='settlementDate']")
	private WebElement settlementMonth_Dd;
	
	@FindBy(xpath="//div[text()='Review relieving details']/../../../../..//span[contains(text(),'SUBMIT')]")
	private WebElement reviewRelievingDetails_SubmitBtn;
	
	@FindBy(xpath="//h2[contains(text(),'submit')]/..//button[contains(text(),'SUBMIT')]")
	private WebElement areYouSureWantToSubmit_YesSubmitBtn;
	
	@FindBys({@FindBy(xpath="//div[contains(@class,'relieve-table-contain')]")})
	private List<WebElement> reviewReleivingDetails_Eles;
	
	public List<WebElement> getInitiateSettlememtMainCard_Eles() {
		return initiateSettlememtMainCard_Eles;
	}

	public WebElement getReviewRelievingDetails_ReviewBtn() {
		return reviewRelievingDetails_ReviewBtn;
	}

	public WebElement getAreYouSureWantToSubmit_YesSubmitBtn() {
		return areYouSureWantToSubmit_YesSubmitBtn;
	}

	public WebElement getReviewRelievingDetails_SubmitBtn() {
		return reviewRelievingDetails_SubmitBtn;
	}
	
	/**
	 * This method is to select leaving reason drop down.
	 * @param leavingReasonDd_xl
	 */
	public void selLeaveingReason(String leavingReason_xl) {
		fluentWait(leavingReason_Dd);
		selDropdown(leavingReason_Dd, leavingReason_xl);
		logPass(leavingReason_xl+" has been selected to leaving reason dropdown.");
	}
	
	/**
	 * This method is to enter value to other input field.
	 * @param leavingReason_xl
	 * @param otherReason_xl
	 */
	public void enterOtherReason(String leavingReason_xl,String otherReason_xl) {
		if(leavingReason_xl.equalsIgnoreCase("other")) {
			scrollByJavaScriptExecutor(otherReason_InputField);
			enterValueToInputField(otherReason_InputField, otherReason_xl);
			logPass(otherReason_xl+" has been entered to other reason input field.");
		}
		else {
			logInfo("Not required to enter value in other input field.");
		}
	}
	
	/**
	 * This method is to select settlement month drop down.
	 * @param settlementMonth_xl
	 */
	public void selSettlementMonth(String settlementMonth_xl) {
		scrollByJavaScriptExecutor(settlementMonth_Dd);
		selDropdown(settlementMonth_Dd, settlementMonth_xl);
		logPass(settlementMonth_xl+" has been selected to settlement month drop down.");
	}
	
	/**
	 * This method is to verify initiate settlement card display.
	 */
	public void verifyInitiateSettlementPageDisplay() {
		Assert.assertTrue(initiateSettlememtMainCard_Eles.size()>0);
		logPass("Initiate settlement main card display has been verified.");
	}
	
	/**
	 * This method is to verify review relieving details display.
	 */
	public void verifyReviewRelievingDetails_Display() {
		Assert.assertTrue(reviewReleivingDetails_Eles.size()>0);
		logPass("Review releiving details display has been verified.");
	}
}
