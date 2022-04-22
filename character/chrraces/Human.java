package dndcompanion.character.chrraces;

import java.util.Arrays;

/**
 * Class to represent the Human Race.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class Human extends Race {

  private String ethnic;
  /* Possible ethnicies:
    Calishite
    Chondathan
    Damaran
    Illuskan
    Mulan
    Rashemi
    Shou
    Tethyrian
    Turami
   */

  /**
   * Default constructor for the class.
   */
  public Human() {
    this.name = "Human";
    this.subraces = new String[] {"Calishite", "Chondathan", "Damaran", "Illuskan",
        "Mulan", "Rashemi", "Shou", "Tethyrian", "Turami"};
    this.mods = new int[]{1, 1, 1, 1, 1, 1}; // +1 All
    this.size = "Medium";
    this.speed = 30;
    this.langs = new String[]{"Common"};
  }

  /**
   * Constructor for race with a ethinicity.

   * @param ethnic the ethnicity to be used in race creation.
   */
  public Human(String ethnic) {
    this();
    setEthnicity(ethnic);
  }


  /** 
   * getter for the ethnicity.

   * @return String the ethnicity as a String.
   */
  public String getEthnicity() {
    return ethnic;
  }


  /** 
   * setter for ethnicity.

   * @param ethnic the ethincity to set.
   */
  public void setEthnicity(String ethnic) {
    this.ethnic = ethnic;
  }


  /** 
   * method to override the default toString method.

   * @return String String representation of the class.
   */
  @Override
  public String toString() {
    return
        this.name + "{\n\t"
        + "ethnicity=" + this.ethnic + "\n\t" 
        + "size=" + this.size + "\n\t" 
        + "speed=" + this.speed + "\n\t" 
        + "langs=" + Arrays.toString(this.langs) + "\n\t" 
        + "mods=" + Arrays.toString(this.mods) + "\n}\n";
  }
}
