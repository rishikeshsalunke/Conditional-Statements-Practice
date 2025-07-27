package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q18_PyramidWithRepeatingNumbers {
	
	public static void main(String[] args) {
		
//		Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
//
//	       1
//	      2 2
//	     3 3 3
//	    4 4 4 4 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the terms: ");
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++)
		{
			for(int space = 1; space <= n - row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++)
			{
				System.out.print(row + " ");
			}
			System.out.println();
		}
	
	}

}
