package primitiveTypesChallenge;

public class OperatorChallenge {
	
	public static void main(String[] args) {
		
		double firstDouble = 20.00d;
		double secondDouble = 80.00d;
		double result = (firstDouble + secondDouble) * 100.00d;
		System.out.println("Result = " + result);
		
		
		double remainder = result % 40d;
		System.out.println("Remainder = " + remainder);
		
		boolean isNoRemainder = (remainder == 0) ? true : false;
		System.out.println("there's no remainder = " + isNoRemainder);
		
		if(!isNoRemainder) {
			System.out.println("We have a remainder");
		}	
		
	}
}
