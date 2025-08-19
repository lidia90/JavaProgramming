package practice;

public class FindMissingNo {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,6,7},sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		for (int j=0;j<=7;j++)
			sum1= sum1+j;
		System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}
