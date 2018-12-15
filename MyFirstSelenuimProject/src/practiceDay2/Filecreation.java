package practiceDay2;

import java.io.File;
import java.io.IOException;

public class Filecreation {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Excel folder\\NewFile");
		boolean status=f.createNewFile();
		
		if (status) {
			System.out.println("File named NewFile is created sucessfully");
		}
		else {
			System.out.println("Failure");
		}
	}

}
