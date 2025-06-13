package org.example;

import net.datafaker.Faker;

public class User {
    String name;
    Address address;

    public User() {
        Faker faker = new Faker();
        name = faker.name().fullName();
        address = new Address();
    }

    public void printUser() {
        System.out.println("User name: " + name);
        address.printAddress();
    }
}
