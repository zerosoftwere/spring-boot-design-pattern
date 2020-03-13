package net.xerosoft.model;

public class Book {
    public Long id;
    public String author;
    public String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[id=" + id + ",author=" + author + ",title=" + title + "]";
    }
}
