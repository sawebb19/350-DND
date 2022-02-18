package DNDCompanion;

public class DisplayModel {
	private ScreenDisplay display = ScreenDisplay.CharSheet;
	
	public DisplayModel() {
		display = ScreenDisplay.CharSheet;
		updateScreen();
	}
	
	private void updateScreen() {
		
	}

	public ScreenDisplay getDisplay() {
		return display;
	}
	public void setDisplay(ScreenDisplay selected) {
		display = selected;
		updateScreen();
	}
}
