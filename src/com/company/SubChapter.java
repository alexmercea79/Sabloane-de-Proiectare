package com.company;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    ArrayList<String> paragaph = new ArrayList<String>();
    ArrayList<String> images = new ArrayList<String>();
    ArrayList<String> table = new ArrayList<String>();

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "SubChapter: " + name  +"\n"+
                "Paragraph: " + paragaph + "\n"+
                "Image with name=" + images + "\n"+
                        "Table with title=" + table;
    }

    public void createNewParagraph(String s) {
        paragaph.add(s);

    }

    public void createNewImage(String s) {
        images.add(s);
    }

    public void createNewTable(String s) {
        table.add(s);
    }
}
