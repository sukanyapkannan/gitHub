package library;

public class HardwareBooks extends book
{
String hardware_category;
String hardware_publisher;
public HardwareBooks(String author_name, String title, int price, int no_of_pages, String hardware_category,
		String hardware_publisher) {
	super(author_name, title, price, no_of_pages);
	this.hardware_category = hardware_category;
	this.hardware_publisher = hardware_publisher;
}
void display2()
{
	System.out.println("harware category :"+hardware_category);
	System.out.println("hardware publisher :"+hardware_publisher);
	super.display();
}
}
