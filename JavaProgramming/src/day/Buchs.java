package day;

public class Buchs {
	
	String title;
	String author;

}

class BuchsTestDrive1 {
	public static void main (String[] args) {
		Buchs[] myBuchs = new Buchs[3];
		int X = 0;
		myBuchs[0] = new Buchs();
		myBuchs[1] = new Buchs();
		myBuchs[2] = new Buchs();
		myBuchs[0].title = "the grapes of java";
		myBuchs[1].title = "the java gatsby";
		myBuchs[2].title = "the java cookbook";
		myBuchs[0].author = "bob";
		myBuchs[1].author = "hari";
		myBuchs[2].author = "robi";
		
		while (X < 3) {
			System.out.println("myBuchs[X].title");
			System.out.println("by");
			System.out.println("myBuchs[X].author");
			X = X + 1;
		}
		
	}
}
