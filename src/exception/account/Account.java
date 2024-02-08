package exception.account;

//계좌 역활 -> Account
//계좌  입금 2000, 출금 -3000 -> Bank
// 잔액이 부족할 경우 사용자 정의 예외를 줄 것임 _>BalanceInsufficientExceptiont선언


public class Account {

    private long balance;

    public Account(){
        balance = 0;
    }
    public void deposit(long money){
        balance += money;
    }
    public long getBalance(){
        return balance;
    }
    public  void withdraw(long money) throws BalanceInsufficientException {
        if(balance < money){
            throw new BalanceInsufficientException
                    ("잔액이 부족합니다. 현재 잔액 : " + balance + ", 출금하고자 하는 금액 : " + money);
        }
        balance-=money;
    }
}
