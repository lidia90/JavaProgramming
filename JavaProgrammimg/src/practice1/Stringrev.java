package practice1;

public class Stringrev {

	public static void main(String[] args) 
	{
		String s="abc,123@gmail.com";
		String rev= "";
		//Approach 1
		
		/*for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is:"+" "+ rev);*/
		
		char a[]=s.toCharArray();
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(a[i]);
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:"+" "+ rev);
	}

}
