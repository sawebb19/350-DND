package DNDCompanion.character.chrraces;

@SuppressWarnings("serial")
public class DwarfMountain extends Dwarf{
    
    public DwarfMountain(){
        super();
        this.subraces = null;
        this.mods[0] = 2; // +2 Wisdom
        this.kind = "Mountain";
    }
}