package day6;

public class Duplicateelementfound {

	public static void main(String[] args) {
		int a[]= {10,20,30,20,40,50,30,30};
		int search_element = 20;
		int count=0;
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==search_element)
			{
			count++;		
			}
		
		}
		System.out.println(count);

	}
	
}

