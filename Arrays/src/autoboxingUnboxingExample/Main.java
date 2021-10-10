package autoboxingUnboxingExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Ways of creating arrays
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
//		ArrayList<String> strArrayList = new ArrayList<~>();
//		strArrayList.add("Prince");
		
//		ArrayList<IntClass> intClassArrayList = new ArrayList<~>();
//		intClassArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		
		//loop to add to the array.
		for(int i=0; i < 10; i++) {
			// auto-boxing converting base primitive type int into an integer
			intArrayList.add(Integer.valueOf(i));
		}
		
		// loop to execute
		for(int i=0; i < 10; i++) {
			// annexing is taking from the object wrapper and converting back to primitive type.
			System.out.println(i + " -> " + intArrayList.get(i).intValue());
		}
		
		// Shorter way of Auto-boxing & Un-boxing.
		Integer myIntValue = 56;
		
		
		
		
		
		
		
	}

}
