package com.zappos.pom;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends PageBase {

	@FindBy(how = How.ID,using = "addToCart")
	private WebElement addToCartButton;
	
	@FindBy(how = How.XPATH,using = "//*[@id='cartInfoPopWarn-d3']/div/div")
	private WebElement selectSizeWarning;
	
	@FindBy(how = How.XPATH,using = "//*[@id='cartInfoPopWarn-d4']/div/div")
	private WebElement selectWidthWarning;
	
	@FindBy(how = How.ID, using = "notifyMePopupLink")
	private WebElement notifyMePopupLink;
	
	
	public ProductDetailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void addToCart(){
		addToCartButton.click();
	}
	
	public void selectDontSeeSize(){
		notifyMePopupLink.click();
	}
	
	public void verifySizeWarning(){
		Boolean displayed = selectSizeWarning.isDisplayed();
		Assert.assertTrue("Size warning is not desplayed", displayed);
		String text = selectSizeWarning.getText();
		System.out.println(text);
		
	}
	
	public void verifyWidthWarning(){
		Boolean displayed = selectWidthWarning.isDisplayed();
		Assert.assertTrue("Width warning is not desplayed", displayed);
		String text = selectWidthWarning.getText();
		System.out.println(text);
		
	}
	public void verifyPageTitle(String expected){
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
	public void verifyAddToCartExist(){
		WebElement addToCartButton = waitForElement(By.id("addToCart"));
		
		Boolean displayed = addToCartButton.isDisplayed();
		Assert.assertTrue("Add to cart button not desplayed", displayed);
	}
	
	public void verifyPopupDisplayByTitle(String title){
		boolean windowFound = false;
		String currentWindow =   driver.getWindowHandle();
		Set<String> windowList = driver.getWindowHandles();
		for(String item : windowList){
			driver.switchTo().window(item);
			String curentTitle = driver.getTitle();
			System.out.println("Win Id:" + item);
			System.out.println("Title: " + curentTitle);
			if(curentTitle.toUpperCase().contentEquals(title.toUpperCase())){
				windowFound = true;
				break;
			}
		}
		
		Assert.assertTrue("Popup not found with the time " + title , windowFound);
		
		
	}
}
