package Day8;

public class EmployeeClass {
	
	//variables
	int eid;
	String ename;
	String job;
	int sal;
	
	//method
	void display() //void:bcz it is printing only console page not return value
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);

	}

	/*public static void main(String[] args) 
	{
		EmployeeClass emp1 = new EmployeeClass(); // object
		emp1.eid = 101;
		emp1.ename= "John";
		emp1.job="Manager";
		emp1.sal= 100000;
		emp1.display();
	}*/

}
