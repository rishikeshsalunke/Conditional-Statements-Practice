package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q05_WeekdayName {

	public static void main(String[] args) {

//		Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//		Test Data
//		Input number: 3
//		Expected Output :
//		Wednesday
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 7");
		int i = sc.nextInt();
		
		switch (i) {
		case 1: System.out.println("Monday");
		break; 
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thursday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
		
		
		
		
		
		
		
//		for(int n = 2; n <= 100; n++)
//		{
//			boolean isprime = true;
//			
//			for(int i = 2; i < n/2; i++)
//			{
//				if(n % i == 0)
//				{
//					isprime = false;
//					break;
//				}
//			}
//			
//			if(isprime)
//			{
//				System.out.print(n+", ");
//			}
//		}
		

	}

}
