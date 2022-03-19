package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	
	//========================= Web Elements ======================
	
	@FindBy(className = "login")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//========================= Functions =============================
	
	public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		LoginLink.click();
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		RememberMe.click();
		LoginBtn.click();
	}
	
}
