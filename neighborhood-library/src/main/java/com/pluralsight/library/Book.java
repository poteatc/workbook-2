package com.pluralsight.library;

import java.util.Scanner;

public class Book {
    // Class variables: also called attributes or properties
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    // Default Constructor
    public Book() {
        this.id = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Parametrized constructor
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
    // getter for id
    public int getId() {
        return id;
    }
    // setter for id
    public void setId(int id) {
        this.id = id;
    }

    // getter for isbn
    public String getIsbn() {
        return isbn;
    }

    // setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // getter for title
    public String getTitle() {
        return title;
    }
    // setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // getter for isCheckedOutTo returning if a Book is checked out
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // setter for isCheckedOut to
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    // getter for isCheckedOutTo returning name of person Book is checked out to
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // setter for isCheckedOutTo setting name of person Book is checked out to
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


}
