/*
@ Program : Declaring a class and its objct
code by : Swapnil
Date 20 September 2022
*/

//declaring a Library class
class Library 
{

//declaring proprties
private String bookName;
private String bookAuthor;
private double bookPrice;

//method to insert book
void insertMovie(String bookName,String bookAuthor, double bookPrice)
{
	this.bookName=bookName;
	this.bookAuthor=bookAuthor;
	this.bookPrice=bookPrice;
	
}

//method to display Book
void displayBook()
{
	System.out.println("Book Name :"+this.bookName+" "+"Author :"+ this.bookAuthor+" "+"Price :"+this.bookPrice);
}
//end class

//declaring class Book
class Book
{
	//calling main method
	public static void main(String...args)
	{
		//creating book object
		Library book1=new Library();
		book1.insertBook("The Post Office","Rabindranath Tagore",699); //implicit
		Library book2=new Library();
		book2.insertBook("Ignited Minds ","A.P.J Abdul Kalam",300);
		Library book3=new Library();
		book3.insertBook("The Loom of Time","Kalidasa",371);
		
		//display input
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
	}//end of main
}
//end of class
}