package DNDCompanion.character.chrraces;

/**
 * Class to represent the Deep subrace of Gnome.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class GnomeDeep extends Gnome {
    
	/**
	 * Default Constructor for the class.
	 */
    public GnomeDeep() {
        super();
        this.subraces = null;
        this.mods[1] = 1; // +1 Dexterity
        this.langs = new String[]{"Common", "Gnomish", "Undercommon"};
        this.kind = "Deep";
    }
}
