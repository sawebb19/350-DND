package DNDCompanion.character.chrraces;

/**
 * Class to represent the Gnome Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public abstract class Gnome extends Subrace {

	/**
	 * Default Constructor for the class.
	 */
    protected Gnome() {
        this.name = "Gnome";
        this.subraces = new String[]{"Deep", "Rock"};
        this.mods[3] = 2; // +2 Intelligence
        this.size = "Small";
        this.speed = 25;
        this.langs = new String[]{"Common", "Gnomish"};

    }
}
