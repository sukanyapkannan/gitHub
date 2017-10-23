package unHandledDemo;

import java.util.Scanner;

public class GlobalCatchHandledDemo {

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
		catch(Exception a)
		{
			System.out.println("some exception has occured!!!");
			
		}
		
System.out.println("exception handled in the program");
	}

}
