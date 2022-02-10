package dndcompanion.character.chrclasses;

public class Sorcerer extends CharacterClass{
    public Sorcerer(){
        this.name = "Sorcerer";
        this.hit = 6;
        this.saves[2] = 1; // Constitution
        this.saves[5] = 1; // Charisma
    }
}
