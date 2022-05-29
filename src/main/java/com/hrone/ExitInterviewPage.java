package com.hrone.genericPages;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrone.library.ApplicationUtility;

/**
 * 
 * @author shalini.sharma
 *
 */
public class ExitInterviewPage extends ApplicationUtility{
	public ExitInterviewPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='SHOW EXIT INTERVIEW ']")
	private WebElement showExitInterview_Link;
	
	@FindBy(xpath="//textarea[@placeholder='Any Suggestions']")
	private WebElement anySuggestions_TextField;

	public WebElement getShowExitInterview_Link() {
		return showExitInterview_Link;
	}
	
	public void exitInterview(String reasonForLeaving_xl,String bestThnAbtCompany_xl,String rateExp_xl,String willJoinInFuture_xl,String anySuggestions_xl) {
		
		WebElement reasonForLeavingEle = driver.findElement(By.xpath("//li[contains(text(),'Reason for leaving')]/../..//span[contains(text(),'"+reasonForLeaving_xl+"')]"));
	    scrollByJavaScriptExecutor(reasonForLeavingEle);
	    fluentWait(reasonForLeavingEle);
	    click_WebElement(reasonForLeavingEle);
	    
	    WebElement bestThnAbtCompanyEle = driver.findElement(By.xpath("//p[contains(text(),'Best thing about company')]/..//div[contains(text(),'"+bestThnAbtCompany_xl+"')]"));
	    scrollByJavaScriptExecutor(bestThnAbtCompanyEle);
	    fluentWait(bestThnAbtCompanyEle);
	    click_WebElement(bestThnAbtCompanyEle);
	    
	    WebElement rateExp = driver.findElement(By.xpath("(//p[contains(text(),'Rate your expierence with company')]/..//span)["+rateExp_xl+"]"));
	    scrollByJavaScriptExecutor(rateExp);
	    fluentWait(rateExp);
	    click_WebElement(rateExp);
	    
	    WebElement willJoinInFutureEle = driver.findElement(By.xpath("//p[contains(text(),'Will you join us again in future')]/..//div[contains(text(),'"+willJoinInFuture_xl+"')]"));
	    fluentWait(willJoinInFutureEle);
	    scrollByJavaScriptExecutor(willJoinInFutureEle);
	    click_WebElement(willJoinInFutureEle);
	    
	    fluentWait(anySuggestions_TextField);
	    anySuggestions_TextField.clear();
	    anySuggestions_TextField.sendKeys(anySuggestions_xl);
	    logFail(anySuggestions_xl+" has been entered in any suggestions input field.");
	}

}
