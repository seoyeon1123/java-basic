package exception.file;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
    //자동으로 리소스를 닫을 수 있도록 한다.
    public FileWriter(String filePath) throws IOException {
        System.out.println("파일을 엽니다 : " + filePath);
        throw  new IOException("파일을 열 수 없습니다. 파일 경로 : " + filePath);
    }
    public void write(String data) throws IOException {
        System.out.println(data + "파일에 저장합니다");
        throw new IOException("파일에 저장할 수 없습니다. 다시 시도하세요");
    }
    public void close()  throws IOException {
        System.out.println("파일을 닫습니다. ");
        throw new IOException("파일을 닫을 수 없습니다. 다시 시도해주세요");
    }
}
