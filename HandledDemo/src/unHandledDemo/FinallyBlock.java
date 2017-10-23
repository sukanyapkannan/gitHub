package unHandledDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class FinallyBlock 
{

	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis=new FileInputStream("Hello.txt");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("exception arised"+e);
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(Exception e1)
			{}
		}

	}

}
