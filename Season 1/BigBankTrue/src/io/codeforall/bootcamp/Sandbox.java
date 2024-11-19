package io.codeforall.bootcamp;

import javax.print.attribute.standard.JobName;

public class Sandbox {



    public static void main(String[] args) {
        Bank bradesco = new Bank();
        Person p1 = new Person(bradesco, "Igor");

        p1.clientDeposit(20);
        p1.clientDeposit(20);
        p1.clientBalance();
        p1.clientWithdraw(23);
    }


}
