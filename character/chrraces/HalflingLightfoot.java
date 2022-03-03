package DNDCompanion.character.chrraces;

/**
 * Class to represent the Lightfoot subrace of Halfling.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class HalflingLightfoot extends Halfling {
    
	/**
	 * Default Constructor for the class.
	 */
    public HalflingLightfoot() {
        super();
        this.subraces = null;
        this.mods[5] = 1; // +1 Charisma
        this.kind = "Lightfoot";
    }
}
