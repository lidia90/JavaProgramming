package Mockpractice;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) 
	{
		int a[]= {2,4,7,11,9};
		int d =60,j=0,n=a.length;
		int x[]=new int[n+1];
		
		for(int i=0;i<n;i++)
			{ 
			x[j+1]=a[i];
			j++;
			}
		x[0]=d;
		System.out.println(Arrays.toString(x));
	}

}
