package com.example.university.java;

import java.util.Scanner;

public class UniversityInformation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentDetails:");
		System.out.println("Enter the EmployeeDetails:");
		System.out.println("Enter the Choice:");
		int a = sc.nextInt();
		switch(a){
		
			case 1:
				Student std = new Student();
				std.getDetail();
				break;
			case 2:
				Employee emp = new Employee();
				emp.getDetail();
				break;
		}
		sc.close();
	}

}
