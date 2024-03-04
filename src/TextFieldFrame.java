//Fig. 12.9: TextFieldFrame.java
//JTextFields and JPasswordFields.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class TextFieldFrame extends JFrame
{
    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passwordField1; // password field with text


    // TextFieldFrame constructor adds JTextFields to JFrame
    public TextFieldFrame()
    {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout()); // set frame layout

        // construct text field with 10 columns
        textField1 = new JTextField(20);
        add(textField1); // add textField1 to JFrame

        // construct text field with default text
        textField2 = new JTextField("Enter text here       ");
        add(textField2); // add textField2 to JFrame

        // construct text field with default text and 21 columns
        textField3 = new JTextField("Un-editable text field", 21);
        textField3.setEditable(false); // disable editing
        add(textField3); // add textField3 to JFrame

        // construct password field with default text
        passwordField1 = new JPasswordField("Hidden text");
        add(passwordField1); // add passwordField to JFrame

        //Step2: register event handlers
        TextFieldHandler handler = new TextFieldHandler(); //Inner Class
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField1.addActionListener(handler);
    }


    // private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        // process text field events
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            // user pressed Enter in JTextField textField1
            if ( event.getSource() == textField1) {
                textField2.setText("Hello ");
                string = String.format("textField1: %s", event.getActionCommand());

                //user pressed Enter in JTextField textField2
            }else if ( event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());

                //user pressed Enter in JTextField textField3
            }else if ( event.getSource() == textField3) {
                string = String.format("textField3: %s", event.getActionCommand());

            }else if ( event.getSource() == passwordField1)
                string = String.format("passwordField: %s", event.getActionCommand());


            // display JTextField content
            JOptionPane.showMessageDialog(null, string); // null = center, string is empty
        }
    }// end private inner class TextFieldHandler

}// end class TextFieldFrame


/*
* This code snippet is an event handler method for handling actions performed on different text fields and a password field. Here's an explanation of the if statement:

    if (event.getSource() == textField1):
        Checks if the event source (the component that triggered the event) is equal to textField1.
        If true, it sets the text of textField2 to "Hello" and formats a string to indicate that the action was performed on textField1.

    else if (event.getSource() == textField2):
        Checks if the event source is equal to textField2.
        If true, it formats a string to indicate that the action was performed on textField2.

    else if (event.getSource() == textField3):
        Checks if the event source is equal to textField3.
        If true, it formats a string to indicate that the action was performed on textField3.

    else if (event.getSource() == passwordField1):
        Checks if the event source is equal to passwordField1.
        If true, it formats a string to indicate that the action was performed on passwordField1.

    Finally, the method displays a message dialog showing the content of the text fields or the password field, depending on which component triggered the event.
*
* */




