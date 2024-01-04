package JavaPrograms;

import java.util.Scanner;

public class CountDigitsofANumber {

	public static void main(String[] args) {
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to count the digits:");
		int num = sc.nextInt();
		while(num>0)
		{
		if(num%10>0)
		{
		  i++;
		}
		num = num/10;
		}
		System.out.println("Number of digits in  the given no is: "+i);
	}

}
