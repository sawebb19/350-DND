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

public class CharacterSheet extends JFrame implements ActionListener {

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem openChar;
    private JMenuItem saveChar;
    private JMenuItem newChar;
    private JMenuItem close;

    private JLabel charName;
    private JLabel charRace;
    private JLabel charClass;

    private Character character;

    public CharacterSheet() {

        // Menus

        menus = new JMenuBar();

        fileMenu = new JMenu("File");
        newChar = new JMenuItem("New Character");
        openChar = new JMenuItem("Open Character");
        saveChar = new JMenuItem("Save Character");
        //saveChar.setEnabled(false);
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

        // Items inside CharacterSheet

        charName = new JLabel();
        charRace = new JLabel();
        charClass = new JLabel();

        charName.setBounds(50,20,70,15);
        charRace.setBounds(50,55,70,15);
        charClass.setBounds(50,90,70,15);

        getContentPane().add(charName);
        getContentPane().add(charRace);
        getContentPane().add(charClass);

        setVisible(true);
        setSize(1920, 1080);

        Race race = new HalfOrc();
        CharacterClass paladin = new Paladin();

        // Test Character For Saving/Loading
        character = new Character("Terry", // Name
                "Neutral", // Ethical Align
                "Evil", // Moral Align
                race,
                paladin,
                1, // Level
                0, // Exp
                new int[] { 3, 3, 3, 3, 3, 3 }, // Stats
                new int[] { 0, 0, 0, 0, 0, 0 }); // Modifiers

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

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

                        Character temp = (Character) in.readObject();
                        charName.setText(temp.getName());
                        charRace.setText(temp.getRace().getName());
                        charClass.setText(temp.getCharClass().getName());
                        //saveChar.setEnabled(true);
                    }

                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }

        if (src == saveChar) {
            // Code for saving a character
            try (FileOutputStream file = new FileOutputStream("ExampleChars/" + character.getName() + ".char");
                    ObjectOutputStream out = new ObjectOutputStream(file);) {

                out.writeObject(character);
            }

            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (src == close) {
            // Code for closing the program
            System.exit(1);
        }

    }

    public static void main(String[] args) {
        new CharacterSheet();
    }
}