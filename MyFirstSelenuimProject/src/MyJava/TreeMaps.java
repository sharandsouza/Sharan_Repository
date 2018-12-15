package MyJava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {

	Map<String, String> mymap= new TreeMap<String, String>();
		
		mymap.put(aa, "Alicia");
		mymap.put(bb, "Alicia");
		mymap.put(abc, "Bombay");
		mymap.put(ccc, "Catherine");
		
		System.out.println(mymap);
		System.out.println(mymap.get(8));
		
		mymap.remove(5);
		System.out.println(mymap);
	}	

	}


