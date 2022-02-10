package dndcompanion.character;

import java.io.Serializable; // Allows you to save and load the char

import dndcompanion.character.chrclasses.*;
import dndcompanion.character.chrraces.*;
import java.util.Arrays;

public class Character implements Serializable{
    private String name;
    private String ethicalAlign;
    private String moralAlign;
    private Race race;
    private CharacterClass charClass;
    private int level;
    private int exp;

    // Stats
    private int[] stats;
    private int[] mods;

    public Character(){
    }

    public Character(String name,
                    String ethicalAlign, // 0: Lawful, 1: Neutral, 2: Chaotic
                    String moralAlign, // 0: Good, 1: Neutral, 2: Evil
                    Race race,
                    CharacterClass charClass,
                    int level,
                    int exp,
                    int[] stats,
                    int[] mods){

        this.name = name;
        this.ethicalAlign = ethicalAlign;
        this.moralAlign = moralAlign;
        this.race = race;
        this.charClass = charClass;
        this.level = level;
        this.exp = exp;
        this.stats = stats;
        this.mods = mods;

    }
  
    public String getName(){
        return this.name;
    }

    public Race getRace(){
        return this.race;
    }

    public CharacterClass getCharClass(){
        return this.charClass;
    }

    public String toString(){
        return
        "name=" + this.name + "\n" +
        "ethical=" + this.ethicalAlign + "\n" +
        "moral=" + this.moralAlign + "\n" +
         race.toString() +
         charClass.toString() +
         "level=" + this.level + "\n" +
         "exp=" + this.exp + "\n" +
         "stats=" + Arrays.toString(this.stats) + "\n" +
         "mods=" + Arrays.toString(this.mods);
    }
}
