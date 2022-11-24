/*
 * program to print create a class Member having the following members:
 * name
 * age
 * phone number
 * address
 * salary
 * @ Abhijit banerjee
 * 24/11/2022
 */


package com.question3;
//import class
class Member {
	String name;
	int age;
	String number;
	String address;
	int salary;
	
    public void printSalary() {
    	System.out.println(salary);
    }
}

//import and extend
class Employee extends Member{
	String specialization;
}



class Manager extends Member{
	String department;
	public String specialization;
}

//import main class
class question3{
	public static void main(String[] args) {
		Employee e= new Employee();
		e.name = "Abhijit";
		e.age = 24;
		e.number = "6200993989";
		e.address = "Dhanbad";
		e.salary = 10000;
		e.specialization = "Java";
		
		Manager m = new Manager();
		m.name = "Abhijit";
		m.age = 24;
		m.number = "6200993989";
		m.address = "Dhanbad";
		m.salary = 10000;
		m.specialization = "Java";
		
		
	}
}