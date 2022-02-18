package DNDCompanion.character.chrclasses;

public class Paladin extends CharacterClass{
    public Paladin(){
        this.name = "Paladin";
        this.hit = 10;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}
