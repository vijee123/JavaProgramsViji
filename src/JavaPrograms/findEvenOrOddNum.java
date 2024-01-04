package JavaPrograms;

import java.util.Scanner;

public class findEvenOrOddNum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number:");
	int no = sc.nextInt();
	if(no%2==0)
		System.out.println("The number is Even...");
	else
		System.out.println("The number is Odd...");

	}

}
