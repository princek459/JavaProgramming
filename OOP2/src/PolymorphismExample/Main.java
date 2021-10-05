package PolymorphismExample;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}






class Jaws extends Movie {
	
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "Monster shark eats bunch of people";
	}
}

class IndependenceDay extends Movie {
	
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Aliens taking over earth";
	}
}

class MazeRunner extends Movie {
	
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kids Stuck in a maze";
	}
}

class StarWars extends Movie {
	
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial forces try to take over the universe";
	}
}

class Forgettable extends Movie {
	public Forgettable() {
		super("Forgetable");
	}
	
	//No plot override method
}



public class Main {

	public static void main(String[] args) {
		
		//for loop iterating through movies using polymorphism calling the plot method of that class
		for(int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + 
					" : " + movie.getName() + "\n" + 
					"Plot: " + movie.plot() + "\n");
			//movie.plot assigns different functionality based on the objects created eg polymmorphism
		}
		
	}
	
	//Returning Base super class Movie because all the class inherit/extend from movie
	
	public static Movie randomMovie() {
		
		// code to generate a random number to assign to a movie
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number genarrated was: " + randomNumber);
		
		switch (randomNumber) {
			case 1:
				return new Jaws();
			
			case 2:
				return new IndependenceDay();
				
			case 3:
				return new MazeRunner();
				
			case 4:
				return new StarWars();
			
			case 5:
				return new Forgettable();
		}
		return null;
	}
	

}
