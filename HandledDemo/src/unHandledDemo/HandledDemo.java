package unHandledDemo;

public class HandledDemo
{
	public static void main(String[] args)
	{
		int var1=42,var2=0,result;
		try
		{
		result=var1/var2;
		System.out.println("result is :"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithematic exception!!!");
		}
		System.out.println("After the print");
	}

}
