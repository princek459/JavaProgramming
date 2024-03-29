package AutoboxingUnboxingChallenge;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank("Santander");
		
		bank.addBranch("Cardiff");
		
		bank.addCustomers("Cardiff", "Prince", 33.75);
		bank.addCustomers("Cardiff", "Darcy", 453.75);
		bank.addCustomers("Cardiff", "Chris", 56.75);
		
		bank.addBranch("London");
		bank.addCustomers("London", "David", 87.42);
		
		bank.addCustomers("Cardiff", "Prince", 540.75);
		bank.addCustomers("Cardiff", "Darcy", 56.75);
		bank.addCustomers("Cardiff", "Chris", 89.89);
		
		bank.listCustomers("Cardiff", true);
		

	}

	
	
	
	
	
	
	
	
}
