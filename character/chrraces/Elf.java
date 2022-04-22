package dndcompanion.character.chrraces;

/**
 * Class to represent the Elf Race.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Elf extends Race {

  /**
   * Default Constructor for the class.
   */
  public Elf() {
    this.name = "Elf";
    this.subraces = new String[]{"High", "Wood"};
    this.mods[1] = 2; // +2 Dexterity
    this.size = "Medium";
    this.speed = 30;
    this.langs = new String[]{"Common", "Elvish"};
  }

  /**
   * Constructor for race with a subrace.

   * @param subrace the subrace to be used in race creation.
   */
  public Elf(String subrace) {
    this();
    if (subrace.equals("High")) {
      this.mods[3] = 1; // +1 Intelligence
      // +1 Language
      this.kind = "High";
    } else if (subrace.equals("Wood")) {
      this.mods[4] = 1; // +1 Wisdom
      this.speed = 35; // +5 speed
      this.kind = "Wood";
    }
  }
}
