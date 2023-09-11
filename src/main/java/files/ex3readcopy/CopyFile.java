package files.ex3readcopy;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CopyFile {
    public static void copyFile(String sourcePath, String destinationPath) {
        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(destinationPath, true)) {
            int data;
            while((data = fileReader.read()) != -1) {
                writer.write((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getClass());
        }
    }

    public static void main(String[] args) {
        copyFile("file.txt", "newFile.txt");
    }
}
