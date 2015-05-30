package com.zappos.pom;

import org.openqa.selenium.WebDriver;

public class Zappos {

	private WebDriver driver;
	
	private HomePage homePage;
	private MensPage mensPage;
	private MensShoesPage mensShoesPage;
	private BootsPage bootsPage;
	private ProductDetailPage productDetailPage;
	private NotifyMePage notifyMePage;
	
	public Zappos(WebDriver driver){
		this.driver=driver;
	}
	
	
	public HomePage homePage(){
		if(homePage == null){
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public MensShoesPage mensShoesPage(){
		if(mensShoesPage == null){
			mensShoesPage = new MensShoesPage(driver);
		}
		return mensShoesPage;
	}
	
	public MensPage mensPage(){
		if(mensPage == null){
			mensPage = new MensPage(driver);
		}
		return mensPage;
	}
	
	public BootsPage bootsPage(){
		if(bootsPage == null){
			bootsPage = new BootsPage(driver);
		}
		return bootsPage;
	}
	
	public ProductDetailPage productDetailPage(){
		if(productDetailPage == null){
			productDetailPage = new ProductDetailPage(driver);
		}
		return productDetailPage;
	}
	
	public NotifyMePage notifyMePage(){
		if(notifyMePage == null){
			notifyMePage = new NotifyMePage(driver);
		}
		return notifyMePage;
	}
	
}
