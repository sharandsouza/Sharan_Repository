package MyJava;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\test\\sharanfile.txt");
		boolean status = f.createNewFile();
		
		if (status) {
			System.out.println("File created");
		}
		else {
			System.out.println("Failure");
		}

	}

}
