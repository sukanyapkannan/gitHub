import java.util.ArrayList;
import java.util.Iterator;

public class IterationDemo
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(12);
		arraylist.add(24);
		arraylist.add(48);
		arraylist.add(36);
		//using for loop
		System.out.println("for loop");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		//Advanced for loop
		System.out.println("Advanced for loop ");
		for(Integer n:arraylist)
		{
			System.out.println(n);
		}

		//while loop
		System.out.println( "while loop ");
		int count=0;
		while(arraylist.size()>count)
		{
			System.out.println(arraylist.get(count));
			count++;
		}
		
		//iterator
		System.out.println("Iterator ");
		Iterator<Integer> iterator=arraylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
