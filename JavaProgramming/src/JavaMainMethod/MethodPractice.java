package JavaMainMethod;

public class MethodPractice {
	
	 int eid;
	 String ename = "smith";
	 String fname;
	 int sal;
	 
	 /*void display()
	 {
		 System.out.println(eid);
		 System.out.println(ename);
		 System.out.println(fname);
		 System.out.println(sal);*/

	 void printData()
	 {
		 System.out.println(eid +" "+ ename+" "+ fname+" " + sal);
	 }

	public static void main(String[] args)
	{
		MethodPractice emp1 = new MethodPractice();
		emp1.eid = 101;
		//emp1.ename= "John";
		emp1.fname= "ray";
		emp1.sal= 50000;
		emp1.printData();
		
		//emp1.display();
		
		MethodPractice emp2 = new MethodPractice();
		emp2.eid = 102;
		//emp2.ename= "Sam";
		emp2.fname= "ray";
		emp2.sal= 80000;
		emp2.printData();

		//emp2.display();
		

	}

}
