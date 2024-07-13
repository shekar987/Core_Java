import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String str="Hi this is shekar Keesari";
        try{
            FileOutputStream fis=new FileOutputStream("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
            BufferedOutputStream bos=new BufferedOutputStream(fis);
            byte[] arr=str.getBytes();
            bos.write(arr);
            bos.close();
            fis.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
