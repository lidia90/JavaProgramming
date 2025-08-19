package day6;

public class LargestNo {

	public static void main(String[] args) 
	{
		int a[]= {20,11,400,34,700};
		int t=0;
		
		for (int i=0;i<a.length;i++)
			for (int j=i+1;j<a.length;j++)
				if (a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		System.out.println("largest no is:" + a[a.length-1]) ;
	}

}
