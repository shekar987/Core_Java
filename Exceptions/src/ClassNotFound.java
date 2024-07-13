public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("ExceptionExamples");
            ClassLoader.getSystemClassLoader().loadClass("ExceptionExamplessss");

        } catch (ClassNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}