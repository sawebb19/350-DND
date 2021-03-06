package dndcompanion.character.chrraces;

/**
 * Class to represent the Halfling Race.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Halfling extends Race {

  /**
   * Default Constructor.
   */
  public Halfling() {
    this.name = "Halfling";
    this.subraces = new String[]{"Lightfoot", "Stout"};
    this.mods[1] = 2; // +2 Dexterity
    this.size = "Small";
    this.speed = 25;
    this.langs = new String[]{"Common", "Halfling"};
  }

  /**
   * Constructor for race with a subrace.

   * @param subrace the subrace to be used in race creation.
   */
  public Halfling(String subrace) {
    this();
    if (subrace.equals("Lightfoot")) {
      this.mods[5] = 1; // +1 Charisma
      this.kind = "Lightfoot";
    } else if (subrace.equals("Stout")) {
      this.mods[2] = 1; // +1 Constitution
      this.kind = "Stout";
    }
  }
}
