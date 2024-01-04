package JavaPrograms;

import java.util.Scanner;

public class CheckPalindromeStringOrNot {
	
	public static void main (String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String:");
		String myString = sc.next();
		int length = myString.length();
		String Rev ="";
		for(int i=length-1; i>=0; i--)
		{
			 Rev = Rev+myString.charAt(i);
		}
		if(myString.equals(Rev))
			System.out.println("The given String is a Palindrome.");
		else
			System.out.println("The String is NOT a Palindrome.");
		
	}

}
