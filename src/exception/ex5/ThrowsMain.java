package exception.ex5;

import java.util.Scanner;

public class ThrowsMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            Throws.divide(A, B);
        } catch (ArithmeticException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }

}
