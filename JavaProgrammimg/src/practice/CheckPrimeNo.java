package practice;

public class CheckPrimeNo {

	public static void main(String[] args) {
		int n= 3,c=0;
		
		if(n>1)
		{
			for (int i = 1;i<=n;i++)
			{
				if(n%i==0)
				
					c++;
			}
				if(c==2)
				{
					System.out.println("prime");
				}
				else
				{
					System.out.println("not prime");
				}
		}
		
		else
		{
			System.out.println("not a prime");
		}
	}

}
