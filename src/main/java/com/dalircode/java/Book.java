package com.dalircode.java;

public class Book {
   String title;
   int publishedYear;
   Author author;

    public Book(String title, int publishedYear, Author author) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}
