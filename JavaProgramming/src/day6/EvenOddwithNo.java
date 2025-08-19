package day6;

public class EvenOddwithNo {

	public static void main(String[] args) 
	{
		int a[]= {10,21,45,60,30,78,43};
		
		System.out.println("even no in the array:");
		for (int i=0;i<a.length;i++)
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		System.out.println("odd no in the array:");
		for (int x:a)
			if(x%2!=0)
				
			{
				System.out.println(x);
			}
	}

}
