package DNDCompanion;

import javax.swing.*;

import DNDCompanion.character.*;
import DNDCompanion.character.chrclasses.*;
import DNDCompanion.character.chrraces.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Font;
import javax.swing.BorderFactory;

public class CharacterEditor extends JFrame implements ActionListener{

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem close;
    private JMenu windowMenu;
    private JMenuItem charEditor;
    private JMenuItem charSheet;
    
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
    
    private JComboBox raceBox;
    private JComboBox subraceBox;
    private JComboBox classBox;
    private JComboBox lvlBox;
    
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
    
    

//    close.addActionListener(this);
//    openChar.addActionListener(this);
//    saveChar.addActionListener(this);

    public CharacterEditor(){
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
        charEditor = new JMenuItem("Character Editor");
        charSheet  = new JMenuItem("Character Sheet");
        
        windowMenu.add(charEditor);
        windowMenu.add(charSheet);

        openChar.addActionListener(this);
        saveChar.addActionListener(this);
        close.addActionListener(this);
        charEditor.addActionListener(this);
        charSheet.addActionListener(this);

        menus.add(fileMenu);
        menus.add(windowMenu);
        setJMenuBar(menus);
        
        charNameText = new JTextField();
        charNameText.setBounds(39, 26, 273, 34);
        getContentPane().add(charNameText);
        charNameText.setColumns(10);
        
        charNameLabel = new JLabel("Character Name");
        charNameLabel.setBounds(39, 11, 117, 14);
        getContentPane().add(charNameLabel);
        
        classLabel = new JLabel("Class & Lvl");
        classLabel.setBounds(40, 69, 70, 14);
        getContentPane().add(classLabel);
        
        String[] classChoice = {"", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        classBox = new JComboBox(classChoice);
        classBox.setBounds(40, 84, 85, 25);
        classBox.setSelectedIndex(0);
        getContentPane().add(classBox);
        
        String[] lvlChoice = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        lvlBox = new JComboBox(lvlChoice);
        lvlBox.setBounds(124, 84, 40, 25);
        lvlBox.setSelectedIndex(0);
        getContentPane().add(lvlBox);
        
        String[] raceChoice = {"","Dragonborn","Dwarf","Elf","Gnome","Half-Elf","Halfling","Half-Orc","Human","Tiefling"};
        raceBox = new JComboBox(raceChoice);
        raceBox.setBounds(188, 84, 124, 25);
        raceBox.addActionListener(this);
        getContentPane().add(raceBox);
        
        subraceBox = new JComboBox(new String[]{""});
        subraceBox.setBounds(188, 135, 124, 25);
        getContentPane().add(subraceBox);
        
        raceLabel = new JLabel("Race");
        raceLabel.setBounds(188, 69, 56, 14);
        getContentPane().add(raceLabel);
        
        playerNameLabel = new JLabel("Player Name");
        playerNameLabel.setBounds(39, 171, 86, 14);
        getContentPane().add(playerNameLabel);
        
        
        playerNameText = new JTextField();
        playerNameText.setBounds(39, 186, 125, 25);
        getContentPane().add(playerNameText);
        
        bgLabel = new JLabel("Background");
        bgLabel.setBounds(188, 171, 83, 14);
        getContentPane().add(bgLabel);
        
        bgText = new JTextField();
        bgText.setColumns(10);
        bgText.setBounds(188, 186, 124, 25);
        getContentPane().add(bgText);
        
        xpLabel = new JLabel("Experience");
        xpLabel.setBounds(39, 120, 84, 14);
        getContentPane().add(xpLabel);
        
        xpText = new JTextField();
        xpText.setColumns(10);
        xpText.setBounds(39, 135, 125, 25);
        getContentPane().add(xpText);
        
        subraceLabel = new JLabel("Subrace");
        subraceLabel.setBounds(188, 120, 83, 14);
        getContentPane().add(subraceLabel);
        
        //separating alignment from skills
        separator1 = new JSeparator(SwingConstants.VERTICAL);
        separator1.setBounds(542, 118, 2, 177);
        getContentPane().add(separator1);
        
        //Skills header and radio buttons for each skill
        skillsLabel = new JLabel("Skills");
        skillsLabel.setBounds(705, 120, 46, 14);
        getContentPane().add(skillsLabel);
        
        skillRadio1 = new JRadioButton("Acrobatics");
        skillRadio1.setBounds(568, 142, 109, 23);
        getContentPane().add(skillRadio1);
        
        skillRadio2 = new JRadioButton("Animal Handling");
        skillRadio2.setBounds(568, 168, 117, 23);
        getContentPane().add(skillRadio2);
        
        skillRadio3 = new JRadioButton("Arcana");
        skillRadio3.setBounds(568, 194, 109, 23);
        getContentPane().add(skillRadio3);
        
        skillRadio4 = new JRadioButton("Athletics");
        skillRadio4.setBounds(568, 220, 109, 23);
        getContentPane().add(skillRadio4);
        
        skillRadio5 = new JRadioButton("Deception");
        skillRadio5.setBounds(568, 246, 109, 23);
        getContentPane().add(skillRadio5);
        
        skillRadio6 = new JRadioButton("History");
        skillRadio6.setBounds(568, 272, 109, 23);
        getContentPane().add(skillRadio6);

        skillRadio7 = new JRadioButton("Insight");
        skillRadio7.setBounds(687, 142, 109, 23);
        getContentPane().add(skillRadio7);
        
        skillRadio8 = new JRadioButton("Intimidation");
        skillRadio8.setBounds(687, 168, 109, 23);
        getContentPane().add(skillRadio8);
        
        skillRadio9 = new JRadioButton("Investigation");
        skillRadio9.setBounds(687, 194, 109, 23);
        getContentPane().add(skillRadio9);
        
        skillRadio10 = new JRadioButton("Medicine");
        skillRadio10.setBounds(687, 220, 109, 23);
        getContentPane().add(skillRadio10);
        
        skillRadio11 = new JRadioButton("Nature");
        skillRadio11.setBounds(687, 246, 109, 23);
        getContentPane().add(skillRadio11);
        
        skillRadio12 = new JRadioButton("Perception");
        skillRadio12.setBounds(687, 272, 109, 23);
        getContentPane().add(skillRadio12);
        
        skillRadio13 = new JRadioButton("Performance");
        skillRadio13.setBounds(798, 142, 109, 23);
        getContentPane().add(skillRadio13);
        
        skillRadio14 = new JRadioButton("Persuasion");
        skillRadio14.setBounds(798, 168, 109, 23);
        getContentPane().add(skillRadio14);
        
        skillRadio15 = new JRadioButton("Religion");
        skillRadio15.setBounds(798, 194, 109, 23);
        getContentPane().add(skillRadio15);
        
        skillRadio16 = new JRadioButton("Sleight of Hand");
        skillRadio16.setBounds(798, 220, 117, 23);
        getContentPane().add(skillRadio16);
        
        skillRadio17 = new JRadioButton("Stealth");
        skillRadio17.setBounds(798, 246, 109, 23);
        getContentPane().add(skillRadio17);
        
        skillRadio18 = new JRadioButton("Survival");
        skillRadio18.setBounds(798, 272, 109, 23);
        getContentPane().add(skillRadio18);
        
        //Alignment header + radio button for each align.
        alignmentLabel = new JLabel("Alignment");
        alignmentLabel.setBounds(411, 120, 70, 14);
        getContentPane().add(alignmentLabel);
        
        alignGroup = new ButtonGroup();
        
        alignRadioLG = new JRadioButton();
        alignRadioLG.setBounds(381, 157, 20, 23);
        getContentPane().add(alignRadioLG);
        alignGroup.add(alignRadioLG);
        
        alignRadioLN = new JRadioButton();
        alignRadioLN.setBounds(381, 207, 20, 23);
        getContentPane().add(alignRadioLN);
        alignGroup.add(alignRadioLN);
        
        alignRadioLE = new JRadioButton();
        alignRadioLE.setBounds(381, 257, 20, 23);
        getContentPane().add(alignRadioLE);
        alignGroup.add(alignRadioLE);
        
        alignRadioNG = new JRadioButton();
        alignRadioNG.setBounds(431, 157, 20, 23);
        getContentPane().add(alignRadioNG);
        alignGroup.add(alignRadioNG);
        
        alignRadioNN = new JRadioButton();
        alignRadioNN.setBounds(431, 207, 20, 23);
        getContentPane().add(alignRadioNN);
        alignGroup.add(alignRadioNN);
        
        alignRadioNE = new JRadioButton();
        alignRadioNE.setBounds(431, 257, 20, 23);
        getContentPane().add(alignRadioNE);
        alignGroup.add(alignRadioNE);
        
        alignRadioCG = new JRadioButton();
        alignRadioCG.setBounds(481, 157, 20, 23);
        getContentPane().add(alignRadioCG);
        alignGroup.add(alignRadioCG);
        
        alignRadioCN = new JRadioButton();
        alignRadioCN.setBounds(481, 207, 20, 23);
        getContentPane().add(alignRadioCN);
        alignGroup.add(alignRadioCN);
        
        alignRadioCE = new JRadioButton();
        alignRadioCE.setBounds(481, 257, 20, 23);
        getContentPane().add(alignRadioCE);
        alignGroup.add(alignRadioCE);
        
        //separate skills from stats
        separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setBounds(343, 107, 595, 2);
        getContentPane().add(separator2);
        
        //stat display/input
        strText = new JTextField();
        strText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        strText.setBounds(392, 51, 40, 32);
        getContentPane().add(strText);
        strText.setColumns(10);
        
        dexText = new JTextField();
        dexText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        dexText.setColumns(10);
        dexText.setBounds(442, 51, 40, 32);
        getContentPane().add(dexText);
        
        conText = new JTextField();
        conText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        conText.setColumns(10);
        conText.setBounds(492, 51, 40, 32);
        getContentPane().add(conText);
        
        intText = new JTextField();
        intText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        intText.setColumns(10);
        intText.setBounds(542, 51, 40, 32);
        getContentPane().add(intText);
        
        wisText = new JTextField();
        wisText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        wisText.setColumns(10);
        wisText.setBounds(592, 51, 40, 32);
        getContentPane().add(wisText);
        
        chaText = new JTextField();
        chaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        chaText.setColumns(10);
        chaText.setBounds(642, 51, 40, 32);
        getContentPane().add(chaText);
        
        strLabel = new JLabel("STR");
        strLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        strLabel.setBounds(392, 34, 40, 14);
        getContentPane().add(strLabel);
        
        dexLabel = new JLabel("DEX");
        dexLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        dexLabel.setBounds(442, 34, 40, 14);
        getContentPane().add(dexLabel);
        
        conLabel = new JLabel("CON");
        conLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conLabel.setBounds(492, 34, 40, 14);
        getContentPane().add(conLabel);
        
        intLabel = new JLabel("INT");
        intLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        intLabel.setBounds(542, 34, 40, 14);
        getContentPane().add(intLabel);
        
        wisLabel = new JLabel("WIS");
        wisLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        wisLabel.setBounds(592, 34, 40, 14);
        getContentPane().add(wisLabel);
        
        chaLabel = new JLabel("CHA");
        chaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chaLabel.setBounds(642, 34, 40, 14);
        getContentPane().add(chaLabel);
        

  
        separator3 = new JSeparator(SwingConstants.VERTICAL);
        separator3.setBounds(333, 10, 2, 626);
        getContentPane().add(separator3);
        
        traitsTextArea = new JTextArea();
        traitsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        traitsTextArea.setWrapStyleWord(true);
        traitsTextArea.setLineWrap(true);
        traitsTextArea.setBounds(39, 257, 273, 80);
//        TraitsTextArea.createRaisedBevelBorder();
        getContentPane().add(traitsTextArea);
        
        idealsTextArea = new JTextArea();
        idealsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        idealsTextArea.setWrapStyleWord(true);
        idealsTextArea.setLineWrap(true);
        idealsTextArea.setBounds(39, 364, 273, 80);
        getContentPane().add(idealsTextArea);
        
        bondsTextArea = new JTextArea();
        bondsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        bondsTextArea.setWrapStyleWord(true);
        bondsTextArea.setLineWrap(true);
        bondsTextArea.setBounds(39, 471, 273, 80);
        getContentPane().add(bondsTextArea);
        
        flawsTextArea = new JTextArea();
        flawsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        flawsTextArea.setWrapStyleWord(true);
        flawsTextArea.setLineWrap(true);
        flawsTextArea.setBounds(39, 578, 272, 80);
        getContentPane().add(flawsTextArea);
        
        traitsLabel = new JLabel("Personality Traits");
        traitsLabel.setBounds(39, 241, 100, 14);
        getContentPane().add(traitsLabel);
        
        idealsLabel = new JLabel("Ideals");
        idealsLabel.setBounds(39, 348, 46, 14);
        getContentPane().add(idealsLabel);
        
        bondsLabel = new JLabel("Bonds");
        bondsLabel.setBounds(39, 455, 46, 14);
        getContentPane().add(bondsLabel);
        
        flawsLabel = new JLabel("Flaws");
        flawsLabel.setBounds(39, 562, 46, 14);
        getContentPane().add(flawsLabel);
        
        acText = new JTextField();
        acText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        acText.setColumns(10);
        acText.setBounds(792, 51, 40, 32);
        getContentPane().add(acText);
        
        JLabel acLabel = new JLabel("AC");
        acLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        acLabel.setBounds(792, 34, 40, 14);
        getContentPane().add(acLabel);
        
        hpText = new JTextField();
        hpText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        hpText.setColumns(10);
        hpText.setBounds(842, 51, 40, 32);
        getContentPane().add(hpText);
        
        JLabel hpLabel = new JLabel("MAX\r\n HP");
        hpLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        hpLabel.setBounds(840, 35, 61, 14);
        getContentPane().add(hpLabel);
        
        featuresTextArea = new JTextArea();
        featuresTextArea.setWrapStyleWord(true);
        featuresTextArea.setLineWrap(true);
        featuresTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        featuresTextArea.setBounds(353, 334, 185, 324);
        getContentPane().add(featuresTextArea);
        
        featuresLabel = new JLabel("Features & Traits");
        featuresLabel.setBounds(401, 318, 100, 14);
        getContentPane().add(featuresLabel);
        
        equipLabel = new JLabel("Equipment");
        equipLabel.setBounds(832, 318, 69, 14);
        getContentPane().add(equipLabel);
        
        equipTextArea = new JTextArea();
        equipTextArea.setWrapStyleWord(true);
        equipTextArea.setLineWrap(true);
        equipTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        equipTextArea.setBounds(763, 334, 185, 324);
        getContentPane().add(equipTextArea);
        
        profTextArea = new JTextArea();
        profTextArea.setWrapStyleWord(true);
        profTextArea.setLineWrap(true);
        profTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        profTextArea.setBounds(558, 334, 185, 324);
        getContentPane().add(profTextArea);
        
        profLabel = new JLabel("Proficiencies");
        profLabel.setBounds(621, 318, 77, 14);
        getContentPane().add(profLabel);
        
        separator4 = new JSeparator(SwingConstants.HORIZONTAL);
        separator4.setBounds(343, 305, 595, 2);
        getContentPane().add(separator4);
        
        
        JLabel goodLabel = new JLabel("Good");
        goodLabel.setBounds(379, 140, 46, 14);
        getContentPane().add(goodLabel);
        
        JLabel lawfulLabel = new JLabel("Lawful");
        lawfulLabel.setBounds(338, 161, 46, 14);
        getContentPane().add(lawfulLabel);
        
        JLabel neutralLawLabel = new JLabel("Neutral");
        neutralLawLabel.setBounds(338, 211, 46, 14);
        getContentPane().add(neutralLawLabel);
        
        JLabel chaoticLabel = new JLabel("Chaotic");
        chaoticLabel.setBounds(338, 261, 46, 14);
        getContentPane().add(chaoticLabel);
        
        JLabel neutralMoralLabel = new JLabel("Neutral");
        neutralMoralLabel.setBounds(424, 140, 46, 14);
        getContentPane().add(neutralMoralLabel);
        
        JLabel evilLabel = new JLabel("Evil");
        evilLabel.setBounds(484, 140, 46, 14);
        getContentPane().add(evilLabel);
        
        
//      JFrame.setLocationRelativeTo(null);
        setVisible(true);
        setSize(1920,1000);
        getContentPane().setLayout(null);
    }

    
    /** 
     * @param e
     */
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        if(src == close){
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
                        
                        //character name
                        charNameText.setText(temp.getName());
                        
                        //character race
                        String race = temp.getRace().getName(); 
                        int n;
                        Boolean hasSubraces = true;
                        switch(race) {
                        	default:
                        	case "": n=0; break;
                        	case "Dragonborn": n=1; hasSubraces = false; break;//no subrace
                        	case "Dwarf": n=2; break;
                        	case "Elf": n=3; break;
                        	case "Gnome": n=4; break;
                        	case "Half-Elf": n=5; hasSubraces = false; break; //no subrace
                        	case "Halfling": n=6; break;
                        	case "Half-Orc": n=7; hasSubraces = false; break; //no subrace
                        	case "Human": n=8; break; 
                        	case "Tiefling": n=9; hasSubraces = false; break; //no subrace
                        }
                        raceBox.setSelectedIndex(n);
                        //checks for subraces and sets up the comboBox if applicable
                        if(hasSubraces) {
                        	subraceBox = new JComboBox(temp.getRace().getSubraces());
                        	subraceBox.setSelectedIndex(subraceBox.getSelectedIndex());
                        }
                        
                        //character class
                        String pClass = temp.getCharClass().getName(); 
                        switch(pClass) {
                        	default:
                        	case "": n=0; break;

                        	case "Barbarian": n=1; break; 
                        	case "Bard": n=2; break;
                        	case "Cleric": n=3; break;
                        	case "Druid": n=4; break;
                        	case "Fighter": n=5; break; 
                        	case "Monk": n=6; break;
                        	case "Paladin": n=7; break; 
                        	case "Ranger": n=8; break; 
                        	case "Rogue": n=9; break;
                        	case "Sorcerer": n=10; break; 
                        	case "Warlock": n=11; break;
                        	case "Wizard": n=12; break;
                        }
                        classBox.setSelectedIndex(n);
                        
                        //char level
                        lvlBox.setSelectedIndex(temp.getLevel()-1);
                        
                        //char alignment
                        String alignment = temp.getAlignment();
                        switch(alignment) {
                    	default:
                    	case "LG": alignRadioLG.doClick(); break;
                    	case "LN": alignRadioLN.doClick(); break; 
                    	case "LE": alignRadioLE.doClick(); break;
                    	case "NG": alignRadioNG.doClick(); break;
                    	case "NN": alignRadioNN.doClick(); break;
                    	case "NE": alignRadioNE.doClick(); break; 
                    	case "CG": alignRadioCG.doClick(); break;
                    	case "CN": alignRadioCN.doClick(); break; 
                    	case "CE": alignRadioCE.doClick(); break; 
                        }
                    	
                        //char experience
                    	xpText.setText("" + temp.getExp());
                    	
                    	//skill radios
                    	if(temp.getSkills().contains(skillRadio1.getText()))
                    		skillRadio1.doClick();
                    	if(temp.getSkills().contains(skillRadio2.getText()))
                    		skillRadio2.doClick();
                    	if(temp.getSkills().contains(skillRadio3.getText()))
                    		skillRadio3.doClick();
                    	if(temp.getSkills().contains(skillRadio4.getText()))
                    		skillRadio4.doClick();
                    	if(temp.getSkills().contains(skillRadio5.getText()))
                    		skillRadio5.doClick();
                    	if(temp.getSkills().contains(skillRadio6.getText()))
                    		skillRadio6.doClick();
                    	if(temp.getSkills().contains(skillRadio7.getText()))
                    		skillRadio7.doClick();
                    	if(temp.getSkills().contains(skillRadio8.getText()))
                    		skillRadio8.doClick();
                    	if(temp.getSkills().contains(skillRadio9.getText()))
                    		skillRadio9.doClick();
                    	if(temp.getSkills().contains(skillRadio10.getText()))
                    		skillRadio10.doClick();
                    	if(temp.getSkills().contains(skillRadio11.getText()))
                    		skillRadio11.doClick();
                    	if(temp.getSkills().contains(skillRadio12.getText()))
                    		skillRadio12.doClick();
                    	if(temp.getSkills().contains(skillRadio13.getText()))
                    		skillRadio13.doClick();
                    	if(temp.getSkills().contains(skillRadio14.getText()))
                    		skillRadio14.doClick();
                    	if(temp.getSkills().contains(skillRadio15.getText()))
                    		skillRadio15.doClick();
                    	if(temp.getSkills().contains(skillRadio16.getText()))
                    		skillRadio16.doClick();		
                    	if(temp.getSkills().contains(skillRadio17.getText()))
                    		skillRadio17.doClick();	
                    	if(temp.getSkills().contains(skillRadio18.getText()))
                    		skillRadio18.doClick();
                    	
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
                        strText.setText("" + temp.getStats()[2]);
                        dexText.setText("" + temp.getStats()[3]);
                        strText.setText("" + temp.getStats()[4]);
                        dexText.setText("" + temp.getStats()[5]);
                        
                        //set ac 
                        acText.setText(""+ temp.getArmor());
                        
                        //set max HP
                        hpText.setText(""+ temp.getMaxHP());
                        
                        playerNameText.setText(temp.getPlayer());
//                        //for saving stats
//                        int[] stats = new int[] {Integer.parseInt(strText.getText()),Integer.parseInt(dexText.getText()),
//                        						 Integer.parseInt(conText.getText()),Integer.parseInt(intText.getText()),
//                        						 Integer.parseInt(wisText.getText()),Integer.parseInt(chaText.getText())};
                        
                        //saveChar.setEnabled(true);
                    }

                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
            
//            temp.getName();
        }
        if(src==saveChar) {
        	String ethicalAlign = "";
        	String moralAlign = "";
        	if(alignRadioLG.isSelected()) {ethicalAlign = "L"; moralAlign = "G";}
        	if(alignRadioLN.isSelected()) {ethicalAlign = "L"; moralAlign = "N";}
        	if(alignRadioLE.isSelected()) {ethicalAlign = "L"; moralAlign = "E";}
        	if(alignRadioNG.isSelected()) {ethicalAlign = "N"; moralAlign = "G";}
        	if(alignRadioNN.isSelected()) {ethicalAlign = "N"; moralAlign = "N";}
        	if(alignRadioNE.isSelected()) {ethicalAlign = "N"; moralAlign = "E";}
        	if(alignRadioCG.isSelected()) {ethicalAlign = "C"; moralAlign = "G";}
        	if(alignRadioCN.isSelected()) {ethicalAlign = "C"; moralAlign = "N";}
        	if(alignRadioCE.isSelected()) {ethicalAlign = "C"; moralAlign = "E";}
        	
        	int [] stats;
        	int str;
        	int dex;
        	int con;
        	int intel;
        	int wis;
        	int cha;
        	if(strText.getText().equals("")) {str = 0;}else {str = Integer.parseInt(strText.getText());}
        	if(dexText.getText().equals("")) {dex = 0;}else {dex = Integer.parseInt(dexText.getText());}
        	if(conText.getText().equals("")) {con = 0;}else {con = Integer.parseInt(conText.getText());}
        	if(intText.getText().equals("")) {intel = 0;}else {intel = Integer.parseInt(intText.getText());}
        	if(wisText.getText().equals("")) {wis = 0;}else {wis = Integer.parseInt(wisText.getText());}
        	if(chaText.getText().equals("")) {cha = 0;}else {cha = Integer.parseInt(chaText.getText());}
        	stats = new int[]{str,dex,con,intel,wis,cha};
        	
        	String skills = "";
        	if(skillRadio1.isSelected()) {skills += skillRadio1.getText();}
        	if(skillRadio2.isSelected()) {skills += skillRadio2.getText();}
        	if(skillRadio3.isSelected()) {skills += skillRadio3.getText();}
        	if(skillRadio4.isSelected()) {skills += skillRadio4.getText();}
        	if(skillRadio5.isSelected()) {skills += skillRadio5.getText();}
        	if(skillRadio6.isSelected()) {skills += skillRadio6.getText();}
        	if(skillRadio7.isSelected()) {skills += skillRadio7.getText();}
        	if(skillRadio8.isSelected()) {skills += skillRadio8.getText();}
        	if(skillRadio9.isSelected()) {skills += skillRadio9.getText();}
        	if(skillRadio10.isSelected()) {skills += skillRadio10.getText();}
        	if(skillRadio11.isSelected()) {skills += skillRadio11.getText();}
        	if(skillRadio12.isSelected()) {skills += skillRadio12.getText();}
        	if(skillRadio13.isSelected()) {skills += skillRadio13.getText();}
        	if(skillRadio14.isSelected()) {skills += skillRadio14.getText();}
        	if(skillRadio15.isSelected()) {skills += skillRadio15.getText();}
        	if(skillRadio16.isSelected()) {skills += skillRadio16.getText();}
        	if(skillRadio17.isSelected()) {skills += skillRadio17.getText();}
        	if(skillRadio18.isSelected()) {skills += skillRadio18.getText();}
        	
        	CharacterClass charClass = null;
        	if(classBox.getSelectedIndex() == 0) {charClass = new Barbarian();}
        	if(classBox.getSelectedIndex() == 1) {charClass = new Bard();}
        	if(classBox.getSelectedIndex() == 2) {charClass = new Cleric();}
        	if(classBox.getSelectedIndex() == 3) {charClass = new Druid();}
        	if(classBox.getSelectedIndex() == 4) {charClass = new Fighter();}
        	if(classBox.getSelectedIndex() == 5) {charClass = new Monk();}
        	if(classBox.getSelectedIndex() == 6) {charClass = new Paladin();}
        	if(classBox.getSelectedIndex() == 7) {charClass = new Ranger();}
        	if(classBox.getSelectedIndex() == 8) {charClass = new Rogue();}
        	if(classBox.getSelectedIndex() == 9) {charClass = new Sorcerer();}
        	if(classBox.getSelectedIndex() == 10) {charClass = new Warlock();}
        	if(classBox.getSelectedIndex() == 11) {charClass = new Wizard();}
        	
        	Race race = null;
        	if(raceBox.getSelectedIndex()==0) {race = new Dragonborn(); }											//Dragonborns
        	if(raceBox.getSelectedIndex()==1 && subraceBox.getSelectedIndex()==0) {race = new DwarfHill(); } 		//Dwarves
        	if(raceBox.getSelectedIndex()==1 && subraceBox.getSelectedIndex()==1) {race = new DwarfMountain(); }
        	if(raceBox.getSelectedIndex()==2 && subraceBox.getSelectedIndex()==0) {race = new ElfHigh(); } 			//Elves
        	if(raceBox.getSelectedIndex()==2 && subraceBox.getSelectedIndex()==1) {race = new ElfWood(); }
        	if(raceBox.getSelectedIndex()==3 && subraceBox.getSelectedIndex()==0) {race = new GnomeDeep(); } 		//Gnomes
        	if(raceBox.getSelectedIndex()==3 && subraceBox.getSelectedIndex()==1) {race = new GnomeRock(); }
        	if(raceBox.getSelectedIndex()==4) {race = new HalfElf(); }												//Half Elves
        	if(raceBox.getSelectedIndex()==5 && subraceBox.getSelectedIndex()==0) {race = new HalflingLightfoot(); }//Halflings
        	if(raceBox.getSelectedIndex()==5 && subraceBox.getSelectedIndex()==1) {race = new HalflingStout(); }
        	if(raceBox.getSelectedIndex()==6) {race = new HalfOrc(); }												//Half Orcs
        	if(raceBox.getSelectedIndex()==7) {race = new Human(); }												//Human
        	if(raceBox.getSelectedIndex()==8) {race = new Tiefling(); }												//Tieflings
        	
        	String charName = charNameText.getText();
        	if(charName.equals("")) {charName = "Unnamed";}
        	
        	int xp;
        	if(xpText.getText().equals("")) {xp = 0;}else {xp =Integer.parseInt(xpText.getText());}
        	
        	int armor;
        	if(acText.getText().equals("")) {armor = 0;}else {armor =Integer.parseInt(acText.getText());}
        	
        	int hp;
        	if(hpText.getText().equals("")) {hp = 0;}else {hp =Integer.parseInt(hpText.getText());}
        	
        	DNDChar temp = new DNDChar(charName, ethicalAlign, moralAlign, race, charClass, (lvlBox.getSelectedIndex() +1), xp, stats, skills, bgText.getText(), 
        			traitsTextArea.getText(), idealsTextArea.getText(), bondsTextArea.getText(), flawsTextArea.getText(), armor, hp, featuresTextArea.getText(),
        			profTextArea.getText(), equipTextArea.getText(), playerNameText.getText());
        	//String name, String ethicalAlign, String moralAlign, Race race, CharacterClass charClass, int level, int exp, int[] stats, String skills, String background, String traits, String ideals,
        	//String bonds, String flaws, int armor, int maxHP, String features, String profs, String equipment, String player
        	
        	try (FileOutputStream file = new FileOutputStream(/*".\\DNDCompanion\\ExampleChars\\" +*/ temp.getName() + ".char");
            		ObjectOutputStream out = new ObjectOutputStream(file);) {
            	out.writeObject(temp);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args){
        new CharacterEditor();
    }
}