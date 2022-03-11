package stepdefination;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefination {

	WebDriver driver;
	
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);  
	String email = "abcd"+ randomInt +"@gmail.com";
	
	@Given("User is on the application")
	public void user_is_on_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	    	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.get("http://retailm1.upskills.in/admin/");
			
	    }
	    catch (WebDriverException e) {
	    	fetched=false;
	    }
	    
	    
	    Assert.assertEquals(expect, fetched);

	}

	@Given("fills up the {string} and {string}")
	public void fills_up_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	    	driver.findElement(By.xpath("//*[@id='input-username']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(string2);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);

		
		
	}

	@Given("clicks on Login button")
	public void clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Given("Admin moves to the affiliates page")
	public void admin_moves_to_the_affiliates_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='menu-marketing']/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='menu-marketing']/ul/li[2]/a")).click();
			Thread.sleep(1000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Then("fills the required fields {string}, {string}")
	public void fills_the_required_fields(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='input-name']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id='input-date-added']")).sendKeys(string2);
			driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("abc@asd.co");
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Then("clicks on Filter button")
	public void clicks_on_Filter_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='button-filter']")).click();
			Thread.sleep(5000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Then("Expected results should be displayed")
	public void Expected_results_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			String actual = driver.findElement(By.xpath("//*[@id='form-affiliate']/div/table/tbody/tr/td[2]")).getText();
			Assert.assertTrue(actual.contains("abx"));
			Thread.sleep(5000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}
	
	@Given("admin fills up the {string} and {string}")
	public void admin_fills_up_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='input-username']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(string2);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Given("admin clicks on Login button")
	public void admin_clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Given("moves to the affiliates page")
	public void moves_to_the_affiliates_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='menu-marketing']/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='menu-marketing']/ul/li[2]/a")).click();
			Thread.sleep(1000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
//		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a")).click();
//		Thread.sleep(1000);
	}

	@Then("Admin moves to Add Affiliates page")
	public void admin_moves_to_Add_Affiliates_page() {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	    	driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a")).click();
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
		
		
	}

	@Given("Enters all the required fields {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void enters_all_the_required_fields(String string, String string2, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id='input-lastname']")).sendKeys(string2);
			driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys(string4);
			driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(string5);
			driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys(string6);
			driver.findElement(By.xpath("//*[@id='input-address-1']")).sendKeys(string7);
			driver.findElement(By.xpath("//*[@id='input-city']")).sendKeys(string8);
			System.out.println(email);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
		
	}

	@Given("select country and Region")
	public void select_country_and_Region() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			WebElement obj = driver.findElement(By.xpath("//*[@id='input-country']"));
			Select sel = new Select(obj);
		    sel.selectByValue("4");
		    Thread.sleep(2000);
		    WebElement obj1 = driver.findElement(By.xpath("//*[@id='input-zone']"));
			Select sel1 = new Select(obj1);
		    sel1.selectByValue("117");
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
//	    sel.selectByIndex(1);
	}

	@Then("Move to Payment Details")
	public void move_to_Payment_Details() {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
	    	driver.findElement(By.xpath("//*[@id='form-affiliate']/ul/li[2]/a")).click();
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
		
	}

	@Then("Enter {string}")
	public void enter(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='input-cheque']")).sendKeys(string);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
//		Thread.sleep(1000);
	}

	@Then("Click on save button")
	public void click_on_save_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/button")).click();
			Thread.sleep(5000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@Then("the above entered information should be added check by email")
	public void the_above_entered_information_should_be_added_check_by_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id='button-filter']")).click();
			String actual = driver.findElement(By.xpath("//*[@id='form-affiliate']/div/table/tbody/tr[1]/td[3]")).getText();
			Assert.assertTrue(actual.contains(email));
			Thread.sleep(5000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}
	
	@Given("Admin moves to the Customer Orders Report page")
	public void admin_moves_to_the_Customer_Orders_Report_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='menu-report']/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='menu-report']/ul/li[3]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='menu-report']/ul/li[3]/ul/li[4]/a")).click();
			Thread.sleep(1000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}
	
	@Then("Admin fills the required fields {string}, {string}, {string}")
	public void admin_fills_the_required_fields(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			driver.findElement(By.xpath("//*[@id='input-date-start']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id='input-date-end']")).sendKeys(string2);
			driver.findElement(By.xpath("//*[@id='input-customer']")).sendKeys(string3);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}


	@Then("Expected Customer results should be displayed")
	public void expected_Customer_results_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(1000);
		boolean expect= true;
	    boolean fetched = true;
	    try
	    {
			String actual = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[2]/div[2]/table/tbody/tr/td[1]")).getText();
			System.out.println(actual);
			Assert.assertTrue(actual.contains("Krishna Mohan"));
			Thread.sleep(1000);
	    }
	    catch(NoSuchElementException e)
	    {
	        fetched=false;
	    }
	    
	    Assert.assertEquals(expect, fetched);
	}

	@After
	public void after(){
		driver.quit();
	}

	
}
