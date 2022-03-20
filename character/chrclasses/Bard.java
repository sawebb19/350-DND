package dndcompanion.character.chrclasses;

/**
 * Class for the Bard character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Bard extends CharacterClass {
	/**
	 * Constructor for Bard Class.
	 */
    public Bard() {
        this.name = "Bard";
        this.hit = 8;
        this.saves[1] = 1; // Dexterity
        this.saves[5] = 1; // Charisma
    }
}
