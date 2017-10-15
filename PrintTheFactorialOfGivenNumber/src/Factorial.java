import java.util.Scanner;
import java.util.*;
public class Factorial
{
	
	int factorial(int n)
	{
	    if(n > 1)
	        return n * factorial(n - 1);
	    else
	        return 1;
	   
	}
	public static void main(String[] args)
	{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter a positive integer :");
n=s.nextInt();
Factorial factorial=new Factorial();
//factorial.factorial(n);
System.out.println("factorial is :"+factorial.factorial(n));
}
}
