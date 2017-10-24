import java.util.*;
public class SortingDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("India");
		arraylist.add("USA");
		arraylist.add("China");
		arraylist.add("Australia");
		System.out.println("before sorting :");
		for(String string:arraylist)
		{
			System.out.println(string);
		}
		Collections.sort(arraylist);
		System.out.println("after sorting :");
			System.out.println(arraylist);
	}

}
