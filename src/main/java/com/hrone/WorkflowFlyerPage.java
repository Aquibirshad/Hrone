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
public class WorkflowFlyerPage extends ApplicationUtility{
	public WorkflowFlyerPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is to verify workflow panel display.
	 * @param workflowPageEle
	 * @param viewFormLabel
	 * @param formHeadingEle
	 * @param formEle
	 */
	public void verifyViewWorkflowPanelDisplay(WebElement workflowPageEle) {
		fluentWait(getViewWorkflow_Label());
		click_WebElement(getViewWorkflow_Label());
		
		WaitStatementsLib.sleep(2000);
		Assert.assertTrue(workflowPageEle.isDisplayed(), "Workflow flyer has been displayed and verified.");
	}
		
	/**
	 * This method is to verify form display.
	 * @param viewFormLabelEle
	 * @param formHeadingEle
	 * @param formEle
	 */
	public void verifyFormDisplay(WebElement viewFormLabelEle,WebElement formHeadingEle, WebElement formEle) {
		fluentWait(viewFormLabelEle);
		scrollByJavaScriptExecutor(viewFormLabelEle);
		click_WebElement(viewFormLabelEle);
		
		WaitStatementsLib.sleep(1000);
		fluentWait(formHeadingEle);
		Assert.assertTrue(formHeadingEle.isDisplayed(), "Form heading is verified.");
		
		WaitStatementsLib.sleep(1000);
		fluentWait(formEle);
		Assert.assertTrue(formEle.isDisplayed(), "Form has been displayed and verified.");
		
	}


}
