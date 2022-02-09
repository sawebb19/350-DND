package DNDCompanion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class CharacterEditor extends JFrame implements ActionListener{

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem OpenChar;
    private JMenuItem SaveChar;
    private JMenuItem Close;
    
    private JLabel charNameLabel;
    private JLabel classLabel;
    private JLabel raceLabel;
    private JLabel alignLabel;
    private JLabel bgLabel;
    private JLabel xpLabel;
    private JLabel playerNameLabel;
    private JLabel saveThrowLabel;
    private JLabel skillsLabel;
    
    private JTextField charNameText;
    private JTextField classText;
    private JTextField raceText;
    private JTextField alignText;
    private JTextField bgText;
    private JTextField xpText;
    private JTextField playerNameText;
    
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
    
    
    private JComboBox alignBox;
    private JComboBox classBox;
    private JComboBox lvlBox;
    
    private JSeparator separator1;
    private JTextField strText;
    private JTextField dexText;
    private JTextField conText;
    private JTextField intText;
    private JTextField wisText;
    private JTextField chaText;
    private JLabel strLabel;
    private JLabel dexLabel;
    private JLabel conLabel;
    private JLabel intLabel;
    private JLabel wisLabel;
    private JLabel chaLabel;
    private JSeparator separator2;
    private JSeparator separator3;
    

    //Close.addActionListener(this);

    public CharacterEditor(){
        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        OpenChar = new JMenuItem("Open Character");
        SaveChar = new JMenuItem("Save Character");
        Close = new JMenuItem("Close");
        
        fileMenu.add(OpenChar);
        fileMenu.add(SaveChar);
        fileMenu.addSeparator();
        fileMenu.add(Close);

        menus.add(fileMenu);
        setJMenuBar(menus);
        
        charNameText = new JTextField();
        charNameText.setBounds(38, 26, 274, 34);
        getContentPane().add(charNameText);
        charNameText.setColumns(10);
        
        charNameLabel = new JLabel("Character Name");
        charNameLabel.setBounds(39, 11, 117, 14);
        getContentPane().add(charNameLabel);
        
        classLabel = new JLabel("Class & Lvl");
        classLabel.setBounds(40, 69, 70, 14);
        getContentPane().add(classLabel);
        
        String[] classChoice = {"", "Barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "warlock", "wizard"};
        classBox = new JComboBox(classChoice);
        classBox.setBounds(40, 84, 85, 25);
        classBox.setSelectedIndex(0);
        getContentPane().add(classBox);
        
        String[] lvlChoice = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        lvlBox = new JComboBox(lvlChoice);
        lvlBox.setBounds(124, 84, 40, 25);
        lvlBox.setSelectedIndex(0);
        getContentPane().add(lvlBox);
        
        raceText = new JTextField();
        raceText.setColumns(10);
        raceText.setBounds(188, 84, 124, 25);
        getContentPane().add(raceText);
        
        raceLabel = new JLabel("Race");
        raceLabel.setBounds(188, 69, 56, 14);
        getContentPane().add(raceLabel);
        
        alignLabel = new JLabel("Alignment");
        alignLabel.setBounds(40, 120, 70, 14);
        getContentPane().add(alignLabel);
        
        String[] alignChoice = {"","Lawful Good","Neutral Good","Chaotic Good",
				"Lawful Neutral","Neutral","Chaotic Neutral",
				"Lawful Evil","Neutral Evil","Chaotic Evil"};
        alignBox = new JComboBox(alignChoice);
        alignBox.setBounds(40, 135, 125, 25);
        alignBox.setSelectedIndex(0);
        getContentPane().add(alignBox);
        
        bgLabel = new JLabel("Background");
        bgLabel.setBounds(188, 120, 83, 14);
        getContentPane().add(bgLabel);
        
        bgText = new JTextField();
        bgText.setColumns(10);
        bgText.setBounds(188, 135, 124, 25);
        getContentPane().add(bgText);
        
        xpLabel = new JLabel("Experience");
        xpLabel.setBounds(40, 171, 84, 14);
        getContentPane().add(xpLabel);
        
        xpText = new JTextField();
        xpText.setColumns(10);
        xpText.setBounds(40, 186, 125, 25);
        getContentPane().add(xpText);
        
        playerNameLabel = new JLabel("Player Name");
        playerNameLabel.setBounds(188, 171, 83, 14);
        getContentPane().add(playerNameLabel);
        
        playerNameText = new JTextField();
        playerNameText.setColumns(10);
        playerNameText.setBounds(188, 186, 124, 25);
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
        separator1.setBounds(542, 108, 2, 187);
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
        separator2.setBounds(353, 107, 535, 2);
        getContentPane().add(separator2);
        
        //stat display/input
        strText = new JTextField();
        strText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        strText.setBounds(479, 51, 40, 32);
        getContentPane().add(strText);
        strText.setColumns(10);
        
        dexText = new JTextField();
        dexText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        dexText.setColumns(10);
        dexText.setBounds(529, 51, 40, 32);
        getContentPane().add(dexText);
        
        conText = new JTextField();
        conText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        conText.setColumns(10);
        conText.setBounds(579, 51, 40, 32);
        getContentPane().add(conText);
        
        intText = new JTextField();
        intText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        intText.setColumns(10);
        intText.setBounds(629, 51, 40, 32);
        getContentPane().add(intText);
        
        wisText = new JTextField();
        wisText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        wisText.setColumns(10);
        wisText.setBounds(679, 51, 40, 32);
        getContentPane().add(wisText);
        
        chaText = new JTextField();
        chaText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        chaText.setColumns(10);
        chaText.setBounds(729, 51, 40, 32);
        getContentPane().add(chaText);
        
        strLabel = new JLabel("STR");
        strLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        strLabel.setBounds(479, 34, 40, 14);
        getContentPane().add(strLabel);
        
        dexLabel = new JLabel("DEX");
        dexLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        dexLabel.setBounds(529, 34, 40, 14);
        getContentPane().add(dexLabel);
        
        conLabel = new JLabel("CON");
        conLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conLabel.setBounds(576, 34, 40, 14);
        getContentPane().add(conLabel);
        
        intLabel = new JLabel("INT");
        intLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        intLabel.setBounds(629, 34, 40, 14);
        getContentPane().add(intLabel);
        
        wisLabel = new JLabel("WIS");
        wisLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        wisLabel.setBounds(679, 34, 40, 14);
        getContentPane().add(wisLabel);
        
        chaLabel = new JLabel("CHA");
        chaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        chaLabel.setBounds(729, 34, 40, 14);
        getContentPane().add(chaLabel);
        

        
        setVisible(true);
        setSize(1000,1000);
        getContentPane().setLayout(null);
        
        separator3 = new JSeparator(SwingConstants.VERTICAL);
        separator3.setBounds(333, 11, 2, 642);
        getContentPane().add(separator3);
        

    }

    public void actionPerformed(ActionEvent e){
        System.out.print("N/A");
        if(e.getSource() == Close){
			System.exit(1);
		}
    }

    public static void main(String[] args){
        new CharacterEditor();
    }
}