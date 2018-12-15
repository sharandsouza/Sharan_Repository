package MyJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileInputStream readfile=new FileInputStream("C:\\Excel folder\\NewFile");
		
		int i=0;
		
		while ((i=readfile.read())!=-1) {
			System.out.print((char) i);
		}
		readfile.close();
		
	}

}
