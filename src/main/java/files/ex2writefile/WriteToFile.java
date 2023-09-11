package files.ex2writefile;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WriteToFile {
    public static void writeNames(String filePath, String[] names) throws FileNotFoundException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            for(String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getClass());
        }
    }
}
