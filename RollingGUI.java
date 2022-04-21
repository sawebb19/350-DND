package dndcompanion;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
/**
 * GUI Class for rolling dice in app.

 * @author Nick Ford
 *
 */
public class RollingGUI implements ActionListener {
  JFrame frame = new JFrame();
  JPanel panel;
  JLabel rollLabel;
  JButton newRollButton;
  JComboBox<String> comboBox;
  JButton rollButton;
  JDialog rollDiag;
  private JTextField resultText;
  private JLabel resultLabel;
  private Component horizontalStrut;
  private Component horizontalStrut_1;
  private Component horizontalStrut_2;
  private Component verticalStrut;
  private Component verticalStrut_1;
  private Component verticalStrut_2;
  private JTextField customText;
  private JLabel AddRollLabel;
  private Component rigidArea;
  private Component rigidArea_1;
  private Component rigidArea_3;
  private Component rigidArea_4;
  private Component rigidArea_5;


  //Constructor for the Rolling GUI 
  public RollingGUI() {
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 20, 0, 0, 0};
    gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
    panel.setLayout(gbl_panel);

    rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
    gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
    gbc_rigidArea_3.gridx = 3;
    gbc_rigidArea_3.gridy = 1;
    panel.add(rigidArea_3, gbc_rigidArea_3);

    AddRollLabel = new JLabel("Custom Roll");
    GridBagConstraints gbc_AddRollLabel = new GridBagConstraints();
    gbc_AddRollLabel.insets = new Insets(0, 0, 5, 5);
    gbc_AddRollLabel.gridx = 4;
    gbc_AddRollLabel.gridy = 2;
    panel.add(AddRollLabel, gbc_AddRollLabel);

    newRollButton = new JButton("Add");
    GridBagConstraints gbc_newRollButton = new GridBagConstraints();
    gbc_newRollButton.fill = GridBagConstraints.HORIZONTAL;
    gbc_newRollButton.insets = new Insets(0, 0, 5, 5);
    gbc_newRollButton.gridx = 2;
    gbc_newRollButton.gridy = 3;
    panel.add(newRollButton, gbc_newRollButton);
    newRollButton.addActionListener(this);

    customText = new JTextField();
    GridBagConstraints gbc_customText = new GridBagConstraints();
    gbc_customText.gridwidth = 4;
    gbc_customText.insets = new Insets(0, 0, 5, 5);
    gbc_customText.fill = GridBagConstraints.HORIZONTAL;
    gbc_customText.gridx = 3;
    gbc_customText.gridy = 3;
    panel.add(customText, gbc_customText);
    customText.setColumns(10);

    rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
    gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
    gbc_rigidArea_5.gridx = 4;
    gbc_rigidArea_5.gridy = 4;
    panel.add(rigidArea_5, gbc_rigidArea_5);

    rigidArea = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbc_rigidArea = new GridBagConstraints();
    gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
    gbc_rigidArea.gridx = 1;
    gbc_rigidArea.gridy = 5;
    panel.add(rigidArea, gbc_rigidArea);

    rollLabel = new JLabel("Saved Rolls");
    GridBagConstraints gbc_rollLabel = new GridBagConstraints();
    gbc_rollLabel.insets = new Insets(0, 0, 5, 5);
    gbc_rollLabel.gridx = 2;
    gbc_rollLabel.gridy = 5;
    panel.add(rollLabel, gbc_rollLabel);

    comboBox = new JComboBox<String>();
    loadRolls(comboBox);
    rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
    gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
    gbc_rigidArea_4.gridx = 7;
    gbc_rigidArea_4.gridy = 5;
    panel.add(rigidArea_4, gbc_rigidArea_4);
    GridBagConstraints gbc_comboBox = new GridBagConstraints();
    gbc_comboBox.insets = new Insets(0, 0, 5, 5);
    gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
    gbc_comboBox.gridx = 2;
    gbc_comboBox.gridy = 6;
    panel.add(comboBox, gbc_comboBox);

    resultLabel = new JLabel("Roll Result");
    GridBagConstraints gbc_resultLabel = new GridBagConstraints();
    gbc_resultLabel.anchor = GridBagConstraints.SOUTH;
    gbc_resultLabel.insets = new Insets(0, 0, 5, 5);
    gbc_resultLabel.gridx = 4;
    gbc_resultLabel.gridy = 6;
    panel.add(resultLabel, gbc_resultLabel);

    rollButton = new JButton("Roll");
    GridBagConstraints gbc_rollButton = new GridBagConstraints();
    gbc_rollButton.fill = GridBagConstraints.BOTH;
    gbc_rollButton.insets = new Insets(0, 0, 5, 5);
    gbc_rollButton.gridx = 2;
    gbc_rollButton.gridy = 7;
    panel.add(rollButton, gbc_rollButton);

    resultText = new JTextField();
    GridBagConstraints gbc_resultText = new GridBagConstraints();
    gbc_resultText.gridwidth = 4;
    gbc_resultText.insets = new Insets(0, 0, 5, 5);
    gbc_resultText.fill = GridBagConstraints.HORIZONTAL;
    gbc_resultText.gridx = 3;
    gbc_resultText.gridy = 7;
    panel.add(resultText, gbc_resultText);
    resultText.setColumns(10);

    rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
    gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
    gbc_rigidArea_1.gridx = 4;
    gbc_rigidArea_1.gridy = 8;
    panel.add(rigidArea_1, gbc_rigidArea_1);
    rollButton.addActionListener(this);

    frame.pack();
    frame.setVisible(true);
  }

  //simulates rolling the die by picking random in in the range of [1,faces]
  private int roll(int faces) {
    Random rand = new Random();
    return rand.nextInt(faces) + 1;
  }

  /**
   * Method to take care of actions initiated by the GUI.
   * 
   * @param e An event performed by one of the Listened-to JFrame items
   */
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    if (src == rollButton) {
      String rollStr = (String)comboBox.getSelectedItem();
      int numDice = Integer.parseInt(rollStr.substring(0, rollStr.indexOf("d")));
      int sizeDice;
      int rollMod;
      if(rollStr.contains("+")) {
        sizeDice = Integer.parseInt(rollStr.substring(rollStr.indexOf("d")+1, rollStr.indexOf("+")));
        rollMod = Integer.parseInt(rollStr.substring(rollStr.indexOf("+")+1));
      } else {
        sizeDice = Integer.parseInt(rollStr.substring(rollStr.indexOf("d")+1));
        rollMod = 0;
      }

      int totalRoll = rollMod;
      String prtStr = "";
      if (totalRoll != 0) {
        prtStr = totalRoll + "(Mod) + ";
      }
      for (int i = 0; i < numDice; i++) {
        int rollTemp = roll(sizeDice);
        totalRoll += rollTemp;
        if (i == numDice - 1) {
          prtStr += (rollTemp + " = " + totalRoll);
        } else {
          prtStr += (rollTemp + " + ");
        }
      }
      resultText.setText(prtStr);
    }
    if (src == newRollButton) {
      String newRoll = customText.getText();
      if (!newRoll.equals("")) {
        System.out.println(newRoll);
        //format check
        try (FileWriter f = new FileWriter(System.getProperty("user.dir") + "\\src\\dndcompanion\\rolls.txt", true)) {
          PrintWriter pw = new PrintWriter(new BufferedWriter(f));
          pw.print("\n" + newRoll); 
          pw.close();
          loadRolls(comboBox);
          comboBox.updateUI();
          customText.setText("");
        } catch (IOException i) { 
          i.printStackTrace(); 
        }
      }
    }

  }

  private void loadRolls(JComboBox<String> box) {
    box.removeAllItems();
    Scanner sc = null;
    try{
      File file = new File(System.getProperty("user.dir") + "\\src\\dndcompanion\\rolls.txt");
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        box.addItem(sc.nextLine());
      }
    }catch(Exception e) {
      //lol nothing cause it won't throw
    }
    if(sc != null) {
      sc.close();
    }
  }
}
