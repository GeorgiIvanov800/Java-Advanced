package Streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {

        // Read

        String path = "D:\\SoftUni Java Course\\JavaAdvancedMay2022\\Streams, Files and Directories" +
                "\\04.Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(line);
            line = scanner.nextLine();

        }
        //System.out.println("Hello World!");

        // Write

    }
}
