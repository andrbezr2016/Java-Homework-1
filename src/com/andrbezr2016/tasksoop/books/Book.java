package com.andrbezr2016.tasksoop.books;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = Objects.requireNonNull(name);
        this.authors = Objects.requireNonNull(authors);
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsString = Arrays.toString(authors);
        return "Book[" +
                "name=" + name +
                ",authors={" + authorsString.substring(1, authorsString.length() - 1) + "}" +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(this.price, book.price) == 0
                && this.qty == book.qty
                && this.name.equals(book.name)
                && Arrays.equals(this.authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + qty;
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    public String getAuthorNames() {
        String names = "";
        for (int i = 0; i < authors.length; i++) {
            names += authors[i].getName();
            if (i < authors.length - 1) {
                names += ',';
            }
        }
        return names;
    }
}
