package practice;

public class CapitalizedString {

	public static void main(String[] args) {
		String s = "My name is Lidia";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
