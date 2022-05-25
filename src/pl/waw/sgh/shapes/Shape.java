package pl.waw.sgh.shapes;

import java.util.Comparator;
import java.util.Objects;

public abstract class Shape implements PerimeterCalculation, Comparable<Shape> {
    protected Double parA = 0.0;
    protected Double parB = 0.0;
    protected Double parC = 0.0;

    public Shape() {
        this(40.0, 20.0, 20.0);
    }


    public Shape(Double parA, Double parB, Double parC) {
        setParams(parA, parB, parC);
    }

//    public Shape(Double parA) {
//        setParams(parA, 0.0);
//    }

    public void setParams(Double a, Double b, Double c) {
        this.parA = a;
        this.parB = b;
        this.parC = c;
    }


    public abstract Double calcSurface();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(parA, shape.parA) && Objects.equals(parB, shape.parB) && Objects.equals(parC, shape.parC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parA, parB);
    }

    @Override
    public int compareTo(Shape sh) {
        return calcSurface().compareTo(sh.calcSurface());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "parA=" + parA +
                ", parB=" + parB +
                ", surface=" + calcSurface() +
                '}';
    }
}
