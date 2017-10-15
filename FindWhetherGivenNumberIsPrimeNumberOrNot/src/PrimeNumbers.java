import java.util.*;
public class PrimeNumbers 
{
	int n;
	PrimeNumbers()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		n=s.nextInt();
		if(n%2!=0)
		{
			System.out.println("it is a prime number!!");
		}
		else 
		{
			System.out.println("it is not a prime number!!");
		}
	}

}
