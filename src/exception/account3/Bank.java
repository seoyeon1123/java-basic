package exception.account3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("입금 할 금액 : ");

        int input = scanner.nextInt();
        account.deposit(input);
        System.out.println("입금 금액 : " + account.getBalance());

        MoneyTransfer moneyTransfer = new MoneyTransfer();
        try{
            System.out.println("출금 할 금액 : ");
            int output = scanner.nextInt();
            account.withdraw(output);
            moneyTransfer.AcountA();
            moneyTransfer.AcountB();
            System.out.println("송금완료");
        } catch (BalanceInsufficientException e){
            moneyTransfer.rollback();
            System.out.println(e.getMessage());
        }
    }
}
