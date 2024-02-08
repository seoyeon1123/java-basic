package exception.perform;

public class Propagation{
    public void perform() throws CustomException{
        System.out.println("performing operation");

        throw new CustomException("오류 발생");
    }
}
