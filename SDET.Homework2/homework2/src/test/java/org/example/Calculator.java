package org.example;

import net.datafaker.Faker;

public class Calculator {

    public static int multiply(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Faker faker = new Faker();

        int num1 = faker.number().randomDigitNotZero();
        int num2 = faker.number().randomDigitNotZero();
        int num3 = faker.number().randomDigitNotZero();


        System.out.println("Definition: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("two numbers: "  + multiply(num1, num2));
        System.out.println("three numbers: " + multiply(num1, num2, num3));
    }
}
