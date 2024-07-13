import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferReader {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
            BufferedReader br=new BufferedReader(fr);
            int i;
            while((i=br.read())!=-1){
                System.out.print((char) i);}
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
