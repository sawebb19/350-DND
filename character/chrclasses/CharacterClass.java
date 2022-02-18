package DNDCompanion.character.chrclasses;

import java.io.Serializable;
import java.util.Arrays;

public abstract class
CharacterClass implements Serializable{
    
    private static final long serialVersionUID = 2L;

    protected String name;
    protected int hit;
    protected int[] saves = {0,0,0,0,0,0};

    protected CharacterClass(){
    }

    protected CharacterClass(String name,
                            int hit,
                            int[] saves){
        this.name = name;
        this.hit = hit;
        this.saves = saves;
    }

    public String getName(){
        return this.name;
    }

    public int getHit(){
        return this.hit;
    }

    public int[] getSaves(){
        return this.saves;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHit(int hit){
        this.hit = hit;
    }

    public void setSaves(int[] saves){
        this.saves = saves;
    }

    public String toString(){
        return
        "class=" + this.name + "{\n\t" +
        "hit=" + this.hit + "\n\t" +
        "saves=" + Arrays.toString(this.saves) + "\n}\n";
    }
}
