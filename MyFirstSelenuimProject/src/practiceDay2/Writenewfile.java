package practiceDay2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writenewfile {

	public static void main(String[] args) throws IOException {

		FileOutputStream f=new FileOutputStream("C:\\Excel folder\\NewFile");
		
		String s= ("I have written this data by using Java program");
		
		byte by[]=s.getBytes();
		f.write(by);
		f.close();
	}

}
