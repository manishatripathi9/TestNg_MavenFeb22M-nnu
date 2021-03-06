package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClassExcel {
	
	public static WebDriver driver;
	
	XSSFWorkbook wbook;
	XSSFSheet sheet;


	@BeforeTest
		public void DataSetUP() throws IOException {
			
			FileInputStream fis = new FileInputStream("exceldata.xlsx");
			wbook = new XSSFWorkbook(fis);
			sheet = wbook.getSheet("Sheet1");	
	}
		
		@AfterTest
		public void DataTearDown() throws IOException {
			
			wbook.close();
		}

	
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}

}
