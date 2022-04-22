package dndcompanion.character.chrraces;

import java.util.Arrays;

/**
 * Class to represent the Dragonborn Race.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Dragonborn extends Race {

  private String ancestry;
  /* Possible ancestries:
    Black
    Blue
    Brass
    Bronze
    Copper
    Gold
    Green
    Red
    Silver
    White
   */

  /**
   * Default constructor for the class.
   */
  public Dragonborn() {
    this.name = "Dragonborn";
    this.subraces = new String[] {"Brass", "Bronze", "Copper", "Gold", "Silver", "Black",
        "Blue", "Green", "Red", "White"};
    this.mods[0] = 2; // +2 Strength
    this.mods[5] = 1; // +1 Charisma
    this.size = "Medium";
    this.speed = 30;
    this.langs = new String[]{"Common", "Draconic"};   
  }

  public Dragonborn(String ancestry) {
    this();
    setAncestry(ancestry);
  }

  /** 
   * getter for the dragonborn ancestry.

   * @return String the dragonborn ancestry as a String.
   */
  public String getAncestry() {
    return this.ancestry;
  }


  /** 
   * setter for the dragonborn ancestry.

   * @param ancestry the dragonborn ancestry as a String.
   */
  public void setAncestry(String ancestry) {
    this.ancestry = ancestry;
  }


  /** 
   * method to override the default toString method.

   * @return String String representation of the class.
   */
  @Override
  public String toString() {
    return
        this.name + "{\n\t" 
        + "ancestry=" + this.ancestry + "\n\t" 
        + "size=" + this.size + "\n\t" 
        + "speed=" + this.speed + "\n\t" 
        + "langs=" + Arrays.toString(this.langs) + "\n\t"
        + "mods=" + Arrays.toString(this.mods) + "\n}\n";
  }
} 