package regularExpressionDemo;
import java.util.regex.*;
public class RegularExpressionDemo 
{
 public static void main(String arg[])
 {
	 String target_String = "It is a best of times t8786";
	 Pattern pattern=Pattern.compile("t.mes");
	 Matcher matcher=pattern.matcher(target_String);
	 while(matcher.find())
	 {
		 System.out.println(matcher.group());
	 }
			 
 }
}
