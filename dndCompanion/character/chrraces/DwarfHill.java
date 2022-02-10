package dndCompanion.character.chrraces;

public class DwarfHill extends Dwarf{
    
    public DwarfHill(){
        super();
        this.subraces = null;
        this.mods[4] = 1; // +1 Wisdom
        this.kind = "Hill";
    }
}
