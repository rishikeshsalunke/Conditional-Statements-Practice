package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q17_RightAngleTriangle_RepeatingNumbers {

	public static void main(String[] args) {

//		Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
//
//		The pattern is as follows :
//
//		1
//		22
//		333
//		4444
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the terms: ");
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}	

	}

}
