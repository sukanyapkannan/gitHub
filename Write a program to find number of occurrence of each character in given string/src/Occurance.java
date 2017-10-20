import java.util.*;
public class Occurance
{
Occurance()
{
	String string;
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string :");
	string=s.nextLine().toLowerCase();
	System.out.println("enter the character to be searched :");
	 char character = s.next().toLowerCase().charAt(0);
	for(int i=0;i<string.length();i++)
	{
		if(string.charAt(i)==character)
			count++;
	}
	if(count==0)
		System.out.println("no character as such exists !");
	else
		System.out.println(character+" occurs "+count+" times in the string "+string);
}
}
