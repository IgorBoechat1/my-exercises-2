package io.codeforall.bootcamp;

public class Bank {

    public static int balance;

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance -= amount;
            System.out.println("Withdraw = " + amount);
            System.out.println("Balance after withdraw: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + " Transaction failed...!! ");

        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Your deposit " + amount);


    }

    public int getBalance() {
        balance = balance;
        System.out.println("Your balance is " + balance);
        return balance;



    }


}





