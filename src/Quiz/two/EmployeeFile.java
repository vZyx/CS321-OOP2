package Quiz.two;

import java.io.*;

public class EmployeeFile {

    public static void main(String[] args) {
        try {
            // Create FileWriter to write to "emp.txt"
            FileWriter writer = new FileWriter("emp.txt");

            // Sample employee details
            String[] employeeDetails = {
                    "Ahmed\t20\t9000",
                    "Ibrahim\t22\t15000"
            };

            // Write employee details to the file
            for (String details : employeeDetails) {
                writer.write(details + "\n");
            }

            // Close the writer
            writer.close();

            System.out.println("Employee details have been written to emp.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
