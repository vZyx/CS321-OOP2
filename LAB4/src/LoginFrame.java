/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    final JLabel label1;
    final JLabel label2;
    final JTextField userNameTextField;
    final JPasswordField pwdField;
    final JButton loginButton;

   //1D Array of user objects:
final User[] usersInfo={ 
	new User("Mai", "AlEissa", "maleissa", "Qer2000", "2817"),
	new User("Omar", "AlAli", "oalali", "Pie3921", "9839")  };
   //LoginFrame Constructor
 LoginFrame() {
        super("Login to Your Account.");
        setLayout(new FlowLayout());

        //create and add components
        label1 = new JLabel("User Name:");
        label2 = new JLabel("Password: ");
        userNameTextField = new JTextField("Enter your username here",15);
        pwdField = new JPasswordField(15);
        loginButton = new JButton("Log in");
        add(label1);
        add(userNameTextField);
        add(label2);
        add(pwdField);
 
      //Register action handler
       handler loginButtonHandler = new handler();
       loginButton.addActionListener(loginButtonHandler); 
      add(loginButton);
}

//inner class for action lisnter
class handler implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
	//======= get the password as string
	String pwd = "";
	for (char x : pwdField.getPassword())
	pwd += x;
	boolean found = false;
	//====search usersInfo array for a valid user:===
	for (User user : usersInfo) {
	 if (userNameTextField.getText().equals(user.getUserName()) && 	pwd.equals(user.getPwd())) 
	{
      		found=true; //user found
        	String secondPwd =JOptionPane.showInputDialog("Please Enter the second static password: ");
  
	        if (secondPwd.equals(user.getSecondPwd())) 
		   JOptionPane.showMessageDialog(LoginFrame.this,"Welcome "+ user.getFirstName()+"  "+user.getLastName()+" to the Online Banking System", "Successful Login", JOptionPane.PLAIN_MESSAGE);
                else { 
                   JOptionPane.showMessageDialog(LoginFrame.this, "Authentication failed due incorrect static password has been entered", "Authentication Failed", JOptionPane.WARNING_MESSAGE);
                   resetLoginFrame();
                   }
        } 
}
//Not found in users array
if(!found){
JOptionPane.showMessageDialog(LoginFrame.this,"Username and/or password are incorrect. Please re- enter both.", "Accesss Denied",JOptionPane.ERROR_MESSAGE);
resetLoginFrame();
 }
}//end of actionPerformed method
} //end of inner class

void resetLoginFrame() {
        pwdField.setText("");
        userNameTextField.setText("");
    }
} 
