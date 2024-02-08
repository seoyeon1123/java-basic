package exception.ex6;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {
        // try-with-resources 사용
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, try-with-resources!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}