package dndCompanion.character.chrclasses;

public class Monk extends CharacterClass{
    public Monk(){
        this.name = "Monk";
        this.hit = 8;
        this.saves[0] = 1; // Strength
        this.saves[1] = 1; // Dexterity
    }
}
