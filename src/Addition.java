import javax.swing.JOptionPane;
import java.awt.*;
//Fig. 12.2: Addition.java
//Addition program that uses JOptionPane for input and output.
public class Addition {
    public static void main(String[] args) {
        //obtain user input from JOptionPane input dialogs
        String firstNumber =  JOptionPane.showInputDialog("Enter first integer" );
        String secondNumber = JOptionPane.showInputDialog("Enter second integer" );

        //convert String inputs to int values for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;

        //display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum,  "Sum of Two integers", JOptionPane.ERROR_MESSAGE);
    }
} // END CLASS Addition

// JOptionPane class. JOptionPane is a class library that makes it easy to pop up a simple dialog box that either provides an information message or asks for a simple input from the user
/*
while the class has a lot of methods, most uses of this class are through a few static methods

Remember that this means you can call upon such features through the class name, without having to build objects

*/

/*

    Message dialog box
        This is a simple information dialog box
        To use it, call one of the showMessageDialog() methods. void showMessageDialog(Component parentComponent, Object message, String title, int messageType)
        parentComponent: indicates what component this dialog will pop up over. Use null to make the message not connected to any other component.
        message: This is the actual message being displayed.
        title: The string that will appear in the pop-up window's title bar
        messageType: Use one of these static constants from the class. Except for plain message, each one uses a special icon on the message box
        PLAIN_MESSAGE
        ERROR_MESSAGE
        INFORMATION_MESSAGE
        WARNING_MESSAGE
        QUESTION_MESSAGE

    These are void methods, so just call them by themselves to pop up a message box


    Input dialog box
        This is a dialog box that allows a user to type in some input
        To use it, call one of the showInputDialog() methods
        These methods return the input as a String. Such calls should capture the returned value


    Confirm dialog box
        This is a dialog box that presents the user with a Yes/No/Cancel option
        To use it, call one of the showConfirmDialog() methods
        These methods return the user's answer as an int value.
        The returned integer value can be tested against pre-defined constants, shown in the Field Summary for the class

*/
// showInputDialog, showMessageDialog, JOptionPane