import javax.swing.JFrame;

public class BankSystem {

    public static void main(String[] args) {
         LoginFrame myloginFrame=new LoginFrame();
         myloginFrame.setSize(300, 150);
         myloginFrame.setLocationRelativeTo(null);
         myloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         myloginFrame.setVisible(true);
     } 
} 
