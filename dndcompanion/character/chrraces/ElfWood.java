package dndcompanion.character.chrraces;

public class ElfWood extends Elf{
    
    public ElfWood(){
        super();
        this.subraces = null;
        this.mods[4] = 1; // +1 Wisdom
        this.speed = 35; // +5 speed
        this.kind = "Wood";
    }
}
