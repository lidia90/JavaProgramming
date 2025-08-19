package Udemy;

import java.util.Scanner;

public class YearisLeapYear {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a year:");
		
		
		int year= sc.nextInt();
		
		boolean flag=false;
		
		if (year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					System.out.println("leap year");flag=true;
				}
				else
				{
					System.out.println("not leap");flag=false;
				}
								
			}
			else
			System.out.println("leap year");flag=true;
		}
		else
		System.out.println(" not leap year");flag=false;
		
	}

}
