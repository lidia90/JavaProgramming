package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\saika\\OneDrive\\Desktop\\Selenium\\Test123.txt");
		
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Selenium with java");
		br.write("Selenium for automation");
		
		System.out.println("finished writing");
		
		br.close();

	}

}
