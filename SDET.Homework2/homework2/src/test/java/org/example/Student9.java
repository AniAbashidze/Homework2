package org.example;

import net.datafaker.Faker;

public class Student9 {
    String studentIdd;

    public Student9() {
        Faker faker = new Faker();
        studentIdd = faker.idNumber().valid();
    }

    public void printInfo() {
        System.out.println("Student ID: " + studentIdd);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Student9 other = (Student9) obj;
        return this.studentIdd.equals(other.studentIdd);
    }
}
