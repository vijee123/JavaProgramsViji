package JavaPrograms;

import java.util.Scanner;

public class reverseNumberPalindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to Reverse:");
		int no = sc.nextInt();
		int a = no;
		int j;
		int RevNum =0;
		
		while(no>0)
		{
			 j = no%10;
			 RevNum = RevNum*10+j;
			 no=no/10;
		}
		System.out.println("The Reversed number is: "+RevNum);
		
		//To check whether the given no is Palindrome or not
		if(a==RevNum)
			System.out.println("The given no is a Palindrome..");
		else
			System.out.println("The given no is NOT a Palindrome...");

	}

}
