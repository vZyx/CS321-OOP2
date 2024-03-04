package Buttons;
// Fig. 12.16: Buttons.ButtonTest.java
// Testing Buttons.ButtonFrame.

import javax.swing.*;

public class ButtonTest
{
    public static void main(String[] args) {
        ButtonFrame buttonFrame1 = new ButtonFrame();
        buttonFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame1.setSize(300, 150);
        buttonFrame1.setVisible(true);
    }
}// end class Buttons.ButtonTest
