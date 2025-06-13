package org.example;

import net.datafaker.Faker;

public class BankAccount {
    private double balance;

    public BankAccount() {
        Faker faker = new Faker();
        this.balance = faker.number().randomNumber();

    }

    public void LimitCheck() {
        System.out.println("Balance: " + balance);

        if (balance < 100) {
            System.out.println("Not enough balance");
        }else {
            System.out.println("Enough balance");
        }

    }

}
