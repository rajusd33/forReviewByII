package com.zappos.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zappos.pom.Zappos;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllSteps {

	protected WebDriver driver;
	protected Zappos zappos;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		zappos = new Zappos(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		zappos = null;
	}
	
	@Given("^User has Navigated to Zappos home page$")
	public void User_has_Navigated_to_Zappos_home_page() {
		driver.navigate().to("http://www.zappos.com");
	}
	
	@When("^User selects \"(.*?)\" from Shop Men's$")
	public void user_Selects_menu_from_Shop_Men(String item) {
		//zappos.homePage().selectMensMenu();
		zappos.homePage().selectItemFromMensSideMenu(item);
	}
	
	@When("^Select \"(.*?)\" from from Men's Shoes$")
	public void select_menu_from_Mens_Shoes(String item) {
		zappos.mensShoesPage().selectMensShoesMenuItem(item);
	}
	
	@Then("^A new page should appear with title \"(.*?)\"$")
	public void a_new_page_should_appear_with_title(String expectedTitle){
		zappos.bootsPage().verifyPageTitle(expectedTitle);
	}
	
	
	@When("^User select \"(.*?)\" from brand menu$")
	public void user_select_menu_from_brand_menu(String menuItem){
		zappos.bootsPage().selectBootBrandFilter(menuItem);
	}
	
	
	@When("^Select \"(.*?)\" boots from the list$")
	public void Select_boots_from_the_list(String bootName){
		zappos.bootsPage().selectProductByProductName(bootName);

	}
	
	@Then("^New page should appear with mens Item$")
	public void New_page_should_appear_with_mens_Item(){
		zappos.mensPage().verifyPageTitle("Men's Shoes, Clothing, Accessories | Zappos.com");
	}
	
	@When("^User selects boots from shoes menu$")
	public void User_selects_boots_from_shoes_menu(){
		zappos.mensPage().selectBoots();
	}
	
	@Then("^a new page should appear with all boots$")
	public void a_new_page_should_appear_with_all_boots(){
		zappos.bootsPage().verifyPageTitle("Men's Boots | Zappos.com FREE Shipping");
	}
	
	
	
	
	
	@Then("^Browser should navigate to Add to cart page$")
	public void Browser_should_navigate_to_Add_to_cart_page(){
		zappos.productDetailPage().verifyAddToCartExist();
	}
	
	@When("^user select Add to cart without selecting size/width$")
	public void user_select_Add_to_cart_without_selecting_size_width(){
		zappos.productDetailPage().addToCart();
	}
	
	@Then("^Please select a Size and Please select a width appear$")
	public void Please_select_a_Size_and_Please_select_a_width_appear(){
		
		zappos.productDetailPage().delayFor(3000);
		zappos.productDetailPage().verifySizeWarning();
		zappos.productDetailPage().verifyWidthWarning();

	}

	@When("^click on Don't see your size Link$")
	public void click_on_Dont_See_Size(){
		zappos.productDetailPage().selectDontSeeSize();
	}
	
	@Then("^Notify me Popup display$")
	public void notify_Me_Popup_Display(){
		zappos.productDetailPage().verifyPopupDisplayByTitle("Zappos.com - Notify Me!");
	}
	
	
	@When("^Fill Notify me with Email \"(.*?)\"$")
	public void fill_Notify_me_with_Email(String arg1) throws Throwable {
		zappos.notifyMePage().enterEmail(arg1);
	}

	@When("^Color with \"(.*?)\"$")
	public void color_with(String arg1) throws Throwable {
		zappos.notifyMePage().enterColor(arg1);
	}

	@When("^Size with \"(.*?)\"$")
	public void size_with(String arg1) throws Throwable {
		zappos.notifyMePage().enterSize(arg1);
	}

	@When("^Width with \"(.*?)\"$")
	public void width_with(String arg1) throws Throwable {
		zappos.notifyMePage().enterWidth(arg1);
	}

	@When("^Select Notify me$")
	public void select_Notify_me() throws Throwable {
		zappos.notifyMePage().selectNotifyMe();
	}
	
	
	@Then("^Acknowledgement page displayed with Thank You$")
	public void acknowledgement_Page_displayed_with_Thank_You() throws Throwable {
		zappos.notifyMePage().verifyAcknowledgementPageDisplayed();
	}

	
	@Given("^User has navigated to  Zappos Keen Utility Pitts Burgh Boot purchase page$")
	public void User_has_navigated_to_Zappos_Keen_Utility_Pitts_Burgh_Boot_purchase_page(){
		driver.navigate().to("http://www.zappos.com");
		//app.objectRep().menshoes().click();
		//app.objectRep().bootInMenu().click();
		//app.objectRep().brandKeenUtility().click();
		//app.objectRep().pitsburghBoot().click();
	}
	
	@When("^user click on \"([^\"]*)\" link$")
	public void user_click_on_link(String arg1) {
		//String winHandleBefore = driver.getWindowHandle(); // to switch back to original window
		//app.objectRep().dontseeLink().click();

	}
	
	@Then("^a New window appears and user move to new window$")
	public void a_New_window_appears_and_user_move_to_new_window() {
		//for(String winHandle : driver.getWindowHandles()){
		//    driver.switchTo().window(winHandle); // change window
		//}
	}
	

	@Then("^enter email address in email text box as myemail@yahoo.com$")
	public void enter_email_address_in_email_text_box_as_myemail_yahoo_com() {
		//app.objectRep().emailTextBox().sendKeys("myemail@yahoo.com");
	}
	
	@Then("^choose color from menu$")
	public void choose_color_from_menu(){
		//app.objectRep().colorAll().click();
		//app.objectRep().colorBlackYellow().click();

	}
	
	@Then("^choose size from size menu$")
	public void choose_size_from_size_menu() {
		//app.objectRep().allSize().click();
		//app.objectRep().size10().click();
	}
	
	@Then("^choose Width from Width Menu$")
	public void choose_Width_from_Width_Menu(){
		//app.objectRep().allWidth().click();
		//app.objectRep().widthMedium().click();
	}
	
	
	@Then("^Thank You message displayed$")
	public void Thank_You_message_displayed(){
		//Assert.assertTrue(app.objectRep().thankyouMessage().isDisplayed());
	}
	
}
