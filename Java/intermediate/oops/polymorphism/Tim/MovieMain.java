package oops.polymorphism.Tim;

public class MovieMain {

	public static void main(String[] args) {
		
		for(int i=0; i<11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
					
		}

	}
	
	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generator was: " + randomNumber);
		switch(randomNumber) {
		
		case 1: 
			return new Jaws();
			
		case 2: 
			return new IndependenceDay();
			
		case 3:
			return new MazeRunner();
			
		case 4:
			return new StarWar();
			
		case 5:
			return new Forgetable();
		}
		return null;
	}
}


