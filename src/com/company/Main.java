package com.company;

public class Main {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        String indexChapterOne = String.valueOf(discoTitanic.createChapter("Capitolul 1"));
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        String indexSubChapterOneOne = String.valueOf(chp1.createSubChapter("Subcapitolul 1.1"));

        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
//        scOneOne.createNewParagraph("Paragraph 1");
//        scOneOne.createNewParagraph("Paragraph 2");
//        scOneOne.createNewParagraph("Paragraph 3");
//        scOneOne.createNewImage("Image 1");
//        scOneOne.createNewParagraph("Paragraph 4");
//        scOneOne.createNewTable("Table 1");
//        scOneOne.createNewParagraph("Paragraph 5");
//        scOneOne.print();
        System.out.println(discoTitanic);
        System.out.println(rpGheo);
        System.out.println(discoTitanic);
    }
}
