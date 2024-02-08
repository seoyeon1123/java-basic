package exception.ex1;

import java.io.FileNotFoundException;

public class FileReadMain extends FileRead{
    public static void main(String[] args) {
        try{
            readFile("example.txt");
            System.out.println("파일 읽기 성공");
        } catch (FileNotFoundException e){
            System.out.println("예외 발생  : " + e.getMessage());
        }
    }
}
