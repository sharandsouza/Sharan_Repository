package MyJava;

/// this is Arraylist

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class list {

	public static void main(String[] args) {
		
		List<String> namelist= new ArrayList<String>();
		
		namelist.add("Sharan");
		namelist.add("Sarita");
		namelist.add("Prajitha");
		
		System.out.println(namelist.size());
		System.out.println(namelist);
		System.out.println(namelist.get(1));
		
		namelist.remove(2);
		System.out.println(namelist.size());
		
		for (Iterator iterator = namelist.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			
			System.out.println(name);
		}
		
	}

}
