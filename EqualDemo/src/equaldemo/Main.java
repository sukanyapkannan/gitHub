package equaldemo;

public class Main 
{

	public static void main(String[] args)
	{
		EqualDemo equaldemo=new EqualDemo(20,50);
		EqualDemo equaldemo1=new EqualDemo(25,50);
	    if (equaldemo.equals(equaldemo1))
	    		{
	    	System.out.println("dimensions are equal");
	    		}
	    else
	    {
	    	System.out.println("dimensions are not equal");
	    }
	}
	

}
