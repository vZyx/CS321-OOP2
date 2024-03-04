// Fig. 11.29: MouseTrackerFrame.java
// Testing MouseTrackerFrame.
import Mouse.MouseTrackerFrame;

import javax.swing.JFrame;

public class MouseTracker 
{
   public static void main( String args[] )
   { 
      MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
      mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseTrackerFrame.setSize( 300, 100 ); // set frame size
      mouseTrackerFrame.setVisible( true ); // display frame
   } // end main
} // end class MouseTracker


