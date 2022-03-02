package DNDCompanion.character;


import DNDCompanion.character.chrclasses.*;
import DNDCompanion.character.chrraces.*;
import java.io.Serializable; // Allows you to save and load the char

/**
 * Class for the storing of character data from GUI.

 * @author Sam Webb and Nick Ford
 *
 */
@SuppressWarnings("serial")
public class DndChar implements Serializable {
    private String name;
    private String ethicalAlign; // L: Lawful, N: Neutral, C: Chaotic
    private String moralAlign; // G: Good, N: Neutral, E: Evil
    private Race race;
    private CharacterClass charClass;
    private int level;
    private int exp;
    private String skills;
    private String background;
    private String traits;
    private String ideals;
    private String bonds;
    private String flaws;
    private int armor;
    private int maxHp;
    private String features;
    private String profs;
    private String equipment;
    private String player;

    // Stats
    private int[] stats;
    private int[] mods = new int[6];

    public DndChar() {
    }

    /**
     * Constructor that takes all character data as parameters. Used in saving character objects.

     * @param name Character Name
     * @param ethicalAlign Ethical alignment piece; L, N, or C.
     * @param moralAlign Moral alignment piece; G, N, or E.
     * @param race Object represents the race of the character.
     * @param charClass Object represents the class of the character.
     * @param level Character level.
     * @param exp Character experience points.
     * @param stats Array of the character's stats.
     * @param skills String containing the name of all skills the character is proficient in.
     * @param background Character background.
     * @param traits Character personality traits text.
     * @param ideals Character ideals text.
     * @param bonds Character bonds text.
     * @param flaws Character flaws text.
     * @param armor Character armor class.
     * @param maxHp Character maximum Health Points.
     * @param features Character features and racial traits text.
     * @param profs Character proficiencies (Ex: languages, weapon types, etc.).
     * @param equipment Character equipment text.
     * @param player Name of person who plays the character.
     */
    public DndChar(String name,
                    String ethicalAlign, 
                    String moralAlign, 
                    Race race,
                    CharacterClass charClass,
                    int level,
                    int exp,
                    int[] stats,
                    String skills,
                    String background, String traits,
                    String ideals, String bonds,
                    String flaws, int armor,
                    int maxHp, String features,
                    String profs, String equipment,
                    String player) {

        this.name = name;
        this.ethicalAlign = ethicalAlign;
        this.moralAlign = moralAlign;
        this.race = race;
        this.charClass = charClass;
        this.level = level;
        this.exp = exp;
        this.stats = stats;
        for (int i = 0; i < stats.length; i++) { //mods are based on stats
        	mods[i] = (stats[i] / 2) - 5;
        }
        this.skills = skills;
        this.background = background;
        this.traits = traits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.armor = armor;
        this.maxHp = maxHp;
        this.features = features;
        this.profs = profs;
        this.equipment = equipment;
        this.player = player;

    }
  
    
    /*
     * getters for each field
     */
    public String getName() {
        return this.name;
    }

    public Race getRace() {
        return this.race;
    }

    public CharacterClass getCharClass() {
        return this.charClass;
    }
    
    public int[] getStats() {
    	return stats;
    }
    
    public int getLevel() {
    	return level;
    }
    
    public int getExp() {
    	return exp;
    }

    public String getAlignment() {
        return ethicalAlign + moralAlign;
    }
    
    public String getSkills() {
    	return skills;
    }
    
    public String getBackground() {
    	return background;
    }
    
    public String getTraits() {
    	return traits;
    }
    
    public String getIdeals() {
    	return ideals;
    }
    
    public String getBonds() {
    	return bonds;
    }
    
    public String getFlaws() {
    	return flaws;
    }
    
    public int getArmor() {
    	return armor;
    }
    
    public int getMaxHp() {
    	return maxHp;
    }

    public String getFeatures() {
    	return features;
    }
    
    public String getProfs() {
    	return profs;
    }
    
    public String getEquip() {
    	return equipment;
    }
    
    public String getPlayer() {
    	return player;
    }
    
//    public String toString(){
//        return
//        "name=" + this.name + "\n" +
//        "ethical=" + this.ethicalAlign + "\n" +
//        "moral=" + this.moralAlign + "\n" +
//         race.toString() +
//         charClass.toString() +
//         "level=" + this.level + "\n" +
//         "exp=" + this.exp + "\n" +
//         "stats=" + Arrays.toString(this.stats) + "\n" +
//         "mods=" + Arrays.toString(this.mods);
//    }

    public static void main(String[] args) {
    	
    }
}
