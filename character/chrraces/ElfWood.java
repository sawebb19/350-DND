package DNDCompanion.character.chrraces;

/**
 * Class to represent the Wood subrace of Elf.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class ElfWood extends Elf {
    
	/**
	 * Default Constructor for the class.
	 */
    public ElfWood() {
        super();
        this.subraces = null;
        this.mods[4] = 1; // +1 Wisdom
        this.speed = 35; // +5 speed
        this.kind = "Wood";
    }
}
