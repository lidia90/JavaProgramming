package day11;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("program started...");
		System.out.println("program in progress...");
		Thread.sleep(5000);

		/*try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}*/
		
		System.out.println("program finished...");
		System.out.println("program exited...");
	}

}
