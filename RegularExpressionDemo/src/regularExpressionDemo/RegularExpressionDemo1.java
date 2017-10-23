package regularExpressionDemo;

import java.util.regex.*;

public class RegularExpressionDemo1
{
 public static void main(String arg[])
 {
	 String target_String="long long ago there was a king";
	 Pattern pattern=Pattern.compile("longg");
	 Matcher matcher=pattern.matcher(target_String);
	 if (matcher.find())
		 System.out.println("pattern found");
	 else
		 System.out.println("pattern not found");
 }
}
