import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//way of initiallizing an array
//		// Declares its an array []
//		
//		//Array called myIntArray with [10] elements and an interger
//		int[] myIntArray = new int[10];
//		
//		// assigning 50 to the 5th element which would be 6
//		myIntArray[5] = 50;
//				
//		
//		//storing a double in an array list
//		double[] myDouleArray = new double[10];
//		
//		//retrieving the values
//		System.out.println(myIntArray[5]);
		
		
		//Second way of initializing an array
		
//		//directly setting the elements and what they are { 1,2,3,4,5,6,7,8,9,10};
//		int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//		
//		System.out.println(myIntArray[0]);
//		System.out.println(myIntArray[6]);
//		System.out.println(myIntArray[8]);
		
		
//		// 3rd way of implementing an array
//		int[] myIntArray = new int[10];
//		
//		//method given automatically for arrays
//		for(int i=0; i < myIntArray.length; i++) {
//			myIntArray[i] = i*10;
//		}
//		
////		for(int i=0; i<myIntArray.length; i++) {
////			System.out.println("Element " + i + " , value is " + myIntArray[i]);
////		}
	
		// different way of third way
		
//		int[] myIntArray = new int[10];
//		
//		//method given automatically for arrays
//		for(int i=0; i < myIntArray.length; i++) {
//			myIntArray[i] = i*10;
//		}
//		printArray(myIntArray);
//	}
//		
//		public static void printArray(int[] array) {
//			for(int i=0; i<array.length; i++) {
//				System.out.println("Element " + i + " , value is " + array[i]);
//			}
//		
		
		// 4th use of using an array IRL
		// Accept some input from console, sum them up and 
		// figure out the average of those numbers.
		
		
		
		int[] myIntegers = getIntegers(5);
		
		for(int i=0; i < myIntegers.length; i++) {
			
			// message to see the typed value
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		
		System.out.println("The average is " + getAverage(myIntegers));
	}
		
	// Method to allow the user to type 5 numbers and then return those numbers in an array
	// and stored in the myIntegers Array
	
	public static int[] getIntegers(int number) {
		
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for(int i=0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		return (double) sum / (double)array.length;
		
	}
	
	
	
	
	
	

}
	
