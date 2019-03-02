package my.contacts;

import java.util.ArrayList;

public class MyContactProg {

	public static void main(String[] args) {
		System.out.println("Hello world");

		// Create some persons
		Person hans = new Person(1961, 9, 27, "Hans", "Meier" );

		Person fritz = new Person(1962, 9, 27);
		fritz.setFirstName("Fritz");
		fritz.setLastName("Meier");

		Person hanna = new Person(1963, 9, 27);
		hanna.setLastName("Müller");

		// Show details of persons
		System.out.println(hans.toString());
		System.out.printf("Alter: %d \n", hans.getAge());

		System.out.println(fritz.toString());
		System.out.printf("Alter: %d \n", fritz.getAge());

		System.out.println(hanna.toString());
		System.out.printf("Alter: %d \n", hanna.getAge());

		// Compare Age
		System.out.printf("Fritz ist älter als Hans %b\n", fritz.isOlderThan(hans));
		System.out.printf("Hans  ist älter als Fritz %b\n", hans.isOlderThan(fritz));

		// Equality
		Person hansli = hans;
		System.out.printf("Fritz ist Hans: %b\n", fritz.isEqual(hans));
		System.out.printf("Hans  ist Hansli: %b\n", hans.isEqual(hansli));

		// manage marriage
		hans.marry(hanna);
		System.out.printf("Fritz ist verheiratet: %b\n", fritz.isMarried());
		System.out.printf("Hans ist verheiratet: %b\n", hans.isMarried());
		System.out.printf("Hanna ist verheiratet: %b\n", hanna.isMarried());

		hanna.divorce();
		System.out.printf("Hans ist verheiratet: %b\n", hans.isMarried());
		System.out.printf("Hanna ist verheiratet: %b\n", hanna.isMarried());

		// manage contacs in array
		//
		Contact[] contacts = new Contact[10];
		Contact contact = new Contact(hans);
		contact.setEmailAdress("hans.meier@meier.com");
		contact.setPhoneNumber("0795402233");
		contacts[0] = contact;
		contacts[1] = new Contact(fritz, "079 1234567", "fritz.meier@müller.com");
		contacts[2] = new Contact(hanna);

		// show all contacts
		System.out.println("Kontakte");
		for (Contact c : contacts) {
			if (c != null) {
				System.out.println(c.toString());
			}
		}

		// find details of all Meier
		for (Contact c : contacts) {
			if (c != null) {
				if (c.getLastName() == "Meier") {
					System.out.printf("%s\n", c.toString());
				}
			}
		}

		// manage contacts in generic contact list
		//
		ArrayList<Contact> contacts2 = new ArrayList<>();
		for (Contact c : contacts) {
			if (c != null) {
				contacts2.add(c);
			}
		}

		// show all contacts
		for (Contact c : contacts2) {
			System.out.printf("%s\n", c.toString());
		}

		// find details of all Meier
		for (Contact c : contacts2) {
			if (c.getLastName() == "Meier") {
				System.out.printf("%s\n", c.toString());
			}
		}

	}
}
