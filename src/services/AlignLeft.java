package services;


import models.Paragraph;

public class AlignLeft implements AlignStrategy {
        public void render(Paragraph paragraph){
            System.out.println("+++++" + paragraph.getName());
        }
}
