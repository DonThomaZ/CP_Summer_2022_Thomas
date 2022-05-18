package pl.waw.sgh.shapes;

public class ManipulateShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 4.0);
        r1.setParams(6.7, 8.9);
        System.out.println(r1);
        System.out.println("R1 surface: " + r1.calcSurface());

        Circle c1 = new Circle(3.0);
        System.out.println("Circle surface: " + c1.calcSurface());

        Square s1 = new Square(5.0);
        System.out.println("Square surface: " + s1.calcSurface());
    }
}
