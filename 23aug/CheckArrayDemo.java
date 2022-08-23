/*
@ Program: Find the is  present array
code by : Swapnil
Date : 23/08/22
*/
// declaring the class
class checkArryDemo
{
 //method to calculate minimum numbrer from an array

 static void checkArray()
 {
  int[] num = {12, 32, 63, 74, 55};
    int toFind = 63;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
  
  //calling main method
  public static void main(String args[])
  {
	  //calling checkarray method
	  checkArray();
  }
}