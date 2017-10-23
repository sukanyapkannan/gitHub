package Shapes;
import java.util.*;

public class Circle extends Area
{
	double pi=3.14;
	double r;
	double area;
	void Area()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius of circle r :");
	r=s.nextDouble();
	area=pi*r*r;
	System.out.println("area of the circle is :"+area);
	}
}
