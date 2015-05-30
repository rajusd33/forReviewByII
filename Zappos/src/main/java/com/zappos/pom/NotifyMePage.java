package com.zappos.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NotifyMePage extends PageBase{

	@FindBy(how=How.ID, using = "email")
	private WebElement emailTextbox;
	
	@FindBy(how=How.ID, using = "styleId")
	private WebElement styleIdCombo;
	
	@FindBy(how=How.XPATH, using = "(.//*[@id='dimensionValueIds'])[1]")
	private WebElement sizeCombo;
	
	@FindBy(how=How.XPATH, using = "(.//*[@id='dimensionValueIds'])[2]")
	private WebElement widthCombo;
	
	@FindBy(how = How.XPATH, using = "//*[@id='notifyMeCommand']/button[@name='saveStockId']")
	private WebElement notifyMeButton;
	
	@FindBy(how=How.XPATH, using = "//*[@id='content']/h4")
	private WebElement acknowledgement;
	
	public NotifyMePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email){
		emailTextbox.sendKeys(email);
	}
	
	public void enterColor(String color){
		new Select(styleIdCombo).selectByVisibleText(color);
	}
	
	public void enterSize(String size){
		new Select(sizeCombo).selectByVisibleText(size);
	}
	
	public void enterWidth(String width){
		new Select(widthCombo).selectByVisibleText(width);
	}
	
	public void selectNotifyMe(){
		notifyMeButton.click();
	}
	
	public void notifyMe(String email, String colour, String size, String width){
		emailTextbox.sendKeys(email);
		new Select(styleIdCombo).selectByVisibleText(colour);
		new Select(sizeCombo).selectByVisibleText(size);
		new Select(widthCombo).selectByVisibleText(width);
		
		notifyMeButton.click();
		
	}
	
	public void verifyAcknowledgementPageDisplayed(){
		boolean acc = acknowledgement.isDisplayed();
		System.out.println(acknowledgement.getText());
		Assert.assertTrue("Acknowledgement did not displayed", acc);
	}

}
