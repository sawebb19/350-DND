package dndcompanion.character;

import java.io.Serializable; // Allows you to save and load the char

import dndcompanion.character.chrclasses.*;
import dndcompanion.character.chrraces.*;

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
    private int[] mods;

    public Character(){
    }

    public Character(String name,
                    int ethicalAlign,
                    int moralAlign,
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
        return name;
    }

    public String toString(){
        return
        "name=" + this.name +
        "ethical=" + this.ethicalAlign +
        "moral=" + this.moralAlign +
         race.toString() +
         charClass.toString() +
         "level=" + this.level +
         "exp=" + this.exp +
         "stats=" + this.stats +
         "mods=" + this.mods;
    }
}
