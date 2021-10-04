package compositionExample;

public class PC {

	private Case theCase;
	private Moniter moniter;
	private Motherboard motherboard;
	
	public PC(Case theCase, Moniter moniter, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.moniter = moniter;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		// graphics
		
		moniter.drawPixelAt(1200, 50, "Yellow");
	}

	
	
	
	
}
