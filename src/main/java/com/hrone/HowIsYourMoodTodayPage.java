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
public class HowIsYourMoodTodayPage extends ApplicationUtility{
	public HowIsYourMoodTodayPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'How is your mood today')]")
	private WebElement howIsYourMoodToday_Label;
	
	@FindBy(xpath="//textarea[@placeholder='Comments']")
	private WebElement comments_InputField;
	
	@FindBy(xpath="//span[text()='Share anonymous feedback']/..//input")
	private WebElement shareAnonymousFeedback_Chkbox;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement moodBotSubmit_Btn;
	
	public WebElement getHowIsYourMoodToday_Label() {
		return howIsYourMoodToday_Label;
	}

	public WebElement getMoodBotSubmit_Btn() {
		return moodBotSubmit_Btn;
	}

	public void howIsYourMoodToday(String howIsYouMoodToday_xl,String reasons_xl,String comment_xl,String shareAnonymousFeedback_xl) {
		WebElement emojiEle = driver.findElement(By.xpath("//div[text()='"+howIsYouMoodToday_xl+"']/..//img"));
		fluentWait(emojiEle);
		click_WebElement(emojiEle);
		
		WaitStatementsLib.sleep(1000);
		String[] reason_xl = reasons_xl.split(",");
		for(int i=0; i<reason_xl.length; i++) {
			String reasonVal = reason_xl[i];
			
			WebElement reasonEle = driver.findElement(By.xpath("//mat-chip[text()='"+reasonVal+"']"));
			fluentWait(reasonEle);
			click_WebElement(reasonEle);
		}
		
		WaitStatementsLib.sleep(1000);
		enterValueToInputField(comments_InputField, comment_xl);
		logPass(comment_xl+" has been entered to comments input field.");
		
		WaitStatementsLib.sleep(1000);
		scrollByJavaScriptExecutor(shareAnonymousFeedback_Chkbox);
		select_Checkbox(shareAnonymousFeedback_Chkbox, shareAnonymousFeedback_xl);

	}

}
