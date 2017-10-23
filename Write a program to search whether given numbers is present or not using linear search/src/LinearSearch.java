import java.util.Scanner;

public class LinearSearch 
{
	int n,ch,arr[],i;
	LinearSearch()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements :");
		n=s.nextInt();
		System.out.println("enter "+n+"number of integers :");
		arr=new int [n];
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the integer you want to search :");
		ch=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(ch==i)
			{
				System.out.println("integar "+ch+" is found at "+(i+1)+" th position");
				break;
			}
		}
		if(ch==n)
		{
			System.out.println("there is no integer like "+ch+" exists ");
		}
	}

}
