package dndcompanion;

import javax.swing.*;

import dndcompanion.character.Character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class CharacterEditor extends JFrame implements ActionListener{

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem close;
    
    private JLabel charNameLabel;
    private JLabel classLabel;
    private JLabel raceLabel;
    private JLabel alignLabel;
    private JLabel bgLabel;
    private JLabel xpLabel;
    private JLabel subraceLabel;
    private JLabel saveThrowLabel;
    private JLabel skillsLabel;
    private JLabel strLabel;
    private JLabel dexLabel;
    private JLabel conLabel;
    private JLabel intLabel;
    private JLabel wisLabel;
    private JLabel chaLabel;
    private JLabel TraitsLabel;
    private JLabel IdealsLabel;
    private JLabel BondsLabel;
    private JLabel FlawsLabel;
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
    private JComboBox alignBox;
    private JComboBox classBox;
    private JComboBox lvlBox;
    
    private JTextArea IdealsTextArea;
    private JTextArea BondsTextArea;
    private JTextArea FlawsTextArea;
    private JTextArea TraitsTextArea;
    private JTextArea featuresTextArea;
    private JTextArea equipTextArea;
    private JTextArea profTextArea;
    
    private JRadioButton strRadioButton;
    private JRadioButton dexRadioButton;
    private JRadioButton intRadioButton;
    private JRadioButton conRadioButton;
    private JRadioButton chaRadioButton;
    private JRadioButton wisRadioButton;
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
    
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;
    
    

    //Close.addActionListener(this);

    public CharacterEditor(){
        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        openChar = new JMenuItem("Open Character");
        saveChar = new JMenuItem("Save Character");
        close = new JMenuItem("Close");
        
        fileMenu.add(openChar);
        fileMenu.add(saveChar);
        fileMenu.addSeparator();
        fileMenu.add(close);

        openChar.addActionListener(this);
        saveChar.addActionListener(this);
        close.addActionListener(this);

        menus.add(fileMenu);
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
        getContentPane().add(raceBox);
        
        raceLabel = new JLabel("Race");
        raceLabel.setBounds(188, 69, 56, 14);
        getContentPane().add(raceLabel);
        
        alignLabel = new JLabel("Alignment");
        alignLabel.setBounds(39, 171, 70, 14);
        getContentPane().add(alignLabel);
        
        String[] alignChoice = {"","Lawful Good","Neutral Good","Chaotic Good",
				"Lawful Neutral","Neutral","Chaotic Neutral",
				"Lawful Evil","Neutral Evil","Chaotic Evil"};
        alignBox = new JComboBox(alignChoice);
        alignBox.setBounds(39, 186, 125, 25);
        alignBox.setSelectedIndex(0);
        getContentPane().add(alignBox);
        
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
        
        playerNameText = new JTextField();
        playerNameText.setColumns(10);
        playerNameText.setBounds(188, 135, 124, 25);
        getContentPane().add(playerNameText);
        
        
        //Saving Throws Header and radio buttons for each core stat
        saveThrowLabel = new JLabel("Saving Throws");
        saveThrowLabel.setBounds(396, 120, 94, 14);
        getContentPane().add(saveThrowLabel);
        
        strRadioButton = new JRadioButton("Strength");
        strRadioButton.setBounds(353, 142, 86, 23);
        getContentPane().add(strRadioButton);
        
        dexRadioButton = new JRadioButton("Dexterity");
        dexRadioButton.setBounds(353, 168, 86, 23);
        getContentPane().add(dexRadioButton);

        conRadioButton = new JRadioButton("Constitution");
        conRadioButton.setBounds(353, 194, 86, 23);
        getContentPane().add(conRadioButton);
        
        intRadioButton = new JRadioButton("Intelligence");
        intRadioButton.setBounds(436, 142, 100, 23);
        getContentPane().add(intRadioButton);
        
        wisRadioButton = new JRadioButton("Wisdom");
        wisRadioButton.setBounds(436, 168, 100, 23);
        getContentPane().add(wisRadioButton);
        
        chaRadioButton = new JRadioButton("Charisma");
        chaRadioButton.setBounds(436, 194, 100, 23);
        getContentPane().add(chaRadioButton);
        
        //separating STs from skills
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
        
        TraitsTextArea = new JTextArea();
        TraitsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        TraitsTextArea.setWrapStyleWord(true);
        TraitsTextArea.setLineWrap(true);
        TraitsTextArea.setBounds(39, 257, 273, 80);
        getContentPane().add(TraitsTextArea);
        
        IdealsTextArea = new JTextArea();
        IdealsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        IdealsTextArea.setWrapStyleWord(true);
        IdealsTextArea.setLineWrap(true);
        IdealsTextArea.setBounds(39, 364, 273, 80);
        getContentPane().add(IdealsTextArea);
        
        BondsTextArea = new JTextArea();
        BondsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        BondsTextArea.setWrapStyleWord(true);
        BondsTextArea.setLineWrap(true);
        BondsTextArea.setBounds(39, 471, 273, 80);
        getContentPane().add(BondsTextArea);
        
        FlawsTextArea = new JTextArea();
        FlawsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
        FlawsTextArea.setWrapStyleWord(true);
        FlawsTextArea.setLineWrap(true);
        FlawsTextArea.setBounds(39, 578, 272, 80);
        getContentPane().add(FlawsTextArea);
        
        TraitsLabel = new JLabel("Personality Traits");
        TraitsLabel.setBounds(39, 241, 100, 14);
        getContentPane().add(TraitsLabel);
        
        IdealsLabel = new JLabel("Ideals");
        IdealsLabel.setBounds(39, 348, 46, 14);
        getContentPane().add(IdealsLabel);
        
        BondsLabel = new JLabel("Bonds");
        BondsLabel.setBounds(39, 455, 46, 14);
        getContentPane().add(BondsLabel);
        
        FlawsLabel = new JLabel("Flaws");
        FlawsLabel.setBounds(39, 562, 46, 14);
        getContentPane().add(FlawsLabel);
        
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
        
        setVisible(true);
        setSize(1920,1080);
        getContentPane().setLayout(null);
    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        if(src == close){
			System.exit(1);
		}
    }

    public static void main(String[] args){
        new CharacterEditor();
    }
}