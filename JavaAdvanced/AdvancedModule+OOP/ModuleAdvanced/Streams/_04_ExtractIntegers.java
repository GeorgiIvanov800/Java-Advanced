package ModuleAdvanced.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class _04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\bott-800\\Documents\\GitHub\\JavaSoftUniCourse\\JavaAdvanced\\AdvancedModule+OOP\\ModuleAdvanced\\Streams\\Files";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\04_ExtractIntegers_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));

        while (reader.hasNext()) {

            if (reader.hasNextInt()) {
                writer.println(reader.nextInt());
            }
            reader.next();
        }


    }
}
