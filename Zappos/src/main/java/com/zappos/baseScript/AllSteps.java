package com.zappos.baseScript;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllSteps{

	protected WebDriver driver;
	private ZapposApp app;
	
	// create access to base class to find different object repository
	public ZapposApp app(){
		if(app == null){
			app = new ZapposApp(driver);
			}	
		return app;
			} 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Given("^User has Navigated to Zappos home page$")
	public void User_has_Navigated_to_Zappos_home_page() {
		driver.navigate().to("http://www.zappos.com");
	}
	
	@When("^User selects shoes from mens menu$")
	public void User_selects_shoes_from_mens_menu() {
		app.objectRep().menshoes().click();
	}
	
	@Then("^New page should appear with mens Item$")
	public void New_page_should_appear_with_mens_Item(){
		// can verify that new page appreared
	}
	
	@When("^User selects boots from shoes menu$")
	public void User_selects_boots_from_shoes_menu(){
		app.objectRep().bootInMenu().click();
	}
	
	@Then("^a new page should appear with all boots$")
	public void a_new_page_should_appear_with_all_boots(){
		// can verify that new page appeared
	}
	
	@When("^user select Keen Utility brand from sort menu$")
	public void user_select_Keen_Utility_brand_from_sort_menu(){
		app.objectRep().brandKeenUtility().click();
	}
	
	@When("^Select Keep Utility Pitts burgh boots$")
	public void Select_Keep_Utility_Pitts_burgh_boots(){
		app.objectRep().pitsburghBoot().click();

	}
	
	@Then("^Browser should navigate to Add to cart page$")
	public void Browser_should_navigate_to_Add_to_cart_page(){
		// code to verify if browser navigated to add to cart page
	}
	
	@When("^user select Add to cart without selecting size/width$")
	public void user_select_Add_to_cart_without_selecting_size_width(){
		app.objectRep().AddToCart().click();
	}
	
	@Then("^Please select a Size and Please select a width appear$")
	public void Please_select_a_Size_and_Please_select_a_width_appear(){
		WebElement size = app.objectRep().SelectASize();
		WebElement width = app.objectRep().SelectAWidth();
		Assert.assertTrue(size.isDisplayed());
		Assert.assertTrue(width.isDisplayed());
	}
// end of ZapNavigation Feature Steps
		
	
	@Given("^User has navigated to  Zappos Keen Utility Pitts Burgh Boot purchase page$")
	public void User_has_navigated_to_Zappos_Keen_Utility_Pitts_Burgh_Boot_purchase_page(){
		driver.navigate().to("http://www.zappos.com");
		app.objectRep().menshoes().click();
		app.objectRep().bootInMenu().click();
		app.objectRep().brandKeenUtility().click();
		app.objectRep().pitsburghBoot().click();
	}
	
	@When("^user click on \"([^\"]*)\" link$")
	public void user_click_on_link(String arg1) {
		String winHandleBefore = driver.getWindowHandle();
		app.objectRep().dontseeLink().click();

	}
	
	@Then("^a New window appears and user move to new window$")
	public void a_New_window_appears_and_user_move_to_new_window() {
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle); // change window
		}
	}
	

	@Then("^enter email address in email text box as myemail@yahoo.com$")
	public void enter_email_address_in_email_text_box_as_myemail_yahoo_com() {
		app.objectRep().emailTextBox().sendKeys("myemail@yahoo.com");
	}
	
	@Then("^choose color from menu$")
	public void choose_color_from_menu(){
		app.objectRep().colorAll().click();
		app.objectRep().colorBlackYellow().click();

	}
	
	@Then("^choose size from size menu$")
	public void choose_size_from_size_menu() {
		app.objectRep().allSize().click();
		app.objectRep().size10().click();
	}
	
	@Then("^choose Width from Width Menu$")
	public void choose_Width_from_Width_Menu(){
		app.objectRep().allWidth().click();
		app.objectRep().widthMedium().click();
	}
	
	@Then("^click on Notify me button$")
	public void click_on_Notify_me_button(){
		app.objectRep().notifyMe().click();
	}
	
	@Then("^Thank You message displayed$")
	public void Thank_You_message_displayed(){
		Assert.assertTrue(app.objectRep().thankyouMessage().isDisplayed());
	}

}// end of class
