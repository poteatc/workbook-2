package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public FullNameApplication(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ");
        if (!middleName.isEmpty()) {
            sb.append(middleName).append(" ");
        }
        sb.append(lastName);
        if (!suffix.isEmpty()) {
            sb.append(", ").append(suffix);
        }
        return sb.toString();
    }


}
