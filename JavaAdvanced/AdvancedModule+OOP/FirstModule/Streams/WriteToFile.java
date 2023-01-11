package FirstModule.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {
        //Read the file named "input.txt" that is provided for this exercise and
        // write all its content to a file while skipping any punctuation. Skip the following symbols: ",", ".", "!", "?".

        String path = "input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output2.txt");
            //",", ".", "!", "?".
            //symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?'
            Set<Character> punctuationCodes = Set.of(',', '!' , '?', '.');
            int read = inputStream.read();
            while (read != -1) {

                char symbol = (char) read;

                if (!punctuationCodes.contains((char)read)) {
                    outputStream.write(read);

                }
                read = inputStream.read();
            }
        } catch (IOException ignored) {

        }
    }
}
