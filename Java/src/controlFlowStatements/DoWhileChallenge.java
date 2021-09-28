package controlFlowStatements;

public class DoWhileChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			} 
			System.out.println("Even number " + number);
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
			
		}
		
		System.out.println("Total Even numbers found = " + evenNumbersFound);

	}
	
	
	public static boolean isEvenNumber(int number) {
		
		if((number % 2) == 0) {
			return true;
		} else {
			return false;
		}
		
	}


}
