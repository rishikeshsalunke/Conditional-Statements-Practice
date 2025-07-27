package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q23_ReverseTriangle {

	public static void main(String[] args) {

//		Write a Java program to generate the following * triangles.
//
//		Test Data
//		Input the number: 6
//		Expected Output :
//
//		******                                                   
//		 *****                                                   
//		  ****                                                   
//		   ***                                                   
//		    **                                                   
//		     *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number row: ");
		int n = sc.nextInt();
		
		
		for(int row = n; row >= 1; row--)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
