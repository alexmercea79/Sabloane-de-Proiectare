package com.company;

import java.util.ArrayList;

public class Chapter {
    private String name;
    ArrayList<String> subChapters = new ArrayList<String>();


    public String getName() {
        return name;
    }

    public Chapter(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=" + subChapters +
                '}';
    }


    public SubChapter getSubChapter(String indexSubChapterOneOne) {
        subChapters.add(indexSubChapterOneOne);
        return createSubChapter(indexSubChapterOneOne);
    }

    public SubChapter createSubChapter(String s) {
        return s;
    }
}
