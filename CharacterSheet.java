package dndcompanion;

import dndcompanion.character.DndChar;
import dndcompanion.character.chrclasses.Barbarian;
import dndcompanion.character.chrclasses.Fighter;
import dndcompanion.character.chrclasses.Paladin;
import dndcompanion.character.chrclasses.Ranger;
import dndcompanion.character.chrclasses.Sorcerer;
import dndcompanion.character.chrclasses.Wizard;
import dndcompanion.character.chrraces.Dragonborn;
import dndcompanion.character.chrraces.HalfElf;
import dndcompanion.character.chrraces.HalfOrc;
import dndcompanion.character.chrraces.Human;
import dndcompanion.character.chrraces.Tiefling;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



/**
 * GUI Class for displaying a DndChar object for gameplay.

 * @author Nick Ford
 * @author Sam Webb
 *
 */
public class CharacterSheet implements ActionListener {

  private JFrame frame;
  private JMenuBar menus;

  private JMenu fileMenu;
  private JMenuItem openChar;
  private JMenuItem close;
  private JMenu windowMenu;
  private JMenuItem switchWindow;
  private JMenu rollMenu;
  private JMenuItem openRoll;

  private JLabel charNameLabel;
  private JLabel charRace;
  private JLabel charClass;

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
  private JTextField charName;
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
  private JLabel savThroLabel;
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
  private JLabel alignLabel;
  private JTextField playerName;
  private JLabel playerNameLabel;
  private JTextField xpText;
  private JLabel xpLabel;

  private JLabel strSave;
  private JRadioButton strSaveRad;
  private JSeparator saveOutline1;
  private JSeparator saveOutline2;
  private JSeparator saveOutline3;
  private JSeparator saveOutline4;

  private JRadioButton skillRad1;
  private JLabel skillLabel1;
  private JLabel skillLabel2;
  private JRadioButton skillRad2;
  private JLabel skillsLabel;
  private JSeparator skillOutline1;
  private JSeparator skillOutline2;
  private JSeparator skillOutline3;
  private JSeparator skillOutline4;
  private JTextField skillMod1;
  private JTextField skillMod2;
  private JRadioButton skillRad3;
  private JTextField skillMod3;
  private JLabel skillLabel3;
  private JRadioButton skillRad6;
  private JTextField skillMod6;
  private JLabel skillLabel6;
  private JRadioButton skillRad5;
  private JTextField skillMod5;
  private JLabel skillLabel5;
  private JLabel skillLabel4;
  private JTextField skillMod4;
  private JRadioButton skillRad4;
  private JRadioButton skillRad7;
  private JTextField skillMod7;
  private JLabel skillLabel7;
  private JRadioButton skillRad8;
  private JTextField skillMod8;
  private JLabel skillLabel8;
  private JRadioButton skillRad9;
  private JTextField skillMod9;
  private JLabel skillLabel9;
  private JLabel skillLabel10;
  private JTextField skillMod10;
  private JRadioButton skillRad10;
  private JRadioButton skillRad11;
  private JTextField skillMod11;
  private JLabel skillLabel11;
  private JLabel skillLabel12;
  private JTextField skillMod12;
  private JRadioButton skillRad12;
  private JRadioButton skillRad13;
  private JTextField skillMod13;
  private JLabel skillLabel13;
  private JRadioButton skillRad14;
  private JTextField skillMod14;
  private JLabel skillLabel14;
  private JRadioButton skillRad15;
  private JTextField skillMod15;
  private JLabel skillLabel15;
  private JLabel skillLabel16;
  private JTextField skillMod16;
  private JRadioButton skillRad16;
  private JRadioButton skillRad17;
  private JTextField skillMod17;
  private JLabel skillLabel17;
  private JLabel skillLabel18;
  private JTextField skillMod18;
  private JRadioButton skillRad18;
  private JTextField profBonusText;
  private JTextField acText;
  private JTextField initiative;
  private JTextField speed;
  private JTextField tempHp;
  private JTextField totalHp;
  private JTextField currentHp;
  private JTextField hitDice;
  private JSeparator deathSavOutline1;
  private JSeparator deathSavOutline3;
  private JSeparator deathSavOutline4;
  private JSeparator deathSavOutline2;
  private JLabel successLabel;
  private JLabel failsLabel;
  private JRadioButton success1;
  private JRadioButton success2;
  private JRadioButton success3;
  private JRadioButton fails3;
  private JRadioButton fails2;
  private JRadioButton fails1;
  private JTextField inspiration;
  private JLabel inspirationLabel;
  private JLabel acLabel;
  private JLabel initLabel;
  private JLabel speedLabel;
  private JLabel currHpLabel;
  private JLabel maxHpLabel;
  private JLabel tempHpLabel;
  private JLabel hitDiceLabel;
  private JLabel deathSavLabel;
  private JTextArea traitsText;
  private JSeparator traitOutline2;
  private JSeparator traitOutline3;
  private JSeparator traitOutline4;
  private JSeparator idealsOutline1;
  private JSeparator idealsOutline2;
  private JSeparator idealsOutline3;
  private JSeparator idealsOutline4;
  private JTextArea idealsText;
  private JSeparator bondsOutline1;
  private JSeparator bondsOutline2;
  private JSeparator bondsOutline3;
  private JSeparator bondsOutline4;
  private JTextArea bondsText;
  private JSeparator flawsOutline1;
  private JSeparator flawsOutline2;
  private JSeparator flawsOutline3;
  private JSeparator flawsOutline4;
  private JTextArea flawsText;
  private JLabel traitsLabel;
  private JLabel idealsLabel;
  private JLabel bondsLabel;
  private JLabel flawsLabel;
  private JTextField passiveText;
  private JLabel profBonusLabel;
  private JLabel hpDivSign;
  private JLabel profsLabel;
  private JTextArea profsText;
  private JSeparator traitsOutline1;
  private JLabel equipLabel;
  private JTextArea equipText;
  private JTextArea featuresText;
  private JLabel placeholderLabel;
  private JLabel passiveLabel;
  private JLabel featuresLabel;
  private JScrollPane scrollPane;

  /**
   * Constructor for CharacterSheet that loads all the GUI components.
   */
  public CharacterSheet() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
    frame.setMinimumSize(new Dimension(1050, 970));
    frame.setSize(1500, 1500);
    // Menus

    menus = new JMenuBar();

    fileMenu = new JMenu("File");
    openChar = new JMenuItem("Open Character");
    close = new JMenuItem("Close");
    fileMenu.add(openChar);
    fileMenu.addSeparator();
    fileMenu.add(close);
    openChar.addActionListener(this);
    close.addActionListener(this);
    menus.add(fileMenu);

    windowMenu = new JMenu("Window");
    switchWindow = new JMenuItem("Switch View");
    windowMenu.add(switchWindow);
    switchWindow.addActionListener(this);
    menus.add(windowMenu);

    rollMenu = new JMenu("Roll");
    openRoll = new JMenuItem("E-Dice");
    rollMenu.add(openRoll);
    openRoll.addActionListener(this);
    menus.add(rollMenu);

    frame.setJMenuBar(menus);

    // Items inside CharacterSheet

    charNameLabel = new JLabel("Character Name");
    charNameLabel.setBounds(111, 95, 98, 15);
    frame.getContentPane().add(charNameLabel);

    charRace = new JLabel("Race");
    charRace.setBounds(399, 115, 70, 15);
    frame.getContentPane().add(charRace);

    charClass = new JLabel("Class & Level");
    charClass.setBounds(399, 64, 84, 15);
    frame.getContentPane().add(charClass);

    strStatLabel = new JLabel("Strength");
    strStatLabel.setBounds(36, 115, 50, 15);
    frame.getContentPane().add(strStatLabel);

    strStat = new JTextField();
    strStat.setHorizontalAlignment(SwingConstants.CENTER);
    strStat.setBackground(new Color(255, 255, 255));
    strStat.setEditable(false);
    strStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    strStat.setBounds(27, 129, 60, 70);
    frame.getContentPane().add(strStat);
    strStat.setColumns(10);

    strMod = new JTextField();
    strMod.setHorizontalAlignment(SwingConstants.CENTER);
    strMod.setBackground(new Color(255, 255, 255));
    strMod.setEditable(false);
    strMod.setBounds(42, 197, 30, 30);
    frame.getContentPane().add(strMod);
    strMod.setColumns(10);

    dexStatLabel = new JLabel("Dexterity");
    dexStatLabel.setBounds(35, 234, 70, 15);
    frame.getContentPane().add(dexStatLabel);

    dexStat = new JTextField();
    dexStat.setHorizontalAlignment(SwingConstants.CENTER);
    dexStat.setBackground(Color.WHITE);
    dexStat.setEditable(false);
    dexStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    dexStat.setColumns(10);
    dexStat.setBounds(27, 248, 60, 70);
    frame.getContentPane().add(dexStat);

    dexMod = new JTextField();
    dexMod.setBackground(Color.WHITE);
    dexMod.setEditable(false);
    dexMod.setColumns(10);
    dexMod.setBounds(42, 317, 30, 30);
    frame.getContentPane().add(dexMod);

    conStatLabel = new JLabel("Constitution");
    conStatLabel.setBounds(27, 354, 70, 15);
    frame.getContentPane().add(conStatLabel);

    conStat = new JTextField();
    conStat.setHorizontalAlignment(SwingConstants.CENTER);
    conStat.setBackground(new Color(255, 255, 255));
    conStat.setEditable(false);
    conStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    conStat.setColumns(10);
    conStat.setBounds(27, 368, 60, 70);
    frame.getContentPane().add(conStat);

    conMod = new JTextField();
    conMod.setHorizontalAlignment(SwingConstants.CENTER);
    conMod.setBackground(new Color(255, 255, 255));
    conMod.setEditable(false);
    conMod.setColumns(10);
    conMod.setBounds(42, 437, 30, 30);
    frame.getContentPane().add(conMod);

    intStatLabel = new JLabel("Intelligence");
    intStatLabel.setBounds(29, 474, 70, 15);
    frame.getContentPane().add(intStatLabel);

    intStat = new JTextField();
    intStat.setHorizontalAlignment(SwingConstants.CENTER);
    intStat.setBackground(new Color(255, 255, 255));
    intStat.setEditable(false);
    intStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    intStat.setColumns(10);
    intStat.setBounds(27, 488, 60, 70);
    frame.getContentPane().add(intStat);

    intMod = new JTextField();
    intMod.setHorizontalAlignment(SwingConstants.CENTER);
    intMod.setBackground(new Color(255, 255, 255));
    intMod.setEditable(false);
    intMod.setColumns(10);
    intMod.setBounds(42, 557, 30, 30);
    frame.getContentPane().add(intMod);

    wisStatLabel = new JLabel("Wisdom");
    wisStatLabel.setBounds(38, 594, 50, 15);
    frame.getContentPane().add(wisStatLabel);

    wisStat = new JTextField();
    wisStat.setHorizontalAlignment(SwingConstants.CENTER);
    wisStat.setBackground(new Color(255, 255, 255));
    wisStat.setEditable(false);
    wisStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    wisStat.setColumns(10);
    wisStat.setBounds(27, 608, 60, 70);
    frame.getContentPane().add(wisStat);

    wisMod = new JTextField();
    wisMod.setHorizontalAlignment(SwingConstants.CENTER);
    wisMod.setBackground(new Color(255, 255, 255));
    wisMod.setEditable(false);
    wisMod.setColumns(10);
    wisMod.setBounds(42, 677, 30, 30);
    frame.getContentPane().add(wisMod);

    chaStatLabel = new JLabel("Charisma");
    chaStatLabel.setBounds(35, 714, 60, 15);
    frame.getContentPane().add(chaStatLabel);

    chaStat = new JTextField();
    chaStat.setHorizontalAlignment(SwingConstants.CENTER);
    chaStat.setBackground(new Color(255, 255, 255));
    chaStat.setEditable(false);
    chaStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
    chaStat.setColumns(10);
    chaStat.setBounds(27, 728, 60, 70);
    frame.getContentPane().add(chaStat); 

    chaMod = new JTextField();
    chaMod.setHorizontalAlignment(SwingConstants.CENTER);
    chaMod.setBackground(new Color(255, 255, 255));
    chaMod.setEditable(false);
    chaMod.setColumns(10);
    chaMod.setBounds(42, 797, 30, 30);
    frame.getContentPane().add(chaMod);

    charName = new JTextField();
    charName.setBackground(Color.WHITE);
    charName.setEditable(false);
    charName.setBounds(101, 51, 246, 41);
    frame.getContentPane().add(charName);
    charName.setColumns(10);

    strSaveRad = new JRadioButton("");
    strSaveRad.setBounds(163, 145, 20, 20);
    frame.getContentPane().add(strSaveRad);

    strSave = new JLabel("Strength");
    strSave.setBounds(218, 145, 85, 20);
    frame.getContentPane().add(strSave);

    strSaveMod = new JTextField();
    strSaveMod.setEditable(false);
    strSaveMod.setBackground(SystemColor.menu);
    strSaveMod.setBounds(190, 145, 20, 20);
    frame.getContentPane().add(strSaveMod);
    strSaveMod.setColumns(10);

    dexSave = new JLabel("Dexterity");
    dexSave.setBounds(218, 172, 85, 20);
    frame.getContentPane().add(dexSave);

    dexSaveMod = new JTextField();
    dexSaveMod.setEditable(false);
    dexSaveMod.setColumns(10);
    dexSaveMod.setBackground(SystemColor.menu);
    dexSaveMod.setBounds(190, 172, 20, 20);
    frame.getContentPane().add(dexSaveMod);

    dexSaveRad = new JRadioButton("");
    dexSaveRad.setBounds(163, 172, 20, 20);
    frame.getContentPane().add(dexSaveRad);

    conSave = new JLabel("Constitution");
    conSave.setBounds(218, 199, 85, 20);
    frame.getContentPane().add(conSave);

    conSaveMod = new JTextField();
    conSaveMod.setEditable(false);
    conSaveMod.setColumns(10);
    conSaveMod.setBackground(SystemColor.menu);
    conSaveMod.setBounds(190, 199, 20, 20);
    frame.getContentPane().add(conSaveMod);

    conSaveRad = new JRadioButton("");
    conSaveRad.setBounds(163, 199, 20, 20);
    frame.getContentPane().add(conSaveRad);

    intSave = new JLabel("Intelligence");
    intSave.setBounds(218, 226, 85, 20);
    frame.getContentPane().add(intSave);

    intSaveMod = new JTextField();
    intSaveMod.setEditable(false);
    intSaveMod.setColumns(10);
    intSaveMod.setBackground(SystemColor.menu);
    intSaveMod.setBounds(190, 226, 20, 20);
    frame.getContentPane().add(intSaveMod);

    intSaveRad = new JRadioButton("");
    intSaveRad.setBounds(163, 226, 20, 20);
    frame.getContentPane().add(intSaveRad);

    wisSave = new JLabel("Wisdom");
    wisSave.setBounds(218, 253, 85, 20);
    frame.getContentPane().add(wisSave);

    wisSaveMod = new JTextField();
    wisSaveMod.setEditable(false);
    wisSaveMod.setColumns(10);
    wisSaveMod.setBackground(SystemColor.menu);
    wisSaveMod.setBounds(190, 253, 20, 20);
    frame.getContentPane().add(wisSaveMod);

    wisSaveRad = new JRadioButton("");
    wisSaveRad.setBounds(163, 253, 20, 20);
    frame.getContentPane().add(wisSaveRad);

    chaSave = new JLabel("Charisma");
    chaSave.setBounds(218, 280, 85, 20);
    frame.getContentPane().add(chaSave);

    chaSaveMod = new JTextField();
    chaSaveMod.setEditable(false);
    chaSaveMod.setColumns(10);
    chaSaveMod.setBackground(SystemColor.menu);
    chaSaveMod.setBounds(190, 280, 20, 20);
    frame.getContentPane().add(chaSaveMod);

    chaSaveRad = new JRadioButton("");
    chaSaveRad.setBounds(163, 280, 20, 20);
    frame.getContentPane().add(chaSaveRad);



    saveOutline1 = new JSeparator();
    saveOutline1.setBounds(150, 129, 165, 2);
    frame.getContentPane().add(saveOutline1);

    saveOutline2 = new JSeparator();
    saveOutline2.setBounds(150, 329, 165, 2);
    frame.getContentPane().add(saveOutline2);

    saveOutline3 = new JSeparator();
    saveOutline3.setOrientation(SwingConstants.VERTICAL);
    saveOutline3.setBounds(149, 129, 2, 200);
    frame.getContentPane().add(saveOutline3);

    saveOutline4 = new JSeparator();
    saveOutline4.setOrientation(SwingConstants.VERTICAL);
    saveOutline4.setBounds(315, 129, 2, 200);
    frame.getContentPane().add(saveOutline4);

    savThroLabel = new JLabel("Saving Throws");
    savThroLabel.setBounds(200, 311, 91, 14);
    frame.getContentPane().add(savThroLabel);



    classLvl = new JTextField();
    classLvl.setBackground(new Color(255, 255, 255));
    classLvl.setEditable(false);
    classLvl.setBounds(397, 29, 178, 34);
    frame.getContentPane().add(classLvl);
    classLvl.setColumns(10);

    raceText = new JTextField();
    raceText.setEditable(false);
    raceText.setColumns(10);
    raceText.setBackground(Color.WHITE);
    raceText.setBounds(397, 78, 178, 34);
    frame.getContentPane().add(raceText);

    bgText = new JTextField();
    bgText.setEditable(false);
    bgText.setColumns(10);
    bgText.setBackground(Color.WHITE);
    bgText.setBounds(600, 29, 178, 34);
    frame.getContentPane().add(bgText);

    bgLabel = new JLabel("Background");
    bgLabel.setBounds(602, 64, 84, 15);
    frame.getContentPane().add(bgLabel);

    alignText = new JTextField();
    alignText.setEditable(false);
    alignText.setColumns(10);
    alignText.setBackground(Color.WHITE);
    alignText.setBounds(600, 78, 178, 34);
    frame.getContentPane().add(alignText);

    alignLabel = new JLabel("Alignment");
    alignLabel.setBounds(602, 115, 70, 15);
    frame.getContentPane().add(alignLabel);

    playerName = new JTextField();
    playerName.setEditable(false);
    playerName.setColumns(10);
    playerName.setBackground(Color.WHITE);
    playerName.setBounds(807, 29, 178, 34);
    frame.getContentPane().add(playerName);

    playerNameLabel = new JLabel("Player Name");
    playerNameLabel.setBounds(807, 64, 84, 15);
    frame.getContentPane().add(playerNameLabel);

    xpText = new JTextField();
    xpText.setEditable(false);
    xpText.setColumns(10);
    xpText.setBackground(Color.WHITE);
    xpText.setBounds(805, 78, 178, 34);
    frame.getContentPane().add(xpText);

    xpLabel = new JLabel("Experience Points");
    xpLabel.setBounds(807, 115, 113, 15);
    frame.getContentPane().add(xpLabel);

    skillRad1 = new JRadioButton("");
    skillRad1.setBounds(164, 358, 20, 20);
    frame.getContentPane().add(skillRad1);

    skillMod1 = new JTextField();
    skillMod1.setEditable(false);
    skillMod1.setColumns(10);
    skillMod1.setBackground(SystemColor.menu);
    skillMod1.setBounds(191, 358, 20, 20);
    frame.getContentPane().add(skillMod1);

    skillLabel1 = new JLabel("Acrobatics");
    skillLabel1.setBounds(219, 358, 85, 20);
    frame.getContentPane().add(skillLabel1);

    skillOutline1 = new JSeparator();
    skillOutline1.setBounds(151, 342, 165, 2);
    frame.getContentPane().add(skillOutline1);

    skillOutline2 = new JSeparator();
    skillOutline2.setOrientation(SwingConstants.VERTICAL);
    skillOutline2.setBounds(150, 342, 2, 543);
    frame.getContentPane().add(skillOutline2);

    skillOutline4 = new JSeparator();
    skillOutline4.setOrientation(SwingConstants.VERTICAL);
    skillOutline4.setBounds(315, 342, 2, 543);
    frame.getContentPane().add(skillOutline4);

    skillOutline3 = new JSeparator();
    skillOutline3.setBounds(151, 885, 165, 2);
    frame.getContentPane().add(skillOutline3);

    skillsLabel = new JLabel("Skill Proficiencies");
    skillsLabel.setBounds(184, 867, 105, 14);
    frame.getContentPane().add(skillsLabel);

    skillRad2 = new JRadioButton("");
    skillRad2.setBounds(164, 387, 20, 20);
    frame.getContentPane().add(skillRad2);

    skillMod2 = new JTextField();
    skillMod2.setEditable(false);
    skillMod2.setColumns(10);
    skillMod2.setBackground(SystemColor.menu);
    skillMod2.setBounds(191, 387, 20, 20);
    frame.getContentPane().add(skillMod2);

    skillLabel2 = new JLabel("Animal Handling");
    skillLabel2.setBounds(219, 387, 91, 20);
    frame.getContentPane().add(skillLabel2);

    skillRad3 = new JRadioButton("");
    skillRad3.setBounds(164, 414, 20, 20);
    frame.getContentPane().add(skillRad3);

    skillMod3 = new JTextField();
    skillMod3.setEditable(false);
    skillMod3.setColumns(10);
    skillMod3.setBackground(SystemColor.menu);
    skillMod3.setBounds(191, 414, 20, 20);
    frame.getContentPane().add(skillMod3);

    skillLabel3 = new JLabel("Arcana");
    skillLabel3.setBounds(219, 414, 85, 20);
    frame.getContentPane().add(skillLabel3);

    skillRad6 = new JRadioButton("");
    skillRad6.setBounds(164, 499, 20, 20);
    frame.getContentPane().add(skillRad6);

    skillMod6 = new JTextField();
    skillMod6.setEditable(false);
    skillMod6.setColumns(10);
    skillMod6.setBackground(SystemColor.menu);
    skillMod6.setBounds(191, 499, 20, 20);
    frame.getContentPane().add(skillMod6);

    skillLabel6 = new JLabel("History");
    skillLabel6.setBounds(219, 499, 85, 20);
    frame.getContentPane().add(skillLabel6);

    skillRad5 = new JRadioButton("");
    skillRad5.setBounds(164, 472, 20, 20);
    frame.getContentPane().add(skillRad5);

    skillMod5 = new JTextField();
    skillMod5.setEditable(false);
    skillMod5.setColumns(10);
    skillMod5.setBackground(SystemColor.menu);
    skillMod5.setBounds(191, 472, 20, 20);
    frame.getContentPane().add(skillMod5);

    skillLabel5 = new JLabel("Deception");
    skillLabel5.setBounds(219, 472, 85, 20);
    frame.getContentPane().add(skillLabel5);

    skillLabel4 = new JLabel("Athletics");
    skillLabel4.setBounds(219, 443, 85, 20);
    frame.getContentPane().add(skillLabel4);

    skillMod4 = new JTextField();
    skillMod4.setEditable(false);
    skillMod4.setColumns(10);
    skillMod4.setBackground(SystemColor.menu);
    skillMod4.setBounds(191, 443, 20, 20);
    frame.getContentPane().add(skillMod4);

    skillRad4 = new JRadioButton("");
    skillRad4.setBounds(164, 443, 20, 20);
    frame.getContentPane().add(skillRad4);

    skillRad7 = new JRadioButton("");
    skillRad7.setBounds(164, 527, 20, 20);
    frame.getContentPane().add(skillRad7);

    skillMod7 = new JTextField();
    skillMod7.setEditable(false);
    skillMod7.setColumns(10);
    skillMod7.setBackground(SystemColor.menu);
    skillMod7.setBounds(191, 527, 20, 20);
    frame.getContentPane().add(skillMod7);

    skillLabel7 = new JLabel("Insight");
    skillLabel7.setBounds(219, 527, 85, 20);
    frame.getContentPane().add(skillLabel7);

    skillRad8 = new JRadioButton("");
    skillRad8.setBounds(164, 556, 20, 20);
    frame.getContentPane().add(skillRad8);

    skillMod8 = new JTextField();
    skillMod8.setEditable(false);
    skillMod8.setColumns(10);
    skillMod8.setBackground(SystemColor.menu);
    skillMod8.setBounds(191, 556, 20, 20);
    frame.getContentPane().add(skillMod8);

    skillLabel8 = new JLabel("Intimidation");
    skillLabel8.setBounds(219, 556, 85, 20);
    frame.getContentPane().add(skillLabel8);

    skillRad9 = new JRadioButton("");
    skillRad9.setBounds(164, 583, 20, 20);
    frame.getContentPane().add(skillRad9);

    skillMod9 = new JTextField();
    skillMod9.setEditable(false);
    skillMod9.setColumns(10);
    skillMod9.setBackground(SystemColor.menu);
    skillMod9.setBounds(191, 583, 20, 20);
    frame.getContentPane().add(skillMod9);

    skillLabel9 = new JLabel("Investigation");
    skillLabel9.setBounds(219, 583, 85, 20);
    frame.getContentPane().add(skillLabel9);

    skillLabel10 = new JLabel("Medicine");
    skillLabel10.setBounds(219, 612, 85, 20);
    frame.getContentPane().add(skillLabel10);

    skillMod10 = new JTextField();
    skillMod10.setEditable(false);
    skillMod10.setColumns(10);
    skillMod10.setBackground(SystemColor.menu);
    skillMod10.setBounds(191, 612, 20, 20);
    frame.getContentPane().add(skillMod10);

    skillRad10 = new JRadioButton("");
    skillRad10.setBounds(164, 612, 20, 20);
    frame.getContentPane().add(skillRad10);

    skillRad11 = new JRadioButton("");
    skillRad11.setBounds(164, 641, 20, 20);
    frame.getContentPane().add(skillRad11);

    skillMod11 = new JTextField();
    skillMod11.setEditable(false);
    skillMod11.setColumns(10);
    skillMod11.setBackground(SystemColor.menu);
    skillMod11.setBounds(191, 641, 20, 20);
    frame.getContentPane().add(skillMod11);

    skillLabel11 = new JLabel("Nature");
    skillLabel11.setBounds(219, 641, 85, 20);
    frame.getContentPane().add(skillLabel11);

    skillLabel12 = new JLabel("Perception");
    skillLabel12.setBounds(219, 668, 85, 20);
    frame.getContentPane().add(skillLabel12);

    skillMod12 = new JTextField();
    skillMod12.setEditable(false);
    skillMod12.setColumns(10);
    skillMod12.setBackground(SystemColor.menu);
    skillMod12.setBounds(191, 668, 20, 20);
    frame.getContentPane().add(skillMod12);

    skillRad12 = new JRadioButton("");
    skillRad12.setBounds(164, 668, 20, 20);
    frame.getContentPane().add(skillRad12);

    skillRad13 = new JRadioButton("");
    skillRad13.setBounds(164, 695, 20, 20);
    frame.getContentPane().add(skillRad13);

    skillMod13 = new JTextField();
    skillMod13.setEditable(false);
    skillMod13.setColumns(10);
    skillMod13.setBackground(SystemColor.menu);
    skillMod13.setBounds(191, 695, 20, 20);
    frame.getContentPane().add(skillMod13);

    skillLabel13 = new JLabel("Performance");
    skillLabel13.setBounds(219, 695, 85, 20);
    frame.getContentPane().add(skillLabel13);

    skillRad14 = new JRadioButton("");
    skillRad14.setBounds(164, 724, 20, 20);
    frame.getContentPane().add(skillRad14);

    skillMod14 = new JTextField();
    skillMod14.setEditable(false);
    skillMod14.setColumns(10);
    skillMod14.setBackground(SystemColor.menu);
    skillMod14.setBounds(191, 724, 20, 20);
    frame.getContentPane().add(skillMod14);

    skillLabel14 = new JLabel("Persuasion");
    skillLabel14.setBounds(219, 724, 85, 20);
    frame.getContentPane().add(skillLabel14);

    skillRad15 = new JRadioButton("");
    skillRad15.setBounds(164, 751, 20, 20);
    frame.getContentPane().add(skillRad15);

    skillMod15 = new JTextField();
    skillMod15.setEditable(false);
    skillMod15.setColumns(10);
    skillMod15.setBackground(SystemColor.menu);
    skillMod15.setBounds(191, 751, 20, 20);
    frame.getContentPane().add(skillMod15);

    skillLabel15 = new JLabel("Religion");
    skillLabel15.setBounds(219, 751, 85, 20);
    frame.getContentPane().add(skillLabel15);

    skillLabel16 = new JLabel("Sleight of Hand");
    skillLabel16.setBounds(219, 780, 85, 20);
    frame.getContentPane().add(skillLabel16);

    skillMod16 = new JTextField();
    skillMod16.setEditable(false);
    skillMod16.setColumns(10);
    skillMod16.setBackground(SystemColor.menu);
    skillMod16.setBounds(191, 780, 20, 20);
    frame.getContentPane().add(skillMod16);

    skillRad16 = new JRadioButton("");
    skillRad16.setBounds(164, 780, 20, 20);
    frame.getContentPane().add(skillRad16);

    skillRad17 = new JRadioButton("");
    skillRad17.setBounds(164, 809, 20, 20);
    frame.getContentPane().add(skillRad17);

    skillMod17 = new JTextField();
    skillMod17.setEditable(false);
    skillMod17.setColumns(10);
    skillMod17.setBackground(SystemColor.menu);
    skillMod17.setBounds(191, 809, 20, 20);
    frame.getContentPane().add(skillMod17);

    skillLabel17 = new JLabel("Stealth");
    skillLabel17.setBounds(219, 809, 85, 20);
    frame.getContentPane().add(skillLabel17);

    skillLabel18 = new JLabel("Survival");
    skillLabel18.setBounds(219, 836, 85, 20);
    frame.getContentPane().add(skillLabel18);

    skillMod18 = new JTextField();
    skillMod18.setEditable(false);
    skillMod18.setColumns(10);
    skillMod18.setBackground(SystemColor.menu);
    skillMod18.setBounds(191, 836, 20, 20);
    frame.getContentPane().add(skillMod18);

    skillRad18 = new JRadioButton("");
    skillRad18.setBounds(164, 836, 20, 20);
    frame.getContentPane().add(skillRad18);

    profBonusText = new JTextField();
    profBonusText.setEditable(false);
    profBonusText.setHorizontalAlignment(SwingConstants.CENTER);
    profBonusText.setBackground(new Color(255, 255, 255));
    profBonusText.setFont(new Font("Tahoma", Font.PLAIN, 25));
    profBonusText.setBounds(462, 193, 45, 45);
    frame.getContentPane().add(profBonusText);
    profBonusText.setColumns(10);

    profBonusLabel = new JLabel("Proficiency Bonus");
    profBonusLabel.setBounds(517, 207, 107, 14);
    frame.getContentPane().add(profBonusLabel);

    acText = new JTextField();
    acText.setHorizontalAlignment(SwingConstants.CENTER);
    acText.setBackground(new Color(255, 255, 255));
    acText.setEditable(false);
    acText.setFont(new Font("Tahoma", Font.PLAIN, 25));
    acText.setBounds(439, 285, 55, 55);
    frame.getContentPane().add(acText);
    acText.setColumns(10);

    initiative = new JTextField();
    initiative.setHorizontalAlignment(SwingConstants.CENTER);
    initiative.setFont(new Font("Tahoma", Font.PLAIN, 25));
    initiative.setEditable(false);
    initiative.setColumns(10);
    initiative.setBackground(Color.WHITE);
    initiative.setBounds(504, 285, 55, 55);
    frame.getContentPane().add(initiative);

    speed = new JTextField();
    speed.setHorizontalAlignment(SwingConstants.CENTER);
    speed.setFont(new Font("Tahoma", Font.PLAIN, 25));
    speed.setEditable(false);
    speed.setColumns(10);
    speed.setBackground(Color.WHITE);
    speed.setBounds(569, 285, 55, 55);
    frame.getContentPane().add(speed);

    tempHp = new JTextField();
    tempHp.setHorizontalAlignment(SwingConstants.CENTER);
    tempHp.setFont(new Font("Tahoma", Font.PLAIN, 25));
    tempHp.setColumns(10);
    tempHp.setBackground(Color.WHITE);
    tempHp.setBounds(439, 442, 185, 55);
    frame.getContentPane().add(tempHp);

    totalHp = new JTextField();
    totalHp.setEditable(false);
    totalHp.setHorizontalAlignment(SwingConstants.LEFT);
    totalHp.setFont(new Font("Tahoma", Font.PLAIN, 25));
    totalHp.setColumns(10);
    totalHp.setBackground(Color.WHITE);
    totalHp.setBounds(546, 365, 78, 55);
    frame.getContentPane().add(totalHp);

    currentHp = new JTextField();
    currentHp.setHorizontalAlignment(SwingConstants.RIGHT);
    currentHp.setFont(new Font("Tahoma", Font.PLAIN, 25));
    currentHp.setColumns(10);
    currentHp.setBackground(Color.WHITE);
    currentHp.setBounds(439, 365, 78, 55);
    frame.getContentPane().add(currentHp);

    hpDivSign = new JLabel("/");
    hpDivSign.setFont(new Font("Tahoma", Font.PLAIN, 40));
    hpDivSign.setBounds(525, 361, 30, 53);
    frame.getContentPane().add(hpDivSign);

    hitDice = new JTextField();
    hitDice.setEditable(false);
    hitDice.setHorizontalAlignment(SwingConstants.CENTER);
    hitDice.setFont(new Font("Tahoma", Font.PLAIN, 23));
    hitDice.setColumns(10);
    hitDice.setBackground(Color.WHITE);
    hitDice.setBounds(439, 526, 55, 55);
    frame.getContentPane().add(hitDice);

    deathSavOutline1 = new JSeparator();
    deathSavOutline1.setBounds(504, 526, 119, 2);
    frame.getContentPane().add(deathSavOutline1);

    deathSavOutline3 = new JSeparator();
    deathSavOutline3.setBounds(504, 580, 119, 2);
    frame.getContentPane().add(deathSavOutline3);

    deathSavOutline4 = new JSeparator();
    deathSavOutline4.setOrientation(SwingConstants.VERTICAL);
    deathSavOutline4.setBounds(622, 526, 2, 55);
    frame.getContentPane().add(deathSavOutline4);

    deathSavOutline2 = new JSeparator();
    deathSavOutline2.setOrientation(SwingConstants.VERTICAL);
    deathSavOutline2.setBounds(504, 526, 2, 55);
    frame.getContentPane().add(deathSavOutline2);

    successLabel = new JLabel("Successes");
    successLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
    successLabel.setBounds(511, 535, 50, 14);
    frame.getContentPane().add(successLabel);

    failsLabel = new JLabel("Failures");
    failsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
    failsLabel.setBounds(511, 555, 40, 14);
    frame.getContentPane().add(failsLabel);

    success1 = new JRadioButton("");
    success1.setBounds(556, 532, 20, 20);
    frame.getContentPane().add(success1);

    success2 = new JRadioButton("");
    success2.setBounds(576, 532, 20, 20);
    frame.getContentPane().add(success2);

    success3 = new JRadioButton("");
    success3.setBounds(596, 532, 20, 20);
    frame.getContentPane().add(success3);

    fails3 = new JRadioButton("");
    fails3.setBounds(596, 552, 20, 23);
    frame.getContentPane().add(fails3);

    fails2 = new JRadioButton("");
    fails2.setBounds(576, 552, 20, 23);
    frame.getContentPane().add(fails2);

    fails1 = new JRadioButton("");
    fails1.setBounds(556, 552, 20, 20);
    frame.getContentPane().add(fails1);

    inspiration = new JTextField();
    inspiration.setHorizontalAlignment(SwingConstants.CENTER);
    inspiration.setFont(new Font("Tahoma", Font.PLAIN, 25));
    inspiration.setColumns(10);
    inspiration.setBackground(Color.WHITE);
    inspiration.setBounds(462, 140, 45, 45);
    frame.getContentPane().add(inspiration);

    inspirationLabel = new JLabel("Inspiration Dice");
    inspirationLabel.setBounds(517, 158, 98, 14);
    frame.getContentPane().add(inspirationLabel);

    acLabel = new JLabel("Armor Class");
    acLabel.setBounds(439, 342, 78, 14);
    frame.getContentPane().add(acLabel);

    initLabel = new JLabel("Initiative");
    initLabel.setBounds(514, 342, 61, 14);
    frame.getContentPane().add(initLabel);

    speedLabel = new JLabel("Speed");
    speedLabel.setBounds(579, 342, 46, 14);
    frame.getContentPane().add(speedLabel);

    currHpLabel = new JLabel("Current HP");
    currHpLabel.setHorizontalAlignment(SwingConstants.CENTER);
    currHpLabel.setBounds(439, 421, 78, 14);
    frame.getContentPane().add(currHpLabel);

    maxHpLabel = new JLabel("Max HP");
    maxHpLabel.setHorizontalAlignment(SwingConstants.CENTER);
    maxHpLabel.setBounds(546, 421, 78, 14);
    frame.getContentPane().add(maxHpLabel);

    tempHpLabel = new JLabel("Temporary HP");
    tempHpLabel.setHorizontalAlignment(SwingConstants.CENTER);
    tempHpLabel.setBounds(439, 499, 185, 14);
    frame.getContentPane().add(tempHpLabel);

    hitDiceLabel = new JLabel("Hit Dice");
    hitDiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
    hitDiceLabel.setBounds(439, 583, 55, 14);
    frame.getContentPane().add(hitDiceLabel);

    deathSavLabel = new JLabel("Death Saves");
    deathSavLabel.setHorizontalAlignment(SwingConstants.CENTER);
    deathSavLabel.setBounds(504, 583, 120, 14);
    frame.getContentPane().add(deathSavLabel);

    profsLabel = new JLabel("Proficiencies & Languages");
    profsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    profsLabel.setBounds(372, 608, 185, 15);
    frame.getContentPane().add(profsLabel);

    profsText = new JTextArea();
    profsText.setLineWrap(true);
    profsText.setEditable(false);
    profsText.setBounds(372, 627, 185, 259);
    frame.getContentPane().add(profsText);

    traitsLabel = new JLabel("Personality Traits");
    traitsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    traitsLabel.setBounds(741, 273, 240, 14);
    frame.getContentPane().add(traitsLabel);

    traitsOutline1 = new JSeparator();
    traitsOutline1.setBounds(741, 197, 240, 2);
    frame.getContentPane().add(traitsOutline1);

    traitOutline2 = new JSeparator();
    traitOutline2.setOrientation(SwingConstants.VERTICAL);
    traitOutline2.setBounds(741, 198, 2, 75);
    frame.getContentPane().add(traitOutline2);

    traitOutline3 = new JSeparator();
    traitOutline3.setBounds(741, 273, 240, 2);
    frame.getContentPane().add(traitOutline3);

    traitOutline4 = new JSeparator();
    traitOutline4.setOrientation(SwingConstants.VERTICAL);
    traitOutline4.setBounds(981, 198, 2, 75);
    frame.getContentPane().add(traitOutline4);

    traitsText = new JTextArea();
    traitsText.setLineWrap(true);
    traitsText.setEditable(false);
    traitsText.setBounds(741, 198, 240, 75);
    frame.getContentPane().add(traitsText);

    idealsLabel = new JLabel("Ideals");
    idealsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    idealsLabel.setBounds(741, 364, 240, 14);
    frame.getContentPane().add(idealsLabel);

    idealsOutline1 = new JSeparator();
    idealsOutline1.setBounds(741, 289, 240, 2);
    frame.getContentPane().add(idealsOutline1);

    idealsOutline2 = new JSeparator();
    idealsOutline2.setOrientation(SwingConstants.VERTICAL);
    idealsOutline2.setBounds(741, 289, 2, 75);
    frame.getContentPane().add(idealsOutline2);

    idealsOutline3 = new JSeparator();
    idealsOutline3.setBounds(741, 364, 240, 2);
    frame.getContentPane().add(idealsOutline3);

    idealsOutline4 = new JSeparator();
    idealsOutline4.setOrientation(SwingConstants.VERTICAL);
    idealsOutline4.setBounds(981, 289, 2, 75);
    frame.getContentPane().add(idealsOutline4);

    idealsText = new JTextArea();
    idealsText.setLineWrap(true);
    idealsText.setEditable(false);
    idealsText.setBounds(741, 289, 240, 75);
    frame.getContentPane().add(idealsText);

    bondsLabel = new JLabel("Bonds");
    bondsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    bondsLabel.setBounds(741, 455, 242, 14);
    frame.getContentPane().add(bondsLabel);

    bondsOutline1 = new JSeparator();
    bondsOutline1.setBounds(741, 380, 240, 2);
    frame.getContentPane().add(bondsOutline1);

    bondsOutline2 = new JSeparator();
    bondsOutline2.setOrientation(SwingConstants.VERTICAL);
    bondsOutline2.setBounds(741, 380, 2, 75);
    frame.getContentPane().add(bondsOutline2);

    bondsOutline3 = new JSeparator();
    bondsOutline3.setBounds(741, 455, 240, 2);
    frame.getContentPane().add(bondsOutline3);

    bondsOutline4 = new JSeparator();
    bondsOutline4.setOrientation(SwingConstants.VERTICAL);
    bondsOutline4.setBounds(981, 380, 2, 75);
    frame.getContentPane().add(bondsOutline4);

    bondsText = new JTextArea();
    bondsText.setLineWrap(true);
    bondsText.setEditable(false);
    bondsText.setBounds(741, 380, 240, 75);
    frame.getContentPane().add(bondsText);

    flawsLabel = new JLabel("Flaws");
    flawsLabel.setHorizontalAlignment(SwingConstants.CENTER);
    flawsLabel.setBounds(741, 551, 244, 14);
    frame.getContentPane().add(flawsLabel);

    flawsOutline1 = new JSeparator();
    flawsOutline1.setBounds(741, 473, 240, 2);
    frame.getContentPane().add(flawsOutline1);

    flawsOutline2 = new JSeparator();
    flawsOutline2.setOrientation(SwingConstants.VERTICAL);
    flawsOutline2.setBounds(741, 473, 2, 75);
    frame.getContentPane().add(flawsOutline2);

    flawsOutline3 = new JSeparator();
    flawsOutline3.setBounds(741, 548, 240, 2);
    frame.getContentPane().add(flawsOutline3);

    flawsOutline4 = new JSeparator();
    flawsOutline4.setOrientation(SwingConstants.VERTICAL);
    flawsOutline4.setBounds(981, 473, 2, 75);
    frame.getContentPane().add(flawsOutline4);

    flawsText = new JTextArea();
    flawsText.setLineWrap(true);
    flawsText.setEditable(false);
    flawsText.setBounds(741, 473, 240, 75);
    frame.getContentPane().add(flawsText);

    equipLabel = new JLabel("Equipment");
    equipLabel.setHorizontalAlignment(SwingConstants.CENTER);
    equipLabel.setBounds(593, 608, 185, 15);
    frame.getContentPane().add(equipLabel);

    equipText = new JTextArea();
    equipText.setLineWrap(true);
    equipText.setEditable(false);
    equipText.setBounds(592, 625, 185, 259);
    frame.getContentPane().add(equipText);

    featuresLabel = new JLabel("Features & Traits");
    featuresLabel.setHorizontalAlignment(SwingConstants.CENTER);
    featuresLabel.setBounds(809, 608, 185, 15);
    frame.getContentPane().add(featuresLabel);

    passiveText = new JTextField();
    passiveText.setEditable(false);
    passiveText.setHorizontalAlignment(SwingConstants.CENTER);
    passiveText.setFont(new Font("Tahoma", Font.PLAIN, 23));
    passiveText.setColumns(10);
    passiveText.setBackground(Color.WHITE);
    passiveText.setBounds(469, 248, 30, 30);
    frame.getContentPane().add(passiveText);

    passiveLabel = new JLabel("Passive Perception");
    passiveLabel.setBounds(517, 253, 138, 14);
    frame.getContentPane().add(passiveLabel);

    placeholderLabel = new JLabel("");
    placeholderLabel.setBounds(517, 253, 138, 14);
    frame.getContentPane().add(placeholderLabel);

    frame.pack();
    //        setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setBackground(SystemColor.menu);

    scrollPane = new JScrollPane();
    scrollPane.setBounds(807, 627, 187, 258);
    frame.getContentPane().add(scrollPane);

    featuresText = new JTextArea();
    scrollPane.setViewportView(featuresText);
    featuresText.setLineWrap(true);
    featuresText.setEditable(false);
  }


  /** 
   * Method to take care of actions initiated by the GUI.

   * @param e An event performed by one of the Listened-to JFrame items
   */
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();

    if (src == close) {
      // Code for closing the program
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
          try (FileInputStream file = new FileInputStream(path);
              ObjectInputStream in = new ObjectInputStream(file);) {

            DndChar temp = (DndChar) in.readObject();

            

            //character name
            charName.setText(temp.getName());

            //character race

            if (temp.getRace() == null) {
              raceText.setText("");
            } else {
              String race = temp.getRace().getName(); 
              if (temp.getRace() instanceof Dragonborn 
                  || temp.getRace() instanceof Human 
                  || temp.getRace() instanceof HalfElf 
                  || temp.getRace() instanceof HalfOrc 
                  || temp.getRace() instanceof Tiefling) {
                raceText.setText(race);
              } else {
                raceText.setText(temp.getRace().getSubrace() + " " + race);
              }
            }

            //character class and level
            classLvl.setText(temp.getCharClass().getName() + " " + temp.getLevel()); 

            //char alignment
            String alignment = temp.getAlignment();
            switch (alignment) {
              default: 
                alignText.setText(""); 
                break;
              case "LG": 
                alignText.setText("Lawful Good"); 
                break;
              case "LN": 
                alignText.setText("Lawful Neutral"); 
                break; 
              case "LE": 
                alignText.setText("Lawful Evil"); 
                break;
              case "NG": 
                alignText.setText("Neutral Good"); 
                break;
              case "NN": 
                alignText.setText("True Neutral"); 
                break;
              case "NE": 
                alignText.setText("Neutral Evil"); 
                break; 
              case "CG": 
                alignText.setText("Chaotic Good"); 
                break;
              case "CN": 
                alignText.setText("Chaotic Neutral"); 
                break; 
              case "CE": 
                alignText.setText("Chaotic Evil"); 
                break; 
            }

            //char experience
            xpText.setText("" + temp.getExp());

            //Stats
            strStat.setText("" + temp.getStats()[0]);
            dexStat.setText("" + temp.getStats()[1]);
            conStat.setText("" + temp.getStats()[2]);
            intStat.setText("" + temp.getStats()[3]);
            wisStat.setText("" + temp.getStats()[4]);
            chaStat.setText("" + temp.getStats()[5]);

            DecimalFormat df = new DecimalFormat("+0;-0");
            //mods
            strMod.setText("" + df.format(temp.getStats()[0] / 2 - 5));
            dexMod.setText("" + df.format(temp.getStats()[1] / 2 - 5));
            conMod.setText("" + df.format(temp.getStats()[2] / 2 - 5));
            intMod.setText("" + df.format(temp.getStats()[3] / 2 - 5));
            wisMod.setText("" + df.format(temp.getStats()[4] / 2 - 5));
            chaMod.setText("" + df.format(temp.getStats()[5] / 2 - 5));

            //skill radios
            //deselect all skills
            if (skillRad1.isSelected()) {
              skillRad1.doClick();
            }
            if (skillRad2.isSelected()) {
              skillRad2.doClick();
            }
            if (skillRad3.isSelected()) {
              skillRad3.doClick();
            }
            if (skillRad4.isSelected()) {
              skillRad4.doClick();
            }
            if (skillRad5.isSelected()) {
              skillRad5.doClick();
            }
            if (skillRad6.isSelected()) {
              skillRad6.doClick();
            }
            if (skillRad7.isSelected()) {
              skillRad7.doClick();
            }
            if (skillRad8.isSelected()) {
              skillRad8.doClick();
            }
            if (skillRad9.isSelected()) {
              skillRad9.doClick();
            }
            if (skillRad10.isSelected()) {
              skillRad10.doClick();
            }
            if (skillRad11.isSelected()) {
              skillRad11.doClick();
            }
            if (skillRad12.isSelected()) {
              skillRad12.doClick();
            }
            if (skillRad13.isSelected()) {
              skillRad13.doClick();
            }
            if (skillRad14.isSelected()) {
              skillRad14.doClick();
            }
            if (skillRad15.isSelected()) {
              skillRad15.doClick();
            }
            if (skillRad16.isSelected()) {
              skillRad16.doClick();
            }
            if (skillRad17.isSelected()) {
              skillRad17.doClick();
            }
            if (skillRad18.isSelected()) {
              skillRad18.doClick();
            }
            //select right ones
            if (temp.getSkills().contains(skillLabel1.getText())) {
              skillRad1.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel2.getText())) {
              skillRad2.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel3.getText())) {
              skillRad3.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel4.getText())) {
              skillRad4.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel5.getText())) {
              skillRad5.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel6.getText())) {
              skillRad6.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel7.getText())) {
              skillRad7.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel8.getText())) {
              skillRad8.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel9.getText())) {
              skillRad9.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel10.getText())) {
              skillRad10.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel11.getText())) {
              skillRad11.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel12.getText())) {
              skillRad12.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel13.getText())) {
              skillRad13.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel14.getText())) {
              skillRad14.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel15.getText())) {
              skillRad15.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel16.getText())) {
              skillRad16.doClick(); 
            }
            if (temp.getSkills().contains(skillLabel17.getText())) {
              skillRad17.doClick();
            }
            if (temp.getSkills().contains(skillLabel18.getText())) {
              skillRad18.doClick();
            }

            //proficiency bonus
            if (temp.getLevel() < 5) {
              profBonusText.setText("+2");
            } else if (temp.getLevel() < 9) {
              profBonusText.setText("+3");
            } else if (temp.getLevel() < 13) {
              profBonusText.setText("+4");
            } else if (temp.getLevel() < 17) {
              profBonusText.setText("+5");
            } else {
              profBonusText.setText("+6");
            }

            //Skill Mods

            int str = Integer.parseInt(strMod.getText());
            int dex = Integer.parseInt(dexMod.getText());
            int con = Integer.parseInt(conMod.getText());
            int intel = Integer.parseInt(intMod.getText());
            int wis = Integer.parseInt(wisMod.getText());
            int cha = Integer.parseInt(chaMod.getText());
            int bonus = Integer.parseInt(profBonusText.getText());
            if (skillRad1.isSelected()) {
              skillMod1.setText("" + df.format(dex + bonus));
            } else {
              skillMod1.setText(df.format(dex));
            }
            if (skillRad2.isSelected()) {
              skillMod2.setText("" + df.format(wis + bonus));
            } else {
              skillMod2.setText(df.format(wis));
            }
            if (skillRad3.isSelected()) {
              skillMod3.setText("" + df.format(intel + bonus));
            } else {
              skillMod3.setText(df.format(intel));
            }
            if (skillRad4.isSelected()) {
              skillMod4.setText("" + df.format(str + bonus));
            } else {
              skillMod4.setText(df.format(str));
            }
            if (skillRad5.isSelected()) {
              skillMod5.setText("" + df.format(cha + bonus));
            } else {
              skillMod5.setText(df.format(cha));
            }
            if (skillRad6.isSelected()) {
              skillMod6.setText("" + df.format(intel + bonus));
            } else {
              skillMod6.setText(df.format(intel));
            }
            if (skillRad7.isSelected()) {
              skillMod7.setText("" + df.format(wis + bonus));
            } else {
              skillMod7.setText(df.format(wis));
            }
            if (skillRad8.isSelected()) {
              skillMod8.setText("" + df.format(cha + bonus));
            } else {
              skillMod8.setText(df.format(cha));
            }
            if (skillRad9.isSelected()) {
              skillMod9.setText("" + df.format(intel + bonus));
            } else {
              skillMod9.setText(df.format(intel));
            }
            if (skillRad10.isSelected()) {
              skillMod10.setText("" + df.format(wis + bonus));
            } else {
              skillMod10.setText(df.format(wis));
            }
            if (skillRad11.isSelected()) {
              skillMod11.setText("" + df.format(intel + bonus));
            } else {
              skillMod11.setText(df.format(intel));
            }
            if (skillRad12.isSelected()) {
              skillMod12.setText("" + df.format(wis + bonus));
            } else {
              skillMod12.setText(df.format(wis));
            }
            if (skillRad13.isSelected()) {
              skillMod13.setText("" + df.format(cha + bonus));
            } else {
              skillMod13.setText(df.format(cha));
            }
            if (skillRad14.isSelected()) {
              skillMod14.setText("" + df.format(cha + bonus));
            } else {
              skillMod14.setText(df.format(cha));
            }
            if (skillRad15.isSelected()) {
              skillMod15.setText("" + df.format(intel + bonus));
            } else {
              skillMod15.setText(df.format(intel));
            }
            if (skillRad16.isSelected()) {
              skillMod16.setText("" + df.format(dex + bonus));
            } else {
              skillMod16.setText(df.format(dex));
            }
            if (skillRad17.isSelected()) {
              skillMod17.setText("" + df.format(dex + bonus));
            } else {
              skillMod17.setText(df.format(dex));
            }
            if (skillRad18.isSelected()) {
              skillMod18.setText("" + df.format(wis + bonus));
            } else {
              skillMod18.setText(df.format(wis));
            }

            //saving throws
            //reset radio buttons
            if (strSaveRad.isSelected()) {
              strSaveRad.doClick();
            }
            if (dexSaveRad.isSelected()) {
              dexSaveRad.doClick();
            }
            if (conSaveRad.isSelected()) {
              conSaveRad.doClick();
            }
            if (intSaveRad.isSelected()) {
              intSaveRad.doClick();
            }
            if (wisSaveRad.isSelected()) {
              wisSaveRad.doClick();
            }
            if (chaSaveRad.isSelected()) {
              chaSaveRad.doClick();
            }
            //select radio buttons
            int[] saveProfs = temp.getCharClass().getSaves();
            if (saveProfs[0] == 1) {
              strSaveRad.doClick();
            }
            if (saveProfs[1] == 1) {
              dexSaveRad.doClick();
            }
            if (saveProfs[2] == 1) {
              conSaveRad.doClick();
            }
            if (saveProfs[3] == 1) {
              intSaveRad.doClick();
            }
            if (saveProfs[4] == 1) {
              wisSaveRad.doClick();
            }
            if (saveProfs[5] == 1) {
              chaSaveRad.doClick();
            }
            //calc skill mods
            if (strSaveRad.isSelected()) {
              strSaveMod.setText("" + df.format(str + bonus));
            } else {
              strSaveMod.setText(df.format(str));
            }
            if (dexSaveRad.isSelected()) {
              dexSaveMod.setText("" + df.format(dex + bonus));
            } else {
              dexSaveMod.setText(df.format(dex));
            }
            if (conSaveRad.isSelected()) {
              conSaveMod.setText("" + df.format(con + bonus));
            } else {
              conSaveMod.setText(df.format(con));
            }
            if (intSaveRad.isSelected()) {
              intSaveMod.setText("" + df.format(intel + bonus));
            } else {
              intSaveMod.setText(df.format(intel));
            }
            if (wisSaveRad.isSelected()) {
              wisSaveMod.setText("" + df.format(wis + bonus));
            } else {
              wisSaveMod.setText(df.format(wis));
            }
            if (chaSaveRad.isSelected()) {
              chaSaveMod.setText("" + df.format(cha + bonus));
            } else {
              chaSaveMod.setText(df.format(cha));
            }

            //all text areas
            traitsText.setText(temp.getTraits());
            idealsText.setText(temp.getIdeals());
            bondsText.setText(temp.getBonds());
            flawsText.setText(temp.getFlaws());
            equipText.setText(temp.getEquip());
            profsText.setText(temp.getProfs());
            String featureStr = temp.getFeatures();
            for (int i = 0; i < temp.getLevel(); i++) {
              featureStr += temp.getCharClass().getFeatures()[i];
            }
            featuresText.setText(featureStr);

            //set ac 
            acText.setText("" + temp.getArmor());

            //set HP text boxes
            totalHp.setText("" + temp.getMaxHp());
            currentHp.setText("" + temp.getMaxHp());

            //set player name
            playerName.setText(temp.getPlayer());

            //set background
            bgText.setText(temp.getBackground());

            //speed
            speed.setText("" + temp.getRace().getSpeed());

            //passive perception
            passiveText.setText("" + (10 + Integer.parseInt(wisMod.getText())));

            //hit dice
            int dieSize = 8;
            if (temp.getCharClass() instanceof Sorcerer 
                || temp.getCharClass() instanceof Wizard) {
              dieSize = 6;
            }
            if (temp.getCharClass() instanceof Fighter 
                || temp.getCharClass() instanceof Paladin 
                || temp.getCharClass() instanceof Ranger) { 
              dieSize = 10;
            }
            if (temp.getCharClass() instanceof Barbarian) { 
              dieSize = 12;
            }
            hitDice.setText(temp.getLevel() + "d" + dieSize);

            //initiative
            String initStr = df.format(Integer.parseInt(dexMod.getText()));
            initiative.setText(initStr);

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } catch (IOException ex) {
          ex.printStackTrace();
        }

      }
    }
    if (src == switchWindow) {
      new CharacterEditor();
      frame.dispose();
    }
    if (src == openRoll) {
      new RollingGui();
    }

  }
}