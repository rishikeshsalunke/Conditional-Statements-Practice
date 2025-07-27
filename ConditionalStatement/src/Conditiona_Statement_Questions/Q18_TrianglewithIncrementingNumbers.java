package Conditiona_Statement_Questions;

public class Q18_TrianglewithIncrementingNumbers {

	public static void main(String[] args) {

//		Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
//
//		The pattern like :
//
//		1
//		2 3
//		4 5 6
//		7 8 9 10 
		
		
		int n = 1;
		
		for(int row = 1; row <= 4; row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(n++ + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
