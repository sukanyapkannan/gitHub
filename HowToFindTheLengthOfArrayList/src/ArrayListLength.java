import java.util.ArrayList;

public class ArrayListLength 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		System.out.println("Initial Size :"+arraylist.size());
arraylist.add(23);
arraylist.add(55);
arraylist.add(42);
arraylist.add(98);
arraylist.add(100);
		System.out.println("size after adding elements :"+arraylist.size());
arraylist.remove(1);
arraylist.remove(3);
		System.out.println("size after removing elements :"+arraylist.size());
		System.out.println("final arraylist :");
		for(Integer n:arraylist)
		{
			System.out.println(n);
		}


	}

}
