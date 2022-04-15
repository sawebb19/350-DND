package dndcompanion.character.chrraces;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Abstract class for Races.

 * @author Sam Webb
 *
 */
public abstract class Race implements Serializable {
    
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String[] subraces;
    protected String[] langs;
    protected String size;
    protected int speed;
    protected int[] mods = {0, 0, 0, 0, 0, 0};

    protected Race() {
    }

//    public Race(String name,
//                String[] subraces,
//                String[] langs,
//                String size,
//                int speed,
//                int[] mods) {
//                 
//        this.name = name;
//        this.subraces = subraces;
//        this.langs = langs;
//        this.size = size;
//        this.speed = speed;
//        this.mods = mods;
//    }

    
    /** 
     * getter for race name.

     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * getter for subrace array.

     * @return String[]
     */
    public String[] getSubraces() {
        return this.subraces;
    }

    
    /** 
     * getter for creature size.

     * @return String
     */
    public String getSize() {
        return this.size;
    }

    
    /** 
     * getter for walking speed.

     * @return int
     */
    public int getSpeed() {
        return this.speed;
    }

    
    /** 
     * getter for base stat mods.

     * @return int[]
     */
    public int[] getMods() {
        return this.mods;
    }
    
    /** 
     * setter for race name.

     * @param name name of the race.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * setter for subrace array.

     * @param subraces array of subrace names.
     */
    public void setSubraces(String[] subraces) {
        this.subraces = subraces;
    }

    
    /** 
     * setter for creature size.

     * @param size size of the race.
     */
    public void setSize(String size) {
        this.size = size;
    }

    
    /** 
     * setter for walking speed.

     * @param speed walking speed for race.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    /** 
     * setter for base stat mods.

     * @param mods base stat mods for race.
     */
    public void setMods(int[] mods) {
        this.mods = mods;
    }

    /**
     * abstract method for getting the type of subrace.

     * @return String 
     */
    public abstract String getSubrace();
    
    
    /** 
     * method to override the default toString method.

     * @return String represents the class.
     */
    public String toString() {
        return
        "race=" + this.name + "{\n\t" 		
        + "size=" + this.size + "\n\t" 
        + "speed=" + this.speed + "\n\t" 
        + "langs=" + Arrays.toString(this.langs) + "\n\t" 
        + "mods=" + Arrays.toString(this.mods) + "\n}\n";
    }

}
