
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) throws IOException {
        String s="Hello friends, This is shekar Keesari";
        FileWriter fw=new FileWriter("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
        try{
            fw.write(s);
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
