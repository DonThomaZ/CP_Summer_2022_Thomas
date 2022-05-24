package pl.waw.sgh.shapes;

import java.util.Objects;

public abstract class Shape implements PerimeterCalculation {
    protected Double parA = 0.0;
    protected Double parB = 0.0;

    public Shape() {
        this(40.0, 20.0);
    }

    public Shape(Double parA, Double parB) {
        setParams(parA, parB);
    }

//    public Shape(Double parA) {
//        setParams(parA, 0.0);
//    }

    public void setParams(Double a, Double b) {
        this.parA = a;
        this.parB = b;
    }

    public abstract Double calcSurface();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(parA, shape.parA) && Objects.equals(parB, shape.parB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parA, parB);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "parA=" + parA +
                ", parB=" + parB +
                //", surface=" + calcSurface() +
                '}';
    }
}
