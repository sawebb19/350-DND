package dndcompanion.character.chrclasses;

/**
 * Class for the Sorcerer character class.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Sorcerer extends CharacterClass {
	/**
	 * Constructor for Sorcerer Class.
	 */
    public Sorcerer() {
        this.name = "Sorcerer";
        this.hit = 6;
        this.saves[2] = 1; // Constitution
        this.saves[5] = 1; // Charisma
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
     * Constructor for Sorcerer Class with Subclass

     * @param subclass
     */
    public Sorcerer(String subclass) {
        addFeature("", 3);
        addFeature("", 6);
        addFeature("", 10);
        addFeature("", 14);
    }
}
