package practiceDay2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rohan");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("reg-link")).click();
		driver.findElement(By.name("firstname")).sendKeys("rohan");
		driver.findElement(By.name("lastname")).sendKeys("jadhav");
		driver.findElement(By.name("reg_email__")).sendKeys("rohan@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rohan@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rohan");
	

		Select birthday=new Select(driver.findElement(By.id("day")));

		birthday.selectByIndex(1);

		Select birthmonth=new Select(driver.findElement(By.id("month")));

		birthmonth.selectByVisibleText("Mar");
		
		Select birthyear=new Select(driver.findElement(By.id("year")));

		birthyear.selectByValue("1984");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
