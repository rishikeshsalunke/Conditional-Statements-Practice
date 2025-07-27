package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q14_MultiplicationTable {

	public static void main(String[] args) {

//		Write a Java program to display the multiplication table of a given integer.
//
//		Test Data
//		Input the number (Table to be calculated) : Input number of terms : 5
//		Expected Output :
//
//		5 X 0 = 0                                                                        
//		5 X 1 = 5                                                                        
//		5 X 2 = 10                                                                       
//		5 X 3 = 15                                                                       
//		5 X 4 = 20                                                                       
//		5 X 5 = 25
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number (Table to be Calculated): ");
		int number = sc.nextInt();
		
		System.out.println("Enter the number of term: ");
		int terms = sc.nextInt();
		
		for(int i = 0; i <= terms; i++)
		{
			System.out.println(number + " X " +i+ " = " +(number * i));
		}
		
		
		

	}

}
