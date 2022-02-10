package dndCompanion.character.chrclasses;

public class Barbarian extends CharacterClass{
    public Barbarian(){
        this.name = "Barbarian";
        this.hit = 12;
        this.saves[0] = 1; // Strength
        this.saves[2] = 1; // Constitution
    }
}
