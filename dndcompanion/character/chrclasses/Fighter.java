package dndcompanion.character.chrclasses;

public class Fighter extends CharacterClass{
    public Fighter(){
        this.name = "Fighter";
        this.hit = 10;
        this.saves[0] = 1; // Strength
        this.saves[2] = 1; // Constitution
    }
}
