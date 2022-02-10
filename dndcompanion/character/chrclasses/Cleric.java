package dndcompanion.character.chrclasses;

public class Cleric extends CharacterClass{
    public Cleric(){
        this.name = "Cleric";
        this.hit = 8;
        this.saves[4] = 1; // Wisdom
        this.saves[5] = 1; // Charisma
    }
}
