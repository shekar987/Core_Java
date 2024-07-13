import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferWriter {
    public static void main(String[] args) {
        String s="my name is shekar";
        try{
            FileWriter fw=new FileWriter("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
