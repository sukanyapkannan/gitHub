package compositiondemo;

public class Student
{
	int roll;
	   Address address;

	   Student(int rollNo,Address addressDetail)
	   {
	      roll = rollNo;
	      address = addressDetail;
	   }
		
	    void printStudentDetails(Address address1) 
	    {
	       System.out.println("Roll   : " + roll);
	       System.out.println("Street : " + address1.street);
	       System.out.println("City   : " + address1.city);
	       System.out.println("State  : " + address1.state);
	       System.out.println("Zip    : " + address1.zip);
	    }	
		
	    public static void main(String[] args)
	    {
	       Address address1;
	       address1 = new Address("akathethara","palakkad","kerala","679822");
	       Student s1 = new Student(1,address1);
	       s1.printStudentDetails(address1);
	    }
}
