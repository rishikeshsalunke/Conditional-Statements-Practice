package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q24_RightAngleTriangleWithSimblos {

	public static void main(String[] args) {
//		Write a Java program to generate the following @'s triangle.
//
//		Test Data
//		Input the number: 6
//		Expected Output :
//
//		      @                                                  
//		     @@                                                  
//		    @@@                                                  
//		   @@@@                                                  
//		  @@@@@                                                  
//		 @@@@@@
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number row: ");
		int n = sc.nextInt();
		
		
		for(int row = 1; row <= n; row++)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		
		
//		for(int row = 1; row <= n; row++)
//		{
//			for(int space = 1; space <= n - row; space++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int col = 1; col <= row; col++)
//			{
//				System.out.print("@");
//			}
//			System.out.println();
//		}

	}

}
