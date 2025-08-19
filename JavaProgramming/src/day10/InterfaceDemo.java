package day10;

interface Shape
{
	int Length= 10 ; //final& static
	int width = 20; 
	
	void circle(); //abstract method
	
	default void square()
	{
		System.out.println("this is a default method");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle");
	}
}


public class InterfaceDemo implements Shape

{
	public void circle()
	{
		System.out.println("this is circle");
	}
	
	void triangle()
	{
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {
		//scenario 1
		/*InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle();
		idobj.triangle();*/ //static method can directly access from interface
		
		//scenario 2
		
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle(); //static method can directly access from interface
		//sh.triangle(); //cannot access in interface as created in class
	}
	

}
