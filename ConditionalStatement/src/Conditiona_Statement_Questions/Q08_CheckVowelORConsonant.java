package Conditiona_Statement_Questions;

import java.util.Scanner;

public class Q08_CheckVowelORConsonant {

	public static void main(String[] args) {

//		Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//		Test Data
//		Input an alphabet: p
//		Expected Output :
//		Input letter is Consonant
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an alphabet: ");
		String input = sc.next();
		
        // Check if the input length is exactly 1
		if(input.length() == 1)
		{
			
			char ch = input.charAt(0);
			
            // Check if character is a letter (a-z or A-Z)
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
			{
				
	            // Convert character to lowercase to simplify vowel check	
				char lowerCh = Character.toLowerCase(ch);
				// Check if it's a vowel
				if(lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u')
				{
					System.out.println("Input letter is Vowel");
				}
				else 
				{
					System.out.println("Input letter is Consonant");
				}
				
			}
			else
			{
                System.out.println("Error: Not a valid letter of the alphabet.");
			}
			
		}
		else
		{
            System.out.println("Error: Input should be a single character.");
		}
	}
}
