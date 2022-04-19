package dndcompanion.character.chrraces;

/**
 * Class to represent the Half-Orc Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class HalfOrc extends Race {
    
	/**
	 * Default constructor.
	 */
    public HalfOrc() {
        this.name = "Half-Orc";
        this.subraces = null;
        this.mods[0] = 2; // +2 Strength
        this.mods[2] = 1; // +1 Constitution
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common", "Orc"};
    }
}
