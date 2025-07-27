package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q20_DisplayDiamondPattern {

	public static void main(String[] args) {

//		Write a Java program to display the pattern like a diamond.
//
//		Test Data
//		Input number of rows (half of the diamond) : 7
//		Expected Output :	                                                                                 
//		      *                                                                          
//		     ***                                                                         
//		    *****                                                                        
//		   *******                                                                       
//		  *********                                                                      
//		 ***********                                                                     
//		*************                                                                    
//		 ***********                                                                     
//		  *********                                                                      
//		   *******                                                                       
//		    *****                                                                        
//		     ***                                                                         
//		      *  
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n = sc.nextInt();
		
		
		for(int row = 1; row <= n; row++)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= 2*row-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int row = n-1; row >= 1; row--)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= 2*row-1; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
