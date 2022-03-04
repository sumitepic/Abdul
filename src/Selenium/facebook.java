package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook extends BaseClass{
	
	@BeforeClass
	public void launchUrl(){
		String url= "http://facebook.com";
		driver.get(url);
	}
	
	@Test
	public void login(){
		String[] j={"hh","jj","oo"};
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("https://facebook.com", driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys(j[0]);
		driver.findElement(By.name("pass")).sendKeys(j[1]);
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void google(){
		driver.get("https://google.com");
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
	String a="(//*[contains(@class,'inputtext')])[1]";
	
	public void login1(){
		String[] j={"hh","jj","oo"};
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys(j[0]);
		driver.findElement(By.xpath("")).sendKeys(j[1]);
		//driver.findElement(By.name("login")).click();
		nameGeneric("login").click();
		
		driver.findElement(By.partialLinkText("Gm"));
	}
	
	public void login2(){
		WebElement e1=	xpathGeneric(a);
		e1.sendKeys("ss");
	
	}

	public int f2(){
		int a =4;
		return a;
	}
	
	public WebElement xpathGeneric(String value){
		WebElement e1=driver.findElement(By.xpath(value));
		return e1;
	}
	
	public WebElement idGeneric(String value){
		WebElement e1=driver.findElement(By.id(value));
		return e1;
	}
	
	public WebElement nameGeneric(String value){
		WebElement e1=driver.findElement(By.name(value));
		return e1;
	}
	
	public void createNewAccount() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[starts-with(@class, 'inputtext')])[1]")).sendKeys("sss");;
	}
	
	
	
}
