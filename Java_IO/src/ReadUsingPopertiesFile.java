import java.io.FileInputStream;
import java.util.Properties;

public class ReadUsingPopertiesFile {
    public static void main(String[] args) {
        Properties prop = readPropertiesFile("C:\\Users\\91817\\Desktop\\CORE JAVA\\Java_IO\\src\\hello");
        System.out.println("Name: " + prop.getProperty("Name"));
        System.out.println("E.no: " + prop.getProperty("E.no"));
        System.out.println("College: " + prop.getProperty("College"));
    }
    public static Properties readPropertiesFile(String filePath) {
        Properties prop = null;
        try{
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return prop;
    }
}

