package polymorphismChallenge;

//We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {
	
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}


	public int getCylinders() {
		return cylinders;
	}


	public String getName() {
		return name;
	}


	public int getWheels() {
		return wheels;
	}
	
	public String startEngine() {
		return "Car -> startEngine()";
	}
	
	public String accelerate() {
		return "Car -> accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}
}

class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford -> brake()";
	}
	
}

class Honda extends Car {

	public Honda(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Honda -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Honda -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Honda -> brake()";
	}
	
}

class Holden extends Car {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		
		
		// Another way of getting the class and then the name of the class
		
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> brake()";
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Car car = new Car( 8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		
		Ford ford = new Ford(6,"Escort");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Honda honda = new Honda(6,"Civic");
		System.out.println(honda.startEngine());
		System.out.println(honda.accelerate());
		System.out.println(honda.brake());
		
		Holden holden = new Holden(6,"Civic");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
	    

	}

}
