package DNDCompanion.character.chrraces;

/**
 * Class to represent the Hill subrace of Dwarf.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class DwarfHill extends Dwarf {
    
	/**
	 * Default Constructor for the class.
	 */
    public DwarfHill() {
        super();
        this.subraces = null;
        this.mods[4] = 1; // +1 Wisdom
        this.kind = "Hill";
    }
}
