package exception.ex5;


public class Throws{
    public static void divide(int dividend, int divisor) throws ArithmeticException {
        if(divisor == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        int result = dividend / divisor;
        System.out.println(result);
    }
}
