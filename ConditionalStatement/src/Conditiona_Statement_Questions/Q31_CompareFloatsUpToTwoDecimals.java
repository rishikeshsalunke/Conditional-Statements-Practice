package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q31_CompareFloatsUpToTwoDecimals {

	public static void main(String[] args) {

//		Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
//
//		Test Data
//		Input first floating­point number: 1235
//		Input second floating­point number: 2534
//		Expected Output :
//
//		These numbers are different.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter Number 2: ");
		double num2 = sc.nextDouble();
		
		int n1 = (int) (num1 * 100);
		int n2 = (int) (num2 * 100);

		if(n1 == n2)
		{
			System.out.println("These numbers are the same up to two decimals");
		}
		else {
			System.out.println("These numbers are different.");
		}

	}

}
