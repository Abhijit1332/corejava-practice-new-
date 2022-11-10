/*
program to print diamond shape
Abhijit banerjee
3 nov 2022
*/



//package
package com.question1;

//import scanner class
import java.util.Scanner;

//declare class
public class Diamond{
	
//main class	
 public static void main(String[]args)
 {
	 //declare variable
	 int n,i,j, space=1;
	 System.out.println("Enter the number of rows: ");
	 
	 //declare scanner
	 Scanner s= new Scanner(System.in);
	 n =s.nextInt();
	 space = n-1;
	 
	 //for loop start
	 for(j = 1; j <=n; j++)
	 {
		 for(i = 1; i<=space; i++)
		 {
			 System.out.print(" ");
		 }
		 space--;
		 
		 for(i = 1; i <=2*j-1; i++)
		 {
			 System.out.print("*");
		 }
		 
		 System.out.println(" ");
	 }
	 
	 space=1;
	 
	 for(j = 1; j<=n-1; j++)
	 {
		 for(i =1; i<=space; i++)
		 {
			 System.out.print(" ");
		 }
		 
		 space++;
		 
		 for(i =1; i<=2*(n-j)-1; i++)
		 {
			 System.out.print("*");
		 }
		 
		 //end of for loop
		 
		 System.out.println(" ");
	 }
		 
		 
	 //end class 
	 
 }
	
 //end main
}

			

