package practice1.prctc;

//single:

class A
{
	int a = 100;
	
	void m1()
	{
		System.out.println(a);
	}
}

class B extends A
{

	int b = 200;
	
	void m2()
	{
		System.out.println(b);
	}
	
}

class C extends A
{

	int c = 300;
	
	void m3()
	{
		System.out.println(c);
	}
	
}

public class Prac {

	public static void main(String[] args) {
		
		C cobj = new C();
		B bobj=new B();
		System.out.println(cobj.a);
		System.out.println(cobj.c);
		
		cobj.m1();
		cobj.m3();
		
		System.out.println(bobj.b);
		System.out.println(bobj.a);
		
		bobj.m1();
		bobj.m2();



	}

}
