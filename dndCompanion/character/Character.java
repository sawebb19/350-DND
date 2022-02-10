package dndCompanion.character;

import java.io.Serializable; // Allows you to save and load the char

import dndCompanion.character.chrclasses.*;
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
    private int[] mods;

    public Character(){
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
