package com.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {

	private ArrayList<Contact> contacts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void start() {
		int choice;

		do {
			System.out.println("\n===== CONTACT BOOK MENU =====");
			System.out.println("1. Add Contact");
			System.out.println("2. View Contacts");
			System.out.println("3. Search Contact");
			System.out.println("4. Delete Contact");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine(); // clear buffer

			switch (choice) {
			case 1 -> addContact();
			case 2 -> viewContacts();
			case 3 -> searchContact();
			case 4 -> deleteContact();
			case 5 -> System.out.println("Thank you! Exiting...");
			default -> System.out.println("Invalid choice! Try again.");
			}

		} while (choice != 5);
	}

	// Add a contact
	private void addContact() {
		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		System.out.print("Enter phone: ");
		String phone = scanner.nextLine();

		System.out.print("Enter email: ");
		String email = scanner.nextLine();

		contacts.add(new Contact(name, phone, email));
		System.out.println("Contact added successfully!");
	}

	// View all contacts
	private void viewContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts found.");
		} else {
			System.out.println("\n--- Contact List ---");
			for (Contact contact : contacts) {
				System.out.println(contact);
			}
		}
	}

	// Search contact by name
	private void searchContact() {
		System.out.print("Enter name to search: ");
		String name = scanner.nextLine();
		boolean found = false;

		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				System.out.println(contact);
				found = true;
			}
		}

		if (!found) {
			System.out.println("Contact not found.");
		}
	}

	// Delete contact by name
	private void deleteContact() {
		System.out.print("Enter name to delete: ");
		String name = scanner.nextLine();

		boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));

		if (removed) {
			System.out.println("Contact deleted successfully.");
		} else {
			System.out.println("Contact not found.");
		}
	}
}
