package exception.ex8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study {
    public void multiple(){
        try {
            int A = readNumber();
            System.out.println(A + "에 2를 곱하면 " + A*2);
        } catch (InputMismatchException e){
            System.out.println("[Error] 숫자를 입력하세요");
            multiple();
        }

    }
    public int readNumber(){
        System.out.print("숫자를 입력하세요 :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
