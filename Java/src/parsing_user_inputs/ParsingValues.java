package parsing_user_inputs;

public class ParsingValues {

	public static void main(String[] args) {
		
		String numberAsString = "2021.125";
		System.out.println("Number as String = " + numberAsString);
		
		double number = Double.parseDouble(numberAsString);
		System.out.println("Number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println("Number as String = " + numberAsString);
		System.out.println("Number = " + number);

	}

}
