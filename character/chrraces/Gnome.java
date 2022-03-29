package dndcompanion.character.chrraces;

/**
 * Class to represent the Gnome Race.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Gnome extends Subrace {

	/**
	 * Default Constructor for the class.
	 */
	public Gnome() {
        this.name = "Gnome";
        this.subraces = new String[]{"Deep", "Rock"};
        this.mods[3] = 2; // +2 Intelligence
        this.size = "Small";
        this.speed = 25;
        this.langs = new String[]{"Common", "Gnomish"};
    }
    
    public Gnome(String subrace) {
    	this();
    	if (subrace.equals("Deep")) {
    		this.mods[1] = 1; // +1 Dexterity
            this.langs = new String[]{"Common", "Gnomish", "Undercommon"};
            this.kind = "Deep";
    	}else if (subrace.equals("Rock")) {
    		this.mods[2] = 1; // +1 Constitution
            this.kind = "Rock";
    	}
    }
}
