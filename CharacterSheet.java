package DNDCompanion;

import javax.swing.*;
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
        setSize(1000,1000);
    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == openChar){
            JFileChooser sel = new JFileChooser();
            // Code for opening a character
        }

        if(src == saveChar){
            // Code for saving a character
        }

        if(src == close){
            // Code for closing the program
        }

    }

    public static void main(String[] args){
        new CharacterSheet();
    }
}