package my.contacts;

public class Contact {

	private Person person;
	private String phoneNumber;
	private String emailAdress;
	private String mobileNumber;
	private String kategorie; //test1234

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Person getPerson() {
		return person;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber.trim();
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		if (emailAdress.contains("@")) {
			this.emailAdress = emailAdress;
		}
	}

	public Contact(Person person) {
		this.person = person;
	}

	public Contact(Person person, String phoneNumber, String emailAdress) {
		this.person = person;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
	}

	@Override
	public String toString() {
		String s = String.format("%s %s \n %s \n %s \n %s", person.getFirstName(), person.getLastName(), getPhoneNumber(),
				getMobileNumber(), getEmailAdress());
		return s;
	}

	public String getLastName() {
		return person.getLastName();
	}

}
