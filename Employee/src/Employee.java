
public class Employee 
{
 String id;
 String name;
 String designation;
 String department;
public Employee(String id, String name, String designation, String department) 
{
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.department = department;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
 void display()
 {
	 System.out.println("id:"+id);
	 System.out.println("name :"+name);
	 System.out.println("designation :"+designation);
	 System.out.println("department :"+department);
 }

 
 
 
}
