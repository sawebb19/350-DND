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
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;


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

    private DNDChar dndChar;
    private JTextField strStat;
    private JTextField dexStat;
    private JTextField conStat;
    private JTextField intStat;
    private JTextField wisStat;
    private JTextField chaStat;
    private JTextField strMod;
    private JTextField dexMod;
    private JTextField conMod;
    private JTextField intMod;
    private JTextField wisMod;
    private JTextField chaMod;
    private JTextField textField;
    private JTextField strSaveMod;
    private JLabel dexSave;
    private JTextField dexSaveMod;
    private JRadioButton dexSaveRad;
    private JLabel conSave;
    private JTextField conSaveMod;
    private JRadioButton conSaveRad;
    private JLabel intSave;
    private JTextField intSaveMod;
    private JRadioButton intSaveRad;
    private JLabel wisSave;
    private JTextField wisSaveMod;
    private JRadioButton wisSaveRad;
    private JLabel chaSave;
    private JTextField chaSaveMod;
    private JRadioButton chaSaveRad;
    private JLabel SavThroLabel;
    private JLabel strStatLabel;
    private JLabel dexStatLabel;
    private JLabel conStatLabel;
    private JLabel intStatLabel;
    private JLabel wisStatLabel;
    private JLabel chaStatLabel;
    private JTextField classLvl;
    private JTextField raceText;
    private JTextField bgText;
    private JLabel bgLabel;
    private JTextField alignText;
    private JLabel AlignLabel;
    private JTextField pName;
    private JLabel pNameLabel;
    private JTextField xpText;
    private JLabel xpLabel;

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

        charName = new JLabel("Character Name");
        charName.setBounds(58,77,98,15);
        getContentPane().add(charName);
        
        charRace = new JLabel("Race");
        charRace.setBounds(346,97,70,15);
        getContentPane().add(charRace);
        
        charClass = new JLabel("Class & Level");
        charClass.setBounds(346,46,84,15);
        getContentPane().add(charClass);
        
        
        
        getContentPane().setLayout(null);
        
        strStat = new JTextField();
        strStat.setBackground(new Color(255, 255, 255));
        strStat.setEditable(false);
        strStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        strStat.setBounds(35, 137, 60, 70);
        getContentPane().add(strStat);
        strStat.setColumns(10);
        
        dexStat = new JTextField();
        dexStat.setBackground(Color.WHITE);
        dexStat.setEditable(false);
        dexStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        dexStat.setColumns(10);
        dexStat.setBounds(35, 246, 60, 70);
        getContentPane().add(dexStat);
        
        conStat = new JTextField();
        conStat.setBackground(new Color(255, 255, 255));
        conStat.setEditable(false);
        conStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        conStat.setColumns(10);
        conStat.setBounds(35, 356, 60, 70);
        getContentPane().add(conStat);
        
        intStat = new JTextField();
        intStat.setBackground(new Color(255, 255, 255));
        intStat.setEditable(false);
        intStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        intStat.setColumns(10);
        intStat.setBounds(35, 466, 60, 70);
        getContentPane().add(intStat);
        
        wisStat = new JTextField();
        wisStat.setBackground(new Color(255, 255, 255));
        wisStat.setEditable(false);
        wisStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        wisStat.setColumns(10);
        wisStat.setBounds(35, 576, 60, 70);
        getContentPane().add(wisStat);
        
        chaStat = new JTextField();
        chaStat.setBackground(new Color(255, 255, 255));
        chaStat.setEditable(false);
        chaStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        chaStat.setColumns(10);
        chaStat.setBounds(35, 686, 60, 70);
        getContentPane().add(chaStat);
        
        strMod = new JTextField();
        strMod.setBackground(new Color(255, 255, 255));
        strMod.setEditable(false);
        strMod.setBounds(50, 205, 30, 30);
        getContentPane().add(strMod);
        strMod.setColumns(10);
        
        dexMod = new JTextField();
        dexMod.setBackground(Color.WHITE);
        dexMod.setEditable(false);
        dexMod.setColumns(10);
        dexMod.setBounds(50, 315, 30, 30);
        getContentPane().add(dexMod);
        
        conMod = new JTextField();
        conMod.setBackground(new Color(255, 255, 255));
        conMod.setEditable(false);
        conMod.setColumns(10);
        conMod.setBounds(50, 425, 30, 30);
        getContentPane().add(conMod);
        
        intMod = new JTextField();
        intMod.setBackground(new Color(255, 255, 255));
        intMod.setEditable(false);
        intMod.setColumns(10);
        intMod.setBounds(50, 535, 30, 30);
        getContentPane().add(intMod);
        
        wisMod = new JTextField();
        wisMod.setBackground(new Color(255, 255, 255));
        wisMod.setEditable(false);
        wisMod.setColumns(10);
        wisMod.setBounds(50, 645, 30, 30);
        getContentPane().add(wisMod);
        
        chaMod = new JTextField();
        chaMod.setBackground(new Color(255, 255, 255));
        chaMod.setEditable(false);
        chaMod.setColumns(10);
        chaMod.setBounds(50, 755, 30, 30);
        getContentPane().add(chaMod);
        
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setEditable(false);
        textField.setBounds(48, 33, 246, 41);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JRadioButton strSaveRad = new JRadioButton("");
        strSaveRad.setBounds(154, 192, 20, 20);
        getContentPane().add(strSaveRad);
        
        strSaveMod = new JTextField();
        strSaveMod.setEditable(false);
        strSaveMod.setBackground(UIManager.getColor("Button.background"));
        strSaveMod.setBounds(181, 192, 20, 20);
        getContentPane().add(strSaveMod);
        strSaveMod.setColumns(10);
        
        JLabel strSave = new JLabel("Strength");
        strSave.setBounds(209, 192, 85, 20);
        getContentPane().add(strSave);
        
        dexSave = new JLabel("Dexterity");
        dexSave.setBounds(209, 219, 85, 20);
        getContentPane().add(dexSave);
        
        dexSaveMod = new JTextField();
        dexSaveMod.setEditable(false);
        dexSaveMod.setColumns(10);
        dexSaveMod.setBackground(SystemColor.menu);
        dexSaveMod.setBounds(181, 219, 20, 20);
        getContentPane().add(dexSaveMod);
        
        dexSaveRad = new JRadioButton("");
        dexSaveRad.setBounds(154, 219, 20, 20);
        getContentPane().add(dexSaveRad);
        
        conSave = new JLabel("Constitution");
        conSave.setBounds(209, 246, 85, 20);
        getContentPane().add(conSave);
        
        conSaveMod = new JTextField();
        conSaveMod.setEditable(false);
        conSaveMod.setColumns(10);
        conSaveMod.setBackground(SystemColor.menu);
        conSaveMod.setBounds(181, 246, 20, 20);
        getContentPane().add(conSaveMod);
        
        conSaveRad = new JRadioButton("");
        conSaveRad.setBounds(154, 246, 20, 20);
        getContentPane().add(conSaveRad);
        
        intSave = new JLabel("Intelligence");
        intSave.setBounds(209, 273, 85, 20);
        getContentPane().add(intSave);
        
        intSaveMod = new JTextField();
        intSaveMod.setEditable(false);
        intSaveMod.setColumns(10);
        intSaveMod.setBackground(SystemColor.menu);
        intSaveMod.setBounds(181, 273, 20, 20);
        getContentPane().add(intSaveMod);
        
        intSaveRad = new JRadioButton("");
        intSaveRad.setBounds(154, 273, 20, 20);
        getContentPane().add(intSaveRad);
        
        wisSave = new JLabel("Wisdom");
        wisSave.setBounds(209, 300, 85, 20);
        getContentPane().add(wisSave);
        
        wisSaveMod = new JTextField();
        wisSaveMod.setEditable(false);
        wisSaveMod.setColumns(10);
        wisSaveMod.setBackground(SystemColor.menu);
        wisSaveMod.setBounds(181, 300, 20, 20);
        getContentPane().add(wisSaveMod);
        
        wisSaveRad = new JRadioButton("");
        wisSaveRad.setBounds(154, 300, 20, 20);
        getContentPane().add(wisSaveRad);
        
        chaSave = new JLabel("Charisma");
        chaSave.setBounds(209, 327, 85, 20);
        getContentPane().add(chaSave);
        
        chaSaveMod = new JTextField();
        chaSaveMod.setEditable(false);
        chaSaveMod.setColumns(10);
        chaSaveMod.setBackground(SystemColor.menu);
        chaSaveMod.setBounds(181, 327, 20, 20);
        getContentPane().add(chaSaveMod);
        
        chaSaveRad = new JRadioButton("");
        chaSaveRad.setBounds(154, 327, 20, 20);
        getContentPane().add(chaSaveRad);
        
        
        JSeparator SaveBox1 = new JSeparator();
        SaveBox1.setBounds(141, 176, 165, 2);
        getContentPane().add(SaveBox1);
        
        JSeparator SaveBox2 = new JSeparator();
        SaveBox2.setBounds(141, 376, 165, 2);
        getContentPane().add(SaveBox2);
        
        JSeparator SaveBox3 = new JSeparator();
        SaveBox3.setOrientation(SwingConstants.VERTICAL);
        SaveBox3.setBounds(140, 176, 2, 200);
        getContentPane().add(SaveBox3);
        
        JSeparator SaveBox4 = new JSeparator();
        SaveBox4.setOrientation(SwingConstants.VERTICAL);
        SaveBox4.setBounds(306, 176, 2, 200);
        getContentPane().add(SaveBox4);
        
        SavThroLabel = new JLabel("Saving Throws");
        SavThroLabel.setBounds(191, 358, 91, 14);
        getContentPane().add(SavThroLabel);
        
        strStatLabel = new JLabel("Strength");
        strStatLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        strStatLabel.setBounds(45, 124, 50, 15);
        strStatLabel.repaint();
        getContentPane().add(strStatLabel);
        
        dexStatLabel = new JLabel("Dexterity");
        dexStatLabel.setBounds(45, 230, 85, 20);
        getContentPane().add(dexStatLabel);
        
        conStatLabel = new JLabel("Constitution");
        conStatLabel.setBounds(36, 341, 85, 20);
        getContentPane().add(conStatLabel);
        
        intStatLabel = new JLabel("Intelligence");
        intStatLabel.setBounds(38, 450, 85, 20);
        getContentPane().add(intStatLabel);
        
        wisStatLabel = new JLabel("Wisdom");
        wisStatLabel.setBounds(47, 561, 85, 20);
        getContentPane().add(wisStatLabel);
        
        chaStatLabel = new JLabel("Charisma");
        chaStatLabel.setBounds(44, 671, 85, 20);
        getContentPane().add(chaStatLabel);
        
        classLvl = new JTextField();
        classLvl.setBackground(new Color(255, 255, 255));
        classLvl.setEditable(false);
        classLvl.setBounds(344, 11, 178, 34);
        getContentPane().add(classLvl);
        classLvl.setColumns(10);
        
        raceText = new JTextField();
        raceText.setEditable(false);
        raceText.setColumns(10);
        raceText.setBackground(Color.WHITE);
        raceText.setBounds(344, 60, 178, 34);
        getContentPane().add(raceText);
        
        bgText = new JTextField();
        bgText.setEditable(false);
        bgText.setColumns(10);
        bgText.setBackground(Color.WHITE);
        bgText.setBounds(547, 11, 178, 34);
        getContentPane().add(bgText);
        
        bgLabel = new JLabel("Background");
        bgLabel.setBounds(549, 46, 84, 15);
        getContentPane().add(bgLabel);
        
        alignText = new JTextField();
        alignText.setEditable(false);
        alignText.setColumns(10);
        alignText.setBackground(Color.WHITE);
        alignText.setBounds(547, 60, 178, 34);
        getContentPane().add(alignText);
        
        AlignLabel = new JLabel("Alignment");
        AlignLabel.setBounds(549, 97, 70, 15);
        getContentPane().add(AlignLabel);
        
        pName = new JTextField();
        pName.setEditable(false);
        pName.setColumns(10);
        pName.setBackground(Color.WHITE);
        pName.setBounds(752, 11, 178, 34);
        getContentPane().add(pName);
        
        pNameLabel = new JLabel("Player Name");
        pNameLabel.setBounds(754, 46, 84, 15);
        getContentPane().add(pNameLabel);
        
        xpText = new JTextField();
        xpText.setEditable(false);
        xpText.setColumns(10);
        xpText.setBackground(Color.WHITE);
        xpText.setBounds(752, 60, 178, 34);
        getContentPane().add(xpText);
        
        xpLabel = new JLabel("Experience Points");
        xpLabel.setBounds(754, 97, 113, 15);
        getContentPane().add(xpLabel);

        

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
        
        dndChar = new DNDChar(name, ethicalAlign, moralAlign, 
                				   race, charClass, level, exp, 
                				   stats, skills, background, 
                				   traits, ideals, bonds, flaws, 
                				   armor, maxHP, features, profs, 
                				   equipment, player);
        
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src == close) {
            // Code for closing the program
            System.exit(1);
        }
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

            try (FileOutputStream file = new FileOutputStream("ExampleChars/" + dndChar.getName() + ".char");
            		ObjectOutputStream out = new ObjectOutputStream(file);) {
            	out.writeObject(dndChar);
            }

            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        
    }

    public static void main(String[] args) {
        new CharacterSheet();
    }
}