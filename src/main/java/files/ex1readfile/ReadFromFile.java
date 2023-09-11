package files.ex1readfile;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void readFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getClass());
        }
    }

}
