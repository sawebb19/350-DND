package dndcompanion.character.chrraces;

public class DwarfMountain extends Dwarf{
    
    public DwarfMountain(){
        super();
        this.subraces = null;
        this.mods[0] = 2; // +2 Wisdom
        this.kind = "Mountain";
    }
}