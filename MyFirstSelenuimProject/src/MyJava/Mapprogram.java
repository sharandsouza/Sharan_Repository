package MyJava;

import java.util.HashMap;
import java.util.Map;

public class Mapprogram {

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
	}	
}
