package com.java;

import java.util.Scanner;

public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static double mod(double a, double b) {
		return a % b;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double a = inp.nextDouble();
		System.out.print("Enter the second number : ");
		double b = inp.nextDouble();
		int choice = 0;
		do {
			System.out.println("============Simple Calculator===========");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulous");
			System.out.println("6.Exit");
			System.out.print("Enter your choice of Ops: ");
			choice = inp.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Addition is : " + add(a, b));
				break;
			case 2:
				System.out.println("Subtraction is : " + sub(a, b));
				break;
			case 3:
				System.out.println("Multiplication is : " + mul(a, b));
				break;
			case 4:
				if (b != 0) {
					System.out.println("Division is : " + div(a, b));
				} else {
					System.out.print("Base should not be a zero! Enter a new number: ");
					int alt = inp.nextInt();
					System.out.println("Division is : " + div(a, alt));
				}
				break;
			case 5:
				if(b!=0) {
					System.out.println("Modulous is  : " + mod(a, b));
				}else {
					System.out.println("Modulous by zero is undefined");
					System.out.print("Enter a new number : ");
					int alt=inp.nextInt();
					System.out.println("Modulous is : "+mod(a,alt));
				}
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}

		} while (choice !=6);
		inp.close();
	}
}
