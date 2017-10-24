import java.util.*;
public class CollectionSortMain
{

	public static void main(String[] args) 
	{
		ArrayList<students> arraylist=new ArrayList<students>();
		arraylist.add(new students("sukanya", "s181158100075", 15));
		arraylist.add(new students("tinu", "s181158100074", 10));
		arraylist.add(new students("athulya", "s181158100056", 10));
		arraylist.add(new students("ranjini", "s181158100045", 10));
		Collections.sort(arraylist);
		for(students s:arraylist)
		{
			System.out.println(s);
		}
	}

}
