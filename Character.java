package DNDCompanion;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable; // Allows you to save and load the char

public class Character implements Serializable{
    private String name;
    private int ethicalAlign;
    private int moralAlign;
    private CharacterRace race;
    private CharacterClass charClass;
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

    public Character(){
    }
   
}
