package practiceDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class weblogin {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		

	}

}
