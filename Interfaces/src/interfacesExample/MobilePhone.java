package interfacesExample;

public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile Phone powered up");
	}
	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now ringing " + phoneNumber + " on mobile phone");
		} else {
			System.out.println("Phone is switched off");
		}
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the Mobile phone ");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Beep Beep!");
		} else {
			isRinging = false;
			System.out.println("Mobile Phone not on or number different");
		}
		return false;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
}
