package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q07_DaysInMonth {

	public static void main(String[] args) {

//		Write a Java program to find the number of days in a month.
//
//		Test Data
//		Input a month number: 2
//		Input a year: 2016
//		Expected Output :
//		February 2016 has 29 days
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month in number (1-12): ");
		int month = sc.nextInt();
		
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		String monthName = "";
		int days = 0;
		
		switch (month)
		{
		case 1: 
			monthName = "January";
			days = 31;
			break;
			
		case 2: 
			monthName = "February";
			
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			{
				days = 29;
			}
			else {
				days = 28;
			}
			break;
			
		case 3: 
			monthName = "March";
			days = 31;
			break;
			
		case 4: 
			monthName = "April";
			days = 30;
			
		case 5: 
			monthName = "May";
			days = 31;
			break;

		case 6: 
			monthName = "June";
			days = 30;
			
		case 7: 
			monthName = "July";
			days = 31;
			break;

		case 8: 
			monthName = "August";
			days = 31;
			break;

		case 9: 
			monthName = "September";
			days = 30;
			break;

		case 10: 
			monthName = "Ouctober";
			days = 31;
			break;

		case 11: 
			monthName = "November";
			days = 30;
			break;

		case 12: 
			monthName = "December";
			days = 31;
			break;

		default:
			System.out.println("Invalid month Number.");;
			return;
		}
		
		System.out.println(monthName+ " " +year +" has " +days +" days.");

		

	}

}
