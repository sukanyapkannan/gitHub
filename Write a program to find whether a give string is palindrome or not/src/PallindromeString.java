import java.util.*;
public class PallindromeString
{
	static String mystring;
	static String reverse;
public PallindromeString() 
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string :");
	mystring=s.next();
	System.out.println("string :"+mystring);
	StringBuffer stringbuffer=new StringBuffer(mystring);
    reverse=stringbuffer.reverse().toString();
	System.out.println("reverse string :"+reverse);
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
public static void main(String[]arg)
{
	PallindromeString p=new PallindromeString();
	if(mystring.equals(reverse))
		System.out.println("String is a pallindrome !");
	else
		System.out.println("string is not pallindrome !");
}
}
