package GUI_PART3_Key_Event_Handling;

// Fig. 12.41: BorderLayoutFrame.java
// BorderLayout containing five buttons.
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private final JButton[] buttons; // array of buttons to hide portions
    private static final String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    // set up GUI and event handling
    public BorderLayoutFrame()
    {
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5); // 5 pixel gaps
        setLayout(layout);
        buttons = new JButton[names.length];

        // create JButtons and register listeners for them
        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    } // end BorderLayoutFrame constructor

    // handle button events
    @Override
    public void actionPerformed(ActionEvent event)
    {
        // check event source and lay out content pane correspondingly
        for (JButton button : buttons) {
            // show other buttons
            button.setVisible(event.getSource() != button); // hide the button that was clicked
        }

        layout.layoutContainer(getContentPane()); // lay out content pane
    }

    public static void main(String[] args)
    {
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
} // end class BorderLayoutFrame