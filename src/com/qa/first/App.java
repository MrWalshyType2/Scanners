package com.qa.first;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int month = 0;
		
		do {
			System.out.println("Number: ");
			
			while (!s.hasNextInt()) {
				System.out.println("Not a number! Enter valid number: ");
				s.next();
				System.out.println(month);
			}
			month = s.nextInt(); // this is reading the input from s.hasNextInt()
		} while (month <= 0 || month >= 13);
		
		s.close();
	}
}
