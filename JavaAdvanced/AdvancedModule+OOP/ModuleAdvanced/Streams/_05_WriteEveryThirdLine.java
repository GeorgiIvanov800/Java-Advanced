package ModuleAdvanced.Streams;

import java.io.*;

//Read the file provided, named "input.txt" and write to another file all lines whose number is divisible by 3. Line numbers start from one.
public class _05_WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\bott-800\\Documents\\GitHub\\JavaSoftUniCourse\\JavaAdvanced\\AdvancedModule+OOP\\ModuleAdvanced\\Streams\\Files";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\05_WriteEveryThirdLine_output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {
             int lineCount = 1;
             String line = reader.readLine();
             while (line != null) {

                 if (lineCount % 3 == 0) {
                     writer.println(line);
                 }

                 line = reader.readLine();
                 lineCount++;
             }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
