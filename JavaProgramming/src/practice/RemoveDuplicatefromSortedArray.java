package practice;

import java.util.Arrays;

public class RemoveDuplicatefromSortedArray {

	public static void main(String[] args) 
	{
		int a[]= {2,2,3,4,5,6,7,7,10};
		int n= a.length-1;
		int t[]= new int[n];
		int j=0;
		
		
		for(int i=0;i<n;i++)
		{
			if (a[i]!=a[i+1])
			{
				 t[j++]=a[i];

			}
		}
		t[j++]=a[n];
		//System.out.println(t[j]);
			for(int k=0;k<j;k++)
			{
				System.out.print(t[k]+" ");}
			
	}
	

}
