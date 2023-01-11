package ModuleAdvanced.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {
    public static void main(String[] args) {
        //Read the file named "input.txt" and write to another file every character's ASCII representation.
        //Write every space or new line as it is, e.g. as a space or a new line.
        String path = "input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("CopyBytes.txt");

            int read = inputStream.read();
            PrintWriter writer = new PrintWriter(outputStream);

            while (read != -1) {

                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                  writer.println();
                } else {
                    writer.print(read);
                }

                read = inputStream.read();
            }

            writer.flush();

        } catch (IOException ignored) {

        }
    }
}
