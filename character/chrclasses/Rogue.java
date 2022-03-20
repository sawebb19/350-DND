package dndcompanion.character.chrclasses;

/**
 * Class for the Rogue character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Rogue extends CharacterClass {
	/**
	 * Constructor for Rogue Class.
	 */
    public Rogue() {
        this.name = "Rogue";
        this.hit = 8;
        this.saves[1] = 1; // Dexterity
        this.saves[3] = 1; // Intelligence
    }
}