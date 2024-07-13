
public class ExceptionWithoutTry {

    public static void throwException() throws ArithmeticException {
        int result = 10 / 0; // This will cause an ArithmeticException
    }

    public static void main(String[] args) {
        // Calling throwException() without a try block (will cause exception)
        throwException();

        System.out.println("This line won't be executed"); // Unreachable due to exception
    }
}