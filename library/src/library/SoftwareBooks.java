package library;

public class SoftwareBooks extends book
{
 String software_version;
 String software_name;
public SoftwareBooks(String author_name, String title, int price, int no_of_pages, String software_version,
		String software_name) {
	super(author_name, title, price, no_of_pages);
	this.software_version = software_version;
	this.software_name = software_name;
}
void display1()
{
	System.out.println("software version"+software_version);
	System.out.println("software name"+software_name);
	super.display();
}
 
}
