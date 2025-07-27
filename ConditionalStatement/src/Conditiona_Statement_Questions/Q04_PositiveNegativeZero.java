package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q04_PositiveNegativeZero {

	public static void main(String[] args) {

//		Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
//		Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
//		or "large" if it exceeds 1,000,000.
//
//		Test Data
//		Input a number: 25
//		Expected Output :
//		Input value: 25
//		Positive number
		
		
		Scanner sc = new Scanner(System.in);
		double i;
		i = sc.nextDouble();
		
		String abs = "";
		
		if(Math.abs(i) < 1.0)
		{
			abs = "Small";
		}
		if(Math.abs(i) > 1000000.0)
		{
			abs = "Larg";
		}
		
		
		if(i == 0)
		{
			System.out.println("It's a zero");
		}
		else if(i > 0)
		{
			System.out.println("It's a " + abs + " Positive Number");
		}
		else
		{
			System.out.println("It's a " + abs + " Negative Number");
		}
		
		

	}

}
