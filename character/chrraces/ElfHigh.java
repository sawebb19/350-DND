package DNDCompanion.character.chrraces;

/**
 * Class to represent the High subrace of Elf.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class ElfHigh extends Elf {
    
	/**
	 * Default Constructor for the class.
	 */
    public ElfHigh() {
        super();
        this.subraces = null;
        this.mods[3] = 1; // +1 Intelligence
        // +1 Language
        this.kind = "High";
    }
}
