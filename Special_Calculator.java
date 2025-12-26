package com.java;

import java.util.Scanner;

public class Special_Calculator {
	public static double add(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static String div(double a, double b) {
		if (b != 0) {
			return String.valueOf(a / b);
		} else {
			return "Error:Base shouldn't be zero!";
		}
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		double num1 = inp.nextDouble();
		System.out.print("Enter the second number : ");
		double num2 = inp.nextDouble();

		System.out.print("Enter the Ops symbol(+,-,*,/,%) : ");
		char ch = inp.next().charAt(0);
		String result;
		if (ch == '+') {
			result = String.valueOf(add(num1, num2));
		} else if (ch == '-') {
			result = String.valueOf(sub(num1, num2));
		} else if (ch == '*') {
			result = String.valueOf(mul(num1, num2));
		} else if (ch == '/') {
			result = String.valueOf(div(num1, num2));
		} else {
			result = "Invalid Ops";
		}
		System.out.println(result);
		inp.close();
	}

}
