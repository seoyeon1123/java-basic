package exception.ex3;

import java.util.Scanner;

public class DivisionMain extends Division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("나눌 숫자를 입력하세요");
            int divided = scanner.nextInt();

            System.out.println("나누는 숫자를 입력하세요");
            int divisor = scanner.nextInt();

            int result = divided / divisor;
            System.out.println("나눈 결과 : " + result);
        } catch (ArithmeticException e){
            System.out.println("예외발생 : " + e.getMessage());
        } catch (Exception e){
            System.out.println("일반 예외 발생" +  e.getMessage());
        }
    }
}
