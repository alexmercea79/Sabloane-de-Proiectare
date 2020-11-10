package models;


import java.util.ArrayList;

public class Book {
    private final String title;
    ArrayList<Author> authors= new ArrayList<>();
    ArrayList<String> chapters = new ArrayList<>();
    public ArrayList<Element> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", chapters=" + chapters +
                ", content=" + content +
                '}';
    }

    public void addAuthor(Author s) {
        authors.add(s);
    }


    public String createChapter(String s) {
        return s;
    }





    public void addContent(Element e)
    {
        content.add(e);
    }

    public void print()
    {
        System.out.println("Book:" + title);
        System.out.println("Author:" + authors);
        for(Element e: content)
        {
            e.print();
        }
}}
