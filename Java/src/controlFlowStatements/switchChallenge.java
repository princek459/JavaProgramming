package controlFlowStatements;

public class switchChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'C';
		
		switch(letter) {
			case 'A':
				System.out.println("A was found");
				break;
			case 'B':
				System.out.println("B was found");
				break;
			case 'C':
				System.out.println("C was found");
				break;
			case 'D':
				System.out.println("D was found");
				break;
			case 'E':
				System.out.println("E was found");
				break;
			default:
				System.out.println("Not found A, B, C, D or E");
				break;
		}
		
		String month = "april";
		
		//.lowercase means h=that the case now needs to be lower case
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "february":
			System.out.println("Feb");
			break;
		case "march":
			System.out.println("Mar");
			break;
		case "april":
			System.out.println("Apr");
			break;
		default:
			System.out.println("Other month");
			break;
			
		}
	}

}
