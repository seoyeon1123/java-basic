package exception.ex2;

public class RangeValidatorMain extends RangeValidator {
    public static void main(String[] args) {
        try {
            int userInput = getUserInput();
            Range(userInput);
            System.out.println("유효한 숫자입니다.");
        } catch(IllegalArgumentException e){
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
