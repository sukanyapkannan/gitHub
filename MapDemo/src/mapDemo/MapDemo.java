package mapDemo;
import java.util.*;
import java.util.Map.Entry;

public class MapDemo 
{

	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "sukanya");
		map.put(200, "tinu");
		map.put(300, "lovely");
		
		Set<Integer> key=map.keySet();
		
		for(Integer ke:key)
		{
			System.out.println(ke+":"+map.get(ke));
		}
		
		
	}

}
