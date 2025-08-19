package practice1;

import java.util.Scanner;

public class Greeting_main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string:");
		
		String s = sc.nextLine();
		//
		System.out.println("original string is:"+s);
		
		//String s = "Subburaj123";
		
		System.out.println(s.replaceAll("[^A-Za-z]",""));
		//System.out.println(s1);
		System.out.println(s.replaceAll("[^0-9]",""));
		//System.out.println(s2);
		
		
	}
		
}

