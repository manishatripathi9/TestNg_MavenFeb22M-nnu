package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import pages.LoginPage;

@Test
public class LoginTest extends BaseClass{
	
	
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("xyz@abc.com","Abc@12345");
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		AssertJUnit.assertEquals(ActualMsg, ExpMsg);
	}
	
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("xyz@abc.com","Abc@12345");
		
	}
	@Test
	@Parameters({"Param1","Param2"})
	public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal,PasswordVal);		
		
	}
	@Test
	public void ExternalDataTest() {
			
			String UserNameVal = (sheet.getRow(1).getCell(0).getStringCellValue();
			String PasswordVal = (sheet.getRow(1).getCell(1).getStringCellValue();
			
			LoginPage login = new LoginPage();
			login.LoginFunction(UserNameVal,PasswordVal);		
		}


}
