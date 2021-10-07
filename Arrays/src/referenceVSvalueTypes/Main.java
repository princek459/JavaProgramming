package referenceVSvalueTypes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue" + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);

		anotherIntValue++;
		
		System.out.println("myIntValue" + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		// arrays are reference types which are used by a reference...
		// which holds an address...
		// or reference to the object but not the object itself.
		// can't access the object directly 
		int[] myIntArray = new int[5];
		
		// another reference to the same array in memory
		int[] anotherArray = myIntArray;
		
		// static array method to print it out
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		
		// make a change to 1 array
		anotherArray[0] = 1;
		
		System.out.println("After another change myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("After another change anotherArray = " + Arrays.toString(anotherArray));
		
		// Reference types represent the address of the variable rather
		// than the object itself
		
		// dereferencing example
		anotherArray = new int[] {4, 5, 6, 7, 8};
		
		// Call the method
		modifyArray(myIntArray);
		System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));
		
		
	}
	
	// method can only dereference not modify a reference
	private static void modifyArray(int[] array) {
		// change the array position or contents of the elements
		array[0] = 2;
		
		// new feature adds it to a new object that it is referencing
		array = new int[] {1, 2, 3, 4, 5};
		
	}
	
	
	
	
	
	
	

}
