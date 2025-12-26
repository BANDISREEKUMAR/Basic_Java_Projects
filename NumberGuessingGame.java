package com.java;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Random rand =new Random();
		int number=rand.nextInt(100)+1; // .nextInt(max)+min
		int attempts=0;
		int maxAttempts=5;
		System.out.println("Welcome! To Number Guessing Game");
		System.out.println("Try Your Luck Now!");
		
		
		while(attempts < maxAttempts) {
			try {
				attempts++;
				System.out.print("Guess a Number in between 1 to 100 of Attempt("+attempts+") : ");
				int guess=Integer.parseInt(inp.nextLine());
				
				if(number == guess) {
					System.out.println("Congratulations! You guessed correctly!");
					
				}else if(guess < number) {
					System.out.println("Your guess is too low");
				}else if(guess > number) {
					System.out.println("Your guess is too high");
				}
			}catch(NumberFormatException n) {
				System.out.println(n);
				attempts--;
			}
		}
		if(attempts==maxAttempts) {
			System.out.println("You reached to the limit! Better Luck next time.");
			System.out.println("By the way the number is "+number);
		}
		inp.close();
	}

}
