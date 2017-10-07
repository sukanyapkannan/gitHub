package toStringDemo;

public class Main 
{

	public static void main(String[] args)
	{
		ToStringDemo demo=new ToStringDemo("sukanya", "s181175", 22);
		ToStringDemo demo1=new ToStringDemo("sukanya", "s181175", 22 );
		if(demo.equals(demo1))
{
	System.out.println("same resgistrations");
	System.out.println(demo);

	}
		else
		{
			System.out.println("different registrations");
			System.out.println(demo);
			System.out.println(demo1);
		}
		}

}
