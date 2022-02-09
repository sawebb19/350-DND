package DNDCompanion;


import java.io.Serializable; // Allows you to save and load the char

import DNDCompanion.CharClass;

public class DNDChar implements Serializable{
    private String name;
    private int ethicalAlign;
    private int moralAlign;
    private Race race;
    private CharClass charClass;
    private int level;
    private int exp;

    // Stats

    private int str;
    private int strm;
    private int dex;
    private int dexm;
    private int con;
    private int conm;
    private int intel;
    private int intelm;
    private int wis;
    private int wism;
    private int cha;
    private int cham;
    
}
