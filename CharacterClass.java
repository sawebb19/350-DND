package DNDCompanion;

public class CharacterClass {
    private String name;
    // Maybe consolidate the hit vars? Are always equal
    private int hd; // Hit Die
    private int hp; // Hit points
    private int[] saves = {0,0,0,0,0,0}; // Saving throws. "throws" is a reserved word
    // Not sure how to deal wih Skills yet

    public CharacterClass(){
    }

    public CharacterClass(String name){
        this.name = name;

        switch(name){
            case "Barbarian":
                this.hd = this.hp = 12;
                this.saves[0] = 1; // Strength
                this.saves[2] = 1; // Constitution
                break;
            case "Bard":
                this.hd = this.hp = 8;
                this.saves[1] = 1; // Dexterity
                this.saves[5] = 1; // Charisma
                break;
            case "Cleric":
                this.hd = this.hp = 8;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "Druid":
                this.hd = this.hp = 8;
                this.saves[3] = 1; // Intelligence
                this.saves[4] = 1; // Wisdom
                break;
            case "Fighter":
                this.hd = this.hp = 10;
                this.saves[0] = 1; // Strength
                this.saves[2] = 1; // Constitution
                break;
            case "Monk":
                this.hd = this.hp = 8;
                this.saves[0] = 1; // Strength
                this.saves[1] = 1; // Dexterity
                break;
            case "Paladin":
                this.hd = this.hp = 10;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "Ranger":
                this.hd = this.hp = 10;
                this.saves[0] = 1; // Strength
                this.saves[1] = 1; // Dexterity
                break;
            case "Rogue":
                this.hd = this.hp = 8;
                this.saves[1] = 1; // Dexterity
                this.saves[3] = 1; // Intelligence
                break;
            case "Sorcerer":
                this.hd = this.hp = 6;
                this.saves[2] = 1; // Constitution
                this.saves[5] = 1; // Charisma
                break;
            /* Warlock is the same as Cleric atm, but will change once
            skills and abilities are added */
            case "Warlock":
                this.hd = this.hp = 8;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "Wizard":
                this.hd = this.hp = 6;
                this.saves[3] = 1; // Intelligence
                this.saves[4] = 1; // Wisdom
                break;
            default:
                this.hd = this.hp = 0;
                break;
            }
    }

}

