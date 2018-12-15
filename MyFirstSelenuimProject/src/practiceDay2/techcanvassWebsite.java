package practiceDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class techcanvassWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");

		driver.manage().window().maximize();

		driver.findElement(By.name("txtName")).sendKeys("Sharan");
		driver.findElement(By.id("txtEmail")).sendKeys("Sharan@gmail.com");
		driver.findElement(By.name("txtContact")).sendKeys("7896754532");

		Select subject= new Select(driver.findElement(By.name("ddlSubject")));

		subject.selectByValue("Course Enquiry");

		driver.findElement(By.name("txtMessage")).sendKeys("My name is Shazam");


	}
	
}