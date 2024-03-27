package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowersShop extends JFrame implements ActionListener {
    // Declare components
    JComboBox<String> comboBox1;
    JTextField txt1;
    JRadioButton pickUpRadio, deliveryRadio;
    ButtonGroup radioGroup;
    JButton checkoutButton;

    public FlowersShop() {
        // Set up the frame
        setTitle("Flowers Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.PINK); // Change background to Pink

        // Create flower types array
        String[] flowers = {"", "Tulip", "Rose", "Lily"};

        // Create and add components
        JLabel flowerLabel = new JLabel("Choose:");
        add(flowerLabel);
        comboBox1 = new JComboBox<>(flowers);
        comboBox1.setSelectedItem("Choose"); // Placeholder text
        add(comboBox1);

        JLabel quantityLabel = new JLabel("Quantity:");

        txt1 = new JTextField(10);
        add(quantityLabel);
        add(txt1);

        pickUpRadio = new JRadioButton("Pick up");
        deliveryRadio = new JRadioButton("Delivery");
        radioGroup = new ButtonGroup();
        radioGroup.add(pickUpRadio);
        radioGroup.add(deliveryRadio);
        add(pickUpRadio);
        add(deliveryRadio);

        checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(this);
        add(checkoutButton);

        // Set default selected item in comboBox1 to empty
        comboBox1.setSelectedIndex(0);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkoutButton) {
            // Get selected flower and quantity
            String flower = (String) comboBox1.getSelectedItem();
            String quantityStr = txt1.getText();

            // Check if flower and quantity are selected
            if (!flower.equals("") && !quantityStr.equals("")) {
                int quantity = Integer.parseInt(quantityStr);
                int flowerPrice = 0;

                // Determine flower price
                switch (flower) {
                    case "Tulip":
                        flowerPrice = 15;
                        break;
                    case "Rose":
                        flowerPrice = 7;
                        break;
                    case "Lily":
                        flowerPrice = 10;
                        break;
                }

                // Calculate total cost
                int cost = quantity * flowerPrice;

                // Apply delivery charge if selected
                if (deliveryRadio.isSelected()) {
                    cost += 30;
                }

                // Display total cost in message dialog
                JOptionPane.showMessageDialog(this, "Total Cost: $" + cost, "Checkout", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a flower and enter quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the frame
        FlowersShop frame = new FlowersShop();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
