package MyJava;

//we are reading and getting based on key

//We put loop on the keyset and printed the corresponding values

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// 
import java.util.Set;

public class maplist {

	public static void main(String[] args) {

				
		Map<Integer, String> mymap= new HashMap<Integer, String>();
		
		mymap.put(1, "Alicia");
		mymap.put(3, "Alicia");
		mymap.put(5, "Bombay");
		mymap.put(8, "Catherine");
		
		System.out.println(mymap);
		System.out.println(mymap.get(8));
		
		mymap.remove(5);
		System.out.println(mymap);
		
		Set<Integer> keyset = mymap.keySet();
		
		for (Iterator iterator = keyset.iterator(); iterator.hasNext();) {
			Integer keys = (Integer) iterator.next();
			
			System.out.println("key="+keys+" value="+mymap.get(keys));
			
		}
	}

}
