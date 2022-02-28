package DNDCompanion;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.IOException;
import DNDCompanion.character.*;
import DNDCompanion.character.chrclasses.*;
import DNDCompanion.character.chrraces.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;


public class CharacterSheet extends JFrame implements ActionListener {

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
//    private JMenuItem saveChar;
//    private JMenuItem newChar;
    private JMenuItem close;
    private JMenu windowMenu;
    private JMenuItem switchWindow;

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
    
    private JLabel strSave;
    private JRadioButton strSaveRad;
    private JSeparator SaveOutline1;
    private JSeparator SaveOutline2;
    private JSeparator SaveOutline3;
    private JSeparator SaveOutline4;
    
    private JRadioButton skillRad1;
    private JLabel skillLabel1;
    private JLabel skillLabel2;
    private JRadioButton skillRad2;
    private JLabel skillsLabel;
    private JSeparator SkillOutline1;
    private JSeparator SkillOutline2;
    private JSeparator SkillOutline3;
    private JSeparator SkillOutline4;
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
    private JTextField tempHP;
    private JTextField totalHP;
    private JTextField currentHP;
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
    private JLabel currHPLabel;
    private JLabel maxHPLabel;
    private JLabel tempHPLabel;
    private JLabel hitDiceLabel;
    private JLabel deathSavLabel;
    private JTextArea traitsText;
    private JSeparator profsOutline1;
    private JSeparator profsOutline2;
    private JSeparator profsOutline3;
    private JSeparator profsOutline4;
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
    private JLabel ProfBonusLabel;
    private JLabel hpDivSign;
    private JLabel profsLabel;
    private JTextArea profsText;
    private JSeparator traitsOutline1;
    private JLabel equipLabel;
    private JTextArea equipText;
    private JTextArea featuresText;

    public CharacterSheet() {

        // Menus

        menus = new JMenuBar();

        fileMenu = new JMenu("File");
//        newChar = new JMenuItem("New Character");
        openChar = new JMenuItem("Open Character");
//        saveChar = new JMenuItem("Save Character");
        close = new JMenuItem("Close");
        windowMenu = new JMenu("Window");
        switchWindow = new JMenuItem("Switch View");
        
        
        windowMenu.add(switchWindow);

//        fileMenu.add(newChar);
        fileMenu.add(openChar);
//        fileMenu.add(saveChar);
        fileMenu.addSeparator();
        fileMenu.add(close);

//        newChar.addActionListener(this);
        openChar.addActionListener(this);
//        saveChar.addActionListener(this);
        close.addActionListener(this);
        switchWindow.addActionListener(this);

        menus.add(fileMenu);
        menus.add(windowMenu);
        setJMenuBar(menus);

        // Items inside CharacterSheet

        charNameLabel = new JLabel("Character Name");
        charNameLabel.setBounds(501,97,98,15);
        getContentPane().add(charNameLabel);
        
        charRace = new JLabel("Race");
        charRace.setBounds(789,117,70,15);
        getContentPane().add(charRace);
        
        charClass = new JLabel("Class & Level");
        charClass.setBounds(789,66,84,15);
        getContentPane().add(charClass);
        
        
        
        getContentPane().setLayout(null);
        
        strStatLabel = new JLabel("Strength");
        //strStatLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        strStatLabel.setBounds(426, 141, 50, 15);
        getContentPane().add(strStatLabel);
        
        strStat = new JTextField();
        strStat.setHorizontalAlignment(SwingConstants.CENTER);
        strStat.setBackground(new Color(255, 255, 255));
        strStat.setEditable(false);
        strStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        strStat.setBounds(417, 155, 60, 70);
        getContentPane().add(strStat);
        strStat.setColumns(10);
        
        strMod = new JTextField();
        strMod.setHorizontalAlignment(SwingConstants.CENTER);
        strMod.setBackground(new Color(255, 255, 255));
        strMod.setEditable(false);
        strMod.setBounds(432, 223, 30, 30);
        getContentPane().add(strMod);
        strMod.setColumns(10);
        
        dexStatLabel = new JLabel("Dexterity");
        dexStatLabel.setBounds(425, 260, 70, 15);
        getContentPane().add(dexStatLabel);
        
        dexStat = new JTextField();
        dexStat.setHorizontalAlignment(SwingConstants.CENTER);
        dexStat.setBackground(Color.WHITE);
        dexStat.setEditable(false);
        dexStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        dexStat.setColumns(10);
        dexStat.setBounds(417, 274, 60, 70);
        getContentPane().add(dexStat);
        
        dexMod = new JTextField();
        dexMod.setBackground(Color.WHITE);
        dexMod.setEditable(false);
        dexMod.setColumns(10);
        dexMod.setBounds(432, 343, 30, 30);
        getContentPane().add(dexMod);
        
        conStatLabel = new JLabel("Constitution");
        conStatLabel.setBounds(417, 380, 70, 15);
        getContentPane().add(conStatLabel);
        
        conStat = new JTextField();
        conStat.setHorizontalAlignment(SwingConstants.CENTER);
        conStat.setBackground(new Color(255, 255, 255));
        conStat.setEditable(false);
        conStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        conStat.setColumns(10);
        conStat.setBounds(417, 394, 60, 70);
        getContentPane().add(conStat);
        
        conMod = new JTextField();
        conMod.setHorizontalAlignment(SwingConstants.CENTER);
        conMod.setBackground(new Color(255, 255, 255));
        conMod.setEditable(false);
        conMod.setColumns(10);
        conMod.setBounds(432, 463, 30, 30);
        getContentPane().add(conMod);
        
        intStatLabel = new JLabel("Intelligence");
        intStatLabel.setBounds(419, 500, 70, 15);
        getContentPane().add(intStatLabel);
        
        intStat = new JTextField();
        intStat.setHorizontalAlignment(SwingConstants.CENTER);
        intStat.setBackground(new Color(255, 255, 255));
        intStat.setEditable(false);
        intStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        intStat.setColumns(10);
        intStat.setBounds(417, 514, 60, 70);
        getContentPane().add(intStat);
        
        intMod = new JTextField();
        intMod.setHorizontalAlignment(SwingConstants.CENTER);
        intMod.setBackground(new Color(255, 255, 255));
        intMod.setEditable(false);
        intMod.setColumns(10);
        intMod.setBounds(432, 583, 30, 30);
        getContentPane().add(intMod);
        
        wisStatLabel = new JLabel("Wisdom");
        wisStatLabel.setBounds(428, 620, 50, 15);
        getContentPane().add(wisStatLabel);
        
        wisStat = new JTextField();
        wisStat.setHorizontalAlignment(SwingConstants.CENTER);
        wisStat.setBackground(new Color(255, 255, 255));
        wisStat.setEditable(false);
        wisStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        wisStat.setColumns(10);
        wisStat.setBounds(417, 634, 60, 70);
        getContentPane().add(wisStat);
        
        wisMod = new JTextField();
        wisMod.setHorizontalAlignment(SwingConstants.CENTER);
        wisMod.setBackground(new Color(255, 255, 255));
        wisMod.setEditable(false);
        wisMod.setColumns(10);
        wisMod.setBounds(432, 703, 30, 30);
        getContentPane().add(wisMod);
        
        chaStatLabel = new JLabel("Charisma");
        chaStatLabel.setBounds(425, 740, 60, 15);
        getContentPane().add(chaStatLabel);
        
        chaStat = new JTextField();
        chaStat.setHorizontalAlignment(SwingConstants.CENTER);
        chaStat.setBackground(new Color(255, 255, 255));
        chaStat.setEditable(false);
        chaStat.setFont(new Font("Tahoma", Font.PLAIN, 30));
        chaStat.setColumns(10);
        chaStat.setBounds(417, 754, 60, 70);
        getContentPane().add(chaStat); 
        
        chaMod = new JTextField();
        chaMod.setHorizontalAlignment(SwingConstants.CENTER);
        chaMod.setBackground(new Color(255, 255, 255));
        chaMod.setEditable(false);
        chaMod.setColumns(10);
        chaMod.setBounds(432, 823, 30, 30);
        getContentPane().add(chaMod);
        
        charName = new JTextField();
        charName.setBackground(Color.WHITE);
        charName.setEditable(false);
        charName.setBounds(491, 53, 246, 41);
        getContentPane().add(charName);
        charName.setColumns(10);
        
        strSaveRad = new JRadioButton("");
        strSaveRad.setBounds(556, 171, 20, 20);
        getContentPane().add(strSaveRad);
        
        strSave = new JLabel("Strength");
        strSave.setBounds(611, 171, 85, 20);
        getContentPane().add(strSave);
        
        strSaveMod = new JTextField();
        strSaveMod.setEditable(false);
        strSaveMod.setBackground(UIManager.getColor("Button.background"));
        strSaveMod.setBounds(583, 171, 20, 20);
        getContentPane().add(strSaveMod);
        strSaveMod.setColumns(10);
        
        
        
        dexSave = new JLabel("Dexterity");
        dexSave.setBounds(611, 198, 85, 20);
        getContentPane().add(dexSave);
        
        dexSaveMod = new JTextField();
        dexSaveMod.setEditable(false);
        dexSaveMod.setColumns(10);
        dexSaveMod.setBackground(SystemColor.menu);
        dexSaveMod.setBounds(583, 198, 20, 20);
        getContentPane().add(dexSaveMod);
        
        dexSaveRad = new JRadioButton("");
        dexSaveRad.setBounds(556, 198, 20, 20);
        getContentPane().add(dexSaveRad);
        
        conSave = new JLabel("Constitution");
        conSave.setBounds(611, 225, 85, 20);
        getContentPane().add(conSave);
        
        conSaveMod = new JTextField();
        conSaveMod.setEditable(false);
        conSaveMod.setColumns(10);
        conSaveMod.setBackground(SystemColor.menu);
        conSaveMod.setBounds(583, 225, 20, 20);
        getContentPane().add(conSaveMod);
        
        conSaveRad = new JRadioButton("");
        conSaveRad.setBounds(556, 225, 20, 20);
        getContentPane().add(conSaveRad);
        
        intSave = new JLabel("Intelligence");
        intSave.setBounds(611, 252, 85, 20);
        getContentPane().add(intSave);
        
        intSaveMod = new JTextField();
        intSaveMod.setEditable(false);
        intSaveMod.setColumns(10);
        intSaveMod.setBackground(SystemColor.menu);
        intSaveMod.setBounds(583, 252, 20, 20);
        getContentPane().add(intSaveMod);
        
        intSaveRad = new JRadioButton("");
        intSaveRad.setBounds(556, 252, 20, 20);
        getContentPane().add(intSaveRad);
        
        wisSave = new JLabel("Wisdom");
        wisSave.setBounds(611, 279, 85, 20);
        getContentPane().add(wisSave);
        
        wisSaveMod = new JTextField();
        wisSaveMod.setEditable(false);
        wisSaveMod.setColumns(10);
        wisSaveMod.setBackground(SystemColor.menu);
        wisSaveMod.setBounds(583, 279, 20, 20);
        getContentPane().add(wisSaveMod);
        
        wisSaveRad = new JRadioButton("");
        wisSaveRad.setBounds(556, 279, 20, 20);
        getContentPane().add(wisSaveRad);
        
        chaSave = new JLabel("Charisma");
        chaSave.setBounds(611, 306, 85, 20);
        getContentPane().add(chaSave);
        
        chaSaveMod = new JTextField();
        chaSaveMod.setEditable(false);
        chaSaveMod.setColumns(10);
        chaSaveMod.setBackground(SystemColor.menu);
        chaSaveMod.setBounds(583, 306, 20, 20);
        getContentPane().add(chaSaveMod);
        
        chaSaveRad = new JRadioButton("");
        chaSaveRad.setBounds(556, 306, 20, 20);
        getContentPane().add(chaSaveRad);
        
        
        
        SaveOutline1 = new JSeparator();
        SaveOutline1.setBounds(543, 155, 165, 2);
        getContentPane().add(SaveOutline1);
        
        SaveOutline2 = new JSeparator();
        SaveOutline2.setBounds(543, 355, 165, 2);
        getContentPane().add(SaveOutline2);
        
        SaveOutline3 = new JSeparator();
        SaveOutline3.setOrientation(SwingConstants.VERTICAL);
        SaveOutline3.setBounds(542, 155, 2, 200);
        getContentPane().add(SaveOutline3);
        
        SaveOutline4 = new JSeparator();
        SaveOutline4.setOrientation(SwingConstants.VERTICAL);
        SaveOutline4.setBounds(708, 155, 2, 200);
        getContentPane().add(SaveOutline4);
        
        SavThroLabel = new JLabel("Saving Throws");
        SavThroLabel.setBounds(593, 337, 91, 14);
        getContentPane().add(SavThroLabel);
        
        
        
        classLvl = new JTextField();
        classLvl.setBackground(new Color(255, 255, 255));
        classLvl.setEditable(false);
        classLvl.setBounds(787, 31, 178, 34);
        getContentPane().add(classLvl);
        classLvl.setColumns(10);
        
        raceText = new JTextField();
        raceText.setEditable(false);
        raceText.setColumns(10);
        raceText.setBackground(Color.WHITE);
        raceText.setBounds(787, 80, 178, 34);
        getContentPane().add(raceText);
        
        bgText = new JTextField();
        bgText.setEditable(false);
        bgText.setColumns(10);
        bgText.setBackground(Color.WHITE);
        bgText.setBounds(990, 31, 178, 34);
        getContentPane().add(bgText);
        
        bgLabel = new JLabel("Background");
        bgLabel.setBounds(992, 66, 84, 15);
        getContentPane().add(bgLabel);
        
        alignText = new JTextField();
        alignText.setEditable(false);
        alignText.setColumns(10);
        alignText.setBackground(Color.WHITE);
        alignText.setBounds(990, 80, 178, 34);
        getContentPane().add(alignText);
        
        AlignLabel = new JLabel("Alignment");
        AlignLabel.setBounds(992, 117, 70, 15);
        getContentPane().add(AlignLabel);
        
        pName = new JTextField();
        pName.setEditable(false);
        pName.setColumns(10);
        pName.setBackground(Color.WHITE);
        pName.setBounds(1195, 31, 178, 34);
        getContentPane().add(pName);
        
        pNameLabel = new JLabel("Player Name");
        pNameLabel.setBounds(1197, 66, 84, 15);
        getContentPane().add(pNameLabel);
        
        xpText = new JTextField();
        xpText.setEditable(false);
        xpText.setColumns(10);
        xpText.setBackground(Color.WHITE);
        xpText.setBounds(1195, 80, 178, 34);
        getContentPane().add(xpText);
        
        xpLabel = new JLabel("Experience Points");
        xpLabel.setBounds(1197, 117, 113, 15);
        getContentPane().add(xpLabel);
        
        skillRad1 = new JRadioButton("");
        skillRad1.setBounds(555, 384, 20, 20);
        getContentPane().add(skillRad1);
        
        skillMod1 = new JTextField();
        skillMod1.setEditable(false);
        skillMod1.setColumns(10);
        skillMod1.setBackground(SystemColor.menu);
        skillMod1.setBounds(582, 384, 20, 20);
        getContentPane().add(skillMod1);
        
        skillLabel1 = new JLabel("Acrobatics");
        skillLabel1.setBounds(610, 384, 85, 20);
        getContentPane().add(skillLabel1);
        
        SkillOutline1 = new JSeparator();
        SkillOutline1.setBounds(542, 368, 165, 2);
        getContentPane().add(SkillOutline1);
        
        SkillOutline2 = new JSeparator();
        SkillOutline2.setOrientation(SwingConstants.VERTICAL);
        SkillOutline2.setBounds(541, 368, 2, 543);
        getContentPane().add(SkillOutline2);
        
        SkillOutline4 = new JSeparator();
        SkillOutline4.setOrientation(SwingConstants.VERTICAL);
        SkillOutline4.setBounds(706, 368, 2, 543);
        getContentPane().add(SkillOutline4);
        
        SkillOutline3 = new JSeparator();
        SkillOutline3.setBounds(542, 911, 165, 2);
        getContentPane().add(SkillOutline3);
        
        skillsLabel = new JLabel("Skill Proficiencies");
        skillsLabel.setBounds(575, 893, 105, 14);
        getContentPane().add(skillsLabel);
        
        skillRad2 = new JRadioButton("");
        skillRad2.setBounds(555, 413, 20, 20);
        getContentPane().add(skillRad2);
        
        skillMod2 = new JTextField();
        skillMod2.setEditable(false);
        skillMod2.setColumns(10);
        skillMod2.setBackground(SystemColor.menu);
        skillMod2.setBounds(582, 413, 20, 20);
        getContentPane().add(skillMod2);
        
        skillLabel2 = new JLabel("Animal Handling");
        skillLabel2.setBounds(610, 413, 91, 20);
        getContentPane().add(skillLabel2);
        
        skillRad3 = new JRadioButton("");
        skillRad3.setBounds(555, 440, 20, 20);
        getContentPane().add(skillRad3);
        
        skillMod3 = new JTextField();
        skillMod3.setEditable(false);
        skillMod3.setColumns(10);
        skillMod3.setBackground(SystemColor.menu);
        skillMod3.setBounds(582, 440, 20, 20);
        getContentPane().add(skillMod3);
        
        skillLabel3 = new JLabel("Arcana");
        skillLabel3.setBounds(610, 440, 85, 20);
        getContentPane().add(skillLabel3);
        
        skillRad6 = new JRadioButton("");
        skillRad6.setBounds(555, 525, 20, 20);
        getContentPane().add(skillRad6);
        
        skillMod6 = new JTextField();
        skillMod6.setEditable(false);
        skillMod6.setColumns(10);
        skillMod6.setBackground(SystemColor.menu);
        skillMod6.setBounds(582, 525, 20, 20);
        getContentPane().add(skillMod6);
        
        skillLabel6 = new JLabel("History");
        skillLabel6.setBounds(610, 525, 85, 20);
        getContentPane().add(skillLabel6);
        
        skillRad5 = new JRadioButton("");
        skillRad5.setBounds(555, 498, 20, 20);
        getContentPane().add(skillRad5);
        
        skillMod5 = new JTextField();
        skillMod5.setEditable(false);
        skillMod5.setColumns(10);
        skillMod5.setBackground(SystemColor.menu);
        skillMod5.setBounds(582, 498, 20, 20);
        getContentPane().add(skillMod5);
        
        skillLabel5 = new JLabel("Deception");
        skillLabel5.setBounds(610, 498, 85, 20);
        getContentPane().add(skillLabel5);
        
        skillLabel4 = new JLabel("Atheletics");
        skillLabel4.setBounds(610, 469, 85, 20);
        getContentPane().add(skillLabel4);
        
        skillMod4 = new JTextField();
        skillMod4.setEditable(false);
        skillMod4.setColumns(10);
        skillMod4.setBackground(SystemColor.menu);
        skillMod4.setBounds(582, 469, 20, 20);
        getContentPane().add(skillMod4);
        
        skillRad4 = new JRadioButton("");
        skillRad4.setBounds(555, 469, 20, 20);
        getContentPane().add(skillRad4);
        
        skillRad7 = new JRadioButton("");
        skillRad7.setBounds(555, 553, 20, 20);
        getContentPane().add(skillRad7);
        
        skillMod7 = new JTextField();
        skillMod7.setEditable(false);
        skillMod7.setColumns(10);
        skillMod7.setBackground(SystemColor.menu);
        skillMod7.setBounds(582, 553, 20, 20);
        getContentPane().add(skillMod7);
        
        skillLabel7 = new JLabel("Insight");
        skillLabel7.setBounds(610, 553, 85, 20);
        getContentPane().add(skillLabel7);
        
        skillRad8 = new JRadioButton("");
        skillRad8.setBounds(555, 582, 20, 20);
        getContentPane().add(skillRad8);
        
        skillMod8 = new JTextField();
        skillMod8.setEditable(false);
        skillMod8.setColumns(10);
        skillMod8.setBackground(SystemColor.menu);
        skillMod8.setBounds(582, 582, 20, 20);
        getContentPane().add(skillMod8);
        
        skillLabel8 = new JLabel("Intimidation");
        skillLabel8.setBounds(610, 582, 85, 20);
        getContentPane().add(skillLabel8);
        
        skillRad9 = new JRadioButton("");
        skillRad9.setBounds(555, 609, 20, 20);
        getContentPane().add(skillRad9);
        
        skillMod9 = new JTextField();
        skillMod9.setEditable(false);
        skillMod9.setColumns(10);
        skillMod9.setBackground(SystemColor.menu);
        skillMod9.setBounds(582, 609, 20, 20);
        getContentPane().add(skillMod9);
        
        skillLabel9 = new JLabel("Investigation");
        skillLabel9.setBounds(610, 609, 85, 20);
        getContentPane().add(skillLabel9);
        
        skillLabel10 = new JLabel("Medicine");
        skillLabel10.setBounds(610, 638, 85, 20);
        getContentPane().add(skillLabel10);
        
        skillMod10 = new JTextField();
        skillMod10.setEditable(false);
        skillMod10.setColumns(10);
        skillMod10.setBackground(SystemColor.menu);
        skillMod10.setBounds(582, 638, 20, 20);
        getContentPane().add(skillMod10);
        
        skillRad10 = new JRadioButton("");
        skillRad10.setBounds(555, 638, 20, 20);
        getContentPane().add(skillRad10);
        
        skillRad11 = new JRadioButton("");
        skillRad11.setBounds(555, 667, 20, 20);
        getContentPane().add(skillRad11);
        
        skillMod11 = new JTextField();
        skillMod11.setEditable(false);
        skillMod11.setColumns(10);
        skillMod11.setBackground(SystemColor.menu);
        skillMod11.setBounds(582, 667, 20, 20);
        getContentPane().add(skillMod11);
        
        skillLabel11 = new JLabel("Nature");
        skillLabel11.setBounds(610, 667, 85, 20);
        getContentPane().add(skillLabel11);
        
        skillLabel12 = new JLabel("Perception");
        skillLabel12.setBounds(610, 694, 85, 20);
        getContentPane().add(skillLabel12);
        
        skillMod12 = new JTextField();
        skillMod12.setEditable(false);
        skillMod12.setColumns(10);
        skillMod12.setBackground(SystemColor.menu);
        skillMod12.setBounds(582, 694, 20, 20);
        getContentPane().add(skillMod12);
        
        skillRad12 = new JRadioButton("");
        skillRad12.setBounds(555, 694, 20, 20);
        getContentPane().add(skillRad12);
        
        skillRad13 = new JRadioButton("");
        skillRad13.setBounds(555, 721, 20, 20);
        getContentPane().add(skillRad13);
        
        skillMod13 = new JTextField();
        skillMod13.setEditable(false);
        skillMod13.setColumns(10);
        skillMod13.setBackground(SystemColor.menu);
        skillMod13.setBounds(582, 721, 20, 20);
        getContentPane().add(skillMod13);
        
        skillLabel13 = new JLabel("Performance");
        skillLabel13.setBounds(610, 721, 85, 20);
        getContentPane().add(skillLabel13);
        
        skillRad14 = new JRadioButton("");
        skillRad14.setBounds(555, 750, 20, 20);
        getContentPane().add(skillRad14);
        
        skillMod14 = new JTextField();
        skillMod14.setEditable(false);
        skillMod14.setColumns(10);
        skillMod14.setBackground(SystemColor.menu);
        skillMod14.setBounds(582, 750, 20, 20);
        getContentPane().add(skillMod14);
        
        skillLabel14 = new JLabel("Persuasion");
        skillLabel14.setBounds(610, 750, 85, 20);
        getContentPane().add(skillLabel14);
        
        skillRad15 = new JRadioButton("");
        skillRad15.setBounds(555, 777, 20, 20);
        getContentPane().add(skillRad15);
        
        skillMod15 = new JTextField();
        skillMod15.setEditable(false);
        skillMod15.setColumns(10);
        skillMod15.setBackground(SystemColor.menu);
        skillMod15.setBounds(582, 777, 20, 20);
        getContentPane().add(skillMod15);
        
        skillLabel15 = new JLabel("Religion");
        skillLabel15.setBounds(610, 777, 85, 20);
        getContentPane().add(skillLabel15);
        
        skillLabel16 = new JLabel("Sleight of Hand");
        skillLabel16.setBounds(610, 806, 85, 20);
        getContentPane().add(skillLabel16);
        
        skillMod16 = new JTextField();
        skillMod16.setEditable(false);
        skillMod16.setColumns(10);
        skillMod16.setBackground(SystemColor.menu);
        skillMod16.setBounds(582, 806, 20, 20);
        getContentPane().add(skillMod16);
        
        skillRad16 = new JRadioButton("");
        skillRad16.setBounds(555, 806, 20, 20);
        getContentPane().add(skillRad16);
        
        skillRad17 = new JRadioButton("");
        skillRad17.setBounds(555, 835, 20, 20);
        getContentPane().add(skillRad17);
        
        skillMod17 = new JTextField();
        skillMod17.setEditable(false);
        skillMod17.setColumns(10);
        skillMod17.setBackground(SystemColor.menu);
        skillMod17.setBounds(582, 835, 20, 20);
        getContentPane().add(skillMod17);
        
        skillLabel17 = new JLabel("Stealth");
        skillLabel17.setBounds(610, 835, 85, 20);
        getContentPane().add(skillLabel17);
        
        skillLabel18 = new JLabel("Survival");
        skillLabel18.setBounds(610, 862, 85, 20);
        getContentPane().add(skillLabel18);
        
        skillMod18 = new JTextField();
        skillMod18.setEditable(false);
        skillMod18.setColumns(10);
        skillMod18.setBackground(SystemColor.menu);
        skillMod18.setBounds(582, 862, 20, 20);
        getContentPane().add(skillMod18);
        
        skillRad18 = new JRadioButton("");
        skillRad18.setBounds(555, 862, 20, 20);
        getContentPane().add(skillRad18);
        
        profBonusText = new JTextField();
        profBonusText.setEditable(false);
        profBonusText.setHorizontalAlignment(SwingConstants.CENTER);
        profBonusText.setBackground(new Color(255, 255, 255));
        profBonusText.setFont(new Font("Tahoma", Font.PLAIN, 25));
        profBonusText.setBounds(852, 234, 45, 45);
        getContentPane().add(profBonusText);
        profBonusText.setColumns(10);
        
        ProfBonusLabel = new JLabel("Proficiency Bonus");
        ProfBonusLabel.setBounds(907, 252, 107, 14);
        getContentPane().add(ProfBonusLabel);
        
        acText = new JTextField();
        acText.setHorizontalAlignment(SwingConstants.CENTER);
        acText.setBackground(new Color(255, 255, 255));
        acText.setEditable(false);
        acText.setFont(new Font("Tahoma", Font.PLAIN, 25));
        acText.setBounds(829, 287, 55, 55);
        getContentPane().add(acText);
        acText.setColumns(10);
        
        initiative = new JTextField();
        initiative.setHorizontalAlignment(SwingConstants.CENTER);
        initiative.setFont(new Font("Tahoma", Font.PLAIN, 25));
        initiative.setEditable(false);
        initiative.setColumns(10);
        initiative.setBackground(Color.WHITE);
        initiative.setBounds(894, 287, 55, 55);
        getContentPane().add(initiative);
        
        speed = new JTextField();
        speed.setFont(new Font("Tahoma", Font.PLAIN, 25));
        speed.setEditable(false);
        speed.setColumns(10);
        speed.setBackground(Color.WHITE);
        speed.setBounds(959, 287, 55, 55);
        getContentPane().add(speed);
        
        tempHP = new JTextField();
        tempHP.setHorizontalAlignment(SwingConstants.CENTER);
        tempHP.setFont(new Font("Tahoma", Font.PLAIN, 25));
        tempHP.setColumns(10);
        tempHP.setBackground(Color.WHITE);
        tempHP.setBounds(829, 444, 185, 55);
        getContentPane().add(tempHP);
        
        totalHP = new JTextField();
        totalHP.setEditable(false);
        totalHP.setHorizontalAlignment(SwingConstants.LEFT);
        totalHP.setFont(new Font("Tahoma", Font.PLAIN, 25));
        totalHP.setColumns(10);
        totalHP.setBackground(Color.WHITE);
        totalHP.setBounds(936, 367, 78, 55);
        getContentPane().add(totalHP);
        
        currentHP = new JTextField();
        currentHP.setHorizontalAlignment(SwingConstants.RIGHT);
        currentHP.setFont(new Font("Tahoma", Font.PLAIN, 25));
        currentHP.setColumns(10);
        currentHP.setBackground(Color.WHITE);
        currentHP.setBounds(829, 367, 78, 55);
        getContentPane().add(currentHP);
        
        hpDivSign = new JLabel("/");
        hpDivSign.setFont(new Font("Tahoma", Font.PLAIN, 40));
        hpDivSign.setBounds(915, 363, 30, 53);
        getContentPane().add(hpDivSign);
        
        hitDice = new JTextField();
        hitDice.setEditable(false);
        hitDice.setHorizontalAlignment(SwingConstants.CENTER);
        hitDice.setFont(new Font("Tahoma", Font.PLAIN, 25));
        hitDice.setColumns(10);
        hitDice.setBackground(Color.WHITE);
        hitDice.setBounds(829, 528, 55, 55);
        getContentPane().add(hitDice);
        
        deathSavOutline1 = new JSeparator();
        deathSavOutline1.setBounds(894, 528, 119, 2);
        getContentPane().add(deathSavOutline1);
        
        deathSavOutline3 = new JSeparator();
        deathSavOutline3.setBounds(894, 582, 119, 2);
        getContentPane().add(deathSavOutline3);
        
        deathSavOutline4 = new JSeparator();
        deathSavOutline4.setOrientation(SwingConstants.VERTICAL);
        deathSavOutline4.setBounds(1012, 528, 2, 55);
        getContentPane().add(deathSavOutline4);
        
        deathSavOutline2 = new JSeparator();
        deathSavOutline2.setOrientation(SwingConstants.VERTICAL);
        deathSavOutline2.setBounds(894, 528, 2, 55);
        getContentPane().add(deathSavOutline2);
        
        successLabel = new JLabel("Successes");
        successLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
        successLabel.setBounds(901, 537, 50, 14);
        getContentPane().add(successLabel);
        
        failsLabel = new JLabel("Failures");
        failsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
        failsLabel.setBounds(901, 557, 40, 14);
        getContentPane().add(failsLabel);
        
        success1 = new JRadioButton("");
        success1.setBounds(946, 534, 20, 20);
        getContentPane().add(success1);
        
        success2 = new JRadioButton("");
        success2.setBounds(966, 534, 20, 20);
        getContentPane().add(success2);
        
        success3 = new JRadioButton("");
        success3.setBounds(986, 534, 20, 20);
        getContentPane().add(success3);
        
        fails3 = new JRadioButton("");
        fails3.setBounds(986, 554, 20, 23);
        getContentPane().add(fails3);
        
        fails2 = new JRadioButton("");
        fails2.setBounds(966, 554, 20, 23);
        getContentPane().add(fails2);
        
        fails1 = new JRadioButton("");
        fails1.setBounds(946, 554, 20, 20);
        getContentPane().add(fails1);
        
        inspiration = new JTextField();
        inspiration.setHorizontalAlignment(SwingConstants.CENTER);
        inspiration.setFont(new Font("Tahoma", Font.PLAIN, 25));
        inspiration.setColumns(10);
        inspiration.setBackground(Color.WHITE);
        inspiration.setBounds(852, 183, 45, 45);
        getContentPane().add(inspiration);
        
        inspirationLabel = new JLabel("Inspiration Dice");
        inspirationLabel.setBounds(907, 201, 98, 14);
        getContentPane().add(inspirationLabel);
        
        acLabel = new JLabel("Armor Class");
        acLabel.setBounds(829, 344, 78, 14);
        getContentPane().add(acLabel);
        
        initLabel = new JLabel("Initiative");
        initLabel.setBounds(904, 344, 61, 14);
        getContentPane().add(initLabel);
        
        speedLabel = new JLabel("Speed");
        speedLabel.setBounds(969, 344, 46, 14);
        getContentPane().add(speedLabel);
        
        currHPLabel = new JLabel("Current HP");
        currHPLabel.setBounds(838, 423, 69, 14);
        getContentPane().add(currHPLabel);
        
        maxHPLabel = new JLabel("Max HP");
        maxHPLabel.setBounds(946, 423, 60, 14);
        getContentPane().add(maxHPLabel);
        
        tempHPLabel = new JLabel("Temporary HP");
        tempHPLabel.setBounds(887, 500, 84, 14);
        getContentPane().add(tempHPLabel);
        
        hitDiceLabel = new JLabel("Hit Dice");
        hitDiceLabel.setBounds(838, 584, 46, 14);
        getContentPane().add(hitDiceLabel);
        
        deathSavLabel = new JLabel("Death Saves");
        deathSavLabel.setBounds(920, 584, 86, 14);
        getContentPane().add(deathSavLabel);
        
        profsOutline1 = new JSeparator();
        profsOutline1.setBounds(762, 629, 185, 2);
        getContentPane().add(profsOutline1);
        
        profsOutline2 = new JSeparator();
        profsOutline2.setBounds(762, 951, 185, 2);
        getContentPane().add(profsOutline2);
        
        profsOutline3 = new JSeparator();
        profsOutline3.setOrientation(SwingConstants.VERTICAL);
        profsOutline3.setBounds(946, 629, 2, 322);
        getContentPane().add(profsOutline3);
        
        profsOutline4 = new JSeparator();
        profsOutline4.setOrientation(SwingConstants.VERTICAL);
        profsOutline4.setBounds(762, 629, 2, 322);
        getContentPane().add(profsOutline4);
        
        profsLabel = new JLabel("Proficiencies & Languages");
        profsLabel.setBounds(762, 933, 176, 15);
        getContentPane().add(profsLabel);
        
        profsText = new JTextArea();
        profsText.setLineWrap(true);
        profsText.setEditable(false);
        profsText.setBounds(762, 629, 185, 322);
        getContentPane().add(profsText);
        
        traitsLabel = new JLabel("Personality Traits");
        traitsLabel.setBounds(1212, 262, 113, 14);
        getContentPane().add(traitsLabel);
        
        traitsOutline1 = new JSeparator();
        traitsOutline1.setBounds(1131, 199, 240, 2);
        getContentPane().add(traitsOutline1);
        
        traitOutline2 = new JSeparator();
        traitOutline2.setOrientation(SwingConstants.VERTICAL);
        traitOutline2.setBounds(1131, 200, 2, 75);
        getContentPane().add(traitOutline2);
        
        traitOutline3 = new JSeparator();
        traitOutline3.setBounds(1131, 275, 240, 2);
        getContentPane().add(traitOutline3);
        
        traitOutline4 = new JSeparator();
        traitOutline4.setOrientation(SwingConstants.VERTICAL);
        traitOutline4.setBounds(1371, 200, 2, 75);
        getContentPane().add(traitOutline4);
        
        traitsText = new JTextArea();
        traitsText.setLineWrap(true);
        traitsText.setEditable(false);
        traitsText.setBounds(1131, 200, 240, 75);
        getContentPane().add(traitsText);
        
        idealsLabel = new JLabel("Ideals");
        idealsLabel.setBounds(1238, 354, 40, 14);
        getContentPane().add(idealsLabel);
        
        idealsOutline1 = new JSeparator();
        idealsOutline1.setBounds(1131, 291, 240, 2);
        getContentPane().add(idealsOutline1);
        
        idealsOutline2 = new JSeparator();
        idealsOutline2.setOrientation(SwingConstants.VERTICAL);
        idealsOutline2.setBounds(1131, 291, 2, 75);
        getContentPane().add(idealsOutline2);
        
        idealsOutline3 = new JSeparator();
        idealsOutline3.setBounds(1131, 366, 240, 2);
        getContentPane().add(idealsOutline3);
        
        idealsOutline4 = new JSeparator();
        idealsOutline4.setOrientation(SwingConstants.VERTICAL);
        idealsOutline4.setBounds(1371, 291, 2, 75);
        getContentPane().add(idealsOutline4);
        
        idealsText = new JTextArea();
        idealsText.setLineWrap(true);
        idealsText.setEditable(false);
        idealsText.setBounds(1131, 291, 240, 75);
        getContentPane().add(idealsText);
        
        bondsLabel = new JLabel("Bonds");
        bondsLabel.setBounds(1239, 445, 40, 14);
        getContentPane().add(bondsLabel);
        
        bondsOutline1 = new JSeparator();
        bondsOutline1.setBounds(1131, 382, 240, 2);
        getContentPane().add(bondsOutline1);
        
        bondsOutline2 = new JSeparator();
        bondsOutline2.setOrientation(SwingConstants.VERTICAL);
        bondsOutline2.setBounds(1131, 382, 2, 75);
        getContentPane().add(bondsOutline2);
        
        bondsOutline3 = new JSeparator();
        bondsOutline3.setBounds(1131, 457, 240, 2);
        getContentPane().add(bondsOutline3);
        
        bondsOutline4 = new JSeparator();
        bondsOutline4.setOrientation(SwingConstants.VERTICAL);
        bondsOutline4.setBounds(1371, 382, 2, 75);
        getContentPane().add(bondsOutline4);
        
        bondsText = new JTextArea();
        bondsText.setLineWrap(true);
        bondsText.setEditable(false);
        bondsText.setBounds(1131, 382, 240, 75);
        getContentPane().add(bondsText);
        
        flawsLabel = new JLabel("Flaws");
        flawsLabel.setBounds(1239, 537, 40, 14);
        getContentPane().add(flawsLabel);
        
        flawsOutline1 = new JSeparator();
        flawsOutline1.setBounds(1131, 475, 240, 2);
        getContentPane().add(flawsOutline1);
        
        flawsOutline2 = new JSeparator();
        flawsOutline2.setOrientation(SwingConstants.VERTICAL);
        flawsOutline2.setBounds(1131, 475, 2, 75);
        getContentPane().add(flawsOutline2);
        
        flawsOutline3 = new JSeparator();
        flawsOutline3.setBounds(1131, 550, 240, 2);
        getContentPane().add(flawsOutline3);
        
        flawsOutline4 = new JSeparator();
        flawsOutline4.setOrientation(SwingConstants.VERTICAL);
        flawsOutline4.setBounds(1371, 475, 2, 75);
        getContentPane().add(flawsOutline4);
        
        flawsText = new JTextArea();
        flawsText.setLineWrap(true);
        flawsText.setEditable(false);
        flawsText.setBounds(1131, 475, 240, 75);
        getContentPane().add(flawsText);
        
        JSeparator equipOutline1 = new JSeparator();
        equipOutline1.setBounds(982, 627, 185, 2);
        getContentPane().add(equipOutline1);
        
        JSeparator equipOutline2 = new JSeparator();
        equipOutline2.setBounds(982, 949, 185, 2);
        getContentPane().add(equipOutline2);
        
        JSeparator equipOutline3 = new JSeparator();
        equipOutline3.setOrientation(SwingConstants.VERTICAL);
        equipOutline3.setBounds(1166, 627, 2, 322);
        getContentPane().add(equipOutline3);
        
        JSeparator equipOutline4 = new JSeparator();
        equipOutline4.setOrientation(SwingConstants.VERTICAL);
        equipOutline4.setBounds(982, 627, 2, 322);
        getContentPane().add(equipOutline4);
        
        equipLabel = new JLabel("Equipment");
        equipLabel.setBounds(1049, 933, 60, 15);
        getContentPane().add(equipLabel);
        
        equipText = new JTextArea();
        equipText.setLineWrap(true);
        equipText.setEditable(false);
        equipText.setBounds(982, 627, 185, 322);
        getContentPane().add(equipText);
        
        JSeparator featuresOutline1 = new JSeparator();
        featuresOutline1.setBounds(1199, 627, 185, 2);
        getContentPane().add(featuresOutline1);
        
        JSeparator featuresOutline2 = new JSeparator();
        featuresOutline2.setBounds(1199, 949, 185, 2);
        getContentPane().add(featuresOutline2);
        
        JSeparator featuresOutline3 = new JSeparator();
        featuresOutline3.setOrientation(SwingConstants.VERTICAL);
        featuresOutline3.setBounds(1383, 627, 2, 322);
        getContentPane().add(featuresOutline3);
        
        JSeparator featuresOutline4 = new JSeparator();
        featuresOutline4.setOrientation(SwingConstants.VERTICAL);
        featuresOutline4.setBounds(1199, 627, 2, 322);
        getContentPane().add(featuresOutline4);
        
        JLabel featuresLabel = new JLabel("Features & Traits");
        featuresLabel.setBounds(1256, 933, 98, 15);
        getContentPane().add(featuresLabel);
        
        featuresText = new JTextArea();
        featuresText.setLineWrap(true);
        featuresText.setEditable(false);
        featuresText.setBounds(1199, 627, 185, 322);
        getContentPane().add(featuresText);
        
        passiveText = new JTextField();
        passiveText.setEditable(false);
        passiveText.setHorizontalAlignment(SwingConstants.CENTER);
        passiveText.setFont(new Font("Tahoma", Font.PLAIN, 25));
        passiveText.setColumns(10);
        passiveText.setBackground(Color.WHITE);
        passiveText.setBounds(556, 923, 30, 30);
        getContentPane().add(passiveText);
        
        JLabel passiveLabel = new JLabel("Passive Perception");
        passiveLabel.setBounds(592, 929, 116, 14);
        getContentPane().add(passiveLabel);

        pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
//        setSize(1920, 1025);

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


//        //test Character
//    	String name = "Biff";
//        String ethicalAlign = "C";
//        String moralAlign = "N";
//        Race race = new HalfElf();
//        CharacterClass charClass = new Rogue();
//        int level = 3;
//        int exp = 0;
//        int[] stats = {10,10,10,10,10,15};
//        String skills = "SurvivalReligionAcrobatics";
//        String background = "Acolyte"; 
//        String traits = "trait1, trait2";
//        String ideals = "ideals are cool"; 
//        String bonds = "bonded to none";
//        String flaws = "not cool enough"; 
//        int armor = 16;
//        int maxHP = 24; 
//        String features = "cool aura";
//        String profs = "martial, simple, and ranged weapons"; 
//        String equipment = "greataxe and rapier";
//        String player = "Nick";
//        
//        dndChar = new DNDChar(name, ethicalAlign, moralAlign, 
//                				   race, charClass, level, exp, 
//                				   stats, skills, background, 
//                				   traits, ideals, bonds, flaws, 
//                				   armor, maxHP, features, profs, 
//                				   equipment, player);
        
    }

    
    /** 
     * @param e
     */
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

                        DecimalFormat df = new DecimalFormat("+0;-0");
                        
                        //character name
                        charName.setText(temp.getName());
                        
                        //character race
                        //raceText.setText(temp.getRace().getName());
                        String race = temp.getRace().getName(); 
                        if(temp.getRace() == null) {
                        	raceText.setText("");
                        }else if(temp.getRace() instanceof Dragonborn || temp.getRace() instanceof Human || temp.getRace() instanceof HalfElf ||
                        		temp.getRace() instanceof HalfOrc || temp.getRace() instanceof Tiefling) {
                        	raceText.setText(race);
                        }else {
                        	raceText.setText(temp.getRace().getSubrace() +" "+ race);
                        }
                        
                        //character class and level
                        classLvl.setText(temp.getCharClass().getName() +" "+ temp.getLevel()); 
                        
                        //char alignment
                        String alignment = temp.getAlignment();
                        switch(alignment) {
                    	default: alignText.setText(""); break;
                    	case "LG": alignText.setText("Lawful Good"); break;
                    	case "LN": alignText.setText("Lawful Neutral"); break; 
                    	case "LE": alignText.setText("Lawful Evil"); break;
                    	case "NG": alignText.setText("Neutral Good"); break;
                    	case "NN": alignText.setText("True Neutral"); break;
                    	case "NE": alignText.setText("Neutral Evil"); break; 
                    	case "CG": alignText.setText("Chaotic Good"); break;
                    	case "CN": alignText.setText("Chaotic Neutral"); break; 
                    	case "CE": alignText.setText("Chaotic Evil"); break; 
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
                        
                        //mods
                        strMod.setText("" + df.format(temp.getStats()[0]/2 -5));
                        dexMod.setText("" + df.format(temp.getStats()[1]/2 -5));
                        conMod.setText("" + df.format(temp.getStats()[2]/2 -5));
                        intMod.setText("" + df.format(temp.getStats()[3]/2 -5));
                        wisMod.setText("" + df.format(temp.getStats()[4]/2 -5));
                        chaMod.setText("" + df.format(temp.getStats()[5]/2 -5));
                        
                    	//skill radios
                    	//deselect all skills
                    	if(skillRad1.isSelected()) {skillRad1.doClick();}
                    	if(skillRad2.isSelected()) {skillRad2.doClick();}
                    	if(skillRad3.isSelected()) {skillRad3.doClick();}
                    	if(skillRad4.isSelected()) {skillRad4.doClick();}
                    	if(skillRad5.isSelected()) {skillRad5.doClick();}
                    	if(skillRad6.isSelected()) {skillRad6.doClick();}
                    	if(skillRad7.isSelected()) {skillRad7.doClick();}
                    	if(skillRad8.isSelected()) {skillRad8.doClick();}
                    	if(skillRad9.isSelected()) {skillRad9.doClick();}
                    	if(skillRad10.isSelected()) {skillRad10.doClick();}
                    	if(skillRad11.isSelected()) {skillRad11.doClick();}
                    	if(skillRad12.isSelected()) {skillRad12.doClick();}
                    	if(skillRad13.isSelected()) {skillRad13.doClick();}
                    	if(skillRad14.isSelected()) {skillRad14.doClick();}
                    	if(skillRad15.isSelected()) {skillRad15.doClick();}
                    	if(skillRad16.isSelected()) {skillRad16.doClick();}
                    	if(skillRad17.isSelected()) {skillRad17.doClick();}
                    	if(skillRad18.isSelected()) {skillRad18.doClick();}
                    	//select right ones
                    	if(temp.getSkills().contains(skillLabel1.getText()))
                    		skillRad1.doClick();
                    	if(temp.getSkills().contains(skillLabel2.getText()))
                    		skillRad2.doClick();
                    	if(temp.getSkills().contains(skillLabel3.getText()))
                    		skillRad3.doClick();
                    	if(temp.getSkills().contains(skillLabel4.getText()))
                    		skillRad4.doClick();
                    	if(temp.getSkills().contains(skillLabel5.getText()))
                    		skillRad5.doClick();
                    	if(temp.getSkills().contains(skillLabel6.getText()))
                    		skillRad6.doClick();
                    	if(temp.getSkills().contains(skillLabel7.getText()))
                    		skillRad7.doClick();
                    	if(temp.getSkills().contains(skillLabel8.getText()))
                    		skillRad8.doClick();
                    	if(temp.getSkills().contains(skillLabel9.getText()))
                    		skillRad9.doClick();
                    	if(temp.getSkills().contains(skillLabel10.getText()))
                    		skillRad10.doClick();
                    	if(temp.getSkills().contains(skillLabel11.getText()))
                    		skillRad11.doClick();
                    	if(temp.getSkills().contains(skillLabel12.getText()))
                    		skillRad12.doClick();
                    	if(temp.getSkills().contains(skillLabel13.getText()))
                    		skillRad13.doClick();
                    	if(temp.getSkills().contains(skillLabel14.getText()))
                    		skillRad14.doClick();
                    	if(temp.getSkills().contains(skillLabel15.getText()))
                    		skillRad15.doClick();
                    	if(temp.getSkills().contains(skillLabel16.getText()))
                    		skillRad16.doClick();		
                    	if(temp.getSkills().contains(skillLabel17.getText()))
                    		skillRad17.doClick();	
                    	if(temp.getSkills().contains(skillLabel18.getText()))
                    		skillRad18.doClick();
                    	
                    	//proficiency bonus
                    	if(temp.getLevel() < 5) {profBonusText.setText("+2");
                    	}else if(temp.getLevel() < 9) {profBonusText.setText("+3");
                    	}else if(temp.getLevel() < 13) {profBonusText.setText("+4");
                    	}else if(temp.getLevel() < 17) {profBonusText.setText("+5");
                    	}else {profBonusText.setText("+6");}
                    	
                    	//Skill Mods
                    	
                    	int str= Integer.parseInt(strMod.getText());
                    	int dex= Integer.parseInt(dexMod.getText());
                    	int con= Integer.parseInt(conMod.getText());
                    	int intel= Integer.parseInt(intMod.getText());
                    	int wis= Integer.parseInt(wisMod.getText());
                    	int cha= Integer.parseInt(chaMod.getText());
                    	int bonus= Integer.parseInt(profBonusText.getText());
                    	if(skillRad1.isSelected()) {skillMod1.setText(""+ df.format(dex + bonus));
                    	}else {skillMod1.setText(df.format(dex));}
                    	if(skillRad2.isSelected()) {skillMod2.setText(""+ df.format(wis + bonus));
                    	}else {skillMod2.setText(df.format(wis));}
                    	if(skillRad3.isSelected()) {skillMod3.setText(""+ df.format(intel + bonus));
                    	}else {skillMod3.setText(df.format(intel));}
                    	if(skillRad4.isSelected()) {skillMod4.setText(""+ df.format(str + bonus));
                    	}else {skillMod4.setText(df.format(str));}
                    	if(skillRad5.isSelected()) {skillMod5.setText(""+ df.format(cha + bonus));
                    	}else {skillMod5.setText(df.format(cha));}
                    	if(skillRad6.isSelected()) {skillMod6.setText(""+ df.format(intel + bonus));
                    	}else {skillMod6.setText(df.format(intel));}
                    	if(skillRad7.isSelected()) {skillMod7.setText(""+ df.format(wis + bonus));
                    	}else {skillMod7.setText(df.format(wis));}
                    	if(skillRad8.isSelected()) {skillMod8.setText(""+ df.format(cha + bonus));
                    	}else {skillMod8.setText(df.format(cha));}
                    	if(skillRad9.isSelected()) {skillMod9.setText(""+ df.format(intel + bonus));
                    	}else {skillMod9.setText(df.format(intel));}
                    	if(skillRad10.isSelected()) {skillMod10.setText(""+ df.format(wis + bonus));
                    	}else {skillMod10.setText(df.format(wis));}
                    	if(skillRad11.isSelected()) {skillMod11.setText(""+ df.format(intel + bonus));
                    	}else {skillMod11.setText(df.format(intel));}
                    	if(skillRad12.isSelected()) {skillMod12.setText(""+ df.format(wis + bonus));
                    	}else {skillMod12.setText(df.format(wis));}
                    	if(skillRad13.isSelected()) {skillMod13.setText(""+ df.format(cha + bonus));
                    	}else {skillMod13.setText(df.format(cha));}
                    	if(skillRad14.isSelected()) {skillMod14.setText(""+ df.format(cha + bonus));
                    	}else {skillMod14.setText(df.format(cha));}
                    	if(skillRad15.isSelected()) {skillMod15.setText(""+ df.format(intel + bonus));
                    	}else {skillMod15.setText(df.format(intel));}
                    	if(skillRad16.isSelected()) {skillMod16.setText(""+ df.format(dex + bonus));
                    	}else {skillMod16.setText(df.format(dex));}
                    	if(skillRad17.isSelected()) {skillMod17.setText(""+ df.format(dex + bonus));
                    	}else {skillMod17.setText(df.format(dex));}
                    	if(skillRad18.isSelected()) {skillMod18.setText(""+ df.format(wis + bonus));
                    	}else {skillMod18.setText(df.format(wis));}
                    	
                    	//saving throws
                    	//reset radio buttons
                    	if(strSaveRad.isSelected()) {strSaveRad.doClick();}
                    	if(dexSaveRad.isSelected()) {dexSaveRad.doClick();}
                    	if(conSaveRad.isSelected()) {conSaveRad.doClick();}
                    	if(intSaveRad.isSelected()) {intSaveRad.doClick();}
                    	if(wisSaveRad.isSelected()) {wisSaveRad.doClick();}
                    	if(chaSaveRad.isSelected()) {chaSaveRad.doClick();}
                    	//select radio buttons
                    	int[] saveProfs = temp.getCharClass().getSaves();
                    	if(saveProfs[0] == 1) {strSaveRad.doClick();}
                    	if(saveProfs[1] == 1) {dexSaveRad.doClick();}
                    	if(saveProfs[2] == 1) {conSaveRad.doClick();}
                    	if(saveProfs[3] == 1) {intSaveRad.doClick();}
                    	if(saveProfs[4] == 1) {wisSaveRad.doClick();}
                    	if(saveProfs[5] == 1) {chaSaveRad.doClick();}
                    	//calc skill mods
                    	if(strSaveRad.isSelected()) {strSaveMod.setText(""+ df.format(str + bonus));
                    	}else {strSaveMod.setText(df.format(str));}
                    	if(dexSaveRad.isSelected()) {dexSaveMod.setText(""+ df.format(dex + bonus));
                    	}else {dexSaveMod.setText(df.format(dex));}
                    	if(conSaveRad.isSelected()) {conSaveMod.setText(""+ df.format(con + bonus));
                    	}else {conSaveMod.setText(df.format(con));}
                    	if(intSaveRad.isSelected()) {intSaveMod.setText(""+ df.format(intel + bonus));
                    	}else {intSaveMod.setText(df.format(intel));}
                    	if(wisSaveRad.isSelected()) {wisSaveMod.setText(""+ df.format(wis + bonus));
                    	}else {wisSaveMod.setText(df.format(wis));}
                    	if(chaSaveRad.isSelected()) {chaSaveMod.setText(""+ df.format( + bonus));
                    	}else {chaSaveMod.setText(df.format(cha));}
                    	
                    	//all text areas
                        traitsText.setText(temp.getTraits());
                        idealsText.setText(temp.getIdeals());
                        bondsText.setText(temp.getBonds());
                        flawsText.setText(temp.getFlaws());
                        featuresText.setText(temp.getFeatures());
                        equipText.setText(temp.getEquip());
                        profsText.setText(temp.getProfs());
                        
                        //set ac 
                        acText.setText(""+ temp.getArmor());
                        
                        //set HP text boxes
                        totalHP.setText(""+ temp.getMaxHP());
                        currentHP.setText(""+ temp.getMaxHP());
                        
                        //set player name
                        pName.setText(temp.getPlayer());
                        
                        //set background
                        bgText.setText(temp.getBackground());
                        
                        //speed
                        speed.setText(""+ temp.getRace().getSpeed());
                        
                        //passive perception
                        passiveText.setText("" + (10 + Integer.parseInt(wisMod.getText() )) );
                        
                        //hit dice
                        int dieSize = 8;
                        if(temp.getCharClass() instanceof Sorcerer || temp.getCharClass() instanceof Wizard) {
                        	dieSize = 6;
                        }
                        if(temp.getCharClass() instanceof Fighter || temp.getCharClass() instanceof Paladin 
                        		|| temp.getCharClass() instanceof Ranger) { 
                        	dieSize = 10;
                        }
                        if(temp.getCharClass() instanceof Barbarian){ dieSize = 12;}
                        hitDice.setText(temp.getLevel() +"d"+ dieSize);
                        
                        //initiative
                        initiative.setText(""+ df.format(dexMod.getText()));
                        
                    }

                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }

//        if (src == saveChar) {
//            // Code for saving a character
//
//            try (FileOutputStream file = new FileOutputStream("ExampleChars/" + dndChar.getName() + ".char");
//            		ObjectOutputStream out = new ObjectOutputStream(file);) {
//            	out.writeObject(dndChar);
//            }
//
//            catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
        if(src == switchWindow) {
        	new CharacterEditor();
        	this.dispose();
        }
        
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        new CharacterSheet();
    }
}