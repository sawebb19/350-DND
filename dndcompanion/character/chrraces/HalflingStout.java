package dndcompanion.character.chrraces;

public class HalflingStout extends Halfling{
    
    public HalflingStout(){
        super();
        this.subraces = null;
        this.mods[2] = 1; // +1 Constitution
        this.kind = "Stout";
    }
}
