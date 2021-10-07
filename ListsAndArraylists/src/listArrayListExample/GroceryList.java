package listArrayListExample;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	
	// function to add a grocery item/ element
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	// to print the element
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + 
				" items in your grocery list");
		for(int i=0; i< groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	// Modify an item instead of adding a new item.
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified.");
	}
	
	// remove an item
	public void removeGroceryList(int position) {
		// retrieve the item first
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	
	
}
