package DNDCompanion.character.chrraces;

@SuppressWarnings("serial")
public class ElfHigh extends Elf{
    
    public ElfHigh(){
        super();
        this.subraces = null;
        this.mods[3] = 1; // +1 Intelligence
        // +1 Language
        this.kind = "High";
    }
}
