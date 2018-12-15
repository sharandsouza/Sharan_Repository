package practiceDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewWebsiteTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Sharat");
		driver.findElement(By.name("lastName")).sendKeys("Dsouza");
		driver.findElement(By.name("phone")).sendKeys("9819456345");
		driver.findElement(By.name("userName")).sendKeys("dre.gmail.com");
		driver.findElement(By.name("address1")).sendKeys("City lane");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("300023");
		
		Select drpcountry =new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("ANGOLA");
		
		driver.findElement(By.name("email")).sendKeys("dre.gmail.com");
		driver.findElement(By.name("password")).sendKeys("welcome");
		driver.findElement(By.name("confirmPassword")).sendKeys("welcome");
		
		//driver.findElement(By.name("submit")).submit();
	}

}
