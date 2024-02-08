package exception.ex3;

public class Division extends Exception{
    public static int divideNumber(int dividend, int divisor){
        if(divisor == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } return dividend / divisor;
    }
}
