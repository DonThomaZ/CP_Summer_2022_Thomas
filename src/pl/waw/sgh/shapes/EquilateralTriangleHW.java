package pl.waw.sgh.shapes;

public class EquilateralTriangleHW extends TriangleHW {
    public EquilateralTriangleHW(Double parA) {
        super(parA, null, null);
    }

    @Override
    public Double calcPerimeter() {
        return 3*parA;
    }

    @Override
    public Double calcSurface() {
        return Math.pow(parA, 2)*Math.sqrt(3)/4;
    }
}
