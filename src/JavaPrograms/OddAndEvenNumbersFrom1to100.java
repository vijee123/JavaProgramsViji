package JavaPrograms;

public class OddAndEvenNumbersFrom1to100 {

	public static void main(String[] args) {
		int OddCount=0, EvenCount=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
			   EvenCount++;
			}
			else
			{
				OddCount++;
			}
		}
		System.out.println("The number of Odd numbers are: "+OddCount);
		System.out.println("The number of Even numbers are: "+EvenCount);

	}

}
