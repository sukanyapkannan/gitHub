import java.util.Scanner;

public class Numbers 
{
	int i;
	Numbers()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number limit :");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the numbers :");
	for(i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	{
	for(int j=0;j<n;j++)
	System.out.println("numbers are :"+arr[j]);
	}
	}
}
