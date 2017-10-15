import java.util.*;
public class Table 
{
	Table()
	{
		int a;
Scanner s=new Scanner(System.in);
System.out.println(" multipilcation table of which number u want ?:");
int n=s.nextInt();
for(int i=1;i<=10;i++)
{
	a=n*i;
			System.out.println(n+"*"+i+"="+a);
}
	}
}
