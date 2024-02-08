package exception.ex6; // 패키지 이름 변경

import java.io.FileWriter; // java.io.FileWriter import 추가
import java.io.IOException;

public class CustomFileWriter {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, try-with-resources!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
