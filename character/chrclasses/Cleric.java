package DNDCompanion.character.chrclasses;

/**
 * Class for the Cleric character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Cleric extends CharacterClass {
	/**
	 * Constructor for Cleric Class.
	 */
    public Cleric() {
        this.name = "Cleric";
        this.hit = 8;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}
