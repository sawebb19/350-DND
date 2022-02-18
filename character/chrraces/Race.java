package DNDCompanion.character.chrraces;

import java.io.Serializable;
import java.util.Arrays;

public abstract class 
Race implements Serializable{
    
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

    public String getName(){
        return this.name;
    }

    public String[] getSubraces(){
        return this.subraces;
    }

    public String getSize(){
        return this.size;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int[] getMods(){
        return this.mods;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSubraces(String[] subraces){
        this.subraces = subraces;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setMods(int[] mods){
        this.mods = mods;
    }

    public String toString(){
        return
        "race=" + this.name + "{\n\t" +
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + Arrays.toString(this.langs) + "\n\t" +
        "mods=" + Arrays.toString(this.mods) + "\n}\n";
    }

}
