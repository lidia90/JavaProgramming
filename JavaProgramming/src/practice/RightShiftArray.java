package practice;

public class RightShiftArray {

	public static void main(String[] args) 
	{
		int a[]= {10,2,4,6,8};
		int temp = a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
			//System.out.println(a[i]);
		}
		a[0]=temp;
		
		for(int x: a)
			System.out.print(x+",");
		System.out.println("");
	
	}

}
