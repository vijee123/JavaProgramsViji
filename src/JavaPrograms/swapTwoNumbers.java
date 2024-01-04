package JavaPrograms;

public class swapTwoNumbers {

	//Swapping using third variable
	public static void main(String[] args) {
		int a = 10, b=14;
		int c;
		System.out.println("The value of a and b are: "+a+" and "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("The value of a and b are: "+a+" and "+b);
		
		//swapping without using any third var
		
		int i =10, j=15;
		System.out.println("The value of i and j are: "+i+" and "+j);
		i = i+j;
		j = i - j;
		i = i - j;
		System.out.println("The value of i and j are: "+i+" and "+j);

	}

}
