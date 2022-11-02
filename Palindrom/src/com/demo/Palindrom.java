/*
 * Program Palindrom
 * @Author = Abhijit Banerjee
 * @date = 1/11/2022
 */
package com.demo;

import java.util.Scanner;

//declaring a class
public class Palindrom {

	// method to check number is Palindrome
	static void checkPalindrome(int number) {

		int remainder = 0;
		int reversedNumber = 0;
		int temp = number; 

		// calculating the reverse number
		while (number > 0) {
			remainder = number % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
			number = number / 10;
		}
		// end of while loop

		// comparing original and reversed number
		if (reversedNumber == temp)

			System.out.println(temp + " is a palindrome");

		else
			System.out.println(temp + " is not a palindrome");

	}

	// end of method

// main method
	public static void main(String[] args) {

		// creating scanner object
		Scanner s= new Scanner(System.in);
		int originalNumber;

		
		System.out.println("Enter a number:");
		originalNumber = s.nextInt();

		// calling checkPalindrome
		checkPalindrome(originalNumber);

		s.close();

	}

	// main ends

}
//class ends
