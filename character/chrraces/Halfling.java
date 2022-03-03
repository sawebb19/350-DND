package DNDCompanion.character.chrraces;

/**
 * Class to represent the Halfling Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public abstract class Halfling extends Subrace {
    
	/**
	 * Default Constructor.
	 */
    protected Halfling() {
        this.name = "Halfling";
        this.subraces = new String[]{"Lightfoot", "Stout"};
        this.mods[1] = 2; // +2 Dexterity
        this.size = "Small";
        this.speed = 25;
        this.langs = new String[]{"Common", "Halfling"};
    }
}
