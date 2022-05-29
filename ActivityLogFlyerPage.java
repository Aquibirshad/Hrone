package com.hrone.genericPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrone.library.ApplicationUtility;
import com.hrone.library.WaitStatementsLib;

/**
 * 
 * @author shalini.sharma
 *
 */
public class ActivityLogFlyerPage extends ApplicationUtility{
	public ActivityLogFlyerPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is to verify activity log flyer display.
	 * @param activitylogFlyerTitle
	 * @param flyerContentEle
	 */
	public void verifyActivityLogDisplay(WebElement activitylogFlyerTitle,WebElement flyerContentEle) {
		fluentWait(activitylogFlyerTitle);
		
		WaitStatementsLib.sleep(2000);
		Assert.assertTrue(flyerContentEle.isDisplayed(), "Flyer content has been displayed, test has been verified.");
		
	}
}
