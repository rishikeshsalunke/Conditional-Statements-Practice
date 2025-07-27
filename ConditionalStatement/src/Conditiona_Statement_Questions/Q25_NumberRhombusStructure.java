package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q25_NumberRhombusStructure {

	public static void main(String[] args) {

//		Write a Java program to display the number rhombus structure.
//
//		Test Data
//		Input the number: 7
//		Expected Output :
//
//		                                   
//		      1                                                  
//		     212                                                 
//		    32123                                                
//		   4321234                                               
//		  543212345                                              
//		 65432123456                                             
//		7654321234567                                            
//		 65432123456                                             
//		  543212345                                              
//		   4321234                                               
//		    32123                                                
//		     212                                                 
//		      1 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number row: ");
		int n = sc.nextInt();

		// Upper half loop
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) 
			{
				System.out.print(" ");
			}

			// print descending numbers from i to 1
			for (int dec = row; dec >= 1; dec--) 
			{
				System.out.print(dec);
			}

			// print ascending numbers from 2 to i
			for (int asc = 2; asc <= row; asc++) 
			{
				System.out.print(asc);
			}
			System.out.println();
		}

		// Lower half loop
		for (int row = n - 1; row >= 1; row--)
		{
			for (int space = 1; space <= n - row; space++)
			{
				System.out.print(" ");
			}

			// print descending numbers from i to 1
			for (int dec = row; dec >= 1; dec--) 
			{
				System.out.print(dec);
			}

			// print ascending numbers from 2 to i
			for (int asc = 2; asc <= row; asc++) 
			{
				System.out.print(asc);
			}
			System.out.println();
		}

	}

}
