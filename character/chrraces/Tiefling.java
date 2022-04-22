package dndcompanion.character.chrraces;

/**
 * Class to represent the Tiefling Race.

 * @author Sam Webb
 *
 */
@SuppressWarnings("serial")
public class Tiefling extends Race {

  /**
   * Default Constructor for the class.
   */
  public Tiefling() {
    this.name = "Tiefling";
    this.subraces = null;
    this.mods[3] = 1; // +1 Intelligence
    this.mods[5] = 2; // +2 Charisma
    this.size = "Medium";
    this.speed = 30;
    this.langs = new String[]{"Common", "Infernal"};
  }    
}
