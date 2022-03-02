package DNDCompanion.character.chrclasses;

/**
 * Class for the Monk character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Monk extends CharacterClass {
	/**
	 * Constructor for Monk Class.
	 */
    public Monk() {
        this.name = "Monk";
        this.hit = 8;
        this.saves[0] = 1; // Strength
        this.saves[1] = 1; // Dexterity
    }
}
