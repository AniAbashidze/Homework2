package org.example;

public class Student9Main {

        public static void main(String[] args) {
            Student9 s1 = new Student9();
            Student9 s2 = new Student9();

            s1.printInfo();
            s2.printInfo();

            if (s1.equals(s2)) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }
        }
    }


