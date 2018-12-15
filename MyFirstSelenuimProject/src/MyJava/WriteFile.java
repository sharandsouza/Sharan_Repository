package MyJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {


	public static void main(String[] args) throws IOException {
		
		FileOutputStream newdata=new FileOutputStream("C:\\test\\sharanfile3.txt");
		
		String s= "This is my first data written in a file";
		
		byte b[] = s.getBytes();
		newdata.write(b);
		newdata.close();
	
	}

}
