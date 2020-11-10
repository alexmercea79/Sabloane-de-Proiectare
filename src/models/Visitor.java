package models;



public interface Visitor {

    public abstract void visit(Image image);
    public abstract void visit(ImageProxy imageProxy);
    public abstract void visit(Paragraph paraghraph);
    public abstract void visit(Table table);
}
