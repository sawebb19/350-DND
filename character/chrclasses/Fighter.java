package dndcompanion.character.chrclasses;

/**
 * Class for the Fighter character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Fighter extends CharacterClass {
	/**
	 * Constructor for Fighter Class.
	 */
    public Fighter() {
        this.name = "Fighter";
        this.hit = 10;
        this.saves[0] = 1; // Strength
        this.saves[2] = 1; // Constitution
    }
}
