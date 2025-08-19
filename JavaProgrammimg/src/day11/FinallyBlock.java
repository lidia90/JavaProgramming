package day11;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("program started");
		String s = null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch block handle exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered into finally block");
		}
		System.out.println("program finished");
		//System.out.println("program exited");

	}

}
