package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q16_RightAngleTriangle_NumberPattern {

	public static void main(String[] args) {

//		Write a Java program to display the pattern like a right angle triangle with a number.
//
//		Test Data
//		Input number of rows : 10
//		Expected Output :
//
//		1                                                                                
//		12                                                                               
//		123                                                                              
//		1234                                                                             
//		12345                                                                            
//		123456                                                                           
//		1234567                                                                          
//		12345678                                                                         
//		123456789                                                                        
//		12345678910
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the terms: ");
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++)
		{
			for(int col = 1; col <= row; col++) 
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
	}

}
