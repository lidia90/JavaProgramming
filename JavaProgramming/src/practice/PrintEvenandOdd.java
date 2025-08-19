package practice;

public class PrintEvenandOdd {

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,5,6,8,2,2},count=0;
		 for (int i=0;i<=a.length-1;i++)
		 {
			 if (a[i]%2==0)
			 {
				 System.out.println("Even"+ " "+a[i]);
			 }
			 else
			 {
				 System.out.println("Odd"+ " "+a[i]);
			 }
			 count++;
			
		 } System.out.println("Total count is:"+ count);
		
		
	}

}
