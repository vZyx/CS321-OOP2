package Calculator_without_using_GUiI_Desihner.src;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class myframe extends JFrame 
{
    private final JButton addBtn; 
    private final JButton subBtn;
    private final JButton clearBtn;
     private final JButton exitBtn;
    private final JTextField txt1;
    private final JTextField txt2;
    private final JTextField txtResult;
    private final JLabel lblOP;
    private final JLabel lblEqual;
         // ButtonFrame adds JButtons to JFrame
   public myframe()
   {
     super("Calculator ");
      setLayout(new FlowLayout()); 
      txt1 = new JTextField(10);
      add(txt1);
       lblOP= new JLabel("?");
      add(lblOP);
     txt2 = new JTextField(10);
     add(txt2);
     lblEqual= new JLabel("=");
      add(lblEqual);
      txtResult = new JTextField(10);
      add(txtResult);
      addBtn= new JButton("+");
      add(addBtn);
       subBtn= new JButton("-");
      add(subBtn);
      clearBtn= new JButton("Clear");
       add(clearBtn);
        exitBtn= new JButton("Exit");
       add(exitBtn);
       
       
     ButtonHandler handler = new ButtonHandler();   
     
      addBtn.addActionListener(handler);
      subBtn.addActionListener(handler);
      clearBtn.addActionListener(handler);
      exitBtn.addActionListener(handler);
      
   }
   // inner class for button event handling
 private class ButtonHandler implements ActionListener 
   {
      // handle button event
      @Override
      public void actionPerformed(ActionEvent event)
      {
         if(event.getSource()==addBtn){
             lblOP.setText("+");
             String s1= txt1.getText();
            String s2= txt2.getText();
            int num1= Integer.parseInt(s1);
           int num2= Integer.parseInt(s2);
           Integer result=num1+num2; 
           txtResult.setText(result.toString());
         }
         
         
         if(event.getSource()==subBtn){
             lblOP.setText("-");
             String s1= txt1.getText();
            String s2= txt2.getText();
            int num1= Integer.parseInt(s1);
           int num2= Integer.parseInt(s2);
           Integer result=num1-num2; 
           txtResult.setText(result.toString());
         }
         
         if(event.getSource()==clearBtn){
             lblOP.setText("?");
             txtResult.setText("");
              txt1.setText("");  
             txt2.setText("");  
         }
         
         if(event.getSource()==exitBtn){
             System.exit(0);
         }
         
      } 
   }
} // end class ButtonFrame

