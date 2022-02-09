package DNDCompanion;


public class characterRace {
    private String name;
    private String[] subraces;
    private String[] langs;
    private String size;
    private int speed;
    private int[] mods = {0,0,0,0,0,0};
    
    public characterRace(){
    }

    public characterRace(String name){
        this.name = name;

        name = name.toLowerCase();
        switch(name){
            case "dragonborn":
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common", "Draconic");
                this.mods[0] = 2; // +2 Strength
                this.mods[5] = 1; // +1 Charisma
                break;
            case "dwarf":
                this.subraces = new String("Hill", "Mountain");
                this.size = "Medium";
                this.speed = 25;
                this.langs = new String("Common", "Dwarvish");
                break;
            case "elf":
                this.subraces = new String("High", "Wood", "Dark");
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common", "Elvish");
                this.mods[1] = 2; // +2 Dexterity
                break;
            case "gnome":
                this.subraces = new String("Deep", "Rock");
                this.size = "Small";
                this.speed = 25;
                this.langs = new String("Common", "Gnomish");
                this.mods[3] = 2; // +2 Intelligence
                break;
            case "half elf": case "half-elf":
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common", "Elvish"); // Also get one lang of choice
                this.mods[5] = 2; // +2 Charisma. Also get two +1 of their choice
                break;
            case "halfling":
                this.subraces = new Sting("Lightfoot", "Stout");
                this.size = "Small";
                this.speed = 25;
                this.langs = new String("Common", "Halfling");
                break;
            case "half orc": case "half-orc":
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common", "Orc");
                this.mods[0] = 2; // +2 Strength
                this.mods[2] = 1; // +1 Constitution
                break;
            case "human":
                // Ethnicity != subraces, but it works
                this.subraces = new String("Calishite", "Chondathan", "Damaran", 
                                            "Illuskan", "Mulan", "Rashemi",
                                            "Shou", "Tethyrian", "Turami");
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common"); // Also get one lang of choice
                this.mods = new int[]{1,1,1,1,1,1}; // +1 All
                break;
            case "tiefling":
                this.size = "Medium";
                this.speed = 30;
                this.langs = new String("Common", "Infernal");
                this.mods[3] = 1; // +1 Intelligence
                this.mods[5] = 2; // +2 Charisma
                break;
            default:
                this.size = "";
                this.speed = 0;
                this.langs = "";
                break;               
        }
    }
}

