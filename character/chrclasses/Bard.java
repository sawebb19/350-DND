package DNDCompanion.character.chrclasses;

public class Bard extends CharacterClass{
    public Bard(){
        this.name = "Bard";
        this.hit = 8;
        this.saves[1] = 1; // Dexterity
        this.saves[5] = 1; // Charisma
    }
}
