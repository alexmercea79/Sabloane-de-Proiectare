package com.company;

import java.util.ArrayList;

public class Book {
    private final String title;
    ArrayList<Author> authors= new ArrayList<>();
    ArrayList<String> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }




    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", chapters=" + chapters +
                '}';
    }

    public void addAuthor(Author s) {
        authors.add(s);
    }


    public String createChapter(String s) {
        return s;
    }

    public Chapter getChapter(String s) {
        chapters.add(s);
        return new Chapter(s);
    }
}
