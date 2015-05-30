package com.zappos.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

	@FindBy(how=How.XPATH, using = "//*[@id='nav']/li/a[text()=\"Shoes\"]")
	private WebElement topNavManuShoes;
	@FindBy(how=How.XPATH, using = "//*[@id='nav']/li/a[text()=\"Clothing\"]")
	private WebElement topNavManuClothing;
	@FindBy(how=How.XPATH, using = "//*[@id='nav']/li/a[text()=\"Men's\"]")
	private WebElement topNavManuMens;
	
	@FindBy(how=How.XPATH, using = ".//*[@id='hpTopLeft']//div/h4/a[text()=\"Shop Men's\"]/../..")
	private WebElement sideMensShopMenu;

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectMensMenu(){
		topNavManuMens.click();
	}
	
	public void selectItemFromMensSideMenu(String item){
		WebElement itemElement = sideMensShopMenu.findElement(By.xpath("./a[text()=\"" + item + "\"]"));
		itemElement.click();
		
	}
	
	public void verifyPageTitle(String expected){
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	

}
