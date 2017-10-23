package Shapes;

import java.util.Scanner;

public class Rectangle extends Area
{
double length;
double breadth;
double area;
void Area()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the length of rectangle :");
	length=s.nextDouble();
	System.out.println("enter the breadth rectangle:");
	breadth=s.nextDouble();
	area=length*breadth;
	System.out.println("area of the rectangle is :"+area);
}
}
