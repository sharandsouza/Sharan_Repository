package com.tech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGOwnTest {
	
	WebDriver driver =null;
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\git\\Sharan_Repository\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FillWebpage() {

		driver.findElement(By.linkText("Partial Link Test")).click();
		System.out.println(driver.getTitle());	
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println(driver.getTitle());	
		driver.navigate().back();
		driver.findElement(By.name("firstname")).sendKeys("Sharan");
		driver.findElement(By.name("lastname")).sendKeys("Dsouza");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("01/03/2000");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
	}
	
	@Test
	public void Google() {
		driver.get("https://google.com/");
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
