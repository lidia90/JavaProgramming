package day4;

public class Palindrome {

	public static void main(String[] args) {
		int n = 167,rem,rev=0;
		int n1 = n;
		
		while (n!=0)
		{
			rem = n%10;
			n/=10;
			rev =rev * 10 + rem;
			//System.out.println(rev);
		}	
			if (n1==rev)
			{
				System.out.println(n1 +" " + "is a palindrome");
			}
			else
			{
				System.out.println(n1+" " + "is not a palindrome");
			}
		
		
	}

}
