package practiceDay2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webpagepractice {

	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.DemoQA.com");
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("http://www.DemoQA.com");
		
		driver.navigate().refresh();
		
			
	}
}
