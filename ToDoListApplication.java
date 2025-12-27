package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApplication {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		int choice = 0;
		do {
			System.out.println("==============TaskApplication==============");
			System.out.println("1.Add Task");
			System.out.println("2.View Task");
			System.out.println("3.Delete Task");
			System.out.println("4.Exit");
			System.out.print("Enter the choice : ");
			choice = inp.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the task :");
				String task = inp.next();
				if (tasks.contains(task)) {
					System.out.println("Task already exist in the List!");
				} else {
					tasks.add(task);
				}

				break;
			case 2:

				if (tasks.isEmpty()) {
					System.out.println("No Tasks were available");
				} else {
					System.out.println("Availabe List of Tasks");
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + "." + tasks.get(i));
					}
				}
				break;
			case 3:
				System.out.print("Enter the task to delete : ");
				String task1 = inp.next();
				if (tasks.contains(task1)) {
					tasks.remove(task1);
					System.out.println(task1 + " is removed successfully!");
				} else {
					System.out.println("Task Not Available!");
				}
				break;
			case 4:
				System.out.println("Exiting ToDo List Application....");
				break;
			default:
				System.out.println("Invalid choice you have choosen!");
			}
		} while (choice != 4);
		inp.close();
	}

}
