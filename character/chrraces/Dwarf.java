package dndcompanion.character.chrraces;

/**
 * Class to represent the Dwarf Race.

 * @author Sam Webb 
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Dwarf extends Race {

  /**
   * Default Constructor for the class.
   */
  public Dwarf() {
    this.name = "Dwarf";
    this.subraces = new String[]{"Hill", "Mountain"};
    this.mods[2] = 2; // +2 Constitution
    this.size = "Medium";
    this.speed = 25;
    this.langs = new String[]{"Common", "Dwarvish"};
  }

  /**
   * Constructor for race with a subrace.

   * @param subrace the subrace to be used in race creation.
   */
  public Dwarf(String subrace) {
    this();
    if (subrace.equals("Hill")) {
      this.mods[4] = 1; // +1 Wisdom
      this.kind = "Hill";
    } else if (subrace.equals("Mountain")) {
      this.mods[0] = 2; // +2 Strength
      this.kind = "Mountain";
    }
  }
}
