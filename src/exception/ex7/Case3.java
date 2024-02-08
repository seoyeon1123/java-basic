package exception.ex7;

import java.io.IOException;

public class Case3 {
    public static void main(String[] args) {
        byte[] numArray = {'1','2','3','4'};
        try {
            System.out.write(numArray);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
