/*program piggie ba
 Abhijit banerjee
 3 nov 2022
*/


//import package
package com.question3;

//declare class
public class PiggieBank {

	private int amount = 50;

	//constructor without parameter
	public PiggieBank()

	{

	}
    //end constructor
	
	
	//start constructor
	public PiggieBank(int a)

	{

	amount = a+amount;

	}

	public void displayAmount()

	{

	System.out.println(amount);

	}
//end of constructor
	
	
//declare main

	public static void main(String[] args)

	{

		PiggieBank a = new PiggieBank();

		PiggieBank b = new PiggieBank(60);

	a.displayAmount();

	b.displayAmount();

	}
      
	//end main class
	}
   //end class
