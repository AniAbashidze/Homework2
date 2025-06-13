package org.example;
import net.datafaker.Faker;

public class Student {

    public String studentId;
    private String name;
        private int age;
        private double grade;

        public Student() {
            Faker faker = new Faker();
            this.name = faker.name().firstName();
            this.age = faker.number().numberBetween(18, 25);
            this.grade = faker.number().randomDouble(1, 60, 100);
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }


        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            if (grade >= 0 && grade <= 100) {
                this.grade = grade;


            }
        }
    }


