/*
Program:Java program to implimenting class
@code by:Swapnil
date:27/08/22
*/


//declaring class
class Television
{
	//creating instance variable 
	//taking properties int string and duble
	String model;
	String name;
	int price;

	
	//method to print student details
	void printDetails()
	{
		String course="Samsung";  //loacal variable
		System.out.println("Model"+model);
		System.out.println("Name"+name);
		System.out.println("Year"+year);
		System.out.println("Price"+price);
	}
	//calling main method
	public static void main(String ...args)
		{
			
			//creating an another object of class student
		Television r1= new Television();
		//initialize the fiel of object
		r1.model="crystal";
		r1.name="samsung";
		r1.year=2021;
        r1.price=31999;
		
		//creating an another object of class student
		Television r2= new Television();
		//initialize the fiel of object
		r2.model="y series";
		r2.name="oneplus";
		r2.year=2022;
        r2.price=17800;
		//calling the printDetails method
		r1.printDetails();
		r2.printDetails();
		
		
		
	}
}//end code
		