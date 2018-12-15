package MyJava;

		import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class TakingExcelInputsforLoginintoWebPage {

			public static void main(String[] args) throws IOException, InterruptedException {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MyFirstSelenuimProject\\lib\\chromedriverjars\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://lms.techcanvass.co.in/");
				
				driver.manage().window().maximize();
				
				
				FileInputStream excel;
				
				excel= new FileInputStream("C:\\Excel folder\\Login_Credentials.xlsx");
				
				XSSFWorkbook wb= new XSSFWorkbook(excel);
				XSSFSheet ws= wb.getSheetAt(0);
				
				for(int row=1; row<=ws.getLastRowNum(); row++ )
				{
					int column=1;
					XSSFCell Username, Password;
					
					Username=ws.getRow(row).getCell(column);
					Password=ws.getRow(row).getCell(column+1);
					System.out.print(Username.toString());
					System.out.println(Password.toString());
					
					driver.findElement(By.id("txtLoginid")).sendKeys(Username.toString());
					driver.findElement(By.id("txtpassword")).sendKeys(Password.toString());
					driver.findElement(By.id("btnLogin")).click();
					Thread.sleep(2000);
					
					driver.switchTo().alert().accept();
					driver.findElement(By.id("txtLoginid")).clear();
					driver.findElement(By.id("txtpassword")).clear();
					Thread.sleep(2000);
					
				}
				
				wb.close();
				excel.close();
				
			}

		}


	
