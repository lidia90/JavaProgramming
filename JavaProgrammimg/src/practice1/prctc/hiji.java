package practice1.prctc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class hiji {

	public static void main(String[] args)  {
		
		 Map<String, Integer> unsortedMap = new HashMap<>();
	        unsortedMap.put("Banana", 3);
	        unsortedMap.put("Apple", 5);
	        unsortedMap.put("Orange", 2);
	        unsortedMap.put("Mango", 8);
	        
	      List <Map.Entry<String, Integer>> list = new ArrayList <> (unsortedMap.entrySet());
	      list.sort(Map.Entry.comparingByKey());
	        
	        
	        for (Map.Entry<String, Integer> entry : list) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }


	}

}
