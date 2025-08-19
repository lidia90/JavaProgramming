package practice;

import java.util.HashSet;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) 
	{
		int a[]= {1,3,5,7,2,2};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int x:hs)
			System.out.print(x+" ");
	}

}
