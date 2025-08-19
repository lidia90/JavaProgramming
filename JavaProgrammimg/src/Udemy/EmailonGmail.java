package Udemy;

import java.util.Arrays;

public class EmailonGmail {

	public static void main(String[] args) 
	{
		String s ="abc@outlook.Com";
		String[] s1=s.split("@");
		System.out.println(Arrays.toString(s1));
		System.out.println(s1[1]);

		
		if(s1[1].equalsIgnoreCase("gmail.com"))
		{
			System.out.println("email is on gmail");
		}
		else
		{
			System.out.println("email is not on gmail");
		}
	}

	
}
