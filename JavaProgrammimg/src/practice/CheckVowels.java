package practice;

public class CheckVowels {

	public static void main(String[] args) {
		String s = "programming";
		String s1 =s.toUpperCase();
		int i =0,a=0;
		for(char c : s1.toCharArray())
		
			if (c>='A' && c<='Z')
			{
				if (c=='A' || c=='E'||c=='I'||c=='O'||c=='U')
				{
					//System.out.println("vowels"+ c);
					i++;
				}
				else
				{
					//System.out.println("consonants");
					a++;
				}
			}
			
		
		System.out.println("vowels:" + i);
		System.out.println("consonants:"+a);
	}

}
