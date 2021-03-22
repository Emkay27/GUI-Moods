import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonFrame extends JFrame implements ActionListener {

    // Creating the radio buttons and assigning them names.
    JRadioButton sadButton = new JRadioButton("Sad");
    JRadioButton sickButton = new JRadioButton("Sick");
    JRadioButton happyButton = new JRadioButton("Happy");

    //Creating the Image icons.
    ImageIcon sadImage;
    ImageIcon sickImage;
    ImageIcon happyImage;

    public RadioButtonFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //So that the frame can close properly.
        this.setLayout(new FlowLayout()); //Create a flow layout.
        this.setResizable(false); // The frame should't be resizable.
        this.setTitle("                    Click on the Emoji that best describes how you are feeling today"); //Give the frame a title.

        //the image icons we created above, takes as aruguments the path of the picture or the name of the picture if it's in the same folder as the code.
        sadImage = new ImageIcon("sad-emoji-face.png");
        sickImage = new ImageIcon("sick-emoji-face.png");
        happyImage = new ImageIcon("happy-emoji-face.jpg");

        // Now set the icons to the radio buttons.
        sadButton.setIcon(sadImage);
        sickButton.setIcon(sickImage);
        happyButton.setIcon(happyImage);

        //The buttons should't be focusable.
        sadButton.setFocusable(false);
        sickButton.setFocusable(false);
        happyButton.setFocusable(false);

        // Lines 24-27 enables us to select only one radio button as an option out of
        // all the options that are available.
        ButtonGroup group = new ButtonGroup();
        group.add(sadButton);
        group.add(sickButton);
        group.add(happyButton);

        // The following allows the button to listen to the event.
        sadButton.addActionListener(this);
        sickButton.addActionListener(this);
        happyButton.addActionListener(this);

        this.add(sadButton);
        this.add(sickButton);
        this.add(happyButton);
        this.setIconImage(happyImage.getImage());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sadButton) {
            JOptionPane.showMessageDialog(null, "Oh you are Sad, lets go play FIFA.", "Sad",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getSource() == sickButton) {
            JOptionPane.showMessageDialog(null, "Oh you are Sick, lets go see a doctor.", "Sick",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getSource() == happyButton) {
            JOptionPane.showMessageDialog(null, "Oh You are happy today, lets go have some more fun.", "Happy",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}