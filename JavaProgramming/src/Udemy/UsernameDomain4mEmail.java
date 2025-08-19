package Udemy;

public class UsernameDomain4mEmail {

	public static void main(String[] args) 
	{
		String s ="abc@outlook.Com";
		String[] s1=s.toLowerCase().split("@");
		System.out.println("username "+s1[0]+" & "+"domain "+s1[1]);
	}

}
