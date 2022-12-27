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
                "\\input.txt";

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

            int ontByte = inputStream.read();

            while (ontByte != -1) {
                System.out.print((char) ontByte);
                ontByte = inputStream.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot read from file");
        } finally {
            //It runs regardless of whether we have passed  try or catch block
        }

    }
}
