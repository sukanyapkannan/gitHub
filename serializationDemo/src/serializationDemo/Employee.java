package serializationDemo;

import java.io.Serializable;

public class Employee implements Serializable
{
 String empname;
 int empid;
 int salary;
public Employee(String empname, int empid, int salary) 
{
	super();
	this.empname = empname;
	this.empid = empid;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empname=" + empname + ", empid=" + empid + ", salary=" + salary + "]";
}
 
}
