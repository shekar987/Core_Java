import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadUsingBufferedInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
        BufferedInputStream bis=new BufferedInputStream(fis);
        try{
            int i;
            while((i=bis.read())!=-1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
