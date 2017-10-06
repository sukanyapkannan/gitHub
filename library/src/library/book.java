package library;

public class book
{
 String author_name;
 String title;
 int price;
 int no_of_pages;
public book(String author_name, String title, int price, int no_of_pages) 
{
	super();
	this.author_name = author_name;
	this.title = title;
	this.price = price;
	this.no_of_pages = no_of_pages;
}
 void display()
 {
	 System.out.println("author name :"+author_name);
	 System.out.println("title :"+title);
	 System.out.println("price :"+price);
	 System.out.println("no of pages :"+no_of_pages);
 }
}
