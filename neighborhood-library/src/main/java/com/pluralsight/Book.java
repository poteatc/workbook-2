package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    // Class variables: also called attributes or properties
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    // Default Constructor
    public Book() {
        this.id = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public static void main(String[] args) {
//        Book boo1 = new Book(1, "978-0451524935", "To Kill a Mockingbird", true, "Alice Johnson");
//        String s = new String("adfsgagsdsadfg");
//        int i = 0;
//        double d = 4.5;
//        float f = 2.3f;
//        short a = 1;
//        char c = 'z';
//        boolean isZEqualTo121 = 'z' == 121;
//        boolean isALessThanZ = 'A' < 'Z';
        //String s1 = "";
//        int[] integerArray; // declaration
//        double[] doubleArray = new double[10]; // instantiation
//        doubleArray[5] = 17.5;
//        doubleArray[0] = 8.8;
//        ArrayList<Double> list = new ArrayList<>();
//        list.add(5.5);
//        list.add(10d);
//        list.remove(5.5);
        //int[] giveValuesWhenDeclared = new int[]{0, 1, 2};
        //giveValuesWhenDeclared[3] = 100; //throws an ArrayIndexOutOfBoundsException
//        Book[] books = new Book[3];
//        books[0] = new Book();
//        books[1] = new Book(0, "isbn", "The Odyssey", true, "someones name");
//        books[2] = new Book();


        Book[] inventory = new Book[] {
                new Book(1, "978-0451524935", "To Kill a Mockingbird", true, "Alice Johnson"),
                new Book(2, "978-0451524936", "1984", false, "N/A"),
                new Book(3, "978-0743273565", "The Great Gatsby", true, "John Smith"),
                new Book(4, "978-1503280786", "Moby Dick", false, "N/A"),
                new Book(5, "978-0199232765", "War and Peace", true, "Emily Clark"),
                new Book(6, "978-1503290563", "Pride and Prejudice", false, "N/A"),
                new Book(7, "978-0316769488", "The Catcher in the Rye", true, "Michael Thompson"),
                new Book(8, "978-0547928227", "The Hobbit", false, "N/A"),
                new Book(9, "978-0140449136", "Crime and Punishment", true, "Jessica Lee"),
                new Book(10, "978-0140268867", "The Odyssey", false, "N/A"),
                new Book(11, "978-0060850524", "Brave New World", true, "David White"),
                new Book(12, "978-0141441146", "Jane Eyre", false, "N/A"),
                new Book(13, "978-0374528379", "The Brothers Karamazov", true, "Sophia Williams"),
                new Book(14, "978-0060883287", "One Hundred Years of Solitude", false, "N/A"),
                new Book(15, "978-0199535675", "Ulysses", true, "James King"),
                new Book(16, "978-0544003415", "The Lord of the Rings", false, "N/A"),
                new Book(17, "978-0143039433", "The Grapes of Wrath", true, "Sarah Brown"),
                new Book(18, "978-0141439570", "The Picture of Dorian Gray", false, "N/A"),
                new Book(19, "978-0143035008", "Anna Karenina", true, "Thomas Green"),
                new Book(20, "978-0679720201", "The Stranger", false, "N/A"),
                new Book(21, "978-0060934347", "Don Quixote", true, "Olivia Martinez"),
                new Book(22, "978-0141439556", "Wuthering Heights", false, "N/A"),
                new Book(23, "978-0451419439", "Les Misérables", true, "Alexander Scott"),
                new Book(24, "978-1451673319", "Fahrenheit 451", false, "N/A"),
                new Book(25, "978-0679732249", "The Sound and the Fury", true, "Isabella Harris"),
                new Book(26, "978-0141439846", "Dracula", false, "N/A"),
                new Book(27, "978-1503219709", "A Tale of Two Cities", true, "William Roberts"),
                new Book(28, "978-0140449266", "The Count of Monte Cristo", false, "N/A"),
                new Book(29, "978-0385333849", "Slaughterhouse-Five", true, "Charlotte Clark"),
                new Book(30, "978-0140449129", "Madame Bovary", false, "N/A")
        };


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the library!");

        printStoreHomeScreen(inventory);
    }

    private static void printStoreHomeScreen(Book[] inventory) {
        System.out.println("*** Book Store Home Screen ***");
        System.out.println("Please Enter:\n 1) Show Available Books\n 2) Show Checked Out Books\n 3) Exit Application");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                showAvailableBooks(inventory);
            } else if (input == 2) {
                showCheckedOutBooks(inventory);
                // TODO fix showCheck
            } else {
                System.out.println("please enter 1, 2, of 3");
            }
        } while (input != 3);

    }

    private static void showCheckedOutBooks(Book[] inventory) {
        System.out.println("The following books are currently checked out: ");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isCheckedOut()) {
                System.out.printf("%s with Id: %d and ISBN #: %s checked out by %s",
                        inventory[i].title, inventory[i].id, inventory[i].isbn, inventory[i].getCheckedOutTo());
                System.out.println();
            }
        }
        System.out.println("Press C to check in a book: ");
        System.out.println("Press X to go back to the home screen: ");
        Scanner checkIn = new Scanner(System.in);
        String input = checkIn.nextLine();
        if (input.equals("x") || input.equals("X")) {
            return;
        } else {
            System.out.println("What is the ID of the book you want to check in? (int): ");
            int id = checkIn.nextInt();
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i].id == id) {
                    inventory[i].setCheckedOut(false);
                    System.out.printf("The book: %s was checked back in. ID: %d", inventory[i].title, inventory[i].id);
                    System.out.println();
                    break;
                }
            }
        }


//            input = checkIn.nextLine();
//
//            if (input.equals("C") || input.equals("c")) {
//                System.out.println("What is the ID of the book you want to check in? (int): ");
//                int id = checkIn.nextInt();
//                for (int i = 0; i < inventory.length; i++) {
//                    if (inventory[i].id == id) {
//                        inventory[i].setCheckedOut(false);
//                        System.out.printf("The book: %s was checked back in. ID: %d", inventory[i].title, inventory[i].id);
//                        System.out.println();
//                        break;
//                    }
//                }
//            }
            return;
//            System.out.println("Press C to check in another book: ");
//            System.out.println("Press X to go back to the home screen: ");
//            input = checkIn.nextLine();
//            if (input.equals("X") || input.equals("x")) {
//                checkIn.next();
//                checkIn.close();
//                return;
//            } else if (input.equals("C") || input.equals("c")) {
//                continue;
//            } else {
//                System.out.println("Please enter C or X");
//            }
        }

    private static void showAvailableBooks(Book[] inventory) {
        for (int i = 0; i < inventory.length; i++) {
            if (!inventory[i].isCheckedOut()) {
                System.out.printf("%s with Id: %d and ISBN #: %s", inventory[i].title, inventory[i].id, inventory[i].isbn);
                System.out.println();
            }
        }
    }

}
