package MyJava;

////This is Hash Set. It will not be in Order, The names are not printing in order

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {

		HashSet<String> myset= new HashSet<String>();
		
		myset.add("Sharan");
		myset.add("Sarita");
		myset.add("Alicia");
		myset.add("Joanna");
		myset.add("Joanna");
		
		
		System.out.println(myset.size());
		System.out.println(myset);

		myset.remove("Alicia");
		System.out.println(myset.size());
		
		for (Iterator iterator = myset.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			
			System.out.println(name);
		}
	}
}
