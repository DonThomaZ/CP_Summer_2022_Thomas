package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

    public Rectangle(Double parA, Double parB) {
        super(parA, parB);
    }

    public Double calcSurface() {
        return parA*parB;
    }
}
