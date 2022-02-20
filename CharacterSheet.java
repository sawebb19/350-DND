package DNDCompanion;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import DNDCompanion.character.*;
import DNDCompanion.character.chrclasses.CharacterClass;
import DNDCompanion.character.chrclasses.Rogue;
import DNDCompanion.character.chrraces.HalfElf;
import DNDCompanion.character.chrraces.Race;


public class CharacterSheet extends JFrame implements ActionListener {

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem newChar;
    private JMenuItem close;

    private JLabel charName;
    private JLabel charRace;
    private JLabel charClass;

    private DNDChar tempChar;
    

    public CharacterSheet() {

        // Menus

        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        newChar = new JMenuItem("New Character");
        openChar = new JMenuItem("Open Character");
        saveChar = new JMenuItem("Save Character");
        //saveChar.setEnabled(false);
        close = new JMenuItem("Close");

        fileMenu.add(newChar);
        fileMenu.add(openChar);
        fileMenu.add(saveChar);
        fileMenu.addSeparator();
        fileMenu.add(close);

        newChar.addActionListener(this);
        openChar.addActionListener(this);
        saveChar.addActionListener(this);
        close.addActionListener(this);

        menus.add(fileMenu);
        setJMenuBar(menus);

        // Items inside CharacterSheet

        charName = new JLabel();
        charRace = new JLabel();
        charClass = new JLabel();

        charName.setBounds(50,20,70,15);
        charRace.setBounds(50,55,70,15);
        charClass.setBounds(50,90,70,15);

        getContentPane().add(charName);
        getContentPane().add(charRace);
        getContentPane().add(charClass);

        setVisible(true);
        setSize(1920, 1080);

//        Race race = new HalfOrc();
//        CharacterClass paladin = new Paladin();
//
//        // Test Character For Saving/Loading
//        character = new Character("Terry", // Name
//                "Neutral", // Ethical Align
//                "Evil", // Moral Align
//                race,
//                paladin,
//                1, // Level
//                0, // Exp
//                new int[] { 3, 3, 3, 3, 3, 3 }, // Stats
//                new int[] { 0, 0, 0, 0, 0, 0 }); // Modifiers


        //test Character
    	String name = "Biff";
        String ethicalAlign = "C";
        String moralAlign = "N";
        Race race = new HalfElf();
        CharacterClass charClass = new Rogue();
        int level = 3;
        int exp = 0;
        int[] stats = {10,10,10,10,10,15};
        int[] mods = {0,0,0,0,0,2}; 
        String skills = "SurvivalReligionAcrobatics";
        String background = "Acolyte"; 
        String traits = "trait1, trait2";
        String ideals = "ideals are cool"; 
        String bonds = "bonded to none";
        String flaws = "not cool enough"; 
        int armor = 16;
        int maxHP = 24; 
        String features = "cool aura";
        String profs = "martial, simple, and ranged weapons"; 
        String equipment = "greataxe and rapier";
        String player = "Nick";
        
        tempChar = new DNDChar(name, ethicalAlign, moralAlign, 
                				   race, charClass, level, exp, 
                				   stats, mods, skills, background, 
                				   traits, ideals, bonds, flaws, 
                				   armor, maxHP, features, profs, 
                				   equipment, player);
        
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == openChar) {
            // Code for opening a character
            JFileChooser sel = new JFileChooser();
            int status = sel.showOpenDialog(null);
            if (status == JFileChooser.APPROVE_OPTION) {
                String path;
                try {
                    path = sel.getSelectedFile().getCanonicalPath();
                    try (FileInputStream file = new FileInputStream(path);
                            ObjectInputStream in = new ObjectInputStream(file);) {

                        DNDChar temp = (DNDChar) in.readObject();
                        charName.setText(temp.getName());
                        charRace.setText(temp.getRace().getName());
                        charClass.setText(temp.getCharClass().getName());
                        //saveChar.setEnabled(true);
                    }

                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }

        if (src == saveChar) {
            // Code for saving a character
            try (FileOutputStream file = new FileOutputStream("ExampleChars/" + tempChar.getName() + ".char");
                    ObjectOutputStream out = new ObjectOutputStream(file);) {

                out.writeObject(tempChar);
            }

            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (src == close) {
            // Code for closing the program
            System.exit(1);
        }

    }

    public static void main(String[] args) {
        new CharacterSheet();
    }
}