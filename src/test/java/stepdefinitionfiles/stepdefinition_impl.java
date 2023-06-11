package stepdefinitionfiles;


import java.io.IOException;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobjects.Login_elements;
import utils.Object_reader;


public class stepdefinition_impl {
	WebDriver driver;
	Login_elements le;
	Object_reader or;
	
	public stepdefinition_impl(Commonsteps cs) throws IOException {
		this.driver=cs.getdriver();		
		le=new Login_elements(driver);
	    or = new Object_reader ();
	}
	@Given("User is on mercury tours page")
	public void user_is_on_mercury_tours_page() {
		driver.get(or.getURL());
	    
	}
	@When("user click on register")
	public void user_click_on_register() throws InterruptedException {
       
		le.clickonregister();
		Thread.sleep(1000); 
        
	}
	@Then("enter {string} and {string}")
	public void enter_and(String string, String string2) throws InterruptedException {
		le.enterfname(string);
		le.enterlname(string2);
		Thread.sleep(1000); 
	 
	}
	@Then("click on submit")
	public void click_on_submit() throws InterruptedException {
		
		le.clickonsubmit();
		Thread.sleep(1000); 
	}
	@Then("login successful message is displayed")
	public void login_successful_message_is_displayed() {
		System.out.println("successfully registered");
	}	
	
}





//driver.findElement(By.linkText("REGISTER")).click();
//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(string2);
//driver.findElement(By.name("submit")).click();