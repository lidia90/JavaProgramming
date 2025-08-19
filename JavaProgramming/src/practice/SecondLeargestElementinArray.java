package practice;

import java.util.Arrays;

public class SecondLeargestElementinArray {

	public static void main(String[] args) 
	{
		int a[]= {3,9,7,8,12,6,15,5,4,10};
		
		Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		int res = a[a.length-2];
		System.out.println("2nd leargest no is:"+" "+res);
			
		
	}

}
