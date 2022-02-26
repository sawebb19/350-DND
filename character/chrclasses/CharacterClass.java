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

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @return int
     */
    public int getHit(){
        return this.hit;
    }

    
    /** 
     * @return int[]
     */
    public int[] getSaves(){
        return this.saves;
    }

    
    /** 
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    
    /** 
     * @param hit
     */
    public void setHit(int hit){
        this.hit = hit;
    }

    
    /** 
     * @param saves
     */
    public void setSaves(int[] saves){
        this.saves = saves;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return
        "class=" + this.name + "{\n\t" +
        "hit=" + this.hit + "\n\t" +
        "saves=" + Arrays.toString(this.saves) + "\n}\n";
    }
}
