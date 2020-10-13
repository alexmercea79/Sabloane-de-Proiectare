package com.company;

import java.util.ArrayList;

public class Chapter {
    private final String name;
    ArrayList<String> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=" + subChapters +
                '}';
    }


    public String createSubChapter(String s) {
        return s;
    }

    public SubChapter getSubChapter(String indexSubChapterOneOne) {
        subChapters.add(indexSubChapterOneOne);

        return new SubChapter(indexSubChapterOneOne);
    }
}
