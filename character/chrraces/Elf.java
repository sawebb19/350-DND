package DNDCompanion.character.chrraces;

/**
 * Class to represent the Elf Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public abstract class Elf extends Subrace {

	/**
	 * Default Constructor for the class.
	 */
    protected Elf() {
        this.name = "Elf";
        this.subraces = new String[]{"High", "Wood"};
        this.mods[1] = 2; // +2 Dexterity
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common", "Elvish"};
    }
}
