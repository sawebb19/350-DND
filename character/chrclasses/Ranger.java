package dndcompanion.character.chrclasses;

/**
 * Class for the Ranger character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Ranger extends CharacterClass {
	/**
	 * Constructor for Ranger Class.
	 */
    public Ranger() {
        this.name = "Ranger";
        this.hit = 10;
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
     * Constructor for Ranger Class with Subclass

     * @param subclass
     */
    public Ranger(String subclass) {
        addFeature("", 3);
        addFeature("", 6);
        addFeature("", 10);
        addFeature("", 14);
    }
}
