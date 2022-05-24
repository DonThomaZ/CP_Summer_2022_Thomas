package pl.waw.sgh.shapes;

public class Circle extends Shape {
    public Circle(Double parA) {
        super(parA, null);
    }

    public Double calcSurface() {
        return Math.PI*Math.pow(parA, 2);
    }

    @Override
    public Double calcPerimeter() {
        return 2*Math.PI*parA;
    }
}
