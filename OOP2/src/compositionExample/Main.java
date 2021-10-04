package compositionExample;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Moniter theMoniter = new Moniter("35inch beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMoniter, theMotherboard);
		
		thePC.powerUp();
		
		
//		//Accessing the monitor through the PC
//		thePC.getMoniter().drawPixelAt(1500, 1200, "red");
//		
//		//Accessing the motherboard through the PC
//		thePC.getMotherboard().loadProgram("Windows 1.0");
//		
//		//Accessing the power button through the PC
//		thePC.getTheCase().pressPowerButton();
	}

}
