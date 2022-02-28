package DNDCompanion.character.chrraces;

import java.io.Serializable;
import java.util.Arrays;

public abstract class Race implements Serializable{
    
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String[] subraces;
    protected String[] langs;
    protected String size;
    protected int speed;
    protected int[] mods = {0,0,0,0,0,0};

    protected Race(){
    }

    protected Race(String name,
                String[] subraces,
                String[] langs,
                String size,
                int speed,
                int[] mods){
                 
        this.name = name;
        this.subraces = subraces;
        this.langs = langs;
        this.size = size;
        this.speed = speed;
        this.mods = mods;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @return String[]
     */
    public String[] getSubraces(){
        return this.subraces;
    }

    
    /** 
     * @return String
     */
    public String getSize(){
        return this.size;
    }

    
    /** 
     * @return int
     */
    public int getSpeed(){
        return this.speed;
    }

    
    /** 
     * @return int[]
     */
    public int[] getMods(){
        return this.mods;
    }

    
    /** 
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    
    /** 
     * @param subraces
     */
    public void setSubraces(String[] subraces){
        this.subraces = subraces;
    }

    
    /** 
     * @param size
     */
    public void setSize(String size){
        this.size = size;
    }

    
    /** 
     * @param speed
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    
    /** 
     * @param mods
     */
    public void setMods(int[] mods){
        this.mods = mods;
    }

    /**
     * @return String
     */
    public abstract String getSubrace();
    
    
    /** 
     * @return String
     */
    public String toString(){
        return
        "race=" + this.name + "{\n\t" +
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + Arrays.toString(this.langs) + "\n\t" +
        "mods=" + Arrays.toString(this.mods) + "\n}\n";
    }

}
