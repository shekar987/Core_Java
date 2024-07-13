
public class ThrowExceptionWithOwnMsg {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative"); // Custom message
        }
    }

    public static void main(String[] args) {
        int age = -4;

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); // Print the custom message
        }
    }
}

class InvalidAgeException extends Exception { // Custom exception class

    public InvalidAgeException(String message) {
        super(message); // Pass the custom message to the base class constructor
    }
}