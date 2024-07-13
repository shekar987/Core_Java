import java.io.FileReader;

public class ReadUSingFileReader {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
