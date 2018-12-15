package practiceDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://toolsqa.com/automation-practice-form/");
			
			driver.manage().window().maximize();
			
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
			
			Select Drpcontinents=new Select(driver.findElement(By.id("continents")));
			Drpcontinents.selectByVisibleText("Australia");
			
			Select Drpcommands=new Select(driver.findElement(By.id("selenium_commands")));
			Drpcommands.selectByVisibleText("Wait Commands");
			//driver.findElement(By.id("submit")).click();
			

	}

}
