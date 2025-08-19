package practice;
import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) 
	{
		String a[]= {"hsk","ljuk","aaa","hjed","bad"};
		
		for (int i=0;i<a.length;i++)
			
			for(int j=i+1;j<a.length;j++)
			
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
		
		System.out.println( Arrays.toString(a));
		
	}

}
