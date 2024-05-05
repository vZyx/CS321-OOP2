package Quiz.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication34 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("MyFile.txt");
            System.out.println("Continue from this point");

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
