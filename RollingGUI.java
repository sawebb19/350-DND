package dndcompanion;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




/**
 * GUI Class for rolling dice in app.

 * @author Nick Ford
 *
 */
public class RollingGui implements ActionListener {
  JFrame frame = new JFrame();
  JPanel panel;
  JLabel rollLabel;
  JButton newRollButton;
  JComboBox<String> comboBox;
  JButton rollButton;
  JDialog rollDiag;
  private JTextField resultText;
  private JLabel resultLabel;
  private JTextField customText;
  private JLabel addRollLabel;
  private Component rigidArea;
  private Component rigidArea1;
  private Component rigidArea2;
  private Component rigidArea3;
  private Component rigidArea4;

  /**
   * Constructor for the dice rolling GUI. 
   */
  public RollingGui() {
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    GridBagLayout gblPanel = new GridBagLayout();
    gblPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 20, 0, 0, 0};
    gblPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    gblPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 
        Double.MIN_VALUE};
    gblPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 
        Double.MIN_VALUE};
    panel.setLayout(gblPanel);

    rigidArea2 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbcRigidArea2 = new GridBagConstraints();
    gbcRigidArea2.insets = new Insets(0, 0, 5, 5);
    gbcRigidArea2.gridx = 3;
    gbcRigidArea2.gridy = 1;
    panel.add(rigidArea2, gbcRigidArea2);

    addRollLabel = new JLabel("Custom Roll");
    GridBagConstraints gbcAddRollLabel = new GridBagConstraints();
    gbcAddRollLabel.insets = new Insets(0, 0, 5, 5);
    gbcAddRollLabel.gridx = 4;
    gbcAddRollLabel.gridy = 2;
    panel.add(addRollLabel, gbcAddRollLabel);

    newRollButton = new JButton("Add");
    GridBagConstraints gbcNewRollButton = new GridBagConstraints();
    gbcNewRollButton.fill = GridBagConstraints.HORIZONTAL;
    gbcNewRollButton.insets = new Insets(0, 0, 5, 5);
    gbcNewRollButton.gridx = 2;
    gbcNewRollButton.gridy = 3;
    panel.add(newRollButton, gbcNewRollButton);
    newRollButton.addActionListener(this);

    customText = new JTextField();
    GridBagConstraints gbcCustomText = new GridBagConstraints();
    gbcCustomText.gridwidth = 4;
    gbcCustomText.insets = new Insets(0, 0, 5, 5);
    gbcCustomText.fill = GridBagConstraints.HORIZONTAL;
    gbcCustomText.gridx = 3;
    gbcCustomText.gridy = 3;
    panel.add(customText, gbcCustomText);
    customText.setColumns(10);

    rigidArea4 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbcRigidArea4 = new GridBagConstraints();
    gbcRigidArea4.insets = new Insets(0, 0, 5, 5);
    gbcRigidArea4.gridx = 4;
    gbcRigidArea4.gridy = 4;
    panel.add(rigidArea4, gbcRigidArea4);

    rigidArea = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbcRigidArea = new GridBagConstraints();
    gbcRigidArea.insets = new Insets(0, 0, 5, 5);
    gbcRigidArea.gridx = 1;
    gbcRigidArea.gridy = 5;
    panel.add(rigidArea, gbcRigidArea);

    rollLabel = new JLabel("Saved Rolls");
    GridBagConstraints gbcRollLabel = new GridBagConstraints();
    gbcRollLabel.insets = new Insets(0, 0, 5, 5);
    gbcRollLabel.gridx = 2;
    gbcRollLabel.gridy = 5;
    panel.add(rollLabel, gbcRollLabel);

    rigidArea3 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbcRigidArea3 = new GridBagConstraints();
    gbcRigidArea3.insets = new Insets(0, 0, 5, 5);
    gbcRigidArea3.gridx = 7;
    gbcRigidArea3.gridy = 5;
    panel.add(rigidArea3, gbcRigidArea3);
    
    comboBox = new JComboBox<String>();
    loadRolls(comboBox);
    GridBagConstraints gbcComboBox = new GridBagConstraints();
    gbcComboBox.insets = new Insets(0, 0, 5, 5);
    gbcComboBox.fill = GridBagConstraints.HORIZONTAL;
    gbcComboBox.gridx = 2;
    gbcComboBox.gridy = 6;
    panel.add(comboBox, gbcComboBox);

    resultLabel = new JLabel("Roll Result");
    GridBagConstraints gbcResultLabel = new GridBagConstraints();
    gbcResultLabel.anchor = GridBagConstraints.SOUTH;
    gbcResultLabel.insets = new Insets(0, 0, 5, 5);
    gbcResultLabel.gridx = 4;
    gbcResultLabel.gridy = 6;
    panel.add(resultLabel, gbcResultLabel);

    rollButton = new JButton("Roll");
    GridBagConstraints gbcRollButton = new GridBagConstraints();
    gbcRollButton.fill = GridBagConstraints.BOTH;
    gbcRollButton.insets = new Insets(0, 0, 5, 5);
    gbcRollButton.gridx = 2;
    gbcRollButton.gridy = 7;
    panel.add(rollButton, gbcRollButton);

    resultText = new JTextField();
    GridBagConstraints gbcResultText = new GridBagConstraints();
    gbcResultText.gridwidth = 4;
    gbcResultText.insets = new Insets(0, 0, 5, 5);
    gbcResultText.fill = GridBagConstraints.HORIZONTAL;
    gbcResultText.gridx = 3;
    gbcResultText.gridy = 7;
    panel.add(resultText, gbcResultText);
    resultText.setColumns(10);

    rigidArea1 = Box.createRigidArea(new Dimension(20, 20));
    GridBagConstraints gbcRigidArea1 = new GridBagConstraints();
    gbcRigidArea1.insets = new Insets(0, 0, 5, 5);
    gbcRigidArea1.gridx = 4;
    gbcRigidArea1.gridy = 8;
    panel.add(rigidArea1, gbcRigidArea1);
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

   * @param e An event performed by one of the Listened-to JFrame items.
   */
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    if (src == rollButton) {
      String rollStr = (String) comboBox.getSelectedItem();
      int numDice = Integer.parseInt(rollStr.substring(0, rollStr.indexOf("d")));
      int sizeDice;
      int rollMod;
      if (rollStr.contains("+")) {
        sizeDice = Integer.parseInt(rollStr.substring(rollStr.indexOf("d") + 1, 
            rollStr.indexOf("+")));
        rollMod = Integer.parseInt(rollStr.substring(rollStr.indexOf("+") + 1));
      } else {
        sizeDice = Integer.parseInt(rollStr.substring(rollStr.indexOf("d") + 1));
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
        try (FileWriter f = new FileWriter(System.getProperty("user.dir")
            + "\\src\\dndcompanion\\rolls.txt", true)) {
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
    try {
      File file = new File(System.getProperty("user.dir") + "\\src\\dndcompanion\\rolls.txt");
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        box.addItem(sc.nextLine());
      }
    } catch (Exception e) {
      //lol nothing cause it won't throw
    }
    if (sc != null) {
      sc.close();
    }
  }
}
