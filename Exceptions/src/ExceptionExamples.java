import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExamples {

    public static void main(String[] args) {

        // Generate Arithmetic Exception (without handling)
        //System.out.println("Arithmetic Exception (without handling)");
        //int result = 10 / 0; // This will cause an ArithmeticException

        // Handle Arithmetic Exception using try-catch block
        System.out.println("\nArithmetic Exception (with handling)");
        try {
            int result1 = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }

        // Generate Arithmetic Exception
        System.out.println("\nGenerate Arithmetic Exception");
        try {
            int result2 = Integer.parseInt("hello"); // Parse a non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred (intended): " + e.getMessage());
        }

        // Generate ArrayIndexOutOfBoundsException
        System.out.println("\nArrayIndexOutOfBoundsException");
        int[] arr = new int[5];
        try {
            System.out.println(arr[6]); // Accessing an element outside the array bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }


        // Generate FileNotFoundException
        System.out.println("\nFileNotFoundException");
        try {
            java.io.FileReader reader = new java.io.FileReader("nonexistent_file.txt"); // Trying to read a non-existent file
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }

        // Generate IOException (using FileNotFoundException again)
        System.out.println("\nIOException (using FileNotFoundException)");
        try {
            java.io.FileWriter writer = new java.io.FileWriter("nonexistent_file.txt"); // Trying to write to a non-existent file
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage()); // IOException might be caught here
        }

        // Generate NullPointerException
        System.out.println("\nNullPointerException");
        String str = null;
        try {
            System.out.println(str.length()); // Accessing a method of a null object
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        // Generate StringIndexOutOfBoundsException
        System.out.println("\nStringIndexOutOfBoundsException");
        String str2 = "Hello";
        try {
            System.out.println(str2.charAt(10)); // Accessing a character beyond string length
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: "  + e.getMessage());
        }

        // Generate ClassCastException
        System.out.println("\nClassCastException");
        Object obj = new Object();
        try {
            String str3 = (String) obj; // Casting an object to a different type
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}