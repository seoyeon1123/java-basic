package exception.account;

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException(String message){
        super(message);
    }
}
