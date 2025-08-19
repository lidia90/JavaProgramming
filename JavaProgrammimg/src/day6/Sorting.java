package day6;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]= {2,4,1,7,9,3,5,6,8};
		int t=0;
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if (a[j]<a[i])
					{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
		System.out.println( Arrays.toString(a));			

	}
	

}
