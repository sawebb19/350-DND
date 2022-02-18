package DNDCompanion.character.chrclasses;

public class Wizard extends CharacterClass{
    public Wizard(){
        this.name = "Wizard";
        this.hit = 6;
        this.saves[3] = 1; // Intelligence
        this.saves[4] = 1; // Wisdom
    }
}