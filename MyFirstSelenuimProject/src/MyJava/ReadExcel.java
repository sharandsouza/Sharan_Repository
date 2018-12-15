package MyJava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	
		public static void main(String[] args) throws IOException, InterruptedException {

			
		FileInputStream excel;
		
		excel= new FileInputStream("C:\\test\\Login_Credentials.xlsx");
		
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
						
		}
		
		wb.close();
		excel.close();
		
	}

}
