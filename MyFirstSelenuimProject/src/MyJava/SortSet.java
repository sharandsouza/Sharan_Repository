package MyJava;

//This is Sorted set. We have to use Treeset and created an object.

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {

	public static void main(String[] args) {

		SortedSet<String> myset= new TreeSet<String>();
				
		myset.add("Sharan");
		myset.add("Alicia");
		myset.add("Joanna");
		myset.add("Sarita");
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


	


