package day6;

public class SmallestNo {

	public static void main(String[] args) 
	{
		int a[]= {20,11,40,3};
		int t=0;
		
		for (int i=0;i<a.length;i++)
			for (int j=i+1;j<a.length;j++)
				if (a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		System.out.println("smallest no is:" + a[a.length-1]) ;
	}

}
