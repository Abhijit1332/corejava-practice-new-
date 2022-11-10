/*program to print student details 
 * Abhijit Banerjee
 * 10 nov 2022
 */


package com.question1;

//import class
public class Studentdetails {

	//start main class
	public static void main(String[] args) {
		String names[] = { "Rajesh", "Suresh", "Ramesh", "Kamlesh", "Vignesh" };
        int marks[] = { 45, 78, 83, 77, 93 };
        char sections[] = { 'A', 'B', 'A', 'A', 'B' };
        
        //start loop
        for(int i = 0; i < names.length; i++)
        {
            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
        }    
//end loop
	}
//end main 
}
//end class