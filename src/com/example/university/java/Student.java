package com.example.university.java;

import java.util.Scanner;

public class Student extends person {

	String University;
	String Stream;
	int StudentID;
	public void  getDetail() {
		super.getDetail();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the University");
		University = sc.nextLine();
		System.out.println("Enter the Stream");
		Stream = sc.nextLine();
		System.out.println("Enter the StudentID");
		StudentID = sc.nextInt();
		displayDetails();
		sc.close();
	
		
	}
	public void displayDetails() {
		System.out.println("StudentFisrtName:\t"+ super.FirstName);
		System.out.println("StudentLastName:\t"+ super.LastName);
		System.out.println("StudentAgeName:\t"+ super.tAge);
		System.out.println("University:\t"+ University);
		System.out.println("Stream:\t"+ Stream);
		System.out.println("StudentID:\t"+ StudentID);
	}
}
