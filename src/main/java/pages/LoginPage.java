package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;
import utils.TestUtils;

public class LoginPage {
	 private WebDriver driver = DriverFactory.getDriver();

	  // PageFactory element initialization
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
	
 @FindBy(xpath = "//div//input[@placeholder='Username']")
 WebElement usernameFeild; 
 
 @FindBy(xpath = "//div//input[@placeholder='Password']")
 WebElement passwordFeild; 
 
 @FindBy(xpath = "//button[@type='submit']")
 WebElement loginButton; 
 
 By loginPageTitle = By.cssSelector(".orangehrm-login-title");
 
 public HomePage loginToApplication(String username,String password) {
	 TestUtils.waitForElement(loginPageTitle);
	 usernameFeild.sendKeys(username);
	 passwordFeild.sendKeys(password);
	 loginButton.click();
	 return new HomePage();
 }
 

}
