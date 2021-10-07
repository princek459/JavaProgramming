package listArrayListExample;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	
	// function to add a grocery item/ element
	public void addGroceryItem(String item) {
		
		groceryList.add(item);
		
	}

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	// to print the element
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + 
				" items in your grocery list");
		for(int i=0; i< groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	// find out a position of a particular element
	public void modifyGroceryItem(String currentItem, String newItem) {
			
		int position = findItem(currentItem);
		if(position >= 0) {
			modifyGroceryItem(position, newItem);
		}
	}
	
	// Modify an item instead of adding a new item.
	private void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " has been modified.");
	}
	
	public void removeGroceryItem(String item) {
		int position = findItem(item);
		if(position >= 0) {
			removeGroceryItem(position);
		}
	}
	
	// remove an item
	private void removeGroceryItem(int position) {
		// retrieve the item first
		groceryList.remove(position);
	}
	
	// query array list to find an item / element
	private int findItem(String searchItem) {
		
//		// .contains searches the array for the element in ()
//		boolean exists = groceryList.contains(searchItem);
		
//		// similar in searching the array list and finds item and returns 
//		// index position of that element
//		int position = groceryList.indexOf(searchItem);
//		if(position >= 0) {
//			return groceryList.get(position);
		
		return groceryList.indexOf(searchItem);

	}
	
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position >= 0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
