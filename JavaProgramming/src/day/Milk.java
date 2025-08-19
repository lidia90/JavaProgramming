package day;

public class Milk {
	
	String title;
	String author;
}

class MilkTestDrive {
	public static void main(String[] args) {
		
		Milk[] myMilk = new Milk[3];
		
		myMilk[0] = new Milk();
		myMilk[1] = new Milk();
		myMilk[2] = new Milk();
		myMilk[0].title = "The Grapes of Java";
		myMilk[1].title = "The Java Gatsby";
		myMilk[2].title = "The Java Cookbook";
		myMilk[0].author = "ram";
		myMilk[1].author = "sam";
		myMilk[2].author = "jadu";
		
		int x = 0;
		while (x<3) {
			System.out.println(myMilk[x].title + " " + "by" + " " + myMilk[x].author);
			//System.out.println("by");
			//System.out.println(myMilk[x].author);
			x = x + 1;
		}

	}

}
