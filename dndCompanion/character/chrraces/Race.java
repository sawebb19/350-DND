package dndCompanion.character.chrraces;

import java.io.Serializable;

public abstract class 
Race implements Serializable{
    
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String[] subraces;
    protected String[] langs;
    protected String size;
    protected int speed;
    protected int[] mods;

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
        return name;
    }

    public String[] getSubraces(){
        return subraces;
    }

    public String getSize(){
        return size;
    }

    public int getSpeed(){
        return speed;
    }

    public int[] getMods(){
        return mods;
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
        this.name + "{\n\t" +
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + this.langs + "\n\t" +
        "mods=" + this.mods + "\n}";
    }

}
