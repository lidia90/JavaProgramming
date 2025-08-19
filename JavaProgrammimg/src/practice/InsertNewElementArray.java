package practice;

import java.util.Arrays;

public class InsertNewElementArray {

	public static void main(String[] args) 
	{
		int a[]= {1,4,6,2,9},n=5;
		int x[]= new int[n+1];
		int d= 30;
		
		for(int i=0;i<n;i++)
			{
				x[i]=a[i];
			}
		x[n]=d;
		System.out.println(Arrays.toString(x));
	}

}
