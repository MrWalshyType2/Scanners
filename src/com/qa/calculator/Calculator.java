package com.qa.calculator;

import java.util.Scanner;

public class Calculator {
	
	public Calculator() {
		
	}
	
	public double addition(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	public double division(double num1, double num2) {
		return num1 / num2;
	}
	
	public void getMode() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		System.out.print("1: Addition\n"
				+ "2: Subtraction\n"
				+ "3: Multiplication\n"
				+ "4: Division\n\n");
		
		do {
			System.out.println("Please enter a number to select your option: ");
			
			while(!sc.hasNextInt()) {
				System.out.println("Please enter a valid option!");
				sc.next();
			}
			option = sc.nextInt();
		} while (option <= 0 || option >= 5);
		
//		sc.close(); // This breaks the application
		doMath(option);
	}
	
	public float getNum() {
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;
		float num = 0.0f;
		int count = 0;
		
		do {
			System.out.println("Enter a number: ");
			
			while(!sc.hasNextFloat()) {
				if (count != 0) {
					System.out.println("Please enter a valid number!");
					sc.next();
					count = 1;
				}
				sc.next();
			}
			num = sc.nextFloat();
			validInput = true;
		} while (!(validInput));
//		sc.close();
		return num;
	}
	
	public void doMath(int option) {
		double num1 = getNum();
		double num2 = getNum();
		
		switch(option) {
			case 1:
				System.out.println(addition(num1, num2));
				break;
			case 2:
				System.out.println(subtraction(num1, num2));
				break;
			case 3:
				System.out.println(multiplication(num1, num2));
				break;
			case 4:
				System.out.println(division(num1, num2));
				break;
			default:
				System.out.println("Something went wrong...");
				break;
		}
	}
}
