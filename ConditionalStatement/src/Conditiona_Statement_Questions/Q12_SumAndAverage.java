package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q12_SumAndAverage {

	public static void main(String[] args) {

//		Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
//
//		Test Data
//		Input the 5 numbers : 1 2 3 4 5
//		Expected Output :
//
//		Input the 5 numbers :                                                            
//		1                                                                                
//		2                                                                                
//		3                                                                                
//		4                                                                                
//		5                                                                                
//		The sum of 5 no is : 15                                                          
//		The Average is : 3.0

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much number you want to enter: ");
		int n = sc.nextInt();
		
		
		double sum = 0;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Enter number " +i+ " :");
			
			double num = sc.nextDouble();
			sum = num + sum;
		}
		
		double avegage = sum / n;
		
		System.out.println("Sum of " +n+ " number is: " +sum);
		System.out.println("The average is: " +avegage);
		
		

	}

}
