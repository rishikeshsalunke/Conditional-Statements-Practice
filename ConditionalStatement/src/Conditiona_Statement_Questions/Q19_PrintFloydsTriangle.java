package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q19_PrintFloydsTriangle {

	public static void main(String[] args) {

//		Write a Java program to print Floyd's Triangle.
//
//		Test Data
//		Input number of rows : 5
//		Expected Output :
//
//		Input number of rows :  5
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n = sc.nextInt();
		
		int num = 1;
		
		for(int row = 1; row <= n; row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}

}
