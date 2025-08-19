package practice;

import java.util.Arrays;

public class LeftShiftingArray {

	public static void main(String[] args) 
	{
		int a[]= {10,2,4,6,8};
		int temp = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
		for(int x: a)
			System.out.print(x+",");
		System.out.println("");
	}

}
