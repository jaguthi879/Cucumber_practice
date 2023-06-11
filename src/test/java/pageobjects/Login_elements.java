package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_elements {
	WebDriver driver;
	
	public Login_elements (WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);		
		}
	@FindBy(linkText="REGISTER")public WebElement registerbutton;
	@FindBy(xpath="//input[@name='firstName']")public WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']")public WebElement lastname;
	@FindBy(name="submit")public WebElement submitbutton;
	
	
			public void clickonregister() {
				registerbutton.click();
			}
			public void enterfname(String s1) {
				firstname.sendKeys(s1);
				
			}
			public void enterlname(String s2) {
				lastname.sendKeys(s2);
			}
			public void clickonsubmit() {
				submitbutton.click();
			}

}
