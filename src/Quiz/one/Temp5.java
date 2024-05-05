package Quiz.one;


import java.awt.*;
import java.awt.event.*;

public class Temp5 extends Frame implements MouseListener { // 0.5
    private TextField tfMouseX; // to display mouse-click-x
    private TextField tfMouseY; // to display mouse-click-y

    public Temp5() // 0.5
    {
        setLayout(new FlowLayout()); // 0.5
        // Label (anonymous)
        add(new Label("X-Click: ")); // "super" frame adds Label component
        // TextField
        tfMouseX = new TextField(10); // 10 columns
        tfMouseX.setEditable(false); // read-only
        add(tfMouseX); // 0.5
        // Label (anonymous)
        add(new Label("Y-Click: ")); // "super" frame adds Label component


        // TextField
        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false); // read-only
        add(tfMouseY); // "super" frame adds TextField component

        addMouseListener(this);//0.5
        setTitle("MouseEvent Demo"); // 0.5
        setSize(350, 100); // "super" Frame sets initial size
        setVisible(true); // "super" Frame shows
    }

    public static void main(String[] args) {
        new Temp5(); // Let the constructor do the job
    }

    /* MouseEvent handlers */
    // Called back upon mouse clicked
    @Override
    public void mouseClicked(MouseEvent evt) {
        tfMouseX.setText(evt.getX() + ""); // 0.5
        tfMouseY.setText(evt.getY() + ""); // 0.5
    }

    // Not used - need to provide an empty body to compile.
    @Override
    public void mousePressed(MouseEvent evt) {
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
    }

    @Override
    public void mouseEntered(MouseEvent evt) {
    }

    @Override
    public void mouseExited(MouseEvent evt) {
    }
}

