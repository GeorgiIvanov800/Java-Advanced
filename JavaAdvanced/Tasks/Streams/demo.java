package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {

        // Read

        String path = "D:\\SoftUni Java Course\\JavaAdvancedMay2022\\Streams, Files and Directories" +
                "\\04.Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt1";

        /*Scanner scanner = new Scanner(inputStream);

        String line = scanner.nextLine();

        while (scanner.hasNextLine()) {
            System.out.println(line);
            line = scanner.nextLine();

        }
        *///System.out.println("Hello World!");

//        int oneByte = inputStream.read();
//
//        while (oneByte != -1) {
//            System.out.print((char) oneByte);
//            oneByte = inputStream.read();
//        }
        try {
            FileInputStream inputStream = new FileInputStream(path);
            System.out.println("File was found it's ok");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }

    }
}
