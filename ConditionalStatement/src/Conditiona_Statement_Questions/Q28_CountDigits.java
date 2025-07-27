package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q28_CountDigits {

	public static void main(String[] args) {

//		Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
//
//		Test Data
//		Input an integer number less than ten billion: 125463
//		Expected Output :
//
//		Number of digits in the number: 6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion: ");
		long num = sc.nextLong();
		
		if(num < 0)
		{
			num = num - num;
		}
		
		if(num >= 10000000000L)
		{
            System.out.println("Number is greater or equal to ten billion!");
		}
		else
		{
			int count = 0;
			
			long temp = num;
			
			while(temp != 0)
			{
				temp /= 10;
				count++;
			}
			
			
			if(num == 0)
			{
				count = 1; 
			}
            System.out.println("Number of digits in the number: " + count);

		}

	}

}
