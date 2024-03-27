package GUI_PART2_Buttons;
// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.

 import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
/*
Radio buttons normally appear as a group in which only one button can be selected at a time.
Used to represent mutually exclusive options that is maintained by a ButtonGroup object,
which organizes a group of buttons but not displayed in a user interface.
*/
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup; // ButtonGroup method add associates a JRadioButtonwith the group.


public class RadioButtonFrame extends JFrame
{
    private final JTextField textField; // used to display font changes
    private final Font plainFont, boldFont, italicFont, boldItalicFont;
    private final JRadioButton plainJRadioButton, boldJRadioButton, italicJRadioButton, boldItalicJRadioButton;
     private final ButtonGroup radioGroup; //groups radio buttons together

    // RadioButtonFrame constructor adds JRadioButtons to JFrame
    public RadioButtonFrame()
    {
        super("RadioButton Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 25);
        add(textField); // add textField to JFrame

        // create radio buttons
        plainJRadioButton = new JRadioButton("Plain", true); // true initially selected
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(plainJRadioButton); // add plain button to JFrame
        add(boldJRadioButton);  // add bold button to JFrame
        add(italicJRadioButton); // add italic button to JFrame
        add(boldItalicJRadioButton); // add bold and italic button

        // create logical relationship between JRadioButtons
        radioGroup = new ButtonGroup(); // create ButtonGroup
        radioGroup.add(plainJRadioButton); // add plain to group
        radioGroup.add(boldJRadioButton); // add bold to group
        radioGroup.add(italicJRadioButton); // add italic to group
        radioGroup.add(boldItalicJRadioButton); // add bold and italic

        // create font objects
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        // register events for JRadioButtons
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }
    // private inner class for ItemListener event handling
    private class RadioButtonHandler implements ItemListener
    {
        private final Font font; // font associated with this listener

        public RadioButtonHandler(Font f)
        {
            font = f;
        }

        // handle radio button events
         @Override
         public void itemStateChanged(ItemEvent event)
        {
            textField.setFont(font);
        }


    }

    public static void main(String[] args)
    {
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(300, 100);
        radioButtonFrame.setVisible(true);
    }

}// end class RadioButtonFrame
