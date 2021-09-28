package controlFlowStatements;

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
		System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
		System.out.println("The sum of the digits in number 90 is " + sumDigits(90));
		System.out.println("The sum of the digits in number 8 is " + sumDigits(8));
	}
	
	private static int sumDigits(int number) {
		
		if(number < 10) {
			return -1;
		}
		
		int sum = 0;
		
		// 125 | 125 / 10 = 12 | 12 * 10 = 120 | 125 - 120 = 5
		while (number > 0) {
			// extract the least significant digit
			int digit = number % 10;
			sum += digit;
			
			// Drop least significant digit
			//same as number = number / 10
			number /= 10;
		}
		
		return sum;
		
	}

}
