package exception.account3;

public class MoneyTransfer {
    public void AcountA() throws BalanceInsufficientException {
        System.out.println("송금인 계죄 출금 완료");
        throw new BalanceInsufficientException("출금 중 오류 발생");
    }
    public void AcountB() throws BalanceInsufficientException {
        System.out.println("수금인 계죄 입금 완료");
        throw new BalanceInsufficientException("입금 중 오류 발생");
    }
    public void rollback(){
        System.out.println("모두 취소");
    }

}
