package day6;
import java.util.Arrays;
public class SortingaString {

	public static void main(String[] args) 
	{
		//char s[]= {'A','W','D','H'};
		String s[]= {"Abby","merry","john","jecob","zooby"};
		
		Arrays.sort(s);
		System.out.println("after sorting:" + Arrays.toString(s));
	}

}
