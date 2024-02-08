package exception.file;

import java.io.IOException;

public class FIleWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt")){
            fw.write("Java");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
