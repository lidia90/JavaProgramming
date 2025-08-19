package practice1;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) 
	{
		String a = "welcome";
		String a1= "Welcome";
		String b = " to java";
		String c= " selenium";
		String d= a+b+c;
		String s = "abc,xyz@123";//[abc,xyz,123]
		//String s ="abc@gmail.com";
		//String s ="$15,20,55"; //15 20 55
		//System.out.println(a.length()+b.length());
		//System.out.println(d);
		a.concat(b);
		System.out.println(a);
		//System.out.println(b.trim());
		//System.out.println(a.charAt(3));
		//System.out.println(d.contentEquals("welcome"));
		//System.out.println(a.equalsIgnoreCase(a1));
		//System.out.println(a1.replace('e', 'i'));
		//System.out.println(a.substring(0, 4));
		//System.out.println(c.toUpperCase());
		//System.out.println(d.replace(" selenium", " cypress"));
		/*String s1[]=s.split("@");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(Arrays.toString(s1));*/
		/*String s1[]= s.split(",");
		System.out.println(Arrays.toString(s1));//[abc,xyz@123]
		String s2[]=s1[1].split("@");
		System.out.println(Arrays.toString(s2));//[xyz,123]
		System.out.println(s1[0]);//[abc]
		System.out.println(s2[0]);//xyz
		System.out.println(s2[1]);//123
		String s21=(s.replace("@"," ").replace(" ", ","));
		System.out.println(Arrays.toString(s2));*/
		/*String name= "John Kenedy";
		String a11 = name.toLowerCase();
		System.out.println(a11);
		System.out.println(a11.contains("john"));*/
;


		
	}

}
