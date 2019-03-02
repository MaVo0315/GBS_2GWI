package my.contacts;

import java.time.*;

public class Person {
	private String lastName;
	private String firstName;
	private LocalDate birthday;
	private int personalNumber; // has to be unique
	private static int nextPersonalNumber = 1000;
	private Person partner;

	public Person(int year, int month, int day) {
		birthday = LocalDate.of(year, month, day);
		personalNumber = nextPersonalNumber++;
	}
	
	public Person(int year, int month, int day, String firstName, String lastName) {
		birthday = LocalDate.of(year, month, day);
		this.firstName = firstName;
		this.lastName = lastName;
		personalNumber = nextPersonalNumber++;
	}

	public int getPersonalNumber() {
		return personalNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String name) {
		lastName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setName(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public LocalDate getBirthDay() {
		return birthday;
	}
	
	public int getAge() {
		return Period.between(birthday, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		String str = "";
		str = String.format("%d %s %s %d", personalNumber, firstName, lastName, birthday.getYear());
		return str;
	}

	public boolean isOlderThan(Person p) {
		return this.birthday.compareTo(p.birthday) < 0;
	}

	public boolean isEqual(Person p) {
		return this.personalNumber == p.personalNumber;
	}

	public Person getPartner() {
		return partner;
	}

	public boolean marry(Person p) {
		if (!this.isMarried() && this.getAge() >= 18 && !p.isMarried() && p.getAge() >= 18) {
			partner = p;
			p.partner = this;
			return true;
		} else {
			return false;
		}
	}

	public void divorce() {
		this.partner.partner = null;
		this.partner = null;
	}

	public boolean isMarried() {
		return partner != null;
	}

}
