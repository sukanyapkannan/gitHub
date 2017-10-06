package registration;
import java.util.Scanner;

public class student
{
  static int count;
  String name;
  String id;
  String course;
  private int age;
  
  

public static int getCount() {
	return count;
}


public static void setCount(int count) {
	student.count = count;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public int getAge() {
	return age;
}


public void setAge(int age) 
{
	if(age>18&&age<60)
	{
	this.age = age;
	}
	else
	{
		System.out.println("Invalid Age");
	}
}


public student() 
{
	Scanner s=new Scanner(System.in);
	System.out.println("eter name :");
	name=s.next();
	System.out.println("enter id :");
	id=s.next();
	System.out.println("enter course :");
	course=s.next();
	System.out.println("enter age :");
	age=s.nextInt();
	count++;
}


public student(String name, String id, String course, int age) {
	super();
	this.name = name;
	this.id = id;
	this.course = course;
	this.age = age;
}

public student(String id) {
	super();
	this.id = id;
}

public student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

void display()
{
	System.out.println("name :"+name);
	System.out.println("id:"+id);
	System.out.println("course :"+course);
	System.out.println("age:"+age);
	
}
}
