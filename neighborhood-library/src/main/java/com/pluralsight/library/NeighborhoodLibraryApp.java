package com.pluralsight.library;

import java.util.Scanner;

public class NeighborhoodLibraryApp {
    public static Scanner scanner = null;

    public static void main(String[] args) {
        Book[] inventory = getBookInventory();


        scanner = new Scanner(System.in);

        System.out.println("Welcome to the library!");

        showBookStoreHomeScreen(inventory);
    }

    private static Book[] getBookInventory() {
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
        return inventory;
    }

    private static void showBookStoreHomeScreen(Book[] inventory) {
        String prompt = """
                Welcome to the Book Store 
                -------------------------
                       Home Screen
                       -----------
                Please Enter:
                 1) Show Available Books 
                 2) Show Checked Out Books 
                 3) Exit Application
                 
                 $: 
                """;

        boolean done = false;

        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    showAvailableBooks(inventory);
                    break;
                case "2":
                    showCheckedOutBooks(inventory);
                    // TODO fix showCheck
                    break;
                case "3":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);

    }

    private static void printErrorMessage() {
        System.out.println("please enter a valid value from the prompt");
    }

    private static void showCheckedOutBooks(Book[] inventory) {
        String prompt = """
                =====================================
                        Checked Out Books Menu
                =====================================
                Choose an option: 
                
                S. Show checked out books
                C. Check in a book
                X. Exit to main menu
                
                $: 
                """;

        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            switch (input) {
                case "S", "s":
                    for (int i = 0; i < inventory.length; i++) {
                        if (inventory[i].isCheckedOut()) {
                            System.out.printf("""
                                            ------------------------
                                            \"%s\"                                           
                                            Id: %d 
                                            ISBN #: %s
                                            This book is currently checked out by %s
                                            ------------------------
                                            """,
                                    inventory[i].getTitle(), inventory[i].getId(), inventory[i].getIsbn(), inventory[i].getCheckedOutTo());
                            System.out.println("\n");
                        }
                    }
                    break;
                case "C", "c":
                    System.out.println("What is the ID of the book you want to check in? (int): ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    for (int i = 0; i < inventory.length; i++) {
                        if (inventory[i].getId() == id) {
                            inventory[i].setCheckedOut(false);
                            System.out.printf("The book: %s was checked back in. ID: %d", inventory[i].getTitle(), inventory[i].getId());
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case "X", "x":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);
    }

    private static void showAvailableBooks(Book[] inventory) {
        String prompt = """
                =====================================
                          Available Books
                =====================================
                Choose an option: 
                
                S. Show available books
                C. Check out a book
                X. Exit to main menu
                
                $: 
                """;

        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            switch (input) {
                case "S", "s":
                    displayBooks(inventory);
                    break;
                case "C", "c":
                    checkOutBook(inventory);
                    break;
                case "X", "x":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);

    }

    private static void displayBooks(Book[] inventory) {
        for (int i = 0; i < inventory.length; i++) {
            if (!inventory[i].isCheckedOut()) {
                System.out.printf("""
                        \"%s\" 
                        ------------------------
                        Id: %d
                        ISBN #: %s
                        """, inventory[i].getTitle(), inventory[i].getId(), inventory[i].getIsbn());
                System.out.println();
            }
        }
    }

    private static void checkOutBook(Book[] inventory) {
        System.out.println("""
                What book would you like to check out?
                Please enter the book's title, ID, or ISBN #
                $:
                """);
        String input = scanner.nextLine().trim();
        boolean bookFound = false;
        for (int i = 0; i < inventory.length; i++) {
            if (String.valueOf(inventory[i].getId()).equals(input)
                    || inventory[i].getTitle().equalsIgnoreCase(input)
                    || inventory[i].getIsbn().equals(input)) {
                bookFound = true;
                System.out.println("What is your name? : ");
                String name = scanner.nextLine().trim();
                System.out.printf("Thank you %s! You checked out \"%s\".", name, inventory[i].getTitle());
                System.out.println();
                inventory[i].setCheckedOut(true);
                inventory[i].setCheckedOutTo(name);
                break;
            }
        }
        if (!bookFound) {
            System.out.println("We can't find that book in our archive...");
        }
    }
}
