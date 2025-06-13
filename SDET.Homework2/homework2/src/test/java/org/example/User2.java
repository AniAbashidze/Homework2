package org.example;

import net.datafaker.Faker;

public class User2 {
    String name;
    String email;
    Faker faker = new Faker();


    public User2() {
        this.name = faker.name().fullName();
        this.email = null;
    }


    public User2(boolean both) {
        this.name = faker.name().fullName();
        this.email = faker.internet().emailAddress();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        if (email == null) {
            System.out.println("Email: null");
        } else {
            System.out.println("Email: " + email);
        }
    }
}
