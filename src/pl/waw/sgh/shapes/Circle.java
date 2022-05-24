package pl.waw.sgh.shapes;

public class Circle extends Shape {

    public Circle(Double parA) {
        super(parA, 0.0);
    }

    public Double calcSurface() {
        return Math.PI*parA*parA;
    }
}
