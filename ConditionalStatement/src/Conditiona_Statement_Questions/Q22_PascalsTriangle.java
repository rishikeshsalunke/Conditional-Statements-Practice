package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q22_PascalsTriangle {

	public static void main(String[] args) {

//		Write a Java program to display Pascal's triangle.
//
//		Test Data
//		Input number of rows: 5
//		Expected Output :
//
//		Input number of rows: 5                                                          
//		      1                                                                          
//		     1 1                                                                         
//		    1 2 1                                                                        
//		   1 3 3 1                                                                       
//		  1 4 6 4 1 

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n = sc.nextInt();
		
		for(int row = 0; row < n; row++)
		{
			int num = 1; 
			for(int space = 0; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 0; col <= row; col++)
			{
				System.out.print(num + " ");
				num = num * (row - col) / (col + 1);
			}
			System.out.println();
		}
		
	}

}
