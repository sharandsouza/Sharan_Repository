package practiceDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAWebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.store.demoqa.com");
		driver.getTitle();
		driver.getTitle().length();
		System.out.println("Title name is: " +driver.getTitle());
		System.out.println("Title length is: " +driver.getTitle().length());
		
		driver.getCurrentUrl();
		
		if (driver.getCurrentUrl().equals("http://www.store.demoqa.com")) {
		System.out.println("This is the correct URL");
		}
		else {
			System.out.println("This is the wrong URL");
			System.out.println("Actual URL is: " +driver.getCurrentUrl());
			System.out.println("Expected URL is: http://www.store.demoqa.com");
		}
		
		
		driver.getPageSource().length();
		System.out.println("The page length is: " +driver.getPageSource().length());
			

		driver.close();
		
		
		
		
		

	}

}
