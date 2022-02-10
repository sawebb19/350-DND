package dndcompanion.character.chrraces;

public abstract class
Dwarf extends Subrace {

    protected Dwarf(){
        this.name = "Dwarf";
        this.subraces = new String[]{"Hill", "Mountain"};
        this.mods[2] = 2; // +2 Constitution
        this.size = "Medium";
        this.speed = 25;
        this.langs = new String[]{"Common", "Dwarvish"};
    }
}
