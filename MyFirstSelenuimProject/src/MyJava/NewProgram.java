package MyJava;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProgram {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://lms.techcanvass.co.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtLoginid")).sendKeys("sharandsouza87@gmail.com");
	driver.findElement(By.id("txtpassword")).sendKeys("sharan");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.switchTo().alert().accept();
	driver.findElement(By.id("txtLoginid")).clear();
	driver.findElement(By.id("txtpassword")).clear();
	
		
	}

}
