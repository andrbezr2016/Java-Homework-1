package com.andrbezr2016.tasksoop.books;

import java.util.Objects;

public class Author {
    private final String name;
    private final String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = Objects.requireNonNull(name);
        this.email = Objects.requireNonNull(email);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ",email=" + email +
                ",gender=" + gender +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender
                && this.name.equals(author.name)
                && this.email.equals(author.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) gender;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
