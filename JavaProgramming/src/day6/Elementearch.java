package day6;

public class Elementearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_element = 30;
		
		boolean status = false;
		
		/*for (int i=0;i<=a.length-1;i++)
			if (a[i]==search_element)
			{
				System.out.println("element found");
				status=true;
				break;
			}*/
			/*else
			{
				System.out.println("element not found"); break;
			}*/
		//using enhance for loop
		for (int x:a)
		{
			System.out.println("element found");
			status=true;
			break;

		}
		if(status==false)
		{
			System.out.println("element not found");
		}
	}
		

}
