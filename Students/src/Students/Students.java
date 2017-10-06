package Students;
import java.util.Scanner;

public class Students 
{
	String name,id,course;
void getdata()
{
Scanner obj=new Scanner(System.in);
 name=obj.next();
 id=obj.next();
 course=obj.next();
}
void showdata()
{
	System.out.println("name :"+name);
	System.out.println("id :"+id);
	System.out.println("course :"+course);
}
 
}
