package practiceDay2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfacebooklogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.className("inputtext")).sendKeys("joanna@gmail.com");		
		driver.findElement(By.id("pass")).sendKeys("joanna");	
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("reg-link")).click();
		driver.navigate().back();





	}

}
