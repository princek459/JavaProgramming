package controlFlowStatements;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int value = 3;
//		
//		if(value == 1) {
//			System.out.println("Value was 1");
//		} else if(value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("Value was not 1 or 2");
//		}


		//switch version if not doing if statement but if is more flexible
		int switchValue = 3;
		
		//cant introduce more than 1 variable
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
				
			case 2:
				System.out.println("Value was 2");
				break;
				
			case 3: case 4: case 5:
				System.out.println("It was case 3 or 4 or 5");
				System.out.println("It was actually a " + switchValue);
				break;
			
			default:
				System.out.println("was not 1 or 2");
				break;
		}
	}

}
