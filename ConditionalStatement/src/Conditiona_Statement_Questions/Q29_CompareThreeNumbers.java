package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q29_CompareThreeNumbers {

	public static void main(String[] args) {

//		Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
//		"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
//
//		Test Data
//		Input first number: 2564
//		Input second number: 3526
//		Input third number: 2456
//		Expected Output :
//
//		All numbers are different
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		long num1 = sc.nextLong();
		
		System.out.println("Enter Number 2: ");
		long num2 = sc.nextLong();
		
		System.out.println("Enter Number 3: ");
		long num3 = sc.nextLong();
		
		if(num1 == num2 && num2 == num3)
		{
			System.out.println("All three numbers are equal");
		}
		
		else if(num1 != num2 && num2 != num3 && num3 != num1)
		{
			System.out.println("All numbers are different");
		}
		
		else {
			System.out.println("Neither all are equal or different");
		}

	}

}
