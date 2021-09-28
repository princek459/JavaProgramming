package controlFlowStatements;

public class DoWhileStatements {

	public static void main(String[] args) {
		
//		int count = 1;
		
		// 2 different ways of doing the while loop for this
		
//		while(count != 6) {
//			System.out.println("Count value is " + count);
//			count++;
//		}
		
//		while(true) {
//			if(count == 5) {
//				break;
//			}
//			System.out.println("Count value is " + count);
//			count++;
//		}
		
//		do {
//			System.out.println("Count value was " + count);
//			count++;
//		} while(count != 6);
		
		
		
//		// For loop isn't identical and runs foreverrr
//		for(int i=1; 1<7; i++) {
//			System.out.println("Count value is " + count);
//		}
		
//		//Identical to while loop
//		
//		for(count = 1; count != 6; count++) {
//			System.out.println("Count value is " + count);
//		}
		
		
		int number = 4;
		int finishNumber = 20;
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
				
			}
			
			System.out.println("Even number " + number);
		}
		
	}	
	
	
	public static boolean isEvenNumber(int number) {
		
		if((number % 2) == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	

}
