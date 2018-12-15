package practiceDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclassfile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=IqWTvGHgJ5M&list=PLhW3qG5bs-L_s9HdC5zNshE5Ti8jABwlU&index=15");

	}

}
