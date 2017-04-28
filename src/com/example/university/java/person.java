package com.example.university.java;

import java.util.Scanner;

public class person {
	
	String FirstName;
	String LastName;
	int tAge;

	public void getDetail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details: ");
		System.out.println("Enter the FirstName: ");
		FirstName = sc.nextLine();
		System.out.println("Enter the LastName: ");
		LastName = sc.nextLine();
		System.out.println("Enter the Age: ");
		tAge = sc.nextInt();
			
	}
}
