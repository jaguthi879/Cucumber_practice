package stepdefinitionfiles;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Flight_elements;
import utils.Object_reader;


public class Flightbookingstep_impl {
	
	 WebDriver driver;
	 Flight_elements fe;
	 Object_reader or;
	 
	 
	public Flightbookingstep_impl(Commonsteps cs) throws IOException {
		this.driver=cs.getdriver();
		fe=new Flight_elements(driver);
		or=new Object_reader ();
}
	@Given("User should navigate to Mercury tours page")
	public void user_should_navigate_to_mercury_tours_page() {
		driver.get(or.getURL());
	}

	@When("user click on flights")
	public void user_click_on_flights() throws InterruptedException {
		driver.findElement(By.linkText("Flights")).click();
		
		Thread.sleep(4000);
		//driver.switchTo().alert().dismiss();
	}
	
	@Then("fill the flight details")
	public void fill_the_flight_details() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//fe.clickonflights();
		Select passenger = new Select(driver.findElement(By.name("passCount")));
		passenger.selectByValue("2");
		Select Dfrom  = new Select(driver.findElement(By.name("fromPort")));
		 Dfrom.selectByValue("Seattle");
		 Select onMonth = new Select(driver.findElement(By.name("fromMonth")));
		onMonth.selectByVisibleText("January");
		Select Date = new Select(driver.findElement(By.name("fromDay")));
		Date.selectByVisibleText("19");
		Select Arrivingin  = new Select(driver.findElement(By.name("toPort")));
		Arrivingin.selectByValue("Zurich");
		 Select returningMonth = new Select(driver.findElement(By.name("toMonth")));
		 returningMonth.selectByVisibleText("January");
		Select Date1 = new Select(driver.findElement(By.name("toDay")));
		Date1.selectByVisibleText("22");
		Thread.sleep(1000);
		
	}

	@Then("select the prefernces")
	public void select_the_prefernces() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='Coach']"));		
		Select serviceClass = new Select(driver.findElement(By.name("airline")));
		serviceClass.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(1000);
	}

	@Then("click on continue")
	public void click_on_continue() throws InterruptedException {
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(1000);	   
	}

	@Then("Flight Reservation message should display")
	public void flight_reservation_message_should_display() {
       
	    System.out.println("Successfully done with Flight Reservation");
	    
	    driver.findElement(By.xpath("//img[@src='images/home.gif']")).click();
	}
  

}
