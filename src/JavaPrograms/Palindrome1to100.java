package JavaPrograms;

public class Palindrome1to100 {
	
	public static void main(String args[])
	{
		System.out.println("The Palindrome numbers between 1 and 100 are given below: ");
		
		
		for(int n=1; n<=100; n++)
		{
			int no =n;
			int a = no;
			int j =0, revNum=0;
			while(no>0)
			{
			j = no%10;
			revNum =revNum*10+j;
			no = no/10;
			}
			if(a==revNum)
				System.out.print(revNum+",");
			
		}
	}

}
