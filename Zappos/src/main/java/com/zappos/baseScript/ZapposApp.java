package com.zappos.baseScript;

import org.openqa.selenium.WebDriver;


public class ZapposApp {
	
	protected WebDriver driver;
	private ObjectRep objectRep;
	
	public ZapposApp(WebDriver driver){
		this.driver=driver;
	}// constructor

	public ObjectRep objectRep(){
		if (objectRep==null){
			objectRep = new ObjectRep(driver);
			return objectRep;
			}
		else {
			return objectRep;
			}
	}// end of ObjectRep block
	

	

}// end of class
