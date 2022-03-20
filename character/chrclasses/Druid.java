package dndcompanion.character.chrclasses;

/**
 * Class for the Druid character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Druid extends CharacterClass {
	/**
	 * Constructor for Druid Class.
	 */
    public Druid() {
        this.name = "Druid";
        this.hit = 8;
        this.saves[3] = 1; // Intelligence
        this.saves[4] = 1; // Wisdom
    }
}
