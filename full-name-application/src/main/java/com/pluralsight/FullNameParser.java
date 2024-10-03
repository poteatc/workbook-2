package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine().trim();
        String[] names = fullName.split("\\s+");

        String firstName = "(none)";
        String middleName = "(none)";
        String lastName = "(none)";
        if (names.length == 2) {
            firstName = names[0];
            lastName = names[1];
        }
        if (names.length == 3) {
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        }
        System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s", firstName, middleName, lastName);
    }
}
