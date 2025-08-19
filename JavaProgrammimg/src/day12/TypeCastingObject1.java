package day12;

class parent
{
	String name = "John";
	void m1()
	{
		System.out.println("this is m1 from parent...");
	}
}
class child extends parent
{
	int id = 100;
	void m2()
	{
		System.out.println("this is m2 from child");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) 
	{
		/*child c = new child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		parent p = new child();
		System.out.println(p.name);
		//p.m1(); --not possible
		//System.out.println(p.id); --not possible
		p.m2();*/
		
		parent p = new parent();
		child c = (child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
	}

}
