package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        if(balance >= amount){
            balance = balance - amount;
        }else {
            System.out.println("잔액 부족");
        }
    }
}
