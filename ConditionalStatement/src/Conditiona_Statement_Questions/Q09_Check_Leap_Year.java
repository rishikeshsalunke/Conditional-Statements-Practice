package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q09_Check_Leap_Year {

	public static void main(String[] args) {


//		Write a Java program that takes a year from the user and prints whether it is a leap year or not.
//
//		Test Data
//		Input the year: 2016
//		Expected Output :
//		2016 is a leap year
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Year: ");
		int year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0 || (year % 400 == 0)))
		{
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
		

	}

}
