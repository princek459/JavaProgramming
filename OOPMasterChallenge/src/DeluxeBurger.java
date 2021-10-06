
public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Baceon", 9.99, "White");
		super.addHamburgerAddition1("Chips", 1.99);
		super.addHamburgerAddition2("Drink", 2.99);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}
	
	

}
