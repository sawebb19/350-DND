package dndcompanion.character.chrclasses;

/**
 * Class for the Monk character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Monk extends CharacterClass {
	/**
	 * Constructor for Monk Class.
	 */
    public Monk() {
        this.name = "Monk";
        this.hit = 8;
        this.saves[0] = 1; // Strength
        this.saves[1] = 1; // Dexterity
        this.features = new String[] {
                //Level 1
                  "", 
                //Level 2
                  "",
                //Level 3
                  "",
                //Level 4
                  "",
                //Level 5
                  "",
                //Level 6
                  "",
                //Level 7
                  "",
                //Level 8
                  "",
                //Level 9
                  "",
                //Level 10
                  "",
                //Level 11
                  "",
                //Level 12
                  "",
                //Level 13
                  "",
                //Level 14
                  "",
                //Level 15
                  "",
                //Level 16
                  "",
                //Level 17
                  "",
                //Level 18
                  "",
                //Level 19
                  "",
                //Level 20
                  ""
                  };
    }

    /**
     * Constructor for Monk Class with Subclass

     * @param subclass
     */
    public Monk(String subclass) {
        addFeature("", 3);
        addFeature("", 6);
        addFeature("", 10);
        addFeature("", 14);
    }
}
