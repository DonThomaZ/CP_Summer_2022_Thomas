package pl.waw.sgh.shapes;

public class Square extends Shape {

    public Square(Double parA) {
        super(parA, 0.0);
    }

    public Double calcSurface() {
        return parA*parA;
    }
}
