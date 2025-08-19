package day7;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		//mutable can change the string--String
		/*int a[]= {100,20,40,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));*/
		
		//immutable can not change --StringBuffer & StringBuilder
		String s = new String("welcome");
		s.concat("to java");
		System.out.println(s);
	}

}
