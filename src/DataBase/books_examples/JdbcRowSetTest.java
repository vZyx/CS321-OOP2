package DataBase.books_examples;
// Fig. 24.29: JdbcRowSetTest.java
// Displaying the contents of the authors table using JdbcRowSet.

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcRowSetTest 
{
   // JDBC driver name and database URL                              
   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "0708";
   
   public static void main(String args[])
   {
      // connect to database books and query database
      try (JdbcRowSet rowSet =
         RowSetProvider.newFactory().createJdbcRowSet())
      {
         // specify JdbcRowSet properties 
         rowSet.setUrl(DATABASE_URL);        
         rowSet.setUsername(USERNAME);          
         rowSet.setPassword(PASSWORD);          
         rowSet.setCommand("SELECT * FROM authors"); // set query
         rowSet.execute(); // execute query                        

         // process query results
         ResultSetMetaData metaData = rowSet.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
         System.out.println("Authors Table of Books Database:\n");

         // display rowset header
         for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", metaData.getColumnName(i));
         System.out.println();
         
         // display each row
         while (rowSet.next()) 
         {
            for (int i = 1; i <= numberOfColumns; i++)
               System.out.printf("%-8s\t", rowSet.getObject(i));
            System.out.println();
         }
      }
      catch (SQLException sqlException) 
      {
         sqlException.printStackTrace();
         System.exit(1);
      }
   } 
} // end class JdbcRowSetTest

