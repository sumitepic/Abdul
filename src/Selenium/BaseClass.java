package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	String url="";

	public BaseClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		driver= new ChromeDriver(); // Open chrome browser
		}
}
