package MyJava;

//This is LinkedList

//There would be no difference in the output. Only performance would be better than ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linklist {

	public static void main(String[] args) {

		List<String> namelist= new LinkedList<String>();
		
			namelist.add("Sharan");
			namelist.add("Sarita");
			namelist.add("Prajitha");
			namelist.add("Prajitha");
			
			//LIST displays duplicate values like Prajitha which is appearing twice, whereas SET will not 
			//display duplicated values.
		
			
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
