package com.pluralsight.library;

import java.util.Scanner;

public class NeighborhoodLibraryApp {
    // ANSI escape code constants for text colors
    private static String RESET = "\u001B[0m";
    private static String RED = "\u001B[31m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static Scanner scanner = null;

    public static void main(String[] args) {
        // Initialize an array of books
        Book[] inventory = getBookInventory();

        // Initialize the Scanner object
        scanner = new Scanner(System.in);

        // Welcome message for the user
        System.out.println("Welcome to the library!");

        // Display the home screen of the library app
        showBookStoreHomeScreen(inventory);
    }

    // Method to initialize the book inventory
    private static Book[] getBookInventory() {
        // Create an array of Book objects with ID, ISBN, title, availability, and checked-out user
        Book[] inventory = new Book[] {
                // Sample data for each book with unique ID and properties
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

    // Displays the home screen and handles user input for different actions
    private static void showBookStoreHomeScreen(Book[] inventory) {
        String prompt = YELLOW + """
                Welcome to the Book Store 
                -------------------------
                       Home Screen
                       -----------
                Please Enter:
                 1) Show Available Books Menu
                 2) Show Checked Out Books Menu
                 3) Exit Application
                 
                 $: 
                """ + RESET;

        boolean done = false; // To control the loop

        do {
            // Display the prompt to the user
            System.out.println(prompt);
            String input = scanner.nextLine().trim();  // Capture and trim user input
            switch (input) {
                case "1":
                    showAvailableBooksMenu(inventory); // Show available books menu
                    break;
                case "2":
                    showCheckedOutBooksMenu(inventory); // Show checked-out books menu
                    break;
                case "3":
                    done = true; // Exit the loop and close the app
                    break;
                default:
                    printErrorMessage(); // Handle invalid input
                    break;
            }
        } while (!done); // Loop until the user chooses to exit

    }

    // Displays an error message for invalid user input
    private static void printErrorMessage() {
        System.out.println("please enter a valid value from the prompt");
    }

    // Method to display and manage checked-out books
    private static void showCheckedOutBooksMenu(Book[] inventory) {
        String prompt = YELLOW + """
                =====================================
                        Checked Out Books Menu
                =====================================
                Choose an option: 
                
                S. Show checked out books
                C. Check in a book
                X. Exit to main menu
                
                $: 
                """ + RESET;

        boolean done = false; // Controls the loop
        do {
            // Show the checked-out books menu
            System.out.println(prompt);
            String input = scanner.nextLine().trim(); // Get user input
            switch (input) {
                case "S", "s":
                    displayCheckedOutBooks(inventory); // Show all books that are currently checked out
                    break;
                case "C", "c":
                    checkInBook(inventory); // Check in a book
                    break;
                case "X", "x":
                    done = true; // Exit to the main menu
                    break;
                default:
                    printErrorMessage(); // Invalid input handling
                    break;
            }
        } while (!done); // Continue until the user exits
    }

    // Method to display and manage available books
    private static void showAvailableBooksMenu(Book[] inventory) {
        String prompt = YELLOW + """
                =====================================
                          Available Books
                =====================================
                Choose an option: 
                
                S. Show available books
                C. Check out a book
                X. Exit to main menu
                
                $: 
                """ + RESET;

        boolean done = false; // Controls the loop
        do {
            // Show the available books menu
            System.out.println(prompt);
            String input = scanner.nextLine().trim(); // Get user input
            switch (input) {
                case "S", "s":
                    displayAvailableBooks(inventory); // Display available books
                    break;
                case "C", "c":
                    checkOutBook(inventory); // Handle book checkout
                    break;
                case "X", "x":
                    done = true; // Exit to the main menu
                    break;
                default:
                    printErrorMessage(); // Invalid input handling
                    break;
            }
        } while (!done); // Continue until the user exits

    }

    // Displays all books that are available (not checked out)
    private static void displayAvailableBooks(Book[] inventory) {
        // Loop through the book inventory and display the details of available books
        for (int i = 0; i < inventory.length; i++) {
            if (!inventory[i].isCheckedOut()) {
                System.out.printf(GREEN + """
                        \"%s\" 
                        ------------------------
                        Id: %d
                        ISBN #: %s
                        """ + RESET, inventory[i].getTitle(), inventory[i].getId(), inventory[i].getIsbn());
                System.out.println();
            }
        }
    }

    // Displays all books that are checked out and by whom
    private static void displayCheckedOutBooks(Book[] inventory) {
        // Loop through the inventory and display only checked-out books
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isCheckedOut()) {
                System.out.printf(RED + """
                                            ------------------------
                                            \"%s\"                                           
                                            Id: %d 
                                            ISBN #: %s
                                            This book is currently checked out by %s
                                            ------------------------
                                            """ + RESET,
                        inventory[i].getTitle(), inventory[i].getId(), inventory[i].getIsbn(), inventory[i].getCheckedOutTo());
                System.out.println("\n");
            }
        }
    }

    private static void checkInBook(Book[] inventory) {
        // Check a book back into the library
        System.out.println(YELLOW + "What is the ID of the book you want to check in? (int): " + RESET);
        int id = Integer.parseInt(scanner.nextLine().trim()); // Get the book's ID
        // Find the book by ID and check it in
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getId() == id) {
                inventory[i].setCheckedOut(false); // Mark the book as available
                System.out.printf(GREEN + "The book: %s was checked back in. ID: %d", inventory[i].getTitle(), inventory[i].getId());
                System.out.println(RESET);
                break;
            }
        }
    }

    // Handles checking out a book from the inventory
    private static void checkOutBook(Book[] inventory) {
        // Prompt the user to input book details for checkout
        System.out.println(YELLOW + """
                What book would you like to check out?
                Please enter the book's title, ID, or ISBN #
                $:
                """ + RESET);
        String input = scanner.nextLine().trim(); // Get user input
        boolean bookFound = false; // Track whether the book is found
        // Loop through the inventory to find the matching book
        for (int i = 0; i < inventory.length; i++) {
            if (String.valueOf(inventory[i].getId()).equals(input)
                    || inventory[i].getTitle().equalsIgnoreCase(input)
                    || inventory[i].getIsbn().equals(input)) {
                bookFound = true; // Book is found
                // Prompt user for their name and check out the book
                System.out.println("What is your name? : ");
                String name = scanner.nextLine().trim();
                System.out.printf("Thank you %s! You checked out \"%s\".", name, inventory[i].getTitle());
                System.out.println();
                // Mark the book as checked out
                inventory[i].setCheckedOut(true);
                inventory[i].setCheckedOutTo(name);
                break;
            }
        }
        if (!bookFound) {
            // If the book is not found, display an error message
            System.out.println("We can't find that book in our archive...");
        }
    }
}
