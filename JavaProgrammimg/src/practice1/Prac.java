package practice1;
import java.util.HashMap;

public class Prac 
{
	
	public static void main(String[] args) {
		
		HashMap <Integer,String> hm =new  HashMap<>();
		hm.put(102,"Mary");
		hm.put(103,"Scott");
		hm.put(104,"David");
		hm.put(105,"Nick");
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(int k: hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}

		
		
	}
		
}
	


