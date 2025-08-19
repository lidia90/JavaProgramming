package day4;

public class Reverseanumber {

	public static void main(String[] args) {
		int num = 1234,rev,reverseno=0;
		while (num >0)
		{
			rev = num%10;
			num=num/10;
			reverseno = reverseno*10+ rev;
		}
		System.out.println("the reverse no is:" + reverseno);

	}

}
