package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q30_OrderThreeNumbers_IncreasingDecreasing {

	public static void main(String[] args) {

//		Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
//		"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
//
//		Test Data
//		Input first number: 1524
//		Input second number: 2345
//		Input third number: 3321
//		Expected Output :
//
//		Increasing order
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		long num1 = sc.nextLong();
		
		System.out.println("Enter Number 2: ");
		long num2 = sc.nextLong();
		
		System.out.println("Enter Number 3: ");
		long num3 = sc.nextLong();
		
		if(num1 < num2 && num2 < num3)
		{
			System.out.println("Increasing order");
		}
		
		else if(num1 > num2 && num2 > num3)
		{
			System.out.println("Decreasing order");
		}
		
		else {
			System.out.println("Neither increasing or decreasing order");
		}

	}

}
