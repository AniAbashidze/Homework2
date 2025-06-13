package org.example;

import net.datafaker.Faker;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
        Faker faker = new Faker();
        this.brand = faker.brand().car();
        this.model = faker.company().name(); //ვერ ვიპოვე მოდელი :(
        this.year = faker.number().numberBetween(1800, 2025);


        }
    public void printInfo () {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
