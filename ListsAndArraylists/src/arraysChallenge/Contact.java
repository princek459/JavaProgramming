package arraysChallenge;

public class Contact {
	
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// contact record
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}

}
