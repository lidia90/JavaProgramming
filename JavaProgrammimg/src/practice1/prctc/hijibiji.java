package practice1.prctc;

import java.util.Scanner;

public class hijibiji {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter following:");
        int i = scan.nextInt(); 
        double d = scan.nextDouble(); 
        String s = scan.nextLine();
        /*if(scan.hasNextInt())
        i = scan.nextInt();
        if(scan.hasNextDouble())
        d = scan.nextDouble();
        s = scan.nextLine();*/
        if(s.isEmpty() )
        s = scan.nextLine();
        
        System.out.println(i+""+d+""+s);
			
	}
	

}
