package practice;

public class LowestNo {

	public static void main(String[] args) 
	{
		int a[]= {44,2,60,4,90},t=0;
		
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				
				}
			}
			System.out.println("lowest no is:" + a[a.length-1]) ;
	}

}
