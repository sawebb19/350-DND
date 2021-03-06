package dndcompanion.character.chrclasses;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Interface for all dnd class classes.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
public abstract class CharacterClass implements Serializable {

  private static final long serialVersionUID = 2L;

  protected String name;
  protected int hit;
  protected int[] saves = {0, 0, 0, 0, 0, 0};
  protected String[] features = {"", "", "", "", "", "", "", "", "", "", 
      "", "", "", "", "", "", "", "", "", ""};
  protected String[] subclasses;
  protected String subclass;

  protected CharacterClass() {
  }

  //    public CharacterClass(String name, int hit, int[] saves) {
  //        this.name = name;
  //        this.hit = hit;
  //        this.saves = saves;
  //    }


  /** 
   * getter for Name of the Class (DND).

   * @return String Name of the Class (DND).
   */
  public String getName() {
    return this.name;
  }


  /** 
   * getter for hit dice for the Class (DND).

   * @return int hit dice for the Class (DND).
   */
  public int getHit() {
    return this.hit;
  }


  /** 
   * getter for save proficiencies of the Class (DND).

   * @return int[] save proficiencies of the Class (DND).
   */
  public int[] getSaves() {
    return this.saves;
  }

  /** 
   * getter for subclass list of the Class (DND).

   * @return String[] subclasses of the Class (DND).
   */
  public String[] getSubclasses() {
    return subclasses;
  }
  
  /**
   * getter for subclass of this instance of the Class (DND).

   * @return String subclass of the Class instance.
   */
  public String getSubclass() {
    return subclass;
  }

  /** 
   * setter for Name of the Class (DND).

   * @param name Name of the Class (DND).
   */
  public void setName(String name) {
    this.name = name;
  }


  /** 
   * setter for hit dice for the Class (DND).

   * @param hit hit dice for the Class (DND).
   */
  public void setHit(int hit) {
    this.hit = hit;
  }


  /** 
   * setter for save proficiencies of the Class (DND).

   * @param saves save proficiencies of the Class (DND).
   */
  public void setSaves(int[] saves) {
    this.saves = saves;
  }

  /**
   * Adds a feature to the features array list.

   * @param feature the feature to be added to the class feature list.
   * @param level the level at which the class gains the feature.
   */
  public void addFeature(String feature, int level) {
    features[level - 1] += feature;
  }

  /**
   * Gets the array of features for the class for each level.

   * @returns String[] String array of the class's features.
   */
  public String[] getFeatures() {
    return this.features;
  }


  /** 
   * Overriden toString() method for CharacterClass.

   * @return String String to represent the object of CharacterClass.
   */
  @Override
  public String toString() {
    return
        "class=" + this.name + "{\n\t" + "hit=" + this.hit + "\n\t"
        + "saves=" + Arrays.toString(this.saves) + "\n}\n";
  }
}
