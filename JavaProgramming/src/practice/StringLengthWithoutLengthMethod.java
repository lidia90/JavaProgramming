package practice;

public class StringLengthWithoutLengthMethod {

	public static void main(String[] args) {
		String s = "programming";
		int i=0;
		for (char c: s.toCharArray())
		{
			i++;
		}
		System.out.println(i);
	}

}
