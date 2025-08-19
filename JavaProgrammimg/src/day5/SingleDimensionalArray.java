package day5;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		//declaring an array
		
		//Approach 1
		
		/*int a[]=new int [5];
		//adding value
		a[0]=100;
		a[1]=200;
		a[2]=500;
		a[3]=300;
		a[4]=400;*/
		
		//Approach 2
		
		int a[] = {100,200,300,400,500};
		
		//find length of an array
		/*System.out.println("length of an array is:" + a.length);
		System.out.println(a[3]);*/
		
		//reading all the values from an array
		
		//normal for loop
		
		/*for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//enhanced for loop:
		
		for (int x:a)
			System.out.print(" "+x);
			
	}

}
