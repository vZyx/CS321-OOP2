// Fig. 15.8: CreditInquiry.java
// This program reads a file sequentially and displays the
// contents based on the type of account the user requests 
// (credit balance, debit balance or zero balance).
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry
{

   // enum type for the credit-inquiry program's options.
   public enum MenuOption
   {
      // declare contents of enum type
      ZERO_BALANCE(1),
      CREDIT_BALANCE(2),
      DEBIT_BALANCE(3),
      END(4);

      private final int value; // current menu option

      // constructor
      private MenuOption(int value)
      {
         this.value = value;
      }
   } // end enum MenuOption

   private final static MenuOption[] choices = MenuOption.values();

   public static void main(String[] args)
   {
      // get user's request (e.g., zero, credit or debit balance)
      MenuOption accountType = getRequest();

      while (accountType != MenuOption.END)
      {
         switch (accountType)
         {
            case ZERO_BALANCE:
               System.out.printf("%nAccounts with zero balances:%n");
               break;
            case CREDIT_BALANCE:
               System.out.printf("%nAccounts with credit balances:%n");
               break;
            case DEBIT_BALANCE:
               System.out.printf("%nAccounts with debit balances:%n");
               break;
         } 

         readRecords(accountType);
         accountType = getRequest(); // get user's request 
      } 
   } 

   // obtain request from user
   private static MenuOption getRequest()
   {
      int request = 4;

      // display request options
      System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
         " 1 - List accounts with zero balances",
         " 2 - List accounts with credit balances",
         " 3 - List accounts with debit balances", 
         " 4 - Terminate program");

      try
      {
         Scanner input = new Scanner(System.in);

         do // input user request
         {
            System.out.printf("%n? ");
            request = input.nextInt();
         } while ((request < 1) || (request > 4));
      } 
      catch (NoSuchElementException noSuchElementException)
      {
         System.err.println("Invalid input. Terminating.");
      }

      return choices[request - 1]; // return enum value for option
   }

   // read records from file and display only records of appropriate type
   private static void readRecords(MenuOption accountType)
   {
      // open file and process contents
      try (Scanner input = new Scanner(Paths.get("clients.txt")))
      {
         while (input.hasNext()) // more data to read
         { 
            int accountNumber = input.nextInt();
            String firstName = input.next();
            String lastName = input.next();
            double balance = input.nextDouble();

            // if proper account type, display record
            if (shouldDisplay(accountType, balance))       
               System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
            else
               input.nextLine(); // discard the rest of the current record
         }
      }
      catch (NoSuchElementException | 
         IllegalStateException | IOException e)
      {
         System.err.println("Error processing file. Terminating.");
         System.exit(1);
      } 
   } // end method readRecords

   // use record type to determine if record should be displayed
   private static boolean shouldDisplay(MenuOption accountType, double balance)
   {
      if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
         return true;
      else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
         return true;
      else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
         return true;

      return false;
   } 
} // end class CreditInquiry
