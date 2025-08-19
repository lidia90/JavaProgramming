package practice;

public class FindElement {

	public static void main(String[] args) 
	{
		int a[]= {10,33,42,67,55,90};
		int b= 90;
		
		boolean status =false;
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i]==b)
			{
				
				System.out.println("Item is found");
				status=true;
				break;
			}
			
		}
		if (status==false)
		{
			System.out.println("Item is not found");
		}
	}

}
