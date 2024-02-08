package exception.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            int dividend;
            int divisor;

            try {
                System.out.println("나눌 수를 입력해주세요");
                dividend = scanner.nextInt();
                System.out.println("나누는 수를 입력해주세요");
                divisor = scanner.nextInt();
                int result = dividend / divisor;
                System.out.println(result);
            } catch (ArithmeticException e){
                    System.out.println("0으로 나눌 수 없습니다.");
                } catch (InputMismatchException e){
                System.out.println("문자를 입력할 수 없습니다. ");
            }
        }
    }
}
