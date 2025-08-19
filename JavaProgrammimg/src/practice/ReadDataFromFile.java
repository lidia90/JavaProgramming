package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		//Approach-1 using FileReader and BufferedReader
		
		/*FileReader fr = new FileReader("C:\\Users\\saika\\OneDrive\\Desktop\\Selenium\\Test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while ((str= br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		//Approach-2 using Scanner class
		
		File file = new File ("C:\\Users\\saika\\OneDrive\\Desktop\\Selenium\\Test.txt");
		
		Scanner sc = new Scanner (file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
