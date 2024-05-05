package Quiz.two;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeGUI extends JFrame implements ActionListener {
    private JTextField nameField, ageField, salaryField;
    private JButton addButton;

    public EmployeeGUI() {
        setTitle("Add Employee");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Type employee name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Enter Employee Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Enter Employee Salary:"));
        salaryField = new JTextField();
        panel.add(salaryField);

        addButton = new JButton("Click to Add Employee Object to File");
        addButton.addActionListener(this);
        panel.add(addButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            double salary = Double.parseDouble(salaryField.getText());

            Employee emp = new Employee(name, age, salary);
            addToFile(emp);
        }
    }

    private void addToFile(Employee emp) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            outputStream.writeObject(emp);
            System.out.println("Object added successfully");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new EmployeeGUI();
    }
}
