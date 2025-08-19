package practice;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args)
	{
		int a[]= {3,4,5,3,6,7,3,4};
		int count=0;
		System.out.println("duplicate elements are:");

		
		//boolean status=false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
			if(a[i]==a[j])
				count++;
 			}
		if (count==1)
		System.out.println(a[i]);
		count=0;
		}
		
	
	}

}
