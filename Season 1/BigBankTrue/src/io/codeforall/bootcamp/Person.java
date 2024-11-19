package io.codeforall.bootcamp;

public class Person {
    private String name;

    public Bank bank;


    public Person(nk bank, String name) {
        this.name = name;
        this.bank = bank;

    }

    public void clientDeposit(int n) {
        bank.deposit(n);
    }

    public void clientWithdraw(int n) {
        bank.withdraw(n);
    }

    public void clientBalance() {
        bank.getBalance();
    }
}



