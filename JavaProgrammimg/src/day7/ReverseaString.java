package day7;

public class ReverseaString {

	public static void main(String[] args) {
		
		//Approach 1 - length(),charAT()
		
		/*String s= "I love java";
		String rev = "";
		for (int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		//Approach 2- without using string method/char type array
		
		/*String s = "welcome";
		String rev = "";
		
		char a[] = 	s.toCharArray();
		
		for (int i=a.length-1;i>=0;i--)
		{
			rev=rev+ a[i];
		}
		System.out.println(rev);*/
		
		//Approach 3-using StringBuffer
		
		/*StringBuffer s = new StringBuffer("welcome");
		System.out.println("Reverse string is:" + s.reverse());*/
		
		//Approach 4-StringBuilder 
		
		StringBuilder s = new StringBuilder	("welcome");
		System.out.println("Reverse string is:" + s.reverse());

	}

}
