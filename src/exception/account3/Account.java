package exception.account3;

public class Account {
    private long balance;   // 잔액

    public Account() {
        balance = 0;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long money) {
        balance += money;
    }

    public void withdraw(long money) throws BalanceInsufficientException {
        try {
            if (balance < money) {
                throw new BalanceInsufficientException(
                        "잔액부족! 현재 잔액: " + balance + ", 출금하고자 하는 금액: " + money);
            }
            balance -= money;
        } catch (BalanceInsufficientException e){
            balance += money;
            throw e;
        }
    }

}
