package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q27_CheckNegativeZeroPositive {

	public static void main(String[] args) {

//		Write a Java program that reads an integer and check whether it is negative, zero, or positive.
//
//		Test Data
//		Input a number: 7
//		Expected Output :
//
//		Number is positive
		
		Scanner sc = new Scanner(System.in);
		String choice;
		do
		{
            // Check if number is positive, negative, or zero
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			
			if(num > 0)
			{
				System.out.println(num + " is Positive number");
			}
			else if(num < 0)
			{
				System.out.println(num + " is Negative number");
			}
			else
			{
				System.out.println(num + " is Zero");
			}
			
            // Ask user if they want to continue
            System.out.print("Do you want to check another number? (y/n): ");
            choice = sc.next();
			
		}
		while(choice.equalsIgnoreCase("y")); // Continue if user enters 'y' or 'Y'
		
		System.out.println("Program ended.");
        sc.close();

	}

}
