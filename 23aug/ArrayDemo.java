/*

@ Program: Creating Array
code by : Swapnil
Date : 23/08/22
*/
class ArrayDemo
{
 static void printArray(int num1,int num2)
 {
	 //int[]myArray;//creating a reference of array
	 //myArray = new int[3]
	 
 int[]myArray = new int[10];
 myArray[0]=num1;//storing 23 as first element
 myArray[1]=num2;
 
  System.out.println("first element:"+myArray[0]);
  System.out.println("second element:"+myArray[1]);
 }
 public static void main(String args[])
 {
 printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
 }
 }