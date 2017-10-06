package PolymorphismDemo;

public class Main 
{

	public static void main(String[] args)
	{
		Addition sum1=new Addition();
		sum1.add(2, 4);
		Addition sum2=new Addition();
		sum2.add(2.5, 4.1);
		Addition sum3=new Addition();
		sum3.add(2,3,4);
	}

}
