package serializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemoMain 
{

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\hello\\Emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Employee emp=new Employee("sukanya", 51, 30000);
			oos.writeObject(emp);
			System.out.println("object written to a file");
			oos.close();
			FileInputStream fis=new FileInputStream("c:\\hello\\Emp.txt");
			ObjectInputStream  ois=new  ObjectInputStream(fis);
			Employee emp1=(Employee)ois.readObject();
			System.out.println(emp1);
		}
		catch(IOException e)
		{
			System.out.println("Exception arised"+e);
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}

}
