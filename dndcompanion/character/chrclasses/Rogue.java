package dndcompanion.character.chrclasses;

public class Rogue extends CharacterClass{
    public Rogue(){
        this.name = "Rogue";
        this.hit = 8;
        this.saves[1] = 1; // Dexterity
        this.saves[3] = 1; // Intelligence
    }
}
