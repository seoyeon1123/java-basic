package exception.account2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력해주세요: ");
        int input = scanner.nextInt();
        account.deposit(input);
        System.out.println(account.getBalance() + "원 입금하셨습니다. ");

        try{
            System.out.print("출금액을 입력해주세요: ");
            int outPut = scanner.nextInt();
            account.withdraw(outPut);
            System.out.println("" + account.getBalance());
        }catch ( ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
