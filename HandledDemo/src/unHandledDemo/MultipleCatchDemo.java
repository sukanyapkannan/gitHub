package unHandledDemo;
import java.util.*;
public class MultipleCatchDemo 
{

	public static void main(String[] args)
	{
		int arr[]={1,2,0},var1=50,result,index;
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the index value of the array arr[] :");
			index=s.nextInt();
			result=var1/arr[index];
			System.out.println("result is :"+result);
		}
		catch(ArithmeticException ae1)
		{
			System.out.println("arithematic exception has occured!!!"+ae1);
			
		}
		catch(ArrayIndexOutOfBoundsException ae2)
		{
			System.out.println("Array index out of bounds exception has occured!!!"+ae2);
		}
		catch(Exception ae3)
		{
			System.out.println("some exception has occured"+ae3);
		}
System.out.println("exception handled in the program");
	}

}
