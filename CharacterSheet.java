package DNDCompanion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterSheet extends JFrame implements ActionListener{

    private JMenuBar menus;

    private JMenu fileMenu;
    private JMenuItem OpenChar;
    private JMenuItem SaveChar;
    private JMenuItem Close;



    public CharacterSheet(){
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

        setVisible(true);
        setSize(1000,1000);
    }

    public void actionPerformed(ActionEvent e){
        System.out.print("N/A");
    }

    public static void main(String[] args){
        new CharacterSheet();
    }
}