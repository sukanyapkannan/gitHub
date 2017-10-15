import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first string without spaces :");
		String m=s.next();
		Strings s1=new Strings(m);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter second string without spaces:");
		String n=sc.next();
		Strings s2=new Strings(n);
		if(s1.equals(s2))
			System.out.println("two strings are equal");
		else
			System.out.println("two strings are different");
	}

}
