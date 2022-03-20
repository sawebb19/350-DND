package dndcompanion.character.chrclasses;

/**
 * Class for the Paladin character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Paladin extends CharacterClass {
	/**
	 * Constructor for Paladin Class.
	 */
    public Paladin() {
        this.name = "Paladin";
        this.hit = 10;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}
