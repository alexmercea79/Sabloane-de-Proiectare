package services;

import models.Paragraph;

public class AlignRight implements AlignStrategy {
    public Paragraph paragraph;
    public void render(Paragraph paragraph){
        System.out.println(paragraph.getName() + "+++++");
}}
