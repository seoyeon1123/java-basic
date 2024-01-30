package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println("현재 잔액은 : " + account.getBalance());
        account.withdraw(3000);
        System.out.println("현재 잔액은 : " + account.getBalance());
    }
}
