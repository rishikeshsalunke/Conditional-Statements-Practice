package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q26_CharacterRhombusStructure {
	
	public static void main(String[] args) {
		
//		Write a Java program to display the following character rhombus structure.
//
//		Test Data
//		Input the number: 7
//		Expected Output :
//
//		                                      
//		      A                                                  
//		     ABA                                                 
//		    ABCBA                                                
//		   ABCDCBA                                               
//		  ABCDEDCBA                                              
//		 ABCDEFEDCBA                                             
//		ABCDEFGFEDCBA                                            
//		 ABCDEFEDCBA                                             
//		  ABCDEDCBA                                              
//		   ABCDCBA                                               
//		    ABCBA                                                
//		     ABA                                                 
//		      A   
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number row: ");
		int n = sc.nextInt();

		// Upper half loop
		for(int row = 1; row <= n; row++)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			// Print ascending characters from 'A' up to the ith character
            // Example: when i=3 → A B C
			for(int asc = 0; asc < row; asc++ )
			{
				System.out.print((char) ('A' + asc));
			}
			
			// Print descending characters back down to 'A'
            // Skip the last character already printed, so start from i-2
            // Example: when i=3 → B A
			for(int des = row-2; des >= 0; des--)
			{
				System.out.print((char) ('A' + des));
			}
			System.out.println();	
		}
		
		
		// Lower half loop
		for (int row = n - 1; row >= 1; row--)
		{
			for(int space = 1; space <= n-row; space++)
			{
				System.out.print(" ");
			}
			
			// Print ascending characters from 'A' up to the ith character
            // Example: when i=3 → A B C
			for(int asc = 0; asc < row; asc++)
			{
				System.out.print((char) ('A' + asc));
			}
			
			// Print descending characters back down to 'A'
            // Skip the last character already printed, so start from i-2
            // Example: when i=3 → B A
			for(int des = row-2; des >= 0; des--)
			{
				System.out.print((char) ('A' + des));
			}
			System.out.println();
			
		}
		
		
		
	}

}
