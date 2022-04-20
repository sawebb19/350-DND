package dndcompanion.character;

import java.io.Serializable; // Allows you to save and load the char

import dndcompanion.character.chrclasses.CharacterClass;
import dndcompanion.character.chrraces.Race;

/**
 * Class for the storing of character data from GUI.

 * @author Sam Webb
 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class DndChar implements Serializable {
    private String name;
    private String alignment;
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
                    String alignment,
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
        this.alignment = alignment;
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
        return alignment;
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
    
    /*
     * setters for each field
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setCharClass(CharacterClass charClass) {
        this.charClass = charClass;
    }
    
    public void setStats(int[] stats) {
    	this.stats = stats;
    }
    
    public void setLevel(int level) {
    	this.level = level;
    }
    
    public void setExp(int exp) {
    	this.exp = exp;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
    
    public void setSkills(String skills) {
    	this.skills= skills;
    }
    
    public void setBackground(String bg) {
    	this.background = bg;
    }
    
    public void setTraits(String traits) {
    	this.traits = traits;
    }
    
    public void setIdeals(String ideals) {
    	this.ideals = ideals;
    }
    
    public void setBonds(String bonds) {
    	this.bonds = bonds;
    }
    
    public void setFlaws(String flaws) {
    	this.flaws= flaws ;
    }
    
    public void setArmor(int ac) {
    	this.armor = ac;
    }
    
    public void setMaxHp(int hp) {
    	this.maxHp = hp ;
    }

    public void setFeatures(String features) {
    	this.features = features;
    }
    
    public void setProfs(String profs) {
    	this.profs = profs;
    }
    
    public void setEquip(String equip) {
    	this.equipment = equip;
    }
    
    public void setPlayer(String player) {
    	this.player = player;
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

//    public static void main(String[] args) {
//    	
//    }
}
