package DNDCompanion;

public class characterClass {
    private String name;
    // Maybe consolidate the hit vars? Are always equal
    private int hd; // Hit Die
    private int hp; // Hit points
    private int[] saves = {0,0,0,0,0,0}; // Saving throws. "throws" is a reserved word
    // Not sure how to deal wih Skills yet

    public characterClass(){
    }

    public characterClass(String name){
        this.name = name;

        name = name.toLowerCase();
        switch(name){
            case "barbarian":
                this.hd = this.hp = 12;
                this.saves[0] = 1; // Strength
                this.saves[2] = 1; // Constitution
                break;
            case "bard":
                this.hd = this.hp = 8;
                this.saves[1] = 1; // Dexterity
                this.saves[5] = 1; // Charisma
                break;
            case "cleric":
                this.hd = this.hp = 8;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "druid":
                this.hd = this.hp = 8;
                this.saves[3] = 1; // Intelligence
                this.saves[4] = 1; // Wisdom
                break;
            case "fighter":
                this.hd = this.hp = 10;
                this.saves[0] = 1; // Strength
                this.saves[2] = 1; // Constitution
                break;
            case "monk":
                this.hd = this.hp = 8;
                this.saves[0] = 1; // Strength
                this.saves[1] = 1; // Dexterity
                break;
            case "paladin":
                this.hd = this.hp = 10;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "ranger":
                this.hd = this.hp = 10;
                this.saves[0] = 1; // Strength
                this.saves[1] = 1; // Dexterity
                break;
            case "rogue":
                this.hd = this.hp = 8;
                this.saves[1] = 1; // Dexterity
                this.saves[3] = 1; // Intelligence
                break;
            case "sorcerer":
                this.hd = this.hp = 6;
                this.saves[2] = 1; // Constitution
                this.saves[5] = 1; // Charisma
                break;
            /* Warlock is the same as Cleric atm, but will change once
            skills and abilities are added */
            case "warlock":
                this.hd = this.hp = 8;
                this.saves[4] = 1; // Wisdom
                this.saves[5] = 1; // Charisma
                break;
            case "wizard":
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

