package practice;

public class ShiftAllZeroToRight {
	public static void main(String[] args) {
		int a[]=  {1,0,2,0,8,0,9,0};
		
		int t[]=new int[a.length-1];
		int s[]= new int [a.length-1];
		int j=0,j1=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				t[j++]=a[i];
			}
		}
		for(int k=0;k<j;k++)
		{
			System.out.print(t[k]+" ");
		}
		
		for(int i1=0;i1<a.length;i1++)
		{
			if(a[i1]==0)
			{
				t[j1++]=a[i1];
			}
		}
		for(int k1=0;k1<j1;k1++)
		{
			System.out.print(t[k1]+" ");
		}
	}

}
