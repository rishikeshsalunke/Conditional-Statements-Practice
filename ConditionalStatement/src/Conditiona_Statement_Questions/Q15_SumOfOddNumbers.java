package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q15_SumOfOddNumbers {

	public static void main(String[] args) {

//		Test Data
//		Input number of terms is: 5
//		Expected Output :
//
//		The odd numbers are :                                                            
//		1                                                                                
//		3                                                                                
//		5                                                                                
//		7                                                                                
//		9                                                                                
//		The Sum of odd Natural Number upto 5 terms is: 25
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of terms: ");
		int terms = sc.nextInt();
		
		int sum = 0;
		int number = 1;
		
		System.out.println("\nThe odd numbers are: ");
		
		for(int i = 1; i <= terms; i++)
		{
			System.out.println(number);
			
			sum = sum + number;
			
			number = number + 2;
			
		}
		
		System.out.println("The sum of odd natural number upto " +terms+ " terms is: " +sum);
		
		
		
		
		
		

	}

}
