package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    ArrayList<Author> authors= new ArrayList<Author>();
    ArrayList<String> chapters = new ArrayList<String>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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



    public String getChapter(String indexChapterOne) {
        chapters.add(indexChapterOne);
        return createChapter(indexChapterOne);
    }


    public String createChapter(String s) {
        return s;
    }
}
