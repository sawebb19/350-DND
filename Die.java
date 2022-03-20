package dndcompanion;

import java.util.Random;
/**
 * Class for rolling dice in app. Not implemented in current Release.

 * @author Nick Ford
 *
 */
public class Die {
	int faces;
	
	//Constructor takes int input and sets that as the number of faces the die has.
	public Die(int faces) {
		this.faces = faces;
	}
	
	//simulates rolling the die by picking random in in the range of [1,faces]
	public int roll() {
		Random rand = new Random();
		return rand.nextInt(faces) + 1;
	}
	
}
