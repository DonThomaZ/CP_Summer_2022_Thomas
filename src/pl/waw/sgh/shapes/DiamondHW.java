package pl.waw.sgh.shapes;

public class DiamondHW extends Shape {

    public DiamondHW(Double parA, Double parB) {
            super(parA, parB, null);
        }

        @Override
        public Double calcPerimeter() {
            Double side = Math.sqrt(Math.pow(parA, 2) + Math.pow(parB, 2));
            return 4*side;
        }

        @Override
        public Double calcSurface() {
            return (parA*parB)/2;
        }
}

