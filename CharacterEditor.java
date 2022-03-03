package DNDCompanion;

import DNDCompanion.character.*;
import DNDCompanion.character.chrclasses.*;
import DNDCompanion.character.chrraces.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

//import javax.swing.BorderFactory;
import javax.swing.*;

/**
 * GUI Class for displaying a DndChar object for editting.

 * @author Nick Ford
 *
 */
@SuppressWarnings("serial")
public class CharacterEditor extends JFrame implements ActionListener {

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem close;
    private JMenu windowMenu;
    private JMenuItem switchWindow;
    
    private JLabel charNameLabel;
    private JLabel classLabel;
    private JLabel raceLabel;
    private JLabel playerNameLabel;
    private JLabel bgLabel;
    private JLabel xpLabel;
    private JLabel subraceLabel;
    private JLabel alignmentLabel;
    private JLabel skillsLabel;
    private JLabel strLabel;
    private JLabel dexLabel;
    private JLabel conLabel;
    private JLabel intLabel;
    private JLabel wisLabel;
    private JLabel chaLabel;
    private JLabel traitsLabel;
    private JLabel idealsLabel;
    private JLabel bondsLabel;
    private JLabel flawsLabel;
    private JLabel featuresLabel;
    private JLabel equipLabel;
    private JLabel profLabel;
    private JLabel evilLabel;
    
    private JTextField charNameText;
    private JTextField bgText;
    private JTextField xpText;
    private JTextField playerNameText;
    private JTextField strText;
    private JTextField dexText;
    private JTextField conText;
    private JTextField intText;
    private JTextField wisText;
    private JTextField chaText;
    private JTextField acText;
    private JTextField hpText;
    
    private JComboBox<String> raceBox;
    private JComboBox<String> subraceBox;
    private JComboBox<String> classBox;
    private JComboBox<String> lvlBox;
    
    private JTextArea idealsTextArea;
    private JTextArea bondsTextArea;
    private JTextArea flawsTextArea;
    private JTextArea traitsTextArea;
    private JTextArea featuresTextArea;
    private JTextArea equipTextArea;
    private JTextArea profTextArea;
    
    private JRadioButton skillRadio1;
    private JRadioButton skillRadio2;
    private JRadioButton skillRadio3;
    private JRadioButton skillRadio4;
    private JRadioButton skillRadio5;
    private JRadioButton skillRadio6;
    private JRadioButton skillRadio7;
    private JRadioButton skillRadio8;
    private JRadioButton skillRadio9;
    private JRadioButton skillRadio10;
    private JRadioButton skillRadio11;
    private JRadioButton skillRadio12;
    private JRadioButton skillRadio13;
    private JRadioButton skillRadio14;
    private JRadioButton skillRadio15;
    private JRadioButton skillRadio16;
    private JRadioButton skillRadio17;
    private JRadioButton skillRadio18;
    
    private ButtonGroup alignGroup;
    private JRadioButton alignRadioLG;
    private JRadioButton alignRadioLN;
    private JRadioButton alignRadioLE;
    private JRadioButton alignRadioNG;
    private JRadioButton alignRadioNN;
    private JRadioButton alignRadioNE;
    private JRadioButton alignRadioCG;
    private JRadioButton alignRadioCN;
    private JRadioButton alignRadioCE;
    
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;

    /**
     * 
     */
    public CharacterEditor() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        openChar = new JMenuItem("Open Character");
        saveChar = new JMenuItem("Save Character");
        close = new JMenuItem("Close");
        
        fileMenu.add(openChar);
        fileMenu.add(saveChar);
        fileMenu.addSeparator();
        fileMenu.add(close);
        
        windowMenu = new JMenu("Window");
        switchWindow = new JMenuItem("Switch View");
        
        
        windowMenu.add(switchWindow);

        openChar.addActionListener(this);
        saveChar.addActionListener(this);
        close.addActionListener(this);
        switchWindow.addActionListener(this);

        menus.add(fileMenu);
        menus.add(windowMenu);
        setJMenuBar(menus);
        
        charNameText = new JTextField();
        charNameText.setBounds(455, 89, 273, 34);
        getContentPane().add(charNameText);
        charNameText.setColumns(10);
        
        charNameLabel = new JLabel("Character Name");
        charNameLabel.setBounds(455, 74, 117, 14);
        getContentPane().add(charNameLabel);
        
        classLabel = new JLabel("Class & Lvl");
        classLabel.setBounds(456, 132, 70, 14);
        getContentPane().add(classLabel);
        
        String[] classChoice = {"", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", 
        		"Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        classBox = new JComboBox<>(classChoice);
        classBox.setBounds(456, 147, 85, 25);
        classBox.setSelectedIndex(0);
        getContentPane().add(classBox);
        
        String[] lvlChoice = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        		"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        lvlBox = new JComboBox<>(lvlChoice);
        lvlBox.setBounds(540, 147, 40, 25);
        lvlBox.setSelectedIndex(0);
        getContentPane().add(lvlBox);
        
        String[] raceChoice = {"", "Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", 
        		"Half-Orc", "Human", "Tiefling"};
        raceBox = new JComboBox<>(raceChoice);
        raceBox.setBounds(604, 147, 124, 25);
        raceBox.addActionListener(this);
        getContentPane().add(raceBox);
        
        subraceBox = new JComboBox<>(new String[]{""});
        subraceBox.setBounds(604, 198, 124, 25);
        getContentPane().add(subraceBox);
        
        raceLabel = new JLabel("Race");
        raceLabel.setBounds(604, 132, 56, 14);
        getContentPane().add(raceLabel);
        
        playerNameLabel = new JLabel("Player Name");
        playerNameLabel.setBounds(455, 234, 86, 14);
        getContentPane().add(playerNameLabel);
        
        
        playerNameText = new JTextField();
        playerNameText.setBounds(455, 249, 125, 25);
        getContentPane().add(playerNameText);
        
        bgLabel = new JLabel("Background");
        bgLabel.setBounds(604, 234, 83, 14);
        getContentPane().add(bgLabel);
        
        bgText = new JTextField();
        bgText.setColumns(10);
        bgText.setBounds(604, 249, 124, 25);
        getContentPane().add(bgText);
        
        xpLabel = new JLabel("Experience");
        xpLabel.setBounds(455, 183, 84, 14);
        getContentPane().add(xpLabel);
        
        xpText = new JTextField();
        xpText.setColumns(10);
        xpText.setBounds(455, 198, 125, 25);
        getContentPane().add(xpText);
        
        subraceLabel = new JLabel("Subrace");
        subraceLabel.setBounds(604, 183, 83, 14);
        getContentPane().add(subraceLabel);
        
        //separating alignment from skills
        separator1 = new JSeparator(SwingConstants.VERTICAL);
        separator1.setBounds(958, 181, 2, 177);
        getContentPane().add(separator1);
        
        //Skills header and radio buttons for each skill
        skillsLabel = new JLabel("Skills");
        skillsLabel.setBounds(1121, 183, 46, 14);
        getContentPane().add(skillsLabel);
        
        skillRadio1 = new JRadioButton("Acrobatics");
        skillRadio1.setBounds(984, 205, 109, 23);
        getContentPane().add(skillRadio1);
        
        skillRadio2 = new JRadioButton("Animal Handling");
        skillRadio2.setBounds(984, 231, 117, 23);
        getContentPane().add(skillRadio2);
        
        skillRadio3 = new JRadioButton("Arcana");
        skillRadio3.setBounds(984, 257, 109, 23);
        getContentPane().add(skillRadio3);
        
        skillRadio4 = new JRadioButton("Athletics");
        skillRadio4.setBounds(984, 283, 109, 23);
        getContentPane().add(skillRadio4);
        
        skillRadio5 = new JRadioButton("Deception");
        skillRadio5.setBounds(984, 309, 109, 23);
        getContentPane().add(skillRadio5);
        
        skillRadio6 = new JRadioButton("History");
        skillRadio6.setBounds(984, 335, 109, 23);
        getContentPane().add(skillRadio6);

        skillRadio7 = new JRadioButton("Insight");
        skillRadio7.setBounds(1103, 205, 109, 23);
        getContentPane().add(skillRadio7);
        
        skillRadio8 = new JRadioButton("Intimidation");
        skillRadio8.setBounds(1103, 231, 109, 23);
        getContentPane().add(skillRadio8);
        
        skillRadio9 = new JRadioButton("Investigation");
        skillRadio9.setBounds(1103, 257, 109, 23);
        getContentPane().add(skillRadio9);
        
        skillRadio10 = new JRadioButton("Medicine");
        skillRadio10.setBounds(1103, 283, 109, 23);
        getContentPane().add(skillRadio10);
        
        skillRadio11 = new JRadioButton("Nature");
        skillRadio11.setBounds(1103, 309, 109, 23);
        getContentPane().add(skillRadio11);
        
        skillRadio12 = new JRadioButton("Perception");
        skillRadio12.setBounds(1103, 335, 109, 23);
        getContentPane().add(skillRadio12);
        
        skillRadio13 = new JRadioButton("Performance");
        skillRadio13.setBounds(1214, 205, 109, 23);
        getContentPane().add(skillRadio13);
        
        skillRadio14 = new JRadioButton("Persuasion");
        skillRadio14.setBounds(1214, 231, 109, 23);
        getContentPane().add(skillRadio14);
        
        skillRadio15 = new JRadioButton("Religion");
        skillRadio15.setBounds(1214, 257, 109, 23);
        getContentPane().add(skillRadio15);
        
        skillRadio16 = new JRadioButton("Sleight of Hand");
        skillRadio16.setBounds(1214, 283, 117, 23);
        getContentPane().add(skillRadio16);
        
        skillRadio17 = new JRadioButton("Stealth");
        skillRadio17.setBounds(1214, 309, 109, 23);
        getContentPane().add(skillRadio17);
        
        skillRadio18 = new JRadioButton("Survival");
        skillRadio18.setBounds(1214, 335, 109, 23);
        getContentPane().add(skillRadio18);
        
        //Alignment header + radio button for each align.
        alignmentLabel = new JLabel("Alignment");
        alignmentLabel.setBounds(827, 183, 70, 14);
        getContentPane().add(alignmentLabel);
        
        alignGroup = new ButtonGroup();
        
        alignRadioLG = new JRadioButton();
        alignRadioLG.setBounds(797, 220, 20, 23);
        getContentPane().add(alignRadioLG);
        alignGroup.add(alignRadioLG);
        
        alignRadioLN = new JRadioButton();
        alignRadioLN.setBounds(797, 270, 20, 23);
        getContentPane().add(alignRadioLN);
        alignGroup.add(alignRadioLN);
        
        alignRadioLE = new JRadioButton();
        alignRadioLE.setBounds(797, 320, 20, 23);
        getContentPane().add(alignRadioLE);
        alignGroup.add(alignRadioLE);
        
        alignRadioNG = new JRadioButton();
        alignRadioNG.setBounds(847, 220, 20, 23);
        getContentPane().add(alignRadioNG);
        alignGroup.add(alignRadioNG);
        
        alignRadioNN = new JRadioButton();
        alignRadioNN.setBounds(847, 270, 20, 23);
        getContentPane().add(alignRadioNN);
        alignGroup.add(alignRadioNN);
        
        alignRadioNE = new JRadioButton();
        alignRadioNE.setBounds(847, 320, 20, 23);
        getContentPane().add(alignRadioNE);
        alignGroup.add(alignRadioNE);
        
        alignRadioCG = new JRadioButton();
        alignRadioCG.setBounds(897, 220, 20, 23);
        getContentPane().add(alignRadioCG);
        alignGroup.add(alignRadioCG);
        
        alignRadioCN = new JRadioButton();
        alignRadioCN.setBounds(897, 270, 20, 23);
        getContentPane().add(alignRadioCN);
        alignGroup.add(alignRadioCN);
        
        alignRadioCE = new JRadioButton();
        alignRadioCE.setBounds(897, 320, 20, 23);
        getContentPane().add(alignRadioCE);
        alignGroup.add(alignRadioCE);
        
        //separate skills from stats
        separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setBounds(759, 170, 595, 2);
        getContentPane().add(separator2);
        
        //stat display/input
        strText = new JTextField();
        strText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        strText.setBounds(808, 114, 40, 32);
        getContentPane().add(strText);
        strText.setColumns(10);
        
        dexText = new JTextField();
        dexText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        dexText.setColumns(10);
        dexText.setBounds(858, 114, 40, 32);
        getContentPane().add(dexText);
        
        conText = new JTextField();
        conText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        conText.setColumns(10);
        conText.setBounds(908, 114, 40, 32);
        getContentPane().add(conText);
        
        intText = new JTextField();
        intText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        intText.setColumns(10);
        intText.setBounds(958, 114, 40, 32);
        getContentPane().add(intText);
        
        wisText = new JTextField();
        wisText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        wisText.setColumns(10);
        wisText.setBounds(1008, 114, 40, 32);
        getContentPane().add(wisText);
        
        chaText = new JTextField();
        chaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        chaText.setColumns(10);
        chaText.setBounds(1058, 114, 40, 32);
        getContentPane().add(chaText);
        
        strLabel = new JLabel("STR");
        strLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        strLabel.setBounds(808, 97, 40, 14);
        getContentPane().add(strLabel);
        
        dexLabel = new JLabel("DEX");
        dexLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        dexLabel.setBounds(858, 97, 40, 14);
        getContentPane().add(dexLabel);
        
        conLabel = new JLabel("CON");
        conLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conLabel.setBounds(908, 97, 40, 14);
        getContentPane().add(conLabel);
        
        intLabel = new JLabel("INT");
        intLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        intLabel.setBounds(958, 97, 40, 14);
        getContentPane().add(intLabel);
        
        wisLabel = new JLabel("WIS");
        wisLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        wisLabel.setBounds(1008, 97, 40, 14);
        getContentPane().add(wisLabel);
        
        chaLabel = new JLabel("CHA");
        chaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chaLabel.setBounds(1058, 97, 40, 14);
        getContentPane().add(chaLabel);
        

  
        separator3 = new JSeparator(SwingConstants.VERTICAL);
        separator3.setBounds(749, 73, 2, 626);
        getContentPane().add(separator3);
        
        traitsTextArea = new JTextArea();
        traitsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        traitsTextArea.setWrapStyleWord(true);
        traitsTextArea.setLineWrap(true);
        traitsTextArea.setBounds(455, 320, 273, 80);
//        TraitsTextArea.createRaisedBevelBorder();
        getContentPane().add(traitsTextArea);
        
        idealsTextArea = new JTextArea();
        idealsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        idealsTextArea.setWrapStyleWord(true);
        idealsTextArea.setLineWrap(true);
        idealsTextArea.setBounds(455, 427, 273, 80);
        getContentPane().add(idealsTextArea);
        
        bondsTextArea = new JTextArea();
        bondsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        bondsTextArea.setWrapStyleWord(true);
        bondsTextArea.setLineWrap(true);
        bondsTextArea.setBounds(455, 534, 273, 80);
        getContentPane().add(bondsTextArea);
        
        flawsTextArea = new JTextArea();
        flawsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        flawsTextArea.setWrapStyleWord(true);
        flawsTextArea.setLineWrap(true);
        flawsTextArea.setBounds(455, 641, 272, 80);
        getContentPane().add(flawsTextArea);
        
        traitsLabel = new JLabel("Personality Traits");
        traitsLabel.setBounds(455, 304, 100, 14);
        getContentPane().add(traitsLabel);
        
        idealsLabel = new JLabel("Ideals");
        idealsLabel.setBounds(455, 411, 46, 14);
        getContentPane().add(idealsLabel);
        
        bondsLabel = new JLabel("Bonds");
        bondsLabel.setBounds(455, 518, 46, 14);
        getContentPane().add(bondsLabel);
        
        flawsLabel = new JLabel("Flaws");
        flawsLabel.setBounds(455, 625, 46, 14);
        getContentPane().add(flawsLabel);
        
        acText = new JTextField();
        acText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        acText.setColumns(10);
        acText.setBounds(1208, 114, 40, 32);
        getContentPane().add(acText);
        
        JLabel acLabel = new JLabel("AC");
        acLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        acLabel.setBounds(1208, 97, 40, 14);
        getContentPane().add(acLabel);
        
        hpText = new JTextField();
        hpText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        hpText.setColumns(10);
        hpText.setBounds(1258, 114, 40, 32);
        getContentPane().add(hpText);
        
        JLabel hpLabel = new JLabel("MAX\r\n HP");
        hpLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        hpLabel.setBounds(1256, 98, 61, 14);
        getContentPane().add(hpLabel);
        
        featuresTextArea = new JTextArea();
        featuresTextArea.setWrapStyleWord(true);
        featuresTextArea.setLineWrap(true);
        featuresTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        featuresTextArea.setBounds(769, 397, 185, 324);
        getContentPane().add(featuresTextArea);
        
        featuresLabel = new JLabel("Features & Traits");
        featuresLabel.setBounds(817, 381, 100, 14);
        getContentPane().add(featuresLabel);
        
        equipLabel = new JLabel("Equipment");
        equipLabel.setBounds(1248, 381, 69, 14);
        getContentPane().add(equipLabel);
        
        equipTextArea = new JTextArea();
        equipTextArea.setWrapStyleWord(true);
        equipTextArea.setLineWrap(true);
        equipTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        equipTextArea.setBounds(1179, 397, 185, 324);
        getContentPane().add(equipTextArea);
        
        profTextArea = new JTextArea();
        profTextArea.setWrapStyleWord(true);
        profTextArea.setLineWrap(true);
        profTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        profTextArea.setBounds(974, 397, 185, 324);
        getContentPane().add(profTextArea);
        
        profLabel = new JLabel("Proficiencies");
        profLabel.setBounds(1037, 381, 77, 14);
        getContentPane().add(profLabel);
        
        separator4 = new JSeparator(SwingConstants.HORIZONTAL);
        separator4.setBounds(759, 368, 595, 2);
        getContentPane().add(separator4);
        
        
        JLabel goodLabel = new JLabel("Good");
        goodLabel.setBounds(795, 203, 46, 14);
        getContentPane().add(goodLabel);
        
        JLabel lawfulLabel = new JLabel("Lawful");
        lawfulLabel.setBounds(754, 224, 46, 14);
        getContentPane().add(lawfulLabel);
        
        JLabel neutralLawLabel = new JLabel("Neutral");
        neutralLawLabel.setBounds(754, 274, 46, 14);
        getContentPane().add(neutralLawLabel);
        
        JLabel chaoticLabel = new JLabel("Chaotic");
        chaoticLabel.setBounds(754, 324, 46, 14);
        getContentPane().add(chaoticLabel);
        
        JLabel neutralMoralLabel = new JLabel("Neutral");
        neutralMoralLabel.setBounds(840, 203, 46, 14);
        getContentPane().add(neutralMoralLabel);
        
        evilLabel = new JLabel("Evil");
        evilLabel.setBounds(900, 203, 46, 14);
        getContentPane().add(evilLabel);
        
        
//      JFrame.setLocationRelativeTo(null);
//        pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
//        setSize(1920,1000);
        getContentPane().setLayout(null);
    }

    
    /** 
     * @param e
     */
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        if (src == close){
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

                        DndChar temp = (DndChar) in.readObject();
                        
                        //character name
                        charNameText.setText(temp.getName());
                        
                        //character race
                        String race = temp.getRace().getName(); 
                        int n;
                        
                        switch(race) {
                        	default:
                        	case "": 
                        		n=0; 
                        		break;
                        	case "Dragonborn": 
                        		n=1; 
                        		break; //no subrace
                        	case "Dwarf": 
                        		n=2; 
                        		break;
                        	case "Elf": 
                        		n=3; 
                        		break;
                        	case "Gnome": 
                        		n=4; 
                        		break;
                        	case "Half-Elf": 
                        		n=5; 
                        		break; //no subrace
                        	case "Halfling": 
                        		n=6; 
                        		break;
                        	case "Half-Orc": 
                        		n=7; 
                        		break; //no subrace
                        	case "Human": 
                        		n=8; 
                        		break; 
                        	case "Tiefling": 
                        		n=9; 
                        		break; //no subrace
                        }
                        raceBox.setSelectedIndex(n);
                        //checks for subraces and sets up the comboBox if applicable
                        String[] subraces;
                        switch(n) {
                        	default:
                        	case 0:
                        	case 1:
                        	case 5:
                        	case 7:
                        	case 9:
                        		subraces = new String[] {"N/A"}; break;
                        	case 2: 
                        		subraces = new String[] {"", "Hill Dwarf", "Mountain Dwarf"}; 
                        		break;
                        	case 3: 
                        		subraces = new String[] {"", "High Elf", "Wood Elf"}; 
                        		break;
                        	case 4: 
                        		subraces = new String[] {"", "Deep Gnome", "Rock Gnome"}; 
                        		break;
                        	case 6: 
                        		subraces = new String[] {"", "Lightfoot Halfling", "Stout Halfling"}; 
                        		break;
                        	case 8: 
                        		subraces = new String[] {"", "Calishite", "Chondathan", "Damaran",
                        				"Illuskan", "Mulan", "Rashemi", "Shou", "Tethyrian",
                        				"Turami"}; 
                        		break;
                        }
                        	
                        	subraceBox = new JComboBox<>(subraces);
                        	subraceBox.setSelectedIndex(subraceBox.getSelectedIndex());
                        
                        
                        //character class
                        String pClass = temp.getCharClass().getName(); 
                        switch(pClass) {
                        	default:
                        	case "": 
                        		n=0; 
                        		break;
                        	case "Barbarian": 
                        		n=1; 
                        		break; 
                        	case "Bard": 
                        		n=2; 
                        		break;
                        	case "Cleric": 
                        		n=3; 
                        		break;
                        	case "Druid": 
                        		n=4; 
                        		break;
                        	case "Fighter": 
                        		n=5; 
                        		break; 
                        	case "Monk": 
                        		n=6; 
                        		break;
                        	case "Paladin": 
                        		n=7; 
                        		break; 
                        	case "Ranger": 
                        		n=8; 
                        		break; 
                        	case "Rogue": 
                        		n=9; 
                        		break;
                        	case "Sorcerer": 
                        		n=10; 
                        		break; 
                        	case "Warlock": 
                        		n=11; 
                        		break;
                        	case "Wizard": 
                        		n=12; 
                        		break;
                        }
                        classBox.setSelectedIndex(n);
                        
                        //char level
                        lvlBox.setSelectedIndex(temp.getLevel()-1);
                        
                        //char alignment
                        String alignment = temp.getAlignment();
                        switch(alignment) {
                    	default: 
                    		alignGroup.clearSelection(); 
                    		break;
                    	case "LG": 
                    		alignRadioLG.doClick(); 
                    		break;
                    	case "LN": 
                    		alignRadioLN.doClick(); 
                    		break; 
                    	case "LE": 
                    		alignRadioLE.doClick(); 
                    		break;
                    	case "NG": 
                    		alignRadioNG.doClick(); 
                    		break;
                    	case "NN": 
                    		alignRadioNN.doClick(); 
                    		break;
                    	case "NE": 
                    		alignRadioNE.doClick(); 
                    		break; 
                    	case "CG": 
                    		alignRadioCG.doClick(); 
                    		break;
                    	case "CN": 
                    		alignRadioCN.doClick(); 
                    		break; 
                    	case "CE": 
                    		alignRadioCE.doClick(); 
                    		break; 
                        }
                    	
                        //char experience
                    	xpText.setText("" + temp.getExp());
                    	
                    	//skill radios
                    	//deselect all skills
                    	if (skillRadio1.isSelected()) {
                    		skillRadio1.doClick(); 
                    	}
                    	if (skillRadio2.isSelected()) {
                    		skillRadio2.doClick(); 
                    	}
                    	if (skillRadio3.isSelected()) {
                    		skillRadio3.doClick(); 
                    	}
                    	if (skillRadio4.isSelected()) {
                    		skillRadio4.doClick(); 
                    	}
                    	if (skillRadio5.isSelected()) {
                    		skillRadio5.doClick(); 
                    	}
                    	if (skillRadio6.isSelected()) {
                    		skillRadio6.doClick(); 
                    	}
                    	if (skillRadio7.isSelected()) {
                    		skillRadio7.doClick(); 
                    	}
                    	if (skillRadio8.isSelected()) {
                    		skillRadio8.doClick(); 
                    	}
                    	if (skillRadio9.isSelected()) {
                    		skillRadio9.doClick(); 
                    	}
                    	if (skillRadio10.isSelected()) {
                    		skillRadio10.doClick(); 
                    	}
                    	if (skillRadio11.isSelected()) {
                    		skillRadio11.doClick(); 
                    	}
                    	if (skillRadio12.isSelected()) {
                    		skillRadio12.doClick(); 
                    	}
                    	if (skillRadio13.isSelected()) {
                    		skillRadio13.doClick(); 
                    	}
                    	if (skillRadio14.isSelected()) {
                    		skillRadio14.doClick(); 
                    	}
                    	if (skillRadio15.isSelected()) {
                    		skillRadio15.doClick(); 
                    	}
                    	if (skillRadio16.isSelected()) {
                    		skillRadio16.doClick(); 
                    	}
                    	if (skillRadio17.isSelected()) {
                    		skillRadio17.doClick(); 
                    	}
                    	if (skillRadio18.isSelected()) {
                    		skillRadio18.doClick(); 
                    	}
                    	//select right ones
                    	if (temp.getSkills().contains(skillRadio1.getText())) {
                    		skillRadio1.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio2.getText())) {
                    		skillRadio2.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio3.getText())) {
                    		skillRadio3.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio4.getText())) {
                    		skillRadio4.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio5.getText())) {
                    		skillRadio5.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio6.getText())) {
                    		skillRadio6.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio7.getText())) {
                    		skillRadio7.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio8.getText())) {
                    		skillRadio8.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio9.getText())) {
                    		skillRadio9.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio10.getText())) {
                    		skillRadio10.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio11.getText())) {
                    		skillRadio11.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio12.getText())) {
                    		skillRadio12.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio13.getText())) {
                    		skillRadio13.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio14.getText())) {
                    		skillRadio14.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio15.getText())) {
                    		skillRadio15.doClick();
                    	}
                    	if (temp.getSkills().contains(skillRadio16.getText())) {
                    		skillRadio16.doClick();	
                    	}
                    	if (temp.getSkills().contains(skillRadio17.getText())) {
                    		skillRadio17.doClick();	
                    	}	
                    	if (temp.getSkills().contains(skillRadio18.getText())) {
                    		skillRadio18.doClick();
                    	}	
                    	
                    	//all text areas
                        traitsTextArea.setText(temp.getTraits());
                        idealsTextArea.setText(temp.getIdeals());
                        bondsTextArea.setText(temp.getBonds());
                        flawsTextArea.setText(temp.getFlaws());
                        featuresTextArea.setText(temp.getFeatures());
                        equipTextArea.setText(temp.getEquip());
                        profTextArea.setText(temp.getProfs());
                        
                        //set stats
                        strText.setText("" + temp.getStats()[0]);
                        dexText.setText("" + temp.getStats()[1]);
                        conText.setText("" + temp.getStats()[2]);
                        intText.setText("" + temp.getStats()[3]);
                        wisText.setText("" + temp.getStats()[4]);
                        chaText.setText("" + temp.getStats()[5]);
                        
                        //set ac 
                        acText.setText("" + temp.getArmor());
                        
                        //set max HP
                        hpText.setText("" + temp.getMaxHp());
                        
                        playerNameText.setText(temp.getPlayer());
                        
                        bgText.setText(temp.getBackground());
					}catch (Exception ex){
						JOptionPane.showMessageDialog(null, "Not a valid .char file");

                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
            

        }
        if (src == saveChar) {
        	String ethicalAlign = "";
        	String moralAlign = "";
        	if (alignRadioLG.isSelected()) {
        		ethicalAlign = "L"; 
        		moralAlign = "G"; 
        	}
        	if (alignRadioLN.isSelected()) {
        		ethicalAlign = "L"; 
        		moralAlign = "N"; 
        	}
        	if (alignRadioLE.isSelected()) {
        		ethicalAlign = "L"; 
        		moralAlign = "E"; 
        	}
        	if (alignRadioNG.isSelected()) {
        		ethicalAlign = "N"; 
        		moralAlign = "G"; 
        	}
        	if (alignRadioNN.isSelected()) {
        		ethicalAlign = "N"; 
        		moralAlign = "N"; 
        	}
        	if (alignRadioNE.isSelected()) {
        		ethicalAlign = "N"; 
        		moralAlign = "E"; 
        	}
        	if (alignRadioCG.isSelected()) {
        		ethicalAlign = "C"; 
        		moralAlign = "G"; 
        	}
        	if (alignRadioCN.isSelected()) {
        		ethicalAlign = "C"; 
        		moralAlign = "N"; 
        	}
        	if (alignRadioCE.isSelected()) {
        		ethicalAlign = "C"; 
        		moralAlign = "E"; 
        	}
        	
        	int [] stats;
        	int str;
        	int dex;
        	int con;
        	int intel;
        	int wis;
        	int cha;
        	if (strText.getText().equals("")) {
        		str = 0; 
        	} else {
        		str = Integer.parseInt(strText.getText()); 
        	}
        	if (dexText.getText().equals("")) {
        		dex = 0; 
        	} else {
        		dex = Integer.parseInt(dexText.getText()); 
        	}
        	if (conText.getText().equals("")) {
        		con = 0; 
        	} else {
        		con = Integer.parseInt(conText.getText()); 
        	}
        	if (intText.getText().equals("")) {
        		intel = 0; 
        	} else {
        		intel = Integer.parseInt(intText.getText()); 
        	}
        	if (wisText.getText().equals("")) {
        		wis = 0; 
        	} else {
        		wis = Integer.parseInt(wisText.getText()); 
        	}
        	if (chaText.getText().equals("")) {
        		cha = 0; 
        	} else {
        		cha = Integer.parseInt(chaText.getText()); 
        	}
        	stats = new int[]{str, dex, con, intel, wis, cha};
        	
        	String skills = "";
        	if (skillRadio1.isSelected()) {
        		skills += skillRadio1.getText(); 
        	}
        	if (skillRadio2.isSelected()) {
        		skills += skillRadio2.getText(); 
        	}
        	if (skillRadio3.isSelected()) {
        		skills += skillRadio3.getText(); 
        	}
        	if (skillRadio4.isSelected()) {
        		skills += skillRadio4.getText(); 
        	}
        	if (skillRadio5.isSelected()) {
        		skills += skillRadio5.getText(); 
        	}
        	if (skillRadio6.isSelected()) {
        		skills += skillRadio6.getText(); 
        	}
        	if (skillRadio7.isSelected()) {
        		skills += skillRadio7.getText(); 
        	}
        	if (skillRadio8.isSelected()) {
        		skills += skillRadio8.getText(); 
        	}
        	if (skillRadio9.isSelected()) {
        		skills += skillRadio9.getText(); 
        	}
        	if (skillRadio10.isSelected()) {
        		skills += skillRadio10.getText(); 
        	}
        	if (skillRadio11.isSelected()) {
        		skills += skillRadio11.getText(); 
        	}
        	if (skillRadio12.isSelected()) {
        		skills += skillRadio12.getText(); 
        	}
        	if (skillRadio13.isSelected()) {
        		skills += skillRadio13.getText(); 
        	}
        	if (skillRadio14.isSelected()) {
        		skills += skillRadio14.getText(); 
        	}
        	if (skillRadio15.isSelected()) {
        		skills += skillRadio15.getText(); 
        	}
        	if (skillRadio16.isSelected()) {
        		skills += skillRadio16.getText(); 
        	}
        	if (skillRadio17.isSelected()) {
        		skills += skillRadio17.getText(); 
        	}
        	if (skillRadio18.isSelected()) {
        		skills += skillRadio18.getText(); 
        	}
        	
        	CharacterClass charClass = null;
        	if (classBox.getSelectedIndex() == 0) {
        		charClass = new Barbarian(); 
        	}
        	if (classBox.getSelectedIndex() == 1) {
        		charClass = new Bard(); 
        	}
        	if (classBox.getSelectedIndex() == 2) {
        		charClass = new Cleric(); 
        	}
        	if (classBox.getSelectedIndex() == 3) {
        		charClass = new Druid(); 
        	}
        	if (classBox.getSelectedIndex() == 4) {
        		charClass = new Fighter(); 
        	}
        	if (classBox.getSelectedIndex() == 5) {
        		charClass = new Monk(); 
        	}
        	if (classBox.getSelectedIndex() == 6) {
        		charClass = new Paladin(); 
        	}
        	if (classBox.getSelectedIndex() == 7) {
        		charClass = new Ranger(); 
        	}
        	if (classBox.getSelectedIndex() == 8) {
        		charClass = new Rogue(); 
        	}
        	if (classBox.getSelectedIndex() == 9) {
        		charClass = new Sorcerer(); 
        	}
        	if (classBox.getSelectedIndex() == 10) {
        		charClass = new Warlock(); 
        	}
        	if (classBox.getSelectedIndex() == 11) {
        		charClass = new Wizard(); 
        	}
        	
        	Race race = null;
        	//Dragonborns
        	if (raceBox.getSelectedIndex() == 1) {
        		race = new Dragonborn(); 
        	}
        	//Dwarves
        	if (raceBox.getSelectedIndex() == 2 && subraceBox.getSelectedIndex() == 0) {
        		race = new DwarfHill(); 
        	}
        	if (raceBox.getSelectedIndex() == 2 && subraceBox.getSelectedIndex() == 1) {
        		race = new DwarfMountain(); 
        	}
        	//Elves
        	if (raceBox.getSelectedIndex() == 3 && subraceBox.getSelectedIndex() == 0) {
        		race = new ElfHigh(); 
        	}
        	if (raceBox.getSelectedIndex() == 3 && subraceBox.getSelectedIndex() == 1) {
        		race = new ElfWood(); 
        	}
        	//Gnomes
        	if (raceBox.getSelectedIndex() == 4 && subraceBox.getSelectedIndex() == 0) {
        		race = new GnomeDeep(); 
        	}
        	if (raceBox.getSelectedIndex() == 4 && subraceBox.getSelectedIndex() == 1) {
        		race = new GnomeRock(); 
        	}
        	//Half Elves
        	if (raceBox.getSelectedIndex() == 5) {
        		race = new HalfElf(); 
        	}
        	//Halflings
        	if (raceBox.getSelectedIndex() == 6 && subraceBox.getSelectedIndex() == 0) {
        		race = new HalflingLightfoot(); 
        	}
        	if (raceBox.getSelectedIndex() == 6 && subraceBox.getSelectedIndex() == 1) {
        		race = new HalflingStout(); 
        	}
        	//Half Orcs
        	if (raceBox.getSelectedIndex() == 7) {
        		race = new HalfOrc(); 
        	}
        	//Human
        	if (raceBox.getSelectedIndex() == 8) {
        		race = new Human(); 
        	}
        	//Tieflings
        	if (raceBox.getSelectedIndex() == 9) {
        		race = new Tiefling(); 
        	}
        	
        	String charName = charNameText.getText();
        	if (charName.equals("")) {
        		charName = "Unnamed"; 
        	}
        	
        	int xp;
        	if (xpText.getText().equals("")) {
        		xp = 0; 
        	}else {
        		xp = Integer.parseInt(xpText.getText()); 
        	}
        	
        	int armor;
        	if (acText.getText().equals("")) {
        		armor = 0; 
        	}else {
        		armor = Integer.parseInt(acText.getText()); 
        	}
        	
        	int hp;
        	if (hpText.getText().equals("")) {
        		hp = 0; 
        	} else {
        		hp = Integer.parseInt(hpText.getText()); 
        	}
        	
        	DndChar temp = new DndChar(charName, ethicalAlign, moralAlign, race, charClass, 
        			(lvlBox.getSelectedIndex() + 1), xp, stats, skills, bgText.getText(), 
        			traitsTextArea.getText(), idealsTextArea.getText(), bondsTextArea.getText(),
        			flawsTextArea.getText(), armor, hp, featuresTextArea.getText(),	
        			profTextArea.getText(), equipTextArea.getText(), playerNameText.getText());
        	//String name, String ethicalAlign, String moralAlign, Race race, 
        	//CharacterClass charClass, int level, int exp, int[] stats, String skills, 
        	//String background, String traits, String ideals,String bonds, String flaws,
        	//int armor, int maxHP, String features, String profs, String equipment, String player
        	
        	try (FileOutputStream file = new FileOutputStream(/*"\\src\\DNDCompanion\\"
        	+"ExampleChars\\" +*/ temp.getName() + ".char");
            		ObjectOutputStream out = new ObjectOutputStream(file);) {
            	out.writeObject(temp);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (src == raceBox) {
        	int n = raceBox.getSelectedIndex();
        	
        	
        	if (n == 2) {
        		subraceBox.removeAllItems(); 
        		subraceBox.addItem("Hill"); 
        		subraceBox.addItem("Mountain"); 
        	} else if (n == 3) {
        		subraceBox.removeAllItems(); 
        		subraceBox.addItem("High"); 
        		subraceBox.addItem("Wood"); 
        	} else if (n == 4) {
        		subraceBox.removeAllItems(); 
        	subraceBox.addItem("Deep"); 
        	subraceBox.addItem("Rock"); 
        	} else if (n == 6) {
        		subraceBox.removeAllItems(); 
        		subraceBox.addItem("Lightfoot"); 
        		subraceBox.addItem("Stout"); 
        	} else {
        		subraceBox.removeAllItems(); 
        		subraceBox.addItem(""); 
        	}
        	
        	subraceBox.updateUI();
        }
        if (src == switchWindow) {
        	new CharacterSheet();
        	this.dispose();
        }
    }

    
    /** 
     * Method used to start the application.

     * @param args main method argument
     */
    public static void main(String[] args) {
        new CharacterEditor();
    }
}