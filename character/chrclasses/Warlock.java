package DNDCompanion.character.chrclasses;

public class Warlock extends CharacterClass{
    public Warlock(){
        this.name = "Warlock";
        this.hit = 8;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}