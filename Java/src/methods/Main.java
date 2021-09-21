package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int highScore = calculateScore(true, 5000, 5, 100);
		System.out.println("Your final score was: " + highScore);
		

		int highScore2 = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was: " + highScore2);
		
		
	}
	
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver == true ) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		} 
		
		return -1;
		
	}

}
