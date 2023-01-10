package FirstModule.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
    public static void main(String[] args) {
        String path = "input.txt";
        String properties = System.getProperty("user.dir");
        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt"); // make a new  txt file
            int read = inputStream.read();
            while (read != -1) {
                String output = Integer.toBinaryString(read) + " ";
                for (char c : output.toCharArray()) {
                    outputStream.write(c);
                }
                read = inputStream.read();
            }
        } catch (IOException ignored) {
        }

    }
}
