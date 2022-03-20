package dndcompanion.character.chrclasses;

/**
 * Class for the Ranger character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Ranger extends CharacterClass {
	/**
	 * Constructor for Ranger Class.
	 */
    public Ranger() {
        this.name = "Ranger";
        this.hit = 10;
        this.saves[0] = 1; // Strength
        this.saves[1] = 1; // Dexterity
    }
}
