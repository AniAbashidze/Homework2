package org.example;

public class User2Main {
    public static void main(String[] args) {


        User2 user1 = new User2();


        User2 user2 = new User2(true);

        System.out.println("First user:");
        user1.printInfo();

        System.out.println();

        System.out.println("Second user:");
        user2.printInfo();
    }
}
