import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerateInterface 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("one");
		arraylist.add("two");
		arraylist.add("three");
		arraylist.add("four");
		arraylist.add("five");
		Enumeration<String> e=Collections.enumeration(arraylist);
		System.out.println("ArrayList elements :");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

	}

}
