package day4;

public class CountEvenOdd {

	public static void main(String[] args) {
		int n = 4361, rem,evenc = 0,oddc=0;
		while (n>0)
		{
			rem = n%10;
			n/=10;
			//count++;
			
			if (rem%2==0) 
			{
				evenc++;
			}
			else
			{
				oddc++;			
			}
		} System.out.println("even"+ evenc);
		System.out.println("odd"+ oddc);
	}

}
