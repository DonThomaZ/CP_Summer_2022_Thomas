package pl.waw.sgh.shapes;


public class TriangleHW extends Shape {
    public TriangleHW(Double parA, Double parB, Double parC) {
        super(parA, parB, parC);
    }

    @Override
    public Double calcPerimeter() {
        return parA+parB+parC;
    }

    @Override
    public Double calcSurface() {
        Double p = (parA+parB+parC)/2;
        return Math.sqrt(p*(p-parA)*(p-parB)*(p-parC));
    }
}

