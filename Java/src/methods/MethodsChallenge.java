package methods;

public class MethodsChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Steve", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("James", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Thom", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Prince", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Jane", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Karen", highScorePosition);

	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " Managed to get into position " + highScorePosition + 
				" on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
		
		
		// one way of going through the results
//		if (playerScore >= 1000) {
//			return 1;
//		} else if(playerScore >= 500) {
//			return 2;
//		}else if(playerScore >= 100) {
//			return 3;
//		}
//		
//			return 4;
		
		// only 1 return statement
		int position = 4; 
		
		if(playerScore >= 1000) {
			position = 1;
		} else if(playerScore >= 500) {
			position = 2;
		} else if(playerScore >= 100) {
			position = 3;
		} 
		
		return position;
		
	}

}
