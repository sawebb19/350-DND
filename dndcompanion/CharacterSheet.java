package dndcompanion;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

// These are for the test character
import dndcompanion.character.Character;
import dndcompanion.character.chrclasses.*;
import dndcompanion.character.chrraces.*;

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

        Race race = new HalfOrc();
        CharacterClass charClass = new Paladin();

        // Test Character For Saving/Loading
        character = new Character("Terry", // Name
                                    1,  // Ethical Align: Neutral
                                    2, // Moral Align: Evil
                                    race,
                                    charClass,
                                    1, // Level
                                    0, // Exp
                                    new int[]{3,3,3,3,3,3}, // Stats
                                    new int[]{0,0,0,0,0,0}); // Modifiers
                                    
    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == openChar){
            // Code for opening a character
            JFileChooser sel = new JFileChooser();
            int status = sel.showOpenDialog(null);
            if(status == JFileChooser.APPROVE_OPTION){
                try{
                    String path = sel.getSelectedFile().getCanonicalPath();

                    FileInputStream file = new FileInputStream(path);
                    ObjectInputStream in = new ObjectInputStream(file);

                    Character printMe = (Character)in.readObject();

                    in.close();
                    file.close();
                    System.out.println(printMe.toString());
                }

                catch(Exception ex){
                    System.out.println("Error!");
                }

                
            }
        }

        if(src == saveChar){
            // Code for saving a character
            try{

                FileOutputStream file = new FileOutputStream("ExampleChars/"+character.getName()+".char");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(character);

                out.close();
                file.close();
            }

            catch(Exception ex){
                System.out.println("Error!");
            }
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