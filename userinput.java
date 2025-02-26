package day_1;
//The most common way to take user input in Java is using Scanner class which is part of java.util package. The scanner class can read input from various sources like console, files or streams. This class was introduced in Java 5. Before that we use BufferedReader class(Introduced in Java 1.1). As a beginner, we will suggest to use Scanner class.
////        Follow these steps to take user input using Scanner class:
////        Import the Scanner class using import java.util.Scanner;
//        Create the Scanner object and connect Scanner with System.in by passing it as an argument i.e. Scanner scn = new Scanner(System.in);
//        Print a message to prompt for user input and you can use the various methods of Scanner class like nextInt(), nextLine(), next(), nextDouble etc according to your need.

// taking user input
import java.util.Scanner;

class userinput
{
    public static void main(String[] args)
    {

        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);

        // Enter first input
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum: " + (a + b));

        // Closing the scanner to release resources
        scn.close();
    }
}
