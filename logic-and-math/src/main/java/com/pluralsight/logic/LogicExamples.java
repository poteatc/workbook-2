package com.pluralsight.logic;

public class LogicExamples {
    public static void main(String[] args) {
        boolean amIDone = false;
        int i = 0;
        do {
            System.out.println("words...");
            if (i++ == 5) {
                amIDone = true;
            }
        } while(!amIDone);

        i = 0;
        while (i != 5) {
            System.out.println("wordsA");
            i++;
        }
        System.out.println("Hello\sWorld,\sMy\sname\sis\sCaleb");
    }
}
