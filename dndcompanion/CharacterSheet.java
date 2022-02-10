package dndcompanion;

import javax.swing.*;

import dndcompanion.character.Character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterSheet extends JFrame implements ActionListener{

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem newChar;
    private JMenuItem close;

    private Character character;
    private boolean loaded;

    public CharacterSheet(){
        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        newChar = new JMenuItem("New Character");
        openChar = new JMenuItem("Open Character");
        saveChar = new JMenuItem("Save Character");
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

        loaded = false; 

        setVisible(true);
        setSize(1920,1080);
    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == openChar){
            // Code for opening a character
            JFileChooser sel = new JFileChooser();
        }

        if(src == saveChar){
            // Code for saving a character
        }

        if(src == close){
            // Code for closing the program
            System.exit(1);
        }

    }

    public static void main(String[] args){
        new CharacterSheet();
    }
}