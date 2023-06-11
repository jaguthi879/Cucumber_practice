package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_elements {
WebDriver driver;
	
	public Flight_elements (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		}
	
	@FindBy(linkText="Flights")public WebElement flights ;
	@FindBy(xpath="//input[@value='oneway']")public WebElement type ;
	@FindBy(name="passCount")public WebElement passengers ;
	@FindBy(name="fromPort")public WebElement departingfrom;
	@FindBy(name="fromMonth")public WebElement frmmonth ;
	@FindBy(name="fromDay")public WebElement frmday;
	@FindBy(name="toPort")public WebElement returningfrom;
	@FindBy(name="toMonth")public WebElement tomonth ;
	@FindBy(name="toDay")public WebElement today;
	@FindBy(xpath="//input[@value='Coach']")public WebElement serviceclass ;
	@FindBy(name="airline")public WebElement airline;
	@FindBy(name="findFlights")public WebElement fflights;
	
	 public void clickonflights() {
		flights.click();
	}
	 public void selecttype() {
		 type.click();
	 }
     public void selectnoofpassengers() {
    	passengers.click();
    }
     public void selectcity() {
    	 //departingfrom
     }
}
