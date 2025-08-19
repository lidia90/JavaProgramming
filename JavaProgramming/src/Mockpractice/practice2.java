package Mockpractice;

import java.util.Arrays;

public class practice2 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,6,7};
		int n=a.length,d=50,j=0,pos=5;
		int t[]= new int[n+1];
		
		for(int i=0;i<=n;i++)
			{if(i<pos-1)
				t[j++]=a[i];
				//j++;
			//System.out.println(t[j]);
			else if(i==pos-1)
				t[pos-1]=d;
			else
				t[pos++]=a[i-1];
			}	
		System.out.println(Arrays.toString(t));			
	}

}
