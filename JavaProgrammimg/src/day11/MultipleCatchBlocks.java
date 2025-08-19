package day11;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program started");
		String s = null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("handle exception");
			System.out.println(e.getMessage());
		}
		System.out.println("program completed");
		System.out.println("program exited");
	}

}
