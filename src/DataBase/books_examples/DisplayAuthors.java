package DataBase.books_examples;
//DisplayAuthors.java
//Displaying the contents of the Authors table.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors {

    public static void main(String[] args) {

        final String DATABASE_URL = "jdbc:mysql://localhost:3306/books"; // database name
        final String SELECT_QUERY = "SELECT firstName, lastName FROM Authors";// from table_name


        // use try-with-resources to connect to and query the database
        try (
                Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "0708");
                Statement statement = connection.createStatement(); // obtains an object that implements interface Statement
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY))// submits a query to the database.
        {
            // get ResultSet's meta data
            ResultSetMetaData metaData = resultSet.getMetaData(); // describes the ResultSet’s contents
            int numberOfColumns = metaData.getColumnCount(); // retrieves the number of columns in the ResultSet.

            System.out.printf("Authors Table of Books Database:%n%n");

            // display the names of the columns in the ResultSet
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i)); //retrieves the no of columns in the ResultSet.
            System.out.println();

            // display query results
            //ROW
            while (resultSet.next())
            {
                //col
                for (int i = 1; i <= numberOfColumns; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            }
        }// AutoCloseable objects' close methods are called now

        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }




}}