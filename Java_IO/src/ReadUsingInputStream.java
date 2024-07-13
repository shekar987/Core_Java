import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadUsingInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream fis=new FileInputStream("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
        try{
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
