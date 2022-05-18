package pl.waw.sgh.shapes;

public class Rectangle {
    private Double parA = 0.0;
    private Double parB = 0.0;

    public Rectangle() {
        this(40.0, 20.0);
    }

    public Rectangle(Double parA, Double parB) {
        setParams(parA, parB);
    }

    public void setParams(Double a, Double b) {
        this.parA = a;
        this.parB = b;
    }

    public Double calcSurface() {
        return parA*parB;
    }
}
