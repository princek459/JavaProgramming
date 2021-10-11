package linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedList<String> placesToVisit = new LinkedList<String>();
//		placesToVisit.add("Liverpool");
//		placesToVisit.add("London");
//		placesToVisit.add("Cardiff");
//		placesToVisit.add("Manchester");
//		placesToVisit.add("Birmingham");
//		placesToVisit.add("Swansea");
//		placesToVisit.add("Bristol");
//		
//		printList(placesToVisit);
//		
//		placesToVisit.add(1, "Newcastle");
//		printList(placesToVisit);
//		
//		placesToVisit.remove(4);
//		printList(placesToVisit);
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		
		addInOrder(placesToVisit, "Liverpool");
		addInOrder(placesToVisit, "London");
		addInOrder(placesToVisit, "Cardiff");
		addInOrder(placesToVisit, "Manchester");
		addInOrder(placesToVisit, "Birmingham");
		addInOrder(placesToVisit, "Swansea");
		addInOrder(placesToVisit, "Bristol");
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Newcastle");
		addInOrder(placesToVisit, "Cardiff");
		printList(placesToVisit);
		
		visit(placesToVisit);
	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("=========================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0) {
				// means do not add
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if(comparison > 0) {
				// new City should appear before this
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0) {
				// nomve to next city
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.hasNext();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now visiting" + listIterator.next());
				} else {
					System.out.println("Reached end of list");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting" + listIterator.previous());
				} else {
					System.out.println("We are at the start of the list.");
					goingForward = true;
				}
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n" + 
						"1 - Go to next city\n" +
						"2 - Go to previous city\n" + 
						"3 - Print menu options\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
