package parsing_user_inputs;

import java.util.Scanner;

public class ReadingUserChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
//		while(true) {
		while(counter < 10) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");
			
			//define boolean, will check if valid number is entered
			boolean isAnInt = scanner.hasNextInt();
			
			//test if boolean is valid
			if(isAnInt) {
				int number = scanner.nextInt();
				
				// incrementing the count
				counter++;
				sum += number;
				
				//If statement to break out of the loop when counter = 10
//				if (counter == 10) {
//					break;
//				}
			} else { 
				System.out.println("Invalid Number"); 
			}
			
			// so no endless loop
			scanner.nextLine(); //Handing the end of line (enter key)
			
		}
		
		
		System.out.println("sum = " + sum);
		
		scanner.close();

	}

}
