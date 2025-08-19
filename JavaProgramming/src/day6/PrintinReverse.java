package day6;

public class PrintinReverse {

	public static void main(String[] args) 
	{

		int a[]= {10,20,30,60,50};
		
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}

}
