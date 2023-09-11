package files.ex2writefile;

import java.io.FileNotFoundException;

public class TestWriting {
    public static void main(String[] args) throws FileNotFoundException {
        String[] names = {"Jim", "Pam", "Bob"};
        WriteToFile.writeNames("file.txt", names);
    }
}
