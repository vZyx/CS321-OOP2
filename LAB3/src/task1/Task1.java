package task1;

public class Task1 {
 
    public static void main(String[] args)
    {
        try
        {
            someMethod1();
        } 
        catch (Exception ex)
        {
            ex.printStackTrace(); 
        }
        
    }

    public static void someMethod1() throws Exception {
        try {
              someMethod2();
        } 
        catch (Exception ex) {
            throw ex; //re-throw the caught exception
       }
    }
    
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }
    
}




