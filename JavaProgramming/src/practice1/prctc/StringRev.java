package practice1.prctc;

public class StringRev {

	public static void main(String[] args) 
	{
		String s = "i love java programming";
		String s1[]= s.split("\\W+");
		String b = s1[s1.length-1];
		//System.out.println(b);
		String a = s1[0].concat(" ").concat(s1[1].concat(" ").concat(s1[2]));
		//System.out.println(a);
		String rev = "";
		for(int i=b.length()-1;i>=0;i--)
		{
			rev = rev+b.charAt(i);
		}
		//System.out.println(rev);
		
		String c = a.concat(" ").concat(rev);
		System.out.println(c);
	}

}
