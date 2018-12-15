package practiceDay2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execlreading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream excel;
		excel=new FileInputStream("C:\\test\\Read.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(excel);
		XSSFSheet ws=wb.getSheetAt(0);
		
		for (int row = 1; row<=ws.getLastRowNum() ; row++) {
			
			int column=1;
			
			XSSFCell Name, RollNo, Gender, Email;
			
			Name=ws.getRow(row).getCell(column);
			RollNo=ws.getRow(row).getCell(column+1);
			Gender=ws.getRow(row).getCell(column+2);
			Email=ws.getRow(row).getCell(column+3);
			
			System.out.print(Name);
			System.out.print(RollNo);
			System.out.print(Gender);
			System.out.println(Email);
			
		}
		
		
		
	}

}
