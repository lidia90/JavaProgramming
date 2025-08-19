package practice;

import java.util.Scanner;

public class NextLineCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = 0; double d = 0.0; String s = "";
        if(scan.hasNextInt())
        i = scan.nextInt();
        if(scan.hasNextDouble())
        d = scan.nextDouble();
        s = scan.nextLine();
        if(s.isEmpty() )
        s = scan.nextLine();
        
        //scan.close();
        // Write your code here.
        
       
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
        
        
        
        
    
	}

}
