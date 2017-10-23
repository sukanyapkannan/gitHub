import java.io.*;
import java.util.*;
public class FileInputStreamDemo 
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\user\\hello.txt");
			int fileBytes=fis.available();   //available() is used to find how many bytes are there in hello.txt.
			byte buff[]=new byte[fileBytes];   //buff[] is an array we create where the content is copied to it.
			fis.read(buff,0,fileBytes);        //reading buff array from index 0 up to the content size.
			String contentFile=new String(buff);  //convert byte  to string.
			System.out.println(contentFile);
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception arised"+e);
		}
	}

}
