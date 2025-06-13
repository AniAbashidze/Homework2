package org.example;

import net.datafaker.Faker;

public class Product {
    private Double price;
    private Double discount;

    public Product() {
        Faker faker = new Faker();
        this.price = faker.number().randomDouble(2, 100, 1000);
        this.discount = faker.number().randomDouble(2, 5, 50);
    }

    public Double getPrice() {
        return price - (price * (discount / 100));
    }

    public void printInfo() {
        System.out.println("Price: " + price );
        System.out.println("Discount: " + discount + " %");
        System.out.println("Result: " + getPrice() );
    }

}
