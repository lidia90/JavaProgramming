package day6;

public class PrintEvenOdd {

	public static void main(String[] args) 
	{
		int a[]= {10,33,2,4,55,81,50};
		int count=0;
		int count1=0;
		
		for (int x:a)
			if (x%2==0)
			{
				count++;
				
			} 
			System.out.println("even count is:" + count);
			
			for (int x:a)
				if (x%2!=0)
				{
					count1++;
					
				} 
				System.out.println("odd count is:" + count1);
			
	}

}
