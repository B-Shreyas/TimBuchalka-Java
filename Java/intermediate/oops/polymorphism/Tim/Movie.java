package oops.polymorphism.Tim;

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
		return "A shark eats lots of peoples";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return ("Aliens attempt to take over planet");
	}

}

class MazeRunner extends Movie {
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return ("Kids try and escape the maze.");

	}

}

class StarWar extends Movie {
	public StarWar() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return ("Imperial forces try to take over planet");
	}

}

class Forgetable extends Movie {
	public Forgetable() {
		super("Forgetable");
	}
	// No plot here.
}
