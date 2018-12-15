package MyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class seleniumprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		driver.manage().window().maximize();
		//driver.findElement(By.id("txtName")).sendKeys("Sharan");
		driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("Sharan");
		driver.findElement(By.id("txtEmail")).sendKeys("sharandso@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9878987878");
		
		WebElement Subject= driver.findElement(By.id("ddlSubject"));
		
		Select myselect=new Select(Subject);
		
		//myselect.selectByIndex(2);
		//myselect.selectByValue("Complaints");
		myselect.selectByVisibleText("Feedback");
		driver.findElement(By.name("btnSubmit")).click();
		
		
	}

}
