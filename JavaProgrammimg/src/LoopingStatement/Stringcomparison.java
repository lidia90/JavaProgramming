package LoopingStatement;

public class Stringcomparison {

	public static void main(String[] args) 
	{
		int a [][]= { {100,200},
					{300,400},
					{500,600}};

		for (int arr[] : a)
		{
			for (int x : arr)
			{
				System.out.print(x);
			}
		}

	}
}