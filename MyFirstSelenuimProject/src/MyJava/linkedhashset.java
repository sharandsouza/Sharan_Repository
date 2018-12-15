package MyJava;

//This is Linked hash Set. It will be in Order, The names are printing in order

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {


				LinkedHashSet<String> myset= new LinkedHashSet<String>();
				
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



