package Shapes;

import java.util.Scanner;

public class Square extends Area
{
double length;
double area;
void Area()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the side length of square :");
	length=s.nextDouble();
	area=length*length;
	System.out.println("area of the square :"+area);
}

}
