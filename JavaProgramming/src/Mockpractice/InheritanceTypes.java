package Mockpractice;

class A
{
	int a =100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends  A
{
	int b =200;
	void show()
	{
		System.out.println(b);
	}
}

class C extends  A
{
	int c =300;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) 
	{
		B aobj = new B();
		System.out.println(aobj.a);
		System.out.println(aobj.b);
		
		aobj.show();
		aobj.display();

		C cobj = new C();
		System.out.println(cobj.a);
		System.out.println(cobj.c);
		
		cobj.print();
		cobj.display();
	}

}
