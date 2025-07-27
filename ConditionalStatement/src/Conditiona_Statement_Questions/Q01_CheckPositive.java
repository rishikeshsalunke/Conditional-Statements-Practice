package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q01_CheckPositive {

	public static void main(String[] args) {

		// Write a Java program to get a number from the user and print whether it is positive or negative.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the number: ");
		int i = sc.nextInt();
		
		if(i>0)
		{
			System.out.println(i+" Number is Positive");
		}
		else if(i == 0)
		{
			System.out.println(i+" Number is Neutral Number");
		}
		else
		{
			System.out.println(i+" Number is Negative");
		}
		

	}

}
