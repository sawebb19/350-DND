package dndcompanion.character.chrraces;

import java.util.Arrays;

public class Human extends Race{
    
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

    public Human(){
        this.name = "Human";
        this.subraces = null;
        this.mods = new int[]{1,1,1,1,1,1}; // +1 All
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common"};
    }

    public String getEthnicity(){
        return ethnic;
    }

    public void setEthnicity(String ethnic){
        this.ethnic = ethnic;
    }

    @Override
    public String toString(){
        return
        this.name + "{\n\t" +
        "ethnicity=" + this.ethnic + "\n\t" + 
        "size=" + this.size + "\n\t" +
        "speed=" + this.speed + "\n\t" +
        "langs=" + Arrays.toString(this.langs) + "\n\t" +
        "mods=" + Arrays.toString(this.mods) + "\n}\n";
    }
}
