package PolymorphismDemo;

public class Addition
{
 void add(int a,int b)
 {
	 int sum=a+b;
	 System.out.println("sum is :"+sum);
 }
 void add(double a,double b)
 {
	 double sum=a+b;
	 System.out.println("fractional sum is"+sum);
 }
 void add(int a, int b,int c)
 {
	 int sum=a+b+c;
	 System.out.println("sum is :"+sum);
 }
}
