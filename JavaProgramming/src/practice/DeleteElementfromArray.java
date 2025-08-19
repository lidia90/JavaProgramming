package practice;

import java.util.Arrays;

public class DeleteElementfromArray {

	public static void main(String[] args) 
	{
		int a[]= {2,3,6,7,2,12,66};
		int b[]=new int [a.length-1];
		int dl=3,k=0;
		
		for(int i=0;i<a.length;i++)
			if(i!=dl)
			{
				b[k]=a[i];
				k++;
			}
		//System.out.print(a[i]+" ");
		System.out.print(Arrays.toString(b)+" ");
	}
	

}
