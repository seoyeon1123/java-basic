package exception.ex5;

public class Throw1 {
    public static void main(String[] args) {
        int divisor = 55;
        try {
            if (divisor == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다");
            }
            int result = 10 / divisor;
            System.out.println("나눈 결과 : " + result);

        } catch (ArithmeticException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }
}
