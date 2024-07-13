
public class MultiCatch {

    public static void main(String[] args) {
        int result = 0;

        try {
            // Perform operations that might throw exceptions
            String str = null;
            result = Integer.parseInt(str); // NullPointerException
            result = 10 / 0; // ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: "  + e.getMessage());
        } catch (Exception e) { // This is a general catch block (optional)
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            // Code to be executed always (regardless of exceptions)
            System.out.println("This will always be executed (finally block)");
        }

        System.out.println("Result (if no exceptions occurred): " + result);
    }
}
