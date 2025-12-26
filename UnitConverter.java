package com.java;

import java.util.Scanner;

public class UnitConverter {
	
	public static double mileTokm(double miles) {
		return miles * 1.60934;
	}
	public static double kmTomile(double km) {
		return km / 1.60934;
	}
	public static double celTofahr(double cel) {
		return (cel*(9.0/5))+32;
	}
	public static double fahrTocel(double fahr) {
		return (fahr-32)*(5.0/9);
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("=====================UnitConverter====================");
			System.out.println("1.Miles To KiloMeters");
			System.out.println("2.KiloMeters To Miles");
			System.out.println("3.Celsius To Fahrenheit");
			System.out.println("4.Fahrenheit To Celsius");
			System.out.print("Enter your mode of Operation : ");
			choice=inp.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter Miles : ");
				double miles = inp.nextDouble();
				System.out.println(miles+" Miles --> "+mileTokm(miles)+" Km");
				break;
			case 2:
				System.out.print("Enter Kilometers : ");
				double km=inp.nextDouble();
				System.out.println(km+" Km --> "+kmTomile(km)+" Miles");
				break;
			case 3:
				System.out.print("Enter Celsius : ");
				double celsius = inp.nextDouble();
				System.out.println(celsius+" C --> "+celTofahr(celsius)+" F");
				break;
			case 4:
				System.out.print("Enter Fahrenheit : ");
				double fahren=inp.nextDouble();
				System.out.println(fahren+" F --> "+fahrTocel(fahren)+" C");
				break;
			case 5:
				System.out.println("THANK YOU FOR USING MY APPLICATION");
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid Mode Of Operation!");
				break;
			}
			
		}while(choice!=5);
		
		inp.close();
	}

}
