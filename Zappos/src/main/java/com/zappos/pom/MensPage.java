package com.zappos.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MensPage extends PageBase {

	@FindBy(how=How.XPATH, using = "//*[@id='vSideCol']/div/a[text()='Boots']")
	private WebElement sideShoesBootsLink;
	
	public MensPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectBoots(){
		sideShoesBootsLink.click();
	}

	public void verifyPageTitle(String expected){
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
	
}
