import java.util.*;
public class BinarySearch 
{
	int n,i,ch,arr[],first,last,middle;
BinarySearch()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements :");
	n=s.nextInt();
	System.out.println("enter the numbers :");
	arr=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("enter value to find :");
	ch=s.nextInt();
	first=0;
	last=n-1;
	middle=(first+last)/2;
	while(first<=last)
	{
		if(arr[middle]<ch)
		{
			first=middle+1;
		}
		else if(arr[middle]==ch)
		{
			System.out.println(ch+" found at"+(middle+1)+" location ");
			break;
		}
		else
		{
			last=middle-1;
			middle=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println(ch+" is not present in the list ");
		}
	}
}
}
