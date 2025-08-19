package practice;



import java.util.Arrays;

public class InsertElementatFirst {

	public static void main(String[] args) 
	{
		int a[]= {10,2,4},n=3;//n=2 
		int x[]=new int[n+1];
		int temp= 3;
		
		for(int i=0;i<n;i++)
		{
			x[i+1]=a[i];
			//System.out.print(a[i]);
		}
		x[0]=temp;
		
		/*for(int b: x)
			System.out.print(b+",");
		System.out.println("");*/
		
		/*int a[]= {2,4,7,11,9};
		int d =60,j=0,n=a.length;
		int x[]=new int[n+1];
		
		for(int i=0;i<n;i++)
			{ 
			x[j+1]=a[i];
			j++;
			}
		x[0]=d;*/
		System.out.println(Arrays.toString(x));

	}
	

}
