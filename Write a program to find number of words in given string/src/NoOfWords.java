import java.util.*;
public class NoOfWords
{
	String string;
NoOfWords()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string :");
	string=s.nextLine();
	System.out.println("string is :"+string);
	int a=1;
	for(int i=0;i<=string.length()-1;i++)
	{
		if((string.charAt(i)==' ')&&(string.charAt(i+1)!=' '))
			a++;
	}
	System.out.println("number os words in the string is :"+a);
}
}
