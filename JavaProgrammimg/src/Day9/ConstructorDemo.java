package Day9;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()
	{
		x=100;
		y=100;
	}
	
	ConstructorDemo(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(10,40);
		cd.sum();
	}

}
