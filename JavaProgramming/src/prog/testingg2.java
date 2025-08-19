package prog;

class testingg2 {
	String title;
	String author;

}

class testigg2TestDrive {
	
	public static void main (String[] args) {
		testingg2[] myBuchs = new testingg2[3];
		
		int X = 0;
		myBuchs[0] = new testingg2();
		myBuchs[1] = new testingg2();
		myBuchs[2] = new testingg2();
		myBuchs[0] = new testingg2();
		myBuchs[1] = new testingg2();
		myBuchs[2] = new testingg2();
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

