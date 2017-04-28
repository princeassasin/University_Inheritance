package com.example.university.java;

import java.util.Scanner;



public class Employee extends person{
	
	String Department;
	double salary;
	String Designation;

	public void getDetail(){
		
		super.getDetail();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Department");
		Department = sc.nextLine();
		System.out.println("Enter Employee Designation");
		Designation = sc.nextLine();
		System.out.println("Enter Employee Salary");
		salary = sc.nextInt();
		displayDetails();
		sc.close();
		
	}
	public void  displayDetails() {
		System.out.println("Employee FirstName:\t" + super.FirstName);
		System.out.println("Employee LastName:\t"+ super.LastName);
		System.out.println("Employee Age:\t"+ super.tAge);
		System.out.println("Employee Department:\t"+ Department);
		System.out.println("Employee Designation:\t"+ Designation);
		System.out.println("Employee Salary:\t"+ salary);
	}
}
