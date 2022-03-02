package DNDCompanion.character.chrclasses;

/**
 * Class for the Warlock character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Warlock extends CharacterClass {
	/**
	 * Constructor for Warlock Class.
	 */
    public Warlock() {
        this.name = "Warlock";
        this.hit = 8;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}