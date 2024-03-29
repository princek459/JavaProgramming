package interfacesExample;

public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("No action taken, desk phone does not have a power button");
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone ");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring Ring!");
		} else {
			isRinging = false;
		}
		return false;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
	

}
