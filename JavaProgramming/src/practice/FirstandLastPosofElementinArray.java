package practice;

public class FirstandLastPosofElementinArray {

	public static void main(String[] args) {
		int a[]=  {1,0,2,0,8,0,9,0,1,5};
		int t=0;
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==t)
			{
				System.out.println("starting pos:"+i); break;
			}
			
		}
		for(int i =a.length-1;i>=0;i--)
		{
			if(a[i]==t)
			{
				System.out.println("last pos:"+i); break;
			}
			
		}
		
	}

}
