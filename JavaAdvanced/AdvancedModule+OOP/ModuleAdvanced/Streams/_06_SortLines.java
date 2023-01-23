package ModuleAdvanced.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class _06_SortLines {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\bott-800\\Documents\\GitHub\\JavaSoftUniCourse\\JavaAdvanced\\AdvancedModule+OOP\\ModuleAdvanced\\Streams\\Files";
        String inputPath = basePath + "\\input.txt";
        String output = basePath + "\\06_SortedLines_output.txt";

        Path path = Paths.get(inputPath);
        List<String> sortedList = Files.readAllLines(path)
                .stream()
                .sorted()
                .toList();
        Path outputPath = Paths.get(output);
        Files.write(outputPath, sortedList);

    }
}
