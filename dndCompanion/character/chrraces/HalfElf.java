package dndCompanion.character.chrraces;

public class HalfElf extends Race{
    
    public HalfElf(){
        this.name = "Half-Elf";
        this.mods[5] = 2; // + 2 Charisma && +1 of Choice
        this.subraces = null;
        this.size = "Medium";
        this.speed = 30;
        this.langs = new String[]{"Cmoon", "Elvish"}; // +1 of choice

    }
}