package EmployeeDemo;

public class EmployeeDemo 
{
 String empname;
 String empid;
 int empsalary;
 int empage;
public EmployeeDemo(String empname, String empid, int empsalary, int empage) {
	super();
	this.empname = empname;
	this.empid = empid;
	this.empsalary = empsalary;
	this.empage = empage;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public int getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}
public int getEmpage() {
	return empage;
}
public void setEmpage(int empage) {
	this.empage = empage;
}
 void display()
 {
	 System.out.println("employee name :"+empname);
	 System.out.println("employee id :"+empid);
	 System.out.println("employee salary :"+empsalary);
	 System.out.println("employee age :"+empage);
 }
}
