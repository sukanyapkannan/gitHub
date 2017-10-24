import java.util.*;
public class SortingDemo2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("AA");
		arraylist.add("KK");
		arraylist.add("MM");
		arraylist.add("BB");
		arraylist.add("ZZ");
		System.out.println("before sorting :");
			System.out.println(arraylist);
		Collections.sort(arraylist,Collections.reverseOrder());
		System.out.println("after sorting :");
		for(String count:arraylist)
		{
			System.out.println(count);
		}
	}

}
