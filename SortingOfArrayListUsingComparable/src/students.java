
public class students implements Comparable
{
String studentname;
String studentid;
int age;
public students(String studentname, String studentid, int age) {
	super();
	this.studentname = studentname;
	this.studentid = studentid;
	this.age = age;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentid() {
	return studentid;
}
public void setStudentid(String studentid) {
	this.studentid = studentid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public String toString() {
	return "students [studentname=" + studentname + ", studentid=" + studentid + ", age=" + age + "]";
}


}
