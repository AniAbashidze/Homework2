package org.example;
import net.datafaker.Faker;

public class Address {
    private String street;
    private String city;
    private String country;
    private String zipCode;

    public Address() {
        Faker faker = new Faker();
        this.street = faker.address().streetAddress();
        this.city = faker.address().city();
        this.country = faker.address().country();
        this.zipCode = faker.address().zipCode();
    }

    public void printAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Zip Code: " + zipCode);
    }
}
