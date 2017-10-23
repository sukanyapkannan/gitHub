import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo 
{

	public static void main(String[] args) 
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("c:\\hello\\hellosukanya.txt");
		String str="Hello this is sukanyapkannan";
		for(int i=0;i<str.length();i++)
		{
			fos.write(str.charAt(i));
		}
		System.out.println("content written to file ");
		fos.close();
		FileOutputStream fos1=new FileOutputStream("c:\\hello\\hellotinu.txt");
				String str1="hello this is tinu";
		for(int i=0;i<str1.length();i++)
		{
			fos1.write(str1.charAt(i));
		}
		fos1.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception arised"+e);
		}
	}

}
