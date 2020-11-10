package services;

import models.Paragraph;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println("+++++" + paragraph.getName() + "+++++");
    }
}
