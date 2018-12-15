package practiceDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWebpage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Hotels   "));
		driver.findElement(By.id("preloader")).sendKeys("Australia");
		driver.findElement(By.name("date"));
		
	}

}
