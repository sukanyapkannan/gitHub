import java.util.*;
import java.io.*;


public class StringReverse
{
	StringReverse()
	{
	String myString = "HELLO"; 
	StringBuffer stringbuffer = new StringBuffer(myString);
	String reverse = stringbuffer.reverse().toString();
	System.out.println(reverse);
	}
}
