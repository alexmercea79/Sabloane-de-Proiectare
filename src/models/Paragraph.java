package models;

import models.Element;
import services.AlignStrategy;

public class Paragraph implements Element {
    private String title;
    private String name;
    private AlignStrategy alignStrategy;

    public Paragraph(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getName(){
        return this.name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this);
        }
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
