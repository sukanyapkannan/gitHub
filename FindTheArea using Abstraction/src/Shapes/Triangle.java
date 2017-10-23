package Shapes;
import java.util.*;

public class Triangle extends Area
{
double base;
double height;
double area;
void Area()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the base lenth of triangle :");
	base = s.nextDouble();
	area=0.5*base*height;
	System.out.println("area od the triangle is :"+area);
	
}

}

