import java.util.*;
public class Numbers 
{
	int x,y,z,a,b,k,l;
	Numbers()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers :");
x=s.nextInt();
y=s.nextInt();
z=s.nextInt();
if(x>y)
	a=x;
else
	a=y;
if(a>z)
	b=a;
else
	b=z;
System.out.println("largest number is :"+b);
if(x<y)
	k=x;
else
	k=y;
if(k<z)
	l=k;
else
	l=z;
System.out.println("smallest number is :"+l);
	
	
	}
	

}
