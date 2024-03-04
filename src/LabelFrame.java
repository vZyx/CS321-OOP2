// Fig. 12.6: LabelFrame.java
// ]Labels with text and icons

import java.awt.*;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax .swing.ImageIcon; // loads images



    public class LabelFrame extends JFrame
 {
     private JLabel label1; // JLabel with just text
     private JLabel label2; // JLabel constructed with text and icon
     private JLabel label3; // JLabel with added text and icon

     // LabelFrame constructor adds JLabels to JFrame
     public LabelFrame()
     {
         super( "This is JLabel1 Title" );
         setLayout( new FlowLayout() ); // set frame layout -- Later

         // JLabel constructor with a string argument
         label1 = new JLabel( "jLabel1 with text" );
         label1.setBackground(Color.RED);
         label1.setToolTipText( "This is label1" );
         add( label1 ); // add label1 to JFrame

         // JLabel2 constructor with string, Icon and alignment arguments
         Icon bug = new ImageIcon(getClass().getResource( "bug1.png"));
         label2 = new JLabel( "jLabel2 with text and icon", bug, SwingConstants.LEFT );
         label2.setToolTipText( "This is label2" );
         add( label2 ); // add label2 to JFrame

        //Jlabel3
         label3 = new JLabel(); // JLabel constructor no arguments
         label3.setText( "Label3 with icon and text at bottom" );
         label3.setIcon( bug ); // add icon to JLabel
         label3.setHorizontalTextPosition( SwingConstants.CENTER );
         label3.setVerticalTextPosition( SwingConstants.BOTTOM );
         label3.setToolTipText( "This is label3" );
         add( label3 ); // add label3 to JFrame
         } // end LabelFrame constructor



     } // end class LabelFrame



