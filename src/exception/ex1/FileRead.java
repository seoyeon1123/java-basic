package exception.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void readFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
