package com.zappos.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MensShoesPage extends PageBase{

	@FindBy(how=How.XPATH, using = "//*[@id='tcSideCol']/div[1]/h4/a[text()=\"Men's Shoes\"]/../..")
	private WebElement mensShoesMenu;
	
	public MensShoesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void selectMensShoesMenuItem(String item){
		WebElement itemElement = mensShoesMenu.findElement(By.xpath(".//a[text()='" + item + "']"));
		itemElement.click();
	}
	
	public void verifyPageTitle(String expected){
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
}
