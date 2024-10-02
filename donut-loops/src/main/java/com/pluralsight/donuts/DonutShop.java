package com.pluralsight.donuts;

public class DonutShop {
    public static void main(String[] args) {
        Donut d = new Donut("Big Fluffy Donut with cherry on top", 400, 3.99);
//        d.description = "Big Fluffy Donut with cherry on top";
//        d.calories = 400;
//        d.price = 3.99;

        Donut d2 = new Donut("Chocolate donut", 350, 4.99);
//        d.description = "Chocolate donut";
//        d.calories = 350;
//        d.price = 4.99;
        System.out.println(d);
        printDonut(d2);
        //System.out.println(d.toString());
        printDonutAsCSV(d);
    }

    public static void printDonut(Donut d) {
        System.out.println(d.getDescription());
        System.out.printf("Price: $%.2f\n", d.getPrice());
    }

    public static void printDonutAsCSV(Donut d) {
        StringBuilder sb = new StringBuilder();
        sb.append(d.getDescription()).append(",").append(d.getCalories()).append(",").append(d.getPrice());
        System.out.println(sb);
    }
}
