package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q11_NaturalNumbers_TheirSum {

	public static void main(String[] args) {

//		Write a Java program to display n terms of natural numbers and their sum.
//		Test Data
//		Input the number: 2
//		Expected Output :
//		Input number:                                                                    
//		2                                                                                
//		The first n natural numbers are :                                                
//		2                                                                                
//		1                                                                                
//		2                                                                                
//		The Sum of Natural Number upto n terms :                                         
//		23
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i = 1; i <= n; i++)
		{
			sum = i + sum;
		}
		System.out.println("The Sum of Natural Number upto " +n+ " is " +sum);
		

	}

}
