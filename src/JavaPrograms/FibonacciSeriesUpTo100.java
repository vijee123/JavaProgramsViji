package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeriesUpTo100 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//System.out.println("Enter the no of numbers required in the Fibonacci series:");
		//int n = sc.nextInt();
		int a =0;
		int b=1;
		int num=0;
		
		System.out.println(a);
		System.out.println(b);
		while(num<=100)
		{
			num = a+b;
			if(num<=100) {
			System.out.println(num);
			}
			int c =a+b;
			a = b;
			b = c;
		  }
		
	}

}
