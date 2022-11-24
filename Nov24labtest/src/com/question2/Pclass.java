/*
 * Program to print to Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

@ Abhijit Banerjee
@ 24/11/2022

 */


package com.question2;
//import parent class
public class Pclass {

	public void pmethod() {
		System.out.println("This is parent class");
	}
	
	}
//end of parent class


//import child class and extend parent class
class Cclass extends Pclass{
	public void cmethod() {
		System.out.println("This is child class");
	}
}
//end of child class


//import main class
class Ans{
	public static void main(String[] args) {
		Pclass m =new Pclass();
		Cclass n =new Cclass();
		
		m.pmethod();
		n.cmethod();
		n.pmethod();
	}
}
