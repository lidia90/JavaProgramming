package day4;

public class CountDigitsNo {

	public static void main(String[] args) {
		int n = 145,count = 0;
		while (n>0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);
				
	}

}
