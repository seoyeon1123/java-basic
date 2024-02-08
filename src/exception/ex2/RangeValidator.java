package exception.ex2;

import java.util.Scanner;

public class RangeValidator {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        return scanner.nextInt();
    }
    public static void Range(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("숫자는 1에서 100 사이여야 합니다.");
        }
    }
}


