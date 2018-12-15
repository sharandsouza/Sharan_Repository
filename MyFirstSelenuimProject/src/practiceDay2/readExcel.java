package practiceDay2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream excel;
		
		excel =new FileInputStream ("C:\\Excel folder\\Login_Credentials.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int row = 1; row <=sheet.getLastRowNum(); row++) {
			
			int column=2;
			XSSFCell Username, Password;
			
			Username=sheet.getRow(row).getCell(column);
			Password=sheet.getRow(row).getCell(column+1);
			System.out.print(Username);
			System.out.println(Password);
			
			
		}
	}

}
