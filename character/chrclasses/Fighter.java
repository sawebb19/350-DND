package dndcompanion.character.chrclasses;

/**
 * Class for the Fighter character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Fighter extends CharacterClass {
	/**
	 * Constructor for Fighter Class.
	 */
    public Fighter() {
        this.name = "Fighter";
        this.hit = 10;
        this.saves[0] = 1; // Strength
        this.saves[2] = 1; // Constitution
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
     * Constructor for Fighter Class with Subclass

     * @param subclass
     */
    public Fighter(String subclass) {
        addFeature("", 3);
        addFeature("", 6);
        addFeature("", 10);
        addFeature("", 14);
    }
}
