package src.addbookproject;

import src.addbookproject.EmpTableFrame;

import javax.swing.JFrame;

public class startup {


    public static void main(String[] args) {
        EmpTableFrame obj= new EmpTableFrame();
       obj.setSize(300,300);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
