package com.zappos.baseScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRep {
	
	private WebDriver driver;
	
	public ObjectRep(WebDriver driver){
		this.driver=driver;
	} // end of constructor
	
	public WebElement menshoes(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='hpTopLeft']/div/a[@href='/mens-shoes']"));
		return link;
	}
	
	public WebElement bootInMenu(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='tcSideCol']/div/a[@href='/mens-boots~60']"));
		return link;
	}
	
	public WebElement brandKeenUtility(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='FCTbrandnamefacetSelect']/a[contains(.,'Keen Utility')]"));
		return link;
	}
	
	public WebElement pitsburghBoot(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='searchResults']/a[22]/span[contains(.,'Pittsburgh Boot')]"));
		return link;
	}
	
	public WebElement AddToCart(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='addToCart']"));
		return link;
	}
	public WebElement SelectASize(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='cartInfoPopWarn-d3']"));
		return link;
	}
	public WebElement SelectAWidth(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='cartInfoPopWarn-d4']"));
		return link;
	}
	
	public WebElement dontseeLink(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='notifyMePopupLink']"));
		return link;
	}
	//============== window two OR ===================
	
	public WebElement emailTextBox(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='email']"));
		return link;
	}
	
	public WebElement colorAll(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='styleId']"));
		return link;
	}
	public WebElement colorBlackYellow(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='styleId']/option[@value='1368314']"));
		return link;
	}
	public WebElement allSize(){
		WebElement link = driver.findElement(By.xpath("//li[contains(label,'size:')]/*[@id='dimensionValueIds']"));
		return link;
	}
	
	public WebElement size10(){
		WebElement link = driver.findElement(By.xpath("//li[contains(label,'size:')]/*[@id='dimensionValueIds']/option[@value='126483']"));
		return link;
	}
	
	public WebElement allWidth(){
		WebElement link = driver.findElement(By.xpath("//li[contains(label,'width:')]/*[@id='dimensionValueIds']"));
		return link;
	}
	
	public WebElement widthMedium(){
		WebElement link = driver.findElement(By.xpath("//li[contains(label,'width:')]/*[@id='dimensionValueIds']/option[@value='61808']"));
		return link;
	}
	
	public WebElement thankyouMessage(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='content']/h4"));
		return link;
	}
	
	public WebElement notifyMe(){
		WebElement link = driver.findElement(By.xpath(".//*[@id='notifyMeCommand']/button[@class='btn action']"));
		return link;
	}
	
	

	
	
}// end of class
