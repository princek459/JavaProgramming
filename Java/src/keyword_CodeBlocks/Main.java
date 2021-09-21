/**
 * 
 */
package keyword_CodeBlocks;

/**
 * @Prince
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		//don't need code blocks if only 1 line after if statement
//		if(score < 5000 && score > 1000) {
//			System.out.println("Your score was less 5000 but greater than 1000");
//		} else if (score < 1000){
//			System.out.println("Your score was less than 1000");
//		} else {
//			System.out.println("Your score was 5000 or greater");
//		}
		
		if (gameOver == true ) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was: " + finalScore);
		}
		
		boolean secondGameOver = true;
		int secondScore = 10000;
		int secondlevelCompleted = 8;
		int secondBonus = 200;
		
		if(secondGameOver) {
			int secondFinalScore = secondScore + (secondlevelCompleted * secondBonus);
			System.out.println("Your second final score was: " + secondFinalScore);
		}

	}

}
