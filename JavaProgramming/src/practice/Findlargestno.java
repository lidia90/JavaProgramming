package practice;

public class Findlargestno {

	public static void main(String[] args) 
	{
		int a[]= {3,55,6,100},t=0;
		
		//System.out.println("leargest no is:");
		
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				
				}
			}
			System.out.println("largest no is:" + a[a.length-1]) ;
		
	}

}
