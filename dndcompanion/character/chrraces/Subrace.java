package dndcompanion.character.chrraces;

import java.util.Arrays;

public abstract class
Subrace extends Race{

    protected String kind = null;
    
    Subrace(){
        super();
    }

    protected Subrace(String name,
                String[] subraces,
                String kind,
                String[] langs,
                String size,
                int speed,
                int[] mods){
                 
        this.name = name;
        this.subraces = subraces;
        this.kind = kind;
        this.langs = langs;
        this.size = size;
        this.speed = speed;
        this.mods = mods;
    }

    @Override
    public String toString(){
        return
        this.name + "{\n\t" +
        "subrace=" + this.kind + "\n\t" + 
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + Arrays.toString(this.langs) + "\n\t" +
        "mods=" + Arrays.toString(this.mods) + "\n}\n";
    }
}
