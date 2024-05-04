package CONCURRENCY;

// Fig. 23.3: PrintTask.java
// PrintTask class sleeps for a random time from 0 to 5 seconds
import java.security.SecureRandom;

//implement runnable to create separate thread
public class PrintTask implements Runnable
{
   private final static SecureRandom generator = new SecureRandom();
   private final int sleepTime; // random sleep time for thread
   private final String taskName; // name of task
    
   // constructor (assign name to thread)
   public PrintTask(String taskName)
   {
      this.taskName = taskName; //set name of TASK
        
      // pick random sleep time between 0 and 5 seconds
      sleepTime = generator.nextInt(5000); // milliseconds
   }// end PrintTask constructor

   // method run contains the code that a thread will execute
   public void run() 
   {
      try // put thread to sleep for sleepTime amount of time 
      {
         System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
         Thread.sleep(sleepTime); // put thread to sleep
      } // end try
      // if thread interrupted while sleeping, print stack trace
      catch (InterruptedException exception)
      {
         exception.printStackTrace();
         Thread.currentThread().interrupt(); // re-interrupt the thread
      } // end catch
        
      // print task name
      System.out.printf("%s done sleeping%n", taskName); 
   } 
} // end class PrintTask

