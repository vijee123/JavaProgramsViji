package JavaPrograms;

import java.util.Scanner;

public class numberFactorial {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the Factorial:");
		int i = sc.nextInt();
		int fact =1;
		for  (int j=1; j<=i; j++ )
		{
			fact = j*fact; 
		}
		System.out.println("The factorial of "+i+" is "+fact);
	}

}
