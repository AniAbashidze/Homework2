package org.example;

import net.datafaker.Faker;

public class Book {

    private String title;
    private String author;
    private int pages;

    public Book() {
        Faker faker = new Faker();
        this.title = faker.book().title();
        this.author = faker.book().author();
        this.pages = faker.number().randomDigitNotZero();
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Pages: " + pages;
    }

}
