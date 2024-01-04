package JavaPrograms;

import java.util.Scanner;

public class SumOfDigitsofNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int n, sum = 0;
		while(num>0)
		{
			n = num%10;
			if(n>0)
			{
			sum = sum+n;
			num = num/10;
			}
		}
		
		System.out.println("Sum of given digits is: "+ sum);

	}

}
