package exception.ex4;

public class CustomExceptionMain {
    public static void main(String[] args) {
        try{
            int value = 20;
            if(value > 5){
                throw new CustomException("값이 5보다 큽니다");
            }
        } catch (CustomException e){
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }
}
