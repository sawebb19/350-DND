package dndCompanion.character;

import java.io.Serializable; // Allows you to save and load the char

import dndCompanion.CharacterClass;
import dndCompanion.character.chrraces.*;

public class Character implements Serializable{
    private String name;
    private int ethicalAlign;
    private int moralAlign;
    private Race race;
    private CharacterClass charClass;
    private int level;
    private int exp;

    // Stats
    private int[] stats;
    private int[] statMods;

    public Character(){
    }
  
    public String getName(){
        return name;
    }
}
