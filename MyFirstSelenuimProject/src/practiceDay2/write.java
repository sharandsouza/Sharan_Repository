package practiceDay2;

import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException {

		FileWriter writer=new FileWriter("C:\\Excel folder\\write.txt");
		
		writer.write("I have created a new program to re-write data into the exisitng file");
		
		writer.close();
		
		System.out.println("The file is created sucessfully");
	}

}
