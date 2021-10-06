package arrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myIntegers = getIntegers(5);
		
		int[] sorted = sortIntegers(myIntegers);
		printArray(sorted);
				
	}
				
				
	public static int[] getIntegers(int capacity) {
					
		System.out.println("Enter " + capacity + " integer values.\r");
		int[] array = new int[capacity];
					
		for(int i=0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
					
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
		
	}
	
	public static int[] sortIntegers(int[] array) {
		
//		int[] sortedArray = new int[array.length];
//		for(int i=0; i < array.length; i++) {
//			sortedArray[i] = array[i];
//		}
		
		// takes coooy of the array with right length and auto creates new array
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		
		//Loop only continues until while(flag) is set to true
		while(flag) {
			//immediately set to false
			flag = false;
			
			// iterate through the while loop while it is 
			
			//element 0		50
			//element 1		160
			//element 2..	40..
			
			// loop starts on 0 - 50 to 1 - 160 and if element 1 is bigger than element 0 they sway
			// and it loops again through the whole array list
			
			//element 0		160
			//element 1		50
			//element 2..	40..
			
			for(int i=0; i < sortedArray.length-1; i++) {
				
				if(sortedArray[i] < sortedArray[i+1]) {
					//store the current value temporaririly ,move the +1 element into the array 
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					//swapping the +1 element with 0
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
	
	

}
