import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String str = "Hello, World!";
        try {
            OutputStream fos = new FileOutputStream("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
            fos.write(str.getBytes());
            fos.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

