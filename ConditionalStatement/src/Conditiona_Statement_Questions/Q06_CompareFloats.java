package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q06_CompareFloats {

	public static void main(String[] args) {

//		Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//
//		Test Data
//		Input floating-point number: 25.586
//		Input floating-point another number: 25.589
//		Expected Output :
//		They are different
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first floating-point number:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second floating-point number:");
		double num2 = sc.nextDouble();
		
//		Multiply by 1000 and cast to int to keep only up to 3 decimal places		
//		num1 = 25.586 → 25.586 * 1000 = 25586.0
//		num2 = 25.589 → 25.589 * 1000 = 25589.0
		int n1 = (int) (num1 * 1000);
		int n2 = (int) (num2 * 1000);
		

		if(n1 == n2)
		{
			System.out.println(num1+" is same as "+num2);
		}
		else
		{
			System.out.println(num1+" is different then "+num2);
		}
		

	}

}
