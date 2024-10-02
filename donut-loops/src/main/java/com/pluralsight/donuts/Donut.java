package com.pluralsight.donuts;

public class Donut {
    private String description;
    private int calories;
    private double price;

    public Donut(String description, int calories, double price) {
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Donut: ");
        sb.append(description).append(" has ").append(calories).append(" calories for ").append(price);
        return sb.toString();
//        return "Donut{" +
//                "description='" + description + '\'' +
//                ", calories=" + calories +
//                ", price=" + price +
//                '}';
    }
}
