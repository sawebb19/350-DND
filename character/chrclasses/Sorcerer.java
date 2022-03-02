package DNDCompanion.character.chrclasses;

/**
 * Class for the Sorcerer character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Sorcerer extends CharacterClass {
	/**
	 * Constructor for Sorcerer Class.
	 */
    public Sorcerer() {
        this.name = "Sorcerer";
        this.hit = 6;
        this.saves[2] = 1; // Constitution
        this.saves[5] = 1; // Charisma
    }
}
