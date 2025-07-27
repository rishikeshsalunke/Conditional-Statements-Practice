package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q02_QuadraticEquations {

	public static void main(String[] args) {

		// Write a Java program to solve quadratic equations (use if, else if and else).
//		Test Data
//		Input a: 1
//		Input b: 5
//		Input c: 1
//		Expected Output :
//		The roots are -0.20871215252208009 and -4.7912878474779195
		

		double a, b, c;
		double d;
		double r1, r2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a");
		a = sc.nextDouble();
		System.out.println("Enter b");
		b = sc.nextDouble();
		System.out.println("Enter c");
		c = sc.nextDouble();
		
		//First method
//		d = (b*b) - 4*a*c;
		//Second method
		d = (Math.pow(b, 2)) - 4*a*c;
		
		if(d > 0)
		{
			r1 = (-b + Math.sqrt(d)) / (2*a);
			r2 = (-b - Math.sqrt(d)) / (2*a);
			System.out.println("1st root is : "+r1);
			
			System.out.println("2nd root is : "+r2);
		}
		
		else if(d == 0)
		{
			r1 = -b / (2*a);
			System.out.println("1st root is : "+r1);		
		}
		
		else
		{
			System.out.println("Imaginary Roots");
		}
		

	}

}
