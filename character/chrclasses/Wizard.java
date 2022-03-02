package DNDCompanion.character.chrclasses;

/**
 * Class for the Wizard character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Wizard extends CharacterClass {
	/**
	 * Constructor for Wizard Class.
	 */
    public Wizard() {
        this.name = "Wizard";
        this.hit = 6;
        this.saves[3] = 1; // Intelligence
        this.saves[4] = 1; // Wisdom
    }
}