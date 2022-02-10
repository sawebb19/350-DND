package dndCompanion.character.chrraces;

public abstract class
Elf extends Subrace{

    protected Elf(){
        this.name = "Elf";
        this.subraces = new String[]{"High", "Wood"};
        this.mods[1] = 2; // +2 Dexterity
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Common", "Elvish"};
    }
}
