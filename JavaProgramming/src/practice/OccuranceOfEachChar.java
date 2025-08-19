package practice;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		String s = "greek";
		int[] a= new int[256];
		
		for(char ch : s.toCharArray())
		{
			a[ch]++;
		}
		
		for(int i=0;i<a.length;i++)
			{
				if(a[i]>0)
				{
					System.out.println((char)i+":"+a[i]);
				}
			}
	}

}
