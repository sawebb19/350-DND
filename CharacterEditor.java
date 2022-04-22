package dndcompanion;

import dndcompanion.character.DndChar;
import dndcompanion.character.chrclasses.Barbarian;
import dndcompanion.character.chrclasses.Bard;
import dndcompanion.character.chrclasses.CharacterClass;
import dndcompanion.character.chrclasses.Cleric;
import dndcompanion.character.chrclasses.Druid;
import dndcompanion.character.chrclasses.Fighter;
import dndcompanion.character.chrclasses.Monk;
import dndcompanion.character.chrclasses.Paladin;
import dndcompanion.character.chrclasses.Ranger;
import dndcompanion.character.chrclasses.Rogue;
import dndcompanion.character.chrclasses.Sorcerer;
import dndcompanion.character.chrclasses.Warlock;
import dndcompanion.character.chrclasses.Wizard;
import dndcompanion.character.chrraces.Dragonborn;
import dndcompanion.character.chrraces.Dwarf;
import dndcompanion.character.chrraces.Elf;
import dndcompanion.character.chrraces.Gnome;
import dndcompanion.character.chrraces.HalfElf;
import dndcompanion.character.chrraces.HalfOrc;
import dndcompanion.character.chrraces.Halfling;
import dndcompanion.character.chrraces.Human;
import dndcompanion.character.chrraces.Race;
import dndcompanion.character.chrraces.Tiefling;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * GUI Class for displaying a DndChar object for editing.

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
  private JMenu genMenu;
  private JMenuItem genRestart;
  private JMenuItem genCont;
  private JMenu rollMenu;
  private JMenuItem openRoll;

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

  private JTextField[] texts;

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

  private JRadioButton[] skillRadios;

  private ButtonGroup alignGroup;
  private JRadioButton alignRadioLg;
  private JRadioButton alignRadioLn;
  private JRadioButton alignRadioLe;
  private JRadioButton alignRadioNg;
  private JRadioButton alignRadioNn;
  private JRadioButton alignRadioNe;
  private JRadioButton alignRadioCg;
  private JRadioButton alignRadioCn;
  private JRadioButton alignRadioCe;

  private JRadioButton[] alignRadios;

  private JSeparator separator1;
  private JSeparator separator2;
  private JSeparator separator3;
  private JSeparator separator4;

  private static final String[] LEVELS = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
  private static final String[] CLASS_NAMES = { "", "Barbarian", "Bard", "Cleric", "Druid",
      "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };
  private static final String[] RACE_NAMES = { "", "Dragonborn", "Dwarf", "Elf", "Gnome", 
      "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling" };
  private static final String[] ALIGNMENTS = { "LG", "LN", "LE", "NG", "NN", "NE", "CG",
      "CN", "CE" };

  private static final String[] SKILLS = { "Acrobatics", "Animal Handling", "Arcana",
      "Athletics", "Deception", "History", "Insight", "Intimidation", "Investigation",
      "Medicine", "Nature", "Perception", "Performance", "Persuasion", "Religion",
      "Sleight of Hand", "Stealth", "Survival" };
  private JLabel evilLabel;
  private JLabel neutralMoralLabel2;

  /**
   * Constructor for Character editor GUI.
   */
  public CharacterEditor() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(970, 800);
    menus = new JMenuBar();

    fileMenu = new JMenu("File");
    openChar = new JMenuItem("Open Character");
    saveChar = new JMenuItem("Save Character");
    close = new JMenuItem("Close");

    genMenu = new JMenu("Generate Character");
    genRestart = new JMenuItem("Overwrite values");
    genCont = new JMenuItem("Fill remaining values");

    genRestart.addActionListener(this);
    genCont.addActionListener(this);

    genMenu.add(genRestart);
    genMenu.add(genCont);

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

    rollMenu = new JMenu("Roll");
    openRoll = new JMenuItem("E-Dice");
    rollMenu.add(openRoll);
    openRoll.addActionListener(this);


    menus.add(fileMenu);
    menus.add(windowMenu);
    menus.add(rollMenu);
    menus.add(genMenu);
    setJMenuBar(menus);

    charNameText = new JTextField();
    charNameText.setBounds(23, 27, 125, 34);
    getContentPane().add(charNameText);
    charNameText.setColumns(10);

    charNameLabel = new JLabel("Character Name");
    charNameLabel.setBounds(23, 12, 125, 14);
    getContentPane().add(charNameLabel);

    classLabel = new JLabel("Class & Lvl");
    classLabel.setBounds(24, 70, 124, 14);
    getContentPane().add(classLabel);

    classBox = new JComboBox<String>();
    for (int i = 0; i < CLASS_NAMES.length; i++) {
      classBox.addItem(CLASS_NAMES[i]);
    }
    classBox.setBounds(24, 85, 85, 25);
    classBox.setSelectedIndex(0);
    getContentPane().add(classBox);

    lvlBox = new JComboBox<String>();
    for (int i = 0; i < LEVELS.length; i++) {
      lvlBox.addItem(LEVELS[i]);
    }
    lvlBox.setBounds(108, 85, 40, 25);
    lvlBox.setSelectedIndex(0);
    getContentPane().add(lvlBox);

    raceBox = new JComboBox<String>();
    for (int i = 0; i < RACE_NAMES.length; i++) {
      raceBox.addItem(RACE_NAMES[i]);
    }
    raceBox.setBounds(172, 85, 124, 25);
    raceBox.addActionListener(this);
    getContentPane().add(raceBox);

    subraceBox = new JComboBox<String>();
    subraceBox.addItem("");
    subraceBox.setBounds(172, 136, 124, 25);
    getContentPane().add(subraceBox);

    raceLabel = new JLabel("Race");
    raceLabel.setBounds(172, 70, 124, 14);
    getContentPane().add(raceLabel);

    playerNameLabel = new JLabel("Player Name");
    playerNameLabel.setBounds(172, 12, 124, 14);
    getContentPane().add(playerNameLabel);

    playerNameText = new JTextField();
    playerNameText.setBounds(171, 27, 125, 34);
    getContentPane().add(playerNameText);

    bgLabel = new JLabel("Background");
    bgLabel.setBounds(172, 172, 124, 14);
    getContentPane().add(bgLabel);

    bgText = new JTextField();
    bgText.setColumns(10);
    bgText.setBounds(172, 187, 124, 25);
    getContentPane().add(bgText);

    xpLabel = new JLabel("Experience");
    xpLabel.setBounds(23, 172, 125, 14);
    getContentPane().add(xpLabel);

    xpText = new JTextField();
    xpText.setColumns(10);
    xpText.setBounds(23, 187, 125, 25);
    getContentPane().add(xpText);

    subraceLabel = new JLabel("Subrace");
    subraceLabel.setBounds(172, 121, 124, 14);
    getContentPane().add(subraceLabel);

    // separating alignment from skills
    separator1 = new JSeparator(SwingConstants.VERTICAL);
    separator1.setBounds(526, 119, 2, 177);
    getContentPane().add(separator1);

    // Skills header and radio buttons for each skill
    skillsLabel = new JLabel("Skills");
    skillsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    skillsLabel.setBounds(552, 121, 362, 14);
    getContentPane().add(skillsLabel);

    skillRadio1 = new JRadioButton("Acrobatics");
    skillRadio1.setBounds(552, 143, 130, 23);
    getContentPane().add(skillRadio1);

    skillRadio2 = new JRadioButton("Animal Handling");
    skillRadio2.setBounds(552, 169, 130, 23);
    getContentPane().add(skillRadio2);

    skillRadio3 = new JRadioButton("Arcana");
    skillRadio3.setBounds(552, 195, 130, 23);
    getContentPane().add(skillRadio3);

    skillRadio4 = new JRadioButton("Athletics");
    skillRadio4.setBounds(552, 221, 130, 23);
    getContentPane().add(skillRadio4);

    skillRadio5 = new JRadioButton("Deception");
    skillRadio5.setBounds(552, 247, 130, 23);
    getContentPane().add(skillRadio5);

    skillRadio6 = new JRadioButton("History");
    skillRadio6.setBounds(552, 273, 130, 23);
    getContentPane().add(skillRadio6);

    skillRadio7 = new JRadioButton("Insight");
    skillRadio7.setBounds(681, 143, 130, 23);
    getContentPane().add(skillRadio7);

    skillRadio8 = new JRadioButton("Intimidation");
    skillRadio8.setBounds(681, 169, 109, 23);
    getContentPane().add(skillRadio8);

    skillRadio9 = new JRadioButton("Investigation");
    skillRadio9.setBounds(681, 195, 109, 23);
    getContentPane().add(skillRadio9);

    skillRadio10 = new JRadioButton("Medicine");
    skillRadio10.setBounds(681, 221, 109, 23);
    getContentPane().add(skillRadio10);

    skillRadio11 = new JRadioButton("Nature");
    skillRadio11.setBounds(681, 247, 109, 23);
    getContentPane().add(skillRadio11);

    skillRadio12 = new JRadioButton("Perception");
    skillRadio12.setBounds(681, 273, 109, 23);
    getContentPane().add(skillRadio12);

    skillRadio13 = new JRadioButton("Performance");
    skillRadio13.setBounds(810, 143, 130, 23);
    getContentPane().add(skillRadio13);

    skillRadio14 = new JRadioButton("Persuasion");
    skillRadio14.setBounds(810, 168, 130, 23);
    getContentPane().add(skillRadio14);

    skillRadio15 = new JRadioButton("Religion");
    skillRadio15.setBounds(810, 195, 130, 23);
    getContentPane().add(skillRadio15);

    skillRadio16 = new JRadioButton("Sleight of Hand");
    skillRadio16.setBounds(810, 221, 130, 23);
    getContentPane().add(skillRadio16);

    skillRadio17 = new JRadioButton("Stealth");
    skillRadio17.setBounds(810, 247, 130, 23);
    getContentPane().add(skillRadio17);

    skillRadio18 = new JRadioButton("Survival");
    skillRadio18.setBounds(810, 273, 130, 23);
    getContentPane().add(skillRadio18);

    skillRadios = new JRadioButton[] { skillRadio1, skillRadio2, skillRadio3, skillRadio4, 
        skillRadio5, skillRadio6, skillRadio7, skillRadio8, skillRadio9, skillRadio10,
        skillRadio11, skillRadio12, skillRadio13, skillRadio14, skillRadio15, skillRadio16,
        skillRadio17, skillRadio18 };

    // Alignment header + radio button for each align.
    alignmentLabel = new JLabel("Alignment");
    alignmentLabel.setBounds(395, 121, 70, 14);
    getContentPane().add(alignmentLabel);

    alignGroup = new ButtonGroup();

    alignRadioLg = new JRadioButton();
    alignRadioLg.setBounds(365, 158, 20, 23);
    getContentPane().add(alignRadioLg);
    alignGroup.add(alignRadioLg);

    alignRadioLn = new JRadioButton();
    alignRadioLn.setBounds(365, 208, 20, 23);
    getContentPane().add(alignRadioLn);
    alignGroup.add(alignRadioLn);

    alignRadioLe = new JRadioButton();
    alignRadioLe.setBounds(365, 258, 20, 23);
    getContentPane().add(alignRadioLe);
    alignGroup.add(alignRadioLe);

    alignRadioNg = new JRadioButton();
    alignRadioNg.setBounds(415, 158, 20, 23);
    getContentPane().add(alignRadioNg);
    alignGroup.add(alignRadioNg);

    alignRadioNn = new JRadioButton();
    alignRadioNn.setBounds(415, 208, 20, 23);
    getContentPane().add(alignRadioNn);
    alignGroup.add(alignRadioNn);

    alignRadioNe = new JRadioButton();
    alignRadioNe.setBounds(415, 258, 20, 23);
    getContentPane().add(alignRadioNe);
    alignGroup.add(alignRadioNe);

    alignRadioCg = new JRadioButton();
    alignRadioCg.setBounds(465, 158, 20, 23);
    getContentPane().add(alignRadioCg);
    alignGroup.add(alignRadioCg);

    alignRadioCn = new JRadioButton();
    alignRadioCn.setBounds(465, 208, 20, 23);
    getContentPane().add(alignRadioCn);
    alignGroup.add(alignRadioCn);

    alignRadioCe = new JRadioButton();
    alignRadioCe.setBounds(465, 258, 20, 23);
    getContentPane().add(alignRadioCe);
    alignGroup.add(alignRadioCe);

    alignRadios = new JRadioButton[] { alignRadioLg, alignRadioLn, alignRadioLe,
        alignRadioNg, alignRadioNn, alignRadioNe,
        alignRadioCg, alignRadioCn, alignRadioCe };

    // separate skills from stats
    separator2 = new JSeparator(SwingConstants.HORIZONTAL);
    separator2.setBounds(327, 108, 595, 2);
    getContentPane().add(separator2);

    // stat display/input
    strText = new JTextField();
    strText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    strText.setBounds(376, 52, 40, 32);
    getContentPane().add(strText);
    strText.setColumns(10);

    dexText = new JTextField();
    dexText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    dexText.setColumns(10);
    dexText.setBounds(426, 52, 40, 32);
    getContentPane().add(dexText);

    conText = new JTextField();
    conText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    conText.setColumns(10);
    conText.setBounds(476, 52, 40, 32);
    getContentPane().add(conText);

    intText = new JTextField();
    intText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    intText.setColumns(10);
    intText.setBounds(526, 52, 40, 32);
    getContentPane().add(intText);

    wisText = new JTextField();
    wisText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    wisText.setColumns(10);
    wisText.setBounds(576, 52, 40, 32);
    getContentPane().add(wisText);

    chaText = new JTextField();
    chaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    chaText.setColumns(10);
    chaText.setBounds(626, 52, 40, 32);
    getContentPane().add(chaText);

    texts = new JTextField[] { strText, dexText, conText, intText, wisText, chaText };

    strLabel = new JLabel("STR");
    strLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    strLabel.setBounds(376, 35, 40, 14);
    getContentPane().add(strLabel);

    dexLabel = new JLabel("DEX");
    dexLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    dexLabel.setBounds(426, 35, 40, 14);
    getContentPane().add(dexLabel);

    conLabel = new JLabel("CON");
    conLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    conLabel.setBounds(476, 35, 40, 14);
    getContentPane().add(conLabel);

    intLabel = new JLabel("INT");
    intLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    intLabel.setBounds(526, 35, 40, 14);
    getContentPane().add(intLabel);

    wisLabel = new JLabel("WIS");
    wisLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    wisLabel.setBounds(576, 35, 40, 14);
    getContentPane().add(wisLabel);

    chaLabel = new JLabel("CHA");
    chaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    chaLabel.setBounds(626, 35, 40, 14);
    getContentPane().add(chaLabel);

    separator3 = new JSeparator(SwingConstants.VERTICAL);
    separator3.setBounds(317, 11, 2, 626);
    getContentPane().add(separator3);

    traitsTextArea = new JTextArea();
    traitsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    traitsTextArea.setWrapStyleWord(true);
    traitsTextArea.setLineWrap(true);
    traitsTextArea.setBounds(23, 258, 273, 80);
    // TraitsTextArea.createRaisedBevelBorder();
    getContentPane().add(traitsTextArea);

    idealsTextArea = new JTextArea();
    idealsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    idealsTextArea.setWrapStyleWord(true);
    idealsTextArea.setLineWrap(true);
    idealsTextArea.setBounds(23, 365, 273, 80);
    getContentPane().add(idealsTextArea);

    bondsTextArea = new JTextArea();
    bondsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    bondsTextArea.setWrapStyleWord(true);
    bondsTextArea.setLineWrap(true);
    bondsTextArea.setBounds(23, 472, 273, 80);
    getContentPane().add(bondsTextArea);

    flawsTextArea = new JTextArea();
    flawsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    flawsTextArea.setWrapStyleWord(true);
    flawsTextArea.setLineWrap(true);
    flawsTextArea.setBounds(23, 579, 272, 80);
    getContentPane().add(flawsTextArea);

    traitsLabel = new JLabel("Personality Traits");
    traitsLabel.setBounds(23, 242, 170, 14);
    getContentPane().add(traitsLabel);

    idealsLabel = new JLabel("Ideals");
    idealsLabel.setBounds(23, 349, 170, 14);
    getContentPane().add(idealsLabel);

    bondsLabel = new JLabel("Bonds");
    bondsLabel.setBounds(23, 456, 170, 14);
    getContentPane().add(bondsLabel);

    flawsLabel = new JLabel("Flaws");
    flawsLabel.setBounds(23, 563, 170, 14);
    getContentPane().add(flawsLabel);

    acText = new JTextField();
    acText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    acText.setColumns(10);
    acText.setBounds(776, 52, 40, 32);
    getContentPane().add(acText);

    JLabel acLabel = new JLabel("AC");
    acLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    acLabel.setBounds(776, 35, 40, 14);
    getContentPane().add(acLabel);

    hpText = new JTextField();
    hpText.setFont(new Font("Tahoma", Font.PLAIN, 20));
    hpText.setColumns(10);
    hpText.setBounds(826, 52, 40, 32);
    getContentPane().add(hpText);

    JLabel hpLabel = new JLabel("MAX\r\n HP");
    hpLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
    hpLabel.setBounds(824, 36, 61, 14);
    getContentPane().add(hpLabel);

    featuresTextArea = new JTextArea();
    featuresTextArea.setWrapStyleWord(true);
    featuresTextArea.setLineWrap(true);
    featuresTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    featuresTextArea.setBounds(337, 335, 185, 324);
    getContentPane().add(featuresTextArea);

    featuresLabel = new JLabel("Features & Traits");
    featuresLabel.setHorizontalAlignment(SwingConstants.CENTER);
    featuresLabel.setBounds(337, 319, 179, 14);
    getContentPane().add(featuresLabel);

    equipLabel = new JLabel("Equipment");
    equipLabel.setHorizontalAlignment(SwingConstants.CENTER);
    equipLabel.setBounds(747, 319, 185, 14);
    getContentPane().add(equipLabel);

    equipTextArea = new JTextArea();
    equipTextArea.setWrapStyleWord(true);
    equipTextArea.setLineWrap(true);
    equipTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    equipTextArea.setBounds(747, 335, 185, 324);
    getContentPane().add(equipTextArea);

    profTextArea = new JTextArea();
    profTextArea.setWrapStyleWord(true);
    profTextArea.setLineWrap(true);
    profTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
    profTextArea.setBounds(542, 335, 185, 324);
    getContentPane().add(profTextArea);

    profLabel = new JLabel("Proficiencies");
    profLabel.setHorizontalAlignment(SwingConstants.CENTER);
    profLabel.setBounds(542, 319, 185, 14);
    getContentPane().add(profLabel);

    separator4 = new JSeparator(SwingConstants.HORIZONTAL);
    separator4.setBounds(327, 306, 595, 2);
    getContentPane().add(separator4);

    JLabel goodLabel = new JLabel("Good");
    goodLabel.setBounds(363, 141, 72, 14);
    getContentPane().add(goodLabel);

    JLabel lawfulLabel = new JLabel("Lawful");
    lawfulLabel.setBounds(322, 162, 63, 14);
    getContentPane().add(lawfulLabel);

    JLabel neutralLawLabel = new JLabel("Neutral");
    neutralLawLabel.setBounds(322, 212, 63, 14);
    getContentPane().add(neutralLawLabel);

    JLabel chaoticLabel = new JLabel("Chaotic");
    chaoticLabel.setBounds(322, 262, 63, 14);
    getContentPane().add(chaoticLabel);

    JLabel placeholderLabel = new JLabel("");
    placeholderLabel.setBounds(498, 85, 46, 14);
    getContentPane().add(placeholderLabel);

    JComboBox<String> subclassBox = new JComboBox<String>();
    subclassBox.setBounds(23, 137, 125, 22);
    getContentPane().add(subclassBox);

    JLabel subclassLabel = new JLabel("Subclass");
    subclassLabel.setBounds(23, 121, 125, 14);
    getContentPane().add(subclassLabel);

    evilLabel = new JLabel("Evil");
    evilLabel.setBounds(468, 141, 48, 14);
    getContentPane().add(evilLabel);

    neutralMoralLabel2 = new JLabel("Neutral");
    neutralMoralLabel2.setBounds(408, 141, 57, 14);
    getContentPane().add(neutralMoralLabel2);

    // JFrame.setLocationRelativeTo(null);
    //      pack();
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
    setVisible(true);
    getContentPane().setLayout(null);
  }

  /**
   * Method to take care of actions initiated by the GUI.

   * @param e An event performed by one of the Listened-to JFrame items
   */
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    if (src == close) {
      System.exit(1);
    }
    if (src == openChar) {
      // Code for opening a character
      JFileChooser sel = new JFileChooser(System.getProperty("user.dir") 
          + "\\src\\dndcompanion\\ExampleChars");
      int status = sel.showOpenDialog(null);
      if (status == JFileChooser.APPROVE_OPTION) {
        String path;
        try {
          path = sel.getSelectedFile().getCanonicalPath();
          loadChar(path, false, false);
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    }
    if (src == saveChar) { // TODO: Refactor saving + give Dragonborn subraces
      String alignment = "";
      if (alignRadioLg.isSelected()) {
        alignment = "LG";
      }
      if (alignRadioLn.isSelected()) {
        alignment = "LN";
      }
      if (alignRadioLe.isSelected()) {
        alignment = "LE";
      }
      if (alignRadioNg.isSelected()) {
        alignment = "NG";
      }
      if (alignRadioNn.isSelected()) {
        alignment = "NN";
      }
      if (alignRadioNe.isSelected()) {
        alignment = "NE";
      }
      if (alignRadioCg.isSelected()) {
        alignment = "CG";
      }
      if (alignRadioCn.isSelected()) {
        alignment = "CN";
      }
      if (alignRadioCe.isSelected()) {
        alignment = "CE";
      }
      DndChar temp = new DndChar();
      temp.setAlignment(alignment);

      int[] stats;
      int str = 0;
      int dex = 0;
      int con = 0;
      int intel = 0;
      int wis = 0;
      int cha = 0;
      try {
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
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid Stat value");
      } finally {
        stats = new int[] { str, dex, con, intel, wis, cha };
        temp.setStats(stats);
      }

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
      temp.setSkills(skills);

      CharacterClass charClass = null;
      if (classBox.getSelectedIndex() == 1) {
        charClass = new Barbarian();
      }
      if (classBox.getSelectedIndex() == 2) {
        charClass = new Bard();
      }
      if (classBox.getSelectedIndex() == 3) {
        charClass = new Cleric();
      }
      if (classBox.getSelectedIndex() == 4) {
        charClass = new Druid();
      }
      if (classBox.getSelectedIndex() == 5) {
        charClass = new Fighter();
      }
      if (classBox.getSelectedIndex() == 6) {
        charClass = new Monk();
      }
      if (classBox.getSelectedIndex() == 7) {
        charClass = new Paladin();
      }
      if (classBox.getSelectedIndex() == 8) {
        charClass = new Ranger();
      }
      if (classBox.getSelectedIndex() == 9) {
        charClass = new Rogue();
      }
      if (classBox.getSelectedIndex() == 10) {
        charClass = new Sorcerer();
      }
      if (classBox.getSelectedIndex() == 11) {
        charClass = new Warlock();
      }
      if (classBox.getSelectedIndex() == 12) {
        charClass = new Wizard();
      }
      temp.setCharClass(charClass);

      Race race = null;
      // Dragonborns
      if (raceBox.getSelectedIndex() == 1) {
        race = new Dragonborn();
      }
      // Dwarves
      if (raceBox.getSelectedIndex() == 2 && subraceBox.getSelectedIndex() == 0) {
        race = new Dwarf("Hill");
      }
      if (raceBox.getSelectedIndex() == 2 && subraceBox.getSelectedIndex() == 1) {
        race = new Dwarf("Mountain");
      }
      // Elves
      if (raceBox.getSelectedIndex() == 3 && subraceBox.getSelectedIndex() == 0) {
        race = new Elf("High");
      }
      if (raceBox.getSelectedIndex() == 3 && subraceBox.getSelectedIndex() == 1) {
        race = new Elf("Wood");
      }
      // Gnomes
      if (raceBox.getSelectedIndex() == 4 && subraceBox.getSelectedIndex() == 0) {
        race = new Gnome("Deep");
      }
      if (raceBox.getSelectedIndex() == 4 && subraceBox.getSelectedIndex() == 1) {
        race = new Gnome("Rock");
      }
      // Half Elves
      if (raceBox.getSelectedIndex() == 5) {
        race = new HalfElf();
      }
      // Halflings
      if (raceBox.getSelectedIndex() == 6 && subraceBox.getSelectedIndex() == 0) {
        race = new Halfling("Lightfoot");
      }
      if (raceBox.getSelectedIndex() == 6 && subraceBox.getSelectedIndex() == 1) {
        race = new Halfling("Stout");
      }
      // Half Orcs
      if (raceBox.getSelectedIndex() == 7) {
        race = new HalfOrc();
      }
      // Human
      if (raceBox.getSelectedIndex() == 8) {
        race = new Human();
      }
      // Tieflings
      if (raceBox.getSelectedIndex() == 9) {
        race = new Tiefling();
      }
      temp.setRace(race);

      String charName = charNameText.getText();
      if (charName.equals("")) {
        charName = "Unnamed";
      }
      temp.setName(charName);

      int xp = 0;
      int armor = 0;
      int hp = 0;

      try {
        if (xpText.getText().equals("")) {
          xp = 0;
        } else {
          xp = Integer.parseInt(xpText.getText());
        }

        if (acText.getText().equals("")) {
          armor = 0;
        } else {
          armor = Integer.parseInt(acText.getText());
        }

        if (hpText.getText().equals("")) {
          hp = 0;
        } else {
          hp = Integer.parseInt(hpText.getText());
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Inalid Stat Value");
      } finally {
        temp.setExp(xp);
        temp.setArmor(armor);
        temp.setMaxHp(hp);
      }
      temp.setLevel(lvlBox.getSelectedIndex() + 1);
      temp.setBackground(bgText.getText());
      temp.setTraits(traitsTextArea.getText());
      temp.setIdeals(idealsTextArea.getText());
      temp.setBonds(bondsTextArea.getText());
      temp.setFlaws(flawsTextArea.getText());
      temp.setFeatures(featuresTextArea.getText());
      temp.setProfs(profTextArea.getText());
      temp.setEquip(equipTextArea.getText());
      temp.setPlayer(playerNameText.getText());

      try (FileOutputStream file = new FileOutputStream(
          System.getProperty("user.dir") + "\\src\\dndcompanion\\ExampleChars\\" 
              + temp.getName() + ".char");
          ObjectOutputStream out = new ObjectOutputStream(file);) {
        out.writeObject(temp);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    if (src == raceBox) {
      int n = raceBox.getSelectedIndex();
      raceSet(n);
    }

    if (src == switchWindow) {
      new CharacterSheet();
      this.dispose();
    }
    if (src == openRoll) {
      new RollingGui();
    }
    if (src == genRestart) {
      loadChar(null, true, false);
    }

    if (src == genCont) {
      System.out.println("Completing");
    }
  }

  private void raceSet(int n) {
    subraceBox.updateUI();
    subraceBox.removeAllItems();
    subraceBox.addItem("");
    subraceLabel.setText("Subrace");
    if (n == 1) {
      String[] list = new String[] { "Brass", "Bronze", "Copper", "Gold",
          "Silver", "Black", "Blue", "Green", "Red", "White" };
      for (int i = 0; i < list.length; i++) {
        subraceBox.addItem(list[i]);
      }
      subraceLabel.setText("Ancestry");
    } else if (n == 2) {
      subraceBox.addItem("Hill");
      subraceBox.addItem("Mountain");
    } else if (n == 3) {
      subraceBox.addItem("High");
      subraceBox.addItem("Wood");
    } else if (n == 4) {
      subraceBox.addItem("Deep");
      subraceBox.addItem("Rock");
    } else if (n == 6) {
      subraceBox.addItem("Lightfoot");
      subraceBox.addItem("Stout");
    } else if (n == 8) {
      String[] list = new String[] { "Calishite", "Chondathan",
          "Damaran", "Illuskan", "Mulan", "Rashemi", "Shou",
          "Tethyrian", "Turami" };
      for (int i = 0; i < list.length; i++) {
        subraceBox.addItem(list[i]);
      }
      subraceLabel.setText("Ethnicity");
    }
    subraceBox.updateUI();
  }

  private void loadChar(String path, boolean randomize, boolean persist) {
    DndChar temp = new DndChar();
    String inputRace;
    int n = 0; // General purpose int used throughout this function
    Random rand = new Random();
    if (!randomize) {
      try {
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(file);
        temp = (DndChar) in.readObject();
        in.close();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      // character name
      charNameText.setText(temp.getName());
    } else {
      n = rand.nextInt(8);
      temp.raceGen(n);
      n = rand.nextInt(12);
      temp.classGen(n);
      temp.setLevel(1);
      n = rand.nextInt(9);
      temp.setAlignment(ALIGNMENTS[n]);
      temp.setExp(0);

      int[] newStats = new int[] { 0, 0, 0, 0, 0, 0 };
      for (int i = 0; i < texts.length; i++) {
        int[] rolls = new int[] { 0, 0, 0, 0 };
        for (int j = 0; j < 4; j++) {
          rolls[j] = rand.nextInt(6) + 1;
        }
        newStats[i] = Arrays.stream(rolls).sum() - Arrays.stream(rolls).min().getAsInt();
      }
      temp.setStats(newStats);

      String newSkills = "";
      for (int i = 0; i < 4; i++) {
        newSkills += " " + SKILLS[rand.nextInt(SKILLS.length)];
      }

      temp.setSkills(newSkills);
    }

    // Get race
    inputRace = temp.getRace().getName();
    for (int i = 1; i < RACE_NAMES.length - 1; i++) {
      if (RACE_NAMES[i].equals(inputRace)) {
        n = i;
      }
    }

    // Set race in GUI
    raceBox.setSelectedIndex(n);

    String[] subraces;
    // checks for subraces and sets up the comboBox if applicable
    subraces = temp.getRace().getSubraces();
    subraceBox.removeAllItems();
    subraceBox.addItem("");
    if (subraces == null) {
      n = -1;
    } else {
      for (int i = 0; i < subraces.length; i++) {
        subraceBox.addItem(subraces[i]);
        if (subraces[i].equals(temp.getRace().getSubrace())) {
          n = i;
        }
      }
    }
    subraceBox.setSelectedIndex(n + 1);

    // Get character class
    String inputClass = temp.getCharClass().getName();
    for (int i = 1; i < CLASS_NAMES.length - 1; i++) {
      if (CLASS_NAMES[i].equals(inputClass)) {
        n = i;
      }
    }

    // Set character class in GUI
    classBox.setSelectedIndex(n);

    // char level
    lvlBox.setSelectedIndex(temp.getLevel() - 1);

    // char alignment
    String alignment = temp.getAlignment();

    for (int i = 0; i < ALIGNMENTS.length; i++) {
      if (ALIGNMENTS[i].equals(alignment)) {
        this.alignRadios[i].doClick();
      }
    }

    // char experience
    xpText.setText("" + temp.getExp());

    // skill radios
    // deselect all skills and select right ones

    for (int i = 0; i < skillRadios.length; i++) {
      if (skillRadios[i].isSelected()) {
        skillRadios[i].doClick();
      }

      if (temp.getSkills().contains(skillRadios[i].getText())) {
        skillRadios[i].doClick();
      }
    }

    // all text areas
    traitsTextArea.setText(temp.getTraits());
    idealsTextArea.setText(temp.getIdeals());
    bondsTextArea.setText(temp.getBonds());
    flawsTextArea.setText(temp.getFlaws());
    featuresTextArea.setText(temp.getFeatures());
    equipTextArea.setText(temp.getEquip());
    profTextArea.setText(temp.getProfs());

    // set stats
    for (int i = 0; i < texts.length; i++) {
      texts[i].setText("" + temp.getStats()[i]);
    }

    // set ac
    acText.setText("" + temp.getArmor());

    // set max HP
    temp.setMaxHp(temp.getCharClass().getHit() + temp.getStats()[2]);
    hpText.setText("" + temp.getMaxHp());

    playerNameText.setText(temp.getPlayer());

    bgText.setText(temp.getBackground());
  }

  /////////////////////////////////////////////////////////////////////////////
  ///////////// Only here for testing purposes. Remove at Release /////////////
  /////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args) {
    new CharacterEditor();
  }
}