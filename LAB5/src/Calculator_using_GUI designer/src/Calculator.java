package Calculator_using_GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
public class Calculator {
    public static void main(String[] args) {
        Calculator_using_GUI.myframe calcFrame = new Calculator_using_GUI.myframe();
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setVisible(true); 
    }
    
}
