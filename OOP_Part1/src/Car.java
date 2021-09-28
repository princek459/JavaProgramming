
public class Car {
	
	
	// state of the car defining as fields
	private int doors;
	private int wheels;
	public String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}

	}
	
	public String getModel() {
		return this.model;
	}
	
	

}
