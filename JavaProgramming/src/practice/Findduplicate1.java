package practice;

//import java.util.Arrays;

public class Findduplicate1 {

	public static void main(String[] args) 
	{
		int a[]= {3,6,6,5,3,2,6};
		int count=0;
		
		boolean status=false;
		
		System.out.println("duplicate elements are:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			
				if(a[i]==a[j])			
				{
					//System.out.print(a[i]+" ");
					count++;
					status=true;
			//System.out.println(count);
				}
			}
		if(count==1)
		System.out.print(a[i]+" ");
		count=0;
			
		}
		if(status==false)
		System.out.println("not found");
		
	}

}
