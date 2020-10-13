package com.company;

import java.util.ArrayList;

public class Chapter {
    private String name;
    ArrayList<String> subChapters = new ArrayList<String>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=" + subChapters +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String createSubChapter(String s) {
        return s;
    }

    public SubChapter getSubChapter(String indexSubChapterOneOne) {
        subChapters.add(indexSubChapterOneOne);
        SubChapter chapter=new SubChapter(indexSubChapterOneOne);

        return chapter;
    }
}
