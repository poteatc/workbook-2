package com.pluralsight;

public class Main {
    public static void main(String[] args) {
//        String s = "Hello World";
//        System.out.println(s.toLowerCase());

        String allListItems = "Splenda,Coffee,Coke,Eggs,Cheese,Tea,Lettuce,Apples,Oranges,Bananas";
        allListItems = allListItems.replace(",", "\n");
        System.out.println(allListItems);
        String[] list = allListItems.split(",");
        System.out.println(list[0]);

        String newList = """
                    Splenda
                        Coffee
                            Coke
                                Eggs
                                    Cheese 
                                Tea 
                            Lettuce 
                        Apples 
                    Oranges 
                        Bananas
                 """;
        System.out.println(newList.toLowerCase());
        String s = """
                |\t|\t|
                    |\t|\t|
                """;
        System.out.println(s);
    }
}
