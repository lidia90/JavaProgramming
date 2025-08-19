package day4;

public class SumOfDigit {

	public static void main(String[] args) {
		int n = 123,rem,sum=0;
		while (n!=0)
		{
			rem = n%10;
			n/=10;
			sum= sum+rem;
		}
		System.out.println(sum);
	}

}
