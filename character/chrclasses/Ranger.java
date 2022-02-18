package DNDCompanion.character.chrclasses;

public class Ranger extends CharacterClass{
    public Ranger(){
        this.name = "Ranger";
        this.hit = 10;
        this.saves[0] = 1; // Strength
        this.saves[1] = 1; // Dexterity
    }
}
