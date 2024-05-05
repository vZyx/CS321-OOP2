package Quiz.two;

/
import java.sql.*;

public class CarDatabase {

    public static void main(String[] args) {
        // JDBC URL for MySQL database named "cars"
        String url = "jdbc:mysql://localhost/cars";
        String username = "root";
        String password = "0708";

        // SQL query to create table
        String createTableQuery = "CREATE TABLE IF NOT EXISTS vehicles ("
                + "ID INT AUTO_INCREMENT PRIMARY KEY,"
                + "PlateNumber VARCHAR(20),"
                + "Color VARCHAR(20),"
                + "Owner VARCHAR(50),"
                + "Price DOUBLE)";

        // SQL queries to insert records
        String[] insertQueries = {
                "INSERT INTO vehicles (PlateNumber, Color, Owner, Price) VALUES ('ABC123', 'Red', 'John', 20000)",
                "INSERT INTO vehicles (PlateNumber, Color, Owner, Price) VALUES ('XYZ456', 'Blue', 'Jane', 25000)",
                "INSERT INTO vehicles (PlateNumber, Color, Owner, Price) VALUES ('DEF789', 'Green', 'Bob', 18000)",
                "INSERT INTO vehicles (PlateNumber, Color, Owner, Price) VALUES ('GHI012', 'Black', 'Alice', 30000)",
                "INSERT INTO vehicles (PlateNumber, Color, Owner, Price) VALUES ('JKL345', 'White', 'David', 22000)"
        };

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Create table if not exists
            statement.executeUpdate(createTableQuery);

            // Insert records
            for (String query : insertQueries) {
                statement.executeUpdate(query);
            }

            // Retrieve records and print them
            ResultSet resultSet = statement.executeQuery("SELECT * FROM vehicles");
            System.out.println("ID\tPlate Number\tColor\tOwner\tPrice");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ID") + "\t" +
                        resultSet.getString("PlateNumber") + "\t" +
                        resultSet.getString("Color") + "\t" +
                        resultSet.getString("Owner") + "\t" +
                        resultSet.getDouble("Price"));
            }

            // Close connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
