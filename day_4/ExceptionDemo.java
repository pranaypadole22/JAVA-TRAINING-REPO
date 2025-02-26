package day_4;
//Exception
//1.def:-Runtime error is called exception.
//How JVM Handles
//When u ask JVM ,a technically impossible operation to perform ,JVM creates an object of respective exception class,wraps info in it.Then if programmer has not handled,then it thrown as unhandled exception.


//Try-catch theory
//it is hold the code which is likely to create exception at a time only one exception can be thrown from try block
//we can nest try-catch block also
//we can write multiple catch block following for one try block
//Execution of multiple catch block is similar to switch-case.
//Always write a catch-default at last like
//              catch(Exception e)
//               {
//                  e.printStackTrace();-Method from throwable
//                 }
//throw-It is used to throw exception explicitely.
//finally block-It should hold compulsory executing code,which has to executed,wheather there is exception or not.
//Throws-It is used to declare the exception.
// Exception Handling Demo
import java.util.Scanner;

public class ExceptionDemo {
    public  int divide(int a, int b) {
        return a / b; // Division operation
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionDemo obj=new ExceptionDemo();
        try {
            System.out.println("Enter 1st number:");
            int x = sc.nextInt();
            System.out.println("Enter 2nd number:");
            int y = sc.nextInt();
            int result = obj.divide(x, y); // Call divide method
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close scanner to prevent resource leak
            System.out.println("--------End of your Code------------");
        }
    }
}
