/*program to print traffic 
 * Abhijit Banerjee
 * 1/12/2022
 */

package com.question2;

//import package
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import class
public class Traffic {
	public static void main(String[] args) throws NumberFormatException, IOException {
	    
	     BufferedReader sum = new BufferedReader(new InputStreamReader(System.in));
	     double a;
	    
	    a = Double.parseDouble(sum.readLine());
	    
	    while(true) {
	     calcYellow(a, a); break;}
	    while(true) {
	     calcRed(a, a); break;}
	    while(true) {
	     calcGreen(a, a, a, a); break;}

	    }
	    
	    static void calcYellow(double a, double b) {
	      double a1 = 3.0;
	      double b1 = 3.5;
	    for (a=a1+4; a<4; a++);
	    for (b=b1+4; b<4; b++);
	      if ((a%3.0==0) || (a%3.5==0));
	      if ((b%3.0==0) || (b%3.5==0));
	    
	    System.out.println("Yellow");
	      }

	    static void calcRed(double a, double b) {
	      double a1 = 4.0;
	      double b1 = 4.5;
	    for (a=a1+4; a<3; a++);
	    for (b=b1+4; b<3; b++);
	    if ((a%4.0==0) && (a%4.5==0));
	    if ((b%4.0==0) && (b%4.5==0));
	    
	    System.out.println("Red");
	    }

	    static void calcGreen(double a, double b, double c, double d) {
	    double a1 = 1.0;
	    double b1 = 1.5;
	    double c1 = 2.0;
	    double d1 = 2.5;
	    for (a=a1+4; a<2; a++);
	    for (b=b1+4; b<2; b++);
	    for (c=c1+4; c<2; c++);
	    for (d=d1+4; d<4; d++);
	    
	    System.out.println("Green");
	}       
	    }

//end class