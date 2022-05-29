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
public class TaxRegimePopupPage extends ApplicationUtility{
	public TaxRegimePopupPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBys({@FindBy(xpath="//h4[text()='Tax Regime']")})
	private WebElement taxRegime_popupTitle;
	
	@FindBy(xpath="//h4[contains(text(),'Tax Regime')]/../..//button[text()='Submit']")
	private WebElement taxRegime_SubmitBtn;
	
	@FindBy(xpath="//h4[contains(text(),'Tax Regime')]/../..//button[text()='Ignore']")
	private WebElement taxRegime_IgnoreBtn;
	
	public WebElement getTaxRegime_popupTitle() {
		return taxRegime_popupTitle;
	}

	public WebElement getTaxRegime_SubmitBtn() {
		return taxRegime_SubmitBtn;
	}

	public WebElement getTaxRegime_IgnoreBtn() {
		return taxRegime_IgnoreBtn;
	}

	/**
	 * This method is to select old regime or new regime radio button.
	 * @param oldRegimeNewRegime_xl
	 */
	public void selOldRegimeNewRegimeRadioBtn(String oldRegimeNewRegime_xl) {	
			WebElement rdoBtnEle = driver.findElement(By.xpath("//div[contains(text(),'"+oldRegimeNewRegime_xl+"')]"));
			fluentWait(rdoBtnEle);
			click_WebElement(rdoBtnEle);
		
	}
	
}
