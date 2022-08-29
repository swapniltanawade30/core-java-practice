/*
Program:Java program to implimenting class
@code by:Swapnil
date:27/08/22
*/


//declaring class
class Car
{
	//creating instance variable 
	//taking properties int string and duble
	String model;
	String name;
	int price;
	int year;
	
	//method to print student details
	void printDetails()
	{
		String course="Toyota";  //loacal variable
		System.out.println("Model"+model);
		System.out.println("Name"+name);
		System.out.println("Year"+year);
		System.out.println("Price"+price);
	}
	//calling main method
	public static void main(String ...args)
		{
			
			//creating an another object of class student
		Car r1= new Car();
		//initialize the fiel of object
		r1.model="crysta";
		r1.name="innova";
		r1.year=2021;
        r1.price=2600000;
		
		//creating an another object of class student
		Car r2= new Car();
		//initialize the fiel of object
		r2.model="thar";
		r2.name="mahindra";
		r2.year=2021;
        r2.price=1600000;
		//calling the printDetails method
		r1.printDetails();
		r2.printDetails();
		
		
		
	}
}//end code
		