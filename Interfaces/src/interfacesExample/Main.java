package interfacesExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ITelephone princesPhone;
		princesPhone = new DeskPhone(123456);
		princesPhone.powerOn();
		princesPhone.callPhone(123456);
		princesPhone.answer();
		
		princesPhone = new MobilePhone(654321);
		// princesPhone.powerOn();
		princesPhone.callPhone(654321);
		princesPhone.answer();
		
	}

}
