package DNDCompanion.character.chrraces;

/**
 * Class to represent the Rock subrace of Gnome.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class GnomeRock extends Gnome {
    
	/**
	 * Default Constructor for the class.
	 */
    public GnomeRock() {
        super();
        this.subraces = null;
        this.mods[2] = 1; // +1 Constitution
        this.kind = "Rock";
    }
}
