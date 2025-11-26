// Write a program to copy a file to another.
// Pass the file names as command line arguments.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        // Check if exactly two arguments are given
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile <source> <destination>");
            return;
        }

        String source = args[0];
        String destination = args[1];

        try (
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(destination);
        ) {
            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }

            System.out.println("File copied successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
