package Conditiona_Statement_Questions;

public class Q03_GreatestThree {

	public static void main(String[] args) {
		// Write a Java program that takes three numbers from the user and prints the greatest number.
//		Test Data
//		Input the 1st number: 25
//		Input the 2nd number: 78
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87
		
		int a = 22, b = 3, c = 4;
		
		if(a > b)
		{
			if(a > c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b > c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}

	}

}
