package DNDCompanion;
import java.util.Random;

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
