package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail extends BaseClass {
	
	@BeforeClass
	public void launchUrl(){
		String url= "http://gmail.com";
		driver.get(url);
	}
	
	@Test
	public void login(){
		String[] j={"hh","jj","oo"};
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(j[0]);
		driver.findElement(By.name("pass")).sendKeys(j[1]);
		driver.findElement(By.name("login")).click();
	}
	
	
	public void login1(){
		String[] j={"hh","jj","oo"};
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys(j[0]);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(j[1]);
		driver.findElement(By.name("login")).click();
	}
	
	public void login2(){
		driver.findElement(By.partialLinkText("Gmai")).click();;
		driver.findElement(By.className(""));
	}

	
	public void createNewAccount(){
		driver.findElement(By.linkText("Create New Account")).click();;
	}
	
	
	

}
