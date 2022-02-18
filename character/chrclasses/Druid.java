package DNDCompanion.character.chrclasses;

public class Druid extends CharacterClass{
    public Druid(){
        this.name = "Druid";
        this.hit = 8;
        this.saves[3] = 1; // Intelligence
        this.saves[4] = 1; // Wisdom
    }
}
