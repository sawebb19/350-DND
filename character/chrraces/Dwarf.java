package DNDCompanion.character.chrraces;

/**
 * Class to represent the Dwarf Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public abstract class Dwarf extends Subrace {

	/**
	 * Default Constructor for the class.
	 */
    protected Dwarf() {
        this.name = "Dwarf";
        this.subraces = new String[]{"Hill", "Mountain"};
        this.mods[2] = 2; // +2 Constitution
        this.size = "Medium";
        this.speed = 25;
        this.langs = new String[]{"Common", "Dwarvish"};
    }
}
