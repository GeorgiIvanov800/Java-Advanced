package ModuleAdvanced.Streams;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class _02_WriteFile {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\bott-800\\Documents\\GitHub\\JavaSoftUniCourse\\JavaAdvanced\\AdvancedModule+OOP\\ModuleAdvanced\\Streams\\Files\\Files-and-Streams\\Streams-and-Files";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');

        OutputStream outputStream = new FileOutputStream(outputPath);


        try (InputStream inputStream = new FileInputStream(inputPath)){
            int readByte = inputStream.read();
            while (readByte >= 0) {
                if (!punctuation.contains((char)readByte)) {
                    //write
                    outputStream.write(readByte);
                }


                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        outputStream.close();
    }
}
