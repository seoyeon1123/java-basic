package exception.account3;

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException(String message){
        super(message);
    }
}
