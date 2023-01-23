package ModuleAdvanced.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class _01_ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bott-800\\Documents\\GitHub\\JavaSoftUniCourse\\JavaAdvanced\\AdvancedModule+OOP\\ModuleAdvanced\\Streams\\Files\\input.txt";

        try (InputStream inputStream = new FileInputStream(filePath)) {
            int firstByte = inputStream.read();
            System.out.println(firstByte);
            System.out.println((char) firstByte);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}